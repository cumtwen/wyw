package org.wyw.pupu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.wyw.pupu.domain.Order;

public interface OrderService {
	List<Order> ordergetAll(int user_id);
	Order orderGet(int user_id,int good_id);
	void insertorder (int user_id,int good_id,String good_price,String state,int count,float total,String porr);
	void updateorder(int id,String state,String porr);
	void updategood(int id,int count);
	void deletecart(int user_id,int good_id);
	void updatesale(int id,int count);
}
