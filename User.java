package project.com.LibraryManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
@Id
private int uid;
private String uname;
private String subject;
private String contact;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int uid, String uname, String subject, String contact) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.subject = subject;
	this.contact = contact;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", subject=" + subject + ", contact=" + contact + "]";
}
 

}
