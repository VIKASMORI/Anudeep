package project.com.LibraryManagementSystem.DAO;

import java.util.List;

import javax.persistence.Entity;

import project.com.LibraryManagementSystem.Models.Issue;
import project.com.LibraryManagementSystem.Models.User;

public interface IssueDAO {
public boolean addissue(Issue issue);
public Issue getById(int iid);
public List<Issue> getAll();
public boolean updateissue(Issue issue);
public boolean deleteissue(int iid);
}
