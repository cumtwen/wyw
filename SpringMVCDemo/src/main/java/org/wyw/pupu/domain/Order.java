package org.wyw.pupu.domain;

public class Order {
	private Integer id;
	private Integer user_id;
	private Integer good_id;
	private String good_price;
	private String state;
	private Integer count;
	private Integer total;
	private String porr;
	public String getPorr() {
		return porr;
	}
	public void setPorr(String porr) {
		this.porr = porr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
}
