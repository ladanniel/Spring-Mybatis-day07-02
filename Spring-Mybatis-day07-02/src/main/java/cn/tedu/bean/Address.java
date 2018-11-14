package cn.tedu.bean;

import java.io.Serializable;

public class Address implements Serializable{
	/** –Ú¡–∫≈£®∞Ê±æ∫≈£©
	 */
	private static final long serialVersionUID = 1865873083226518655L;
	private Integer id;
	private String province;
	private String city;
	private String area;
	private String useraddress;
	@Override
	public String toString() {
		return "Address [id=" + id + ", province=" + province + ", city=" + city + ", area=" + area + ", useraddress="
				+ useraddress + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	

}
