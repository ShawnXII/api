package com.forerunner.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.forerunner.core.base.entity.AbstractEntity;

/**
 * 账户安全设置
 * 如问题密码设置
 * @author Administrator
 *
 */
@Entity
@Table(name="s_account_safety")
public class AccountSafety extends AbstractEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8038581749018037178L;
	//主键ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",length=64,unique=true)
	private Long id;
	//帐号
	private Account account;
	//问题1
	private String question1;
	//问题2
	private String question2;
	//问题3
	private String question3;
	//答案1
	private String answer1;
	//答案2
	private String answer2;
	//答案3
	private String answer3;
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "AccountSafety [id=" + id + ", account=" + account + ", question1=" + question1 + ", question2="
				+ question2 + ", question3=" + question3 + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + "]";
	}
	
}
