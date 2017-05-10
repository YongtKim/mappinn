package com.finalProject.mappin.common.model.vo;

import java.io.Serializable;

public class Marker implements Serializable{

	private int map_x;
	private int map_y;
	private String marker_name;
	private String marker_img;
	private int content_id;
	private int content_type;
	private String member_id;
	private String content;
	private String address;
	private String url;
	private String tel;
	private String info_img;

	public Marker() {
		super();
	}

	public Marker(int map_x, int map_y, String marker_name, String marker_img, int content_id, int content_type,
			String member_id, String content, String address, String url, String tel, String info_img) {
		super();
		this.map_x = map_x;
		this.map_y = map_y;
		this.marker_name = marker_name;
		this.marker_img = marker_img;
		this.content_id = content_id;
		this.content_type = content_type;
		this.member_id = member_id;
		this.content = content;
		this.address = address;
		this.url = url;
		this.tel = tel;
		this.info_img = info_img;
	}

	public int getMap_x() {
		return map_x;
	}

	public void setMap_x(int map_x) {
		this.map_x = map_x;
	}

	public int getMap_y() {
		return map_y;
	}

	public void setMap_y(int map_y) {
		this.map_y = map_y;
	}

	public String getMarker_name() {
		return marker_name;
	}

	public void setMarker_name(String marker_name) {
		this.marker_name = marker_name;
	}

	public String getMarker_img() {
		return marker_img;
	}

	public void setMarker_img(String marker_img) {
		this.marker_img = marker_img;
	}

	public int getContent_id() {
		return content_id;
	}

	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}

	public int getContent_type() {
		return content_type;
	}

	public void setContent_type(int content_type) {
		this.content_type = content_type;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInfo_img() {
		return info_img;
	}

	public void setInfo_img(String info_img) {
		this.info_img = info_img;
	}

	@Override
	public String toString() {
		return "Marker [map_x=" + map_x + ", map_y=" + map_y + ", marker_name=" + marker_name + ", marker_img="
				+ marker_img + ", content_id=" + content_id + ", content_type=" + content_type + ", member_id="
				+ member_id + ", content=" + content + ", address=" + address + ", url=" + url + ", tel=" + tel
				+ ", info_img=" + info_img + "]";
	}

}
