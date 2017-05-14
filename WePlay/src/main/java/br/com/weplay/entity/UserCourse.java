package br.com.weplay.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="USER_COURSE")
@NamedQuery(name="UserCourse.findAll", query="SELECT u FROM UserCourse u")
public class UserCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USERCOURSE_ID")
	private int usercourseId;

	@Column(name="USERCOURSE_COURSER")
	private int usercourseCourser;

	@Temporal(TemporalType.DATE)
	@Column(name="USERCOURSE_END")
	private Date usercourseEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="USERCOURSE_START")
	private Date usercourseStart;

	@Column(name="USERCOURSE_STATUS")
	private String usercourseStatus;

	@Column(name="USERCOURSE_USER")
	private int usercourseUser;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="USERCOURSE_ID")
	private User user;

	public UserCourse() {
	}

	public int getUsercourseId() {
		return this.usercourseId;
	}

	public void setUsercourseId(int usercourseId) {
		this.usercourseId = usercourseId;
	}

	public int getUsercourseCourser() {
		return this.usercourseCourser;
	}

	public void setUsercourseCourser(int usercourseCourser) {
		this.usercourseCourser = usercourseCourser;
	}

	public Date getUsercourseEnd() {
		return this.usercourseEnd;
	}

	public void setUsercourseEnd(Date usercourseEnd) {
		this.usercourseEnd = usercourseEnd;
	}

	public Date getUsercourseStart() {
		return this.usercourseStart;
	}

	public void setUsercourseStart(Date usercourseStart) {
		this.usercourseStart = usercourseStart;
	}

	public String getUsercourseStatus() {
		return this.usercourseStatus;
	}

	public void setUsercourseStatus(String usercourseStatus) {
		this.usercourseStatus = usercourseStatus;
	}

	public int getUsercourseUser() {
		return this.usercourseUser;
	}

	public void setUsercourseUser(int usercourseUser) {
		this.usercourseUser = usercourseUser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}