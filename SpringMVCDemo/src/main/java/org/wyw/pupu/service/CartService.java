package org.wyw.pupu.service;

import java.util.List;
import org.wyw.pupu.domain.Cart;


public interface CartService {
	Cart cartSelect(int user_id,int good_id);
	List<Cart> cartgetAll(int user_id);
	void inCart(int user_id,int good_id,int count,String good_price);
	void updateCart(int user_id,int good_id,int count);
	void delCart(int user_id,int good_id);
	void delAll(int user_id);
}
