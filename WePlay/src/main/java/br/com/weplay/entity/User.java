package br.com.weplay.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	//bi-directional one-to-one association to UserCourse
	@OneToOne(mappedBy="user")
	private UserCourse userCourse;

	public User() {
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserCourse getUserCourse() {
		return this.userCourse;
	}

	public void setUserCourse(UserCourse userCourse) {
		this.userCourse = userCourse;
	}

}