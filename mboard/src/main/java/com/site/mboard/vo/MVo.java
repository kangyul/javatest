package com.site.mboard.vo;

public class MVo {
	
	private String id;
	private String pw;
	private String name;
	private String nickName;
	private String gender;
	private String tel;
	private String address1;
	private String address2;
	private String hobby;
	
	public MVo() {}

	public MVo(String id, String pw, String name, String nickName, String gender, String tel, String address1,
			String address2, String hobby) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickName = nickName;
		this.gender = gender;
		this.tel = tel;
		this.address1 = address1;
		this.address2 = address2;
		this.hobby = hobby;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
