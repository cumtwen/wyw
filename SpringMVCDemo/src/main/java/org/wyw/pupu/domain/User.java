package org.wyw.pupu.domain;

import java.io.Serializable;


public class User  implements Serializable{
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	private String question;
	private String answer;
	private String newpwd;
	
	public User(){
		super();
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdress() {
		return address;
	}


	public void setAdress(String address) {
		this.address = address;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getNewpwd() {
		return newpwd;
	}


	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}


	
}