package org.wyw.pupu.domain;

import java.io.Serializable;

public class Cart implements Serializable{
	private Integer Id;
	private Integer user_id;
	private Integer good_id;
	private Integer count;
	private String good_price;



	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getGood_price() {
		return good_price;
	}
	public void setGood_price(String good_price) {
		this.good_price = good_price;
	}

}
