package net.codejava.hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "USER")
public class User {
	private int user_id;
	private String name;
	private Set<Account> account;

	public User(){}
	public User( String name) {
		super();
		this.name = name;
	}

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Account> getAccount() {
		return account;
	}

}
