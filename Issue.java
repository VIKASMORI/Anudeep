package project.com.LibraryManagementSystem.Models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.Predicate;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Issue {
	@Id
private int iid;
	 @ManyToOne
     @JoinColumn(nullable = false)
     private User user;
     
     @ManyToOne
     @JoinColumn(nullable = false)
     private Book book;

private LocalDate issuedate;
private LocalDate returndate;
public Issue() {
	super();
	// TODO Auto-generated constructor stub
}
public Issue(int iid, User user, Book book, LocalDate issuedate, LocalDate returndate) {
	super();
	this.iid = iid;
	this.user = user;
	this.book = book;
	this.issuedate = issuedate;
	this.returndate = returndate;
}
public int getIid() {
	return iid;
}
public void setIid(int iid) {
	this.iid = iid;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public LocalDate getIssuedate() {
	return issuedate;
}
public void setIssuedate(LocalDate issuedate) {
	this.issuedate = issuedate;
}
public LocalDate getReturndate() {
	return returndate;
}
public void setReturndate(LocalDate returndate) {
	this.returndate = returndate;
}
@Override
public String toString() {
	return "Issue [iid=" + iid + ", user=" + user + ", book=" + book + ", issuedate=" + issuedate + ", returndate="
			+ returndate + "]";
}

}
