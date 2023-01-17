package com.cholo.spring.test.jsp.model;

import java.util.Date;

public class Seller {
	private int id;
	private String nickname;
	private String profileImage;
	private double temperatur;
	private Date creatdAt;
	private Date updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public double getTemperatur() {
		return temperatur;
	}
	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
	}
	public Date getCreatdAt() {
		return creatdAt;
	}
	public void setCreatdAt(Date creatdAt) {
		this.creatdAt = creatdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
