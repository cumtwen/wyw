package org.wyw.pupu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.Order;
import org.wyw.pupu.mapper.OrderMapper;
import org.wyw.pupu.service.OrderService;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")

public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void insertorder(int user_id,int good_id,String good_price,String state,int count,float total,String porr) {
		// TODO Auto-generated method stub
			orderMapper.insertorder(user_id,good_id,good_price,state,count,total,porr);
		
	}
	@Override
	public List<Order> ordergetAll(int user_id) {
		// TODO Auto-generated method stub
		return orderMapper.orderfindAll(user_id);
	}
	@Override
	public void updateorder( int id,String state,String porr) {
		// TODO Auto-generated method stub
		orderMapper.updateorder(id,state,porr);
	}
	@Override
	public void updategood(int id, int count) {
		// TODO Auto-generated method stub
		orderMapper.updategood(id, count);
	}
	@Override
	public void deletecart(int user_id, int good_id) {
		// TODO Auto-generated method stub
		orderMapper.deletecart(user_id, good_id);
	}
	@Override
	public void updatesale(int id, int count) {
		// TODO Auto-generated method stub
		orderMapper.updatesale(id, count);
	}
	@Override
	public Order orderGet(int user_id, int good_id) {
		return orderMapper.orderGet(user_id,good_id);
	}





}
