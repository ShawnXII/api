package com.forerunner.foundation.domain.po.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.forerunner.core.base.entity.BaseEntity;
/**
 * 
 */
@Entity
@Table(name="s_member")
public class Member extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2447532950118097535L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOGO_ID")
	private Long logoId;
	
	@Column(name="NO")
    private String no;
	
	@Column(name="SEX")
    private int sex;
	
	@Column(name="AGE")
    private int age;
	
	@Column(name="ID_CARD")
    private String idCard;
	
	@Column(name="JP")
    private String jp;
	
	@Column(name="BIRTHDAY")
    private Date birthday;
	
	@Column(name="FAMILY_NAME")
    private String familyName;
	
	@Column(name="MARITALSTATUS")
    private int maritalstatus;
	
	@Column(name="OCCUPATION")
    private String occupation;
	
	@Column(name="DIPLOMA")
    private String diploma;
	
	@Column(name="SALARY")
    private String salary;
    
	@Column(name="HOBBY")
    private String hobby;
	
	@Column(name="NOTE")
    private String note;
	
	@Column(name="OTHER_ID")
	private String otherId;
	
	@Column(name="OTHER_ID_NO")
    private String otherIdNo;
	
	@Column(name="COUNTRY")
    private String country;
	
	@Column(name="ZZMM")
    private String zzmm;
	
	@Column(name="ADDRESS")
    private String address;
	
	@Column(name="POSTCODE")
    private String postcode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLogoId() {
		return logoId;
	}

	public void setLogoId(Long logoId) {
		this.logoId = logoId;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getJp() {
		return jp;
	}

	public void setJp(String jp) {
		this.jp = jp;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(int maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOtherId() {
		return otherId;
	}

	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}

	public String getOtherIdNo() {
		return otherIdNo;
	}

	public void setOtherIdNo(String otherIdNo) {
		this.otherIdNo = otherIdNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", logoId=" + logoId + ", no=" + no + ", sex=" + sex + ", age="
				+ age + ", idCard=" + idCard + ", jp=" + jp + ", birthday=" + birthday + ", familyName=" + familyName
				+ ", maritalstatus=" + maritalstatus + ", occupation=" + occupation + ", diploma=" + diploma
				+ ", salary=" + salary + ", hobby=" + hobby + ", note=" + note + ", otherId=" + otherId + ", otherIdNo="
				+ otherIdNo + ", country=" + country + ", zzmm=" + zzmm + ", address=" + address + ", postcode="
				+ postcode + "]";
	}
    
	
	
}
