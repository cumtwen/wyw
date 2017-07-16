package org.wyw.pupu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.Cart;
import org.wyw.pupu.mapper.CartMapper;
import org.wyw.pupu.service.CartService;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartMapper cartMapper;
	@Override
	public void inCart(int user_id, int good_id, int count,String good_price) {
		cartMapper.insertcart(user_id, good_id, count,good_price);
	}

	@Override
	public void delCart(int user_id, int good_id) {
		// TODO Auto-generated method stub
		cartMapper.deletecart(user_id, good_id);
		
	}

	@Override
	public List<Cart> cartgetAll(int user_id) {
		// TODO Auto-generated method stub
		return cartMapper.cartfindAll(user_id);
	}

	@Override
	public void delAll(int user_id) {
		// TODO Auto-generated method stub
		 cartMapper.delallcart(user_id);
	}

	@Override
	public Cart cartSelect(int user_id, int good_id) {
		Cart cart=cartMapper.cartfind(user_id, good_id);
		return cart;
	}

	@Override
	public void updateCart(int user_id, int good_id, int count) {
		cartMapper.updateCart(user_id, good_id, count);
	}



}
