package project.com.LibraryManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
int bid;
String bname;
String auther;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bid, String bname, String auther) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.auther = auther;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuther() {
	return auther;
}
public void setAuther(String auther) {
	this.auther = auther;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", auther=" + auther + "]";
}


}
