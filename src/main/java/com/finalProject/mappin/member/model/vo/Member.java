package com.finalProject.mappin.member.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable {

	private String member_id;
	private String member_pwd;
	private String member_name;
	private String email;
	private String profile_img;
	private String phone;
	private String address;
	private String facebook;
	private String insta;

	private int msglist_id;
	private String sender;
	private String receiver;
	private String msg_text;
	private Date msg_date;
	private String msg_check;

	public Member() {
		super();
	}

	public Member(String member_id, String member_pwd, String member_name, String email, String profile_img,
			String phone, String address, String facebook, String insta, int msglist_id, String sender, String receiver,
			String msg_text, Date msg_date, String msg_check) {
		super();
		this.member_id = member_id;
		this.member_pwd = member_pwd;
		this.member_name = member_name;
		this.email = email;
		this.profile_img = profile_img;
		this.phone = phone;
		this.address = address;
		this.facebook = facebook;
		this.insta = insta;
		this.msglist_id = msglist_id;
		this.sender = sender;
		this.receiver = receiver;
		this.msg_text = msg_text;
		this.msg_date = msg_date;
		this.msg_check = msg_check;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pwd() {
		return member_pwd;
	}

	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

	public int getMsglist_id() {
		return msglist_id;
	}

	public void setMsglist_id(int msglist_id) {
		this.msglist_id = msglist_id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMsg_text() {
		return msg_text;
	}

	public void setMsg_text(String msg_text) {
		this.msg_text = msg_text;
	}

	public Date getMsg_date() {
		return msg_date;
	}

	public void setMsg_date(Date msg_date) {
		this.msg_date = msg_date;
	}

	public String getMsg_check() {
		return msg_check;
	}

	public void setMsg_check(String msg_check) {
		this.msg_check = msg_check;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_pwd=" + member_pwd + ", member_name=" + member_name
				+ ", email=" + email + ", profile_img=" + profile_img + ", phone=" + phone + ", address=" + address
				+ ", facebook=" + facebook + ", insta=" + insta + ", msglist_id=" + msglist_id + ", sender=" + sender
				+ ", receiver=" + receiver + ", msg_text=" + msg_text + ", msg_date=" + msg_date + ", msg_check="
				+ msg_check + "]";
	}
	
	

}