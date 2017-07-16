package org.wyw.pupu.domain;

public class Remark {
	private Integer user_id;
	private Integer good_id;
	private Integer order_id;
	private String remark;
	private Integer logistics;
	private Integer quality;
	private Integer service;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getLogistics() {
		return logistics;
	}
	public void setLogistics(Integer logistics) {
		this.logistics = logistics;
	}
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}

}
