package org.wyw.pupu.domain;

import java.io.Serializable;

public class Good implements Serializable{
	private Integer id;
	private String number;
	private String type;
	private String name;
	private String introduce;
	private String count;
	private String price;
	private String img1;
	private String img2;
	private String img3;
	private String now;
	private Integer sale;
	private String type1;
	
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", number=" + number + ", type=" + type + ", name=" + name
				+ ", introduce=" + introduce + ", count=" + count + ", price=" + price + ", img1="
				+ img1 + ",img2=" + img2 +",img3=" + img3 +"]";
		}
	public Good(){
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getNow() {
		return now;
	}
	public void setNow(String now) {
		this.now = now;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
}
