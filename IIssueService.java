package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.Models.Issue;

public interface IIssueService {
	
		public boolean addissue(Issue issue);
		public Issue getById(int iid);
		public List<Issue> getAll();
		public boolean updateissue(Issue issue);
		public boolean deleteissue(int iid);
}
