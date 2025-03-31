package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.DAO.IssueDAO;
import project.com.LibraryManagementSystem.DAOImpl.IssueDAOImpl;
import project.com.LibraryManagementSystem.Models.Issue;

public class IssueService implements IIssueService{
	IssueDAO iDAO = new IssueDAOImpl();
	@Override
	public boolean addissue(Issue issue) {
		// TODO Auto-generated method stub
		return iDAO.addissue(issue);
	}

	@Override
	public Issue getById(int iid) {
		// TODO Auto-generated method stub
		return iDAO.getById(iid);
	}

	@Override
	public List<Issue> getAll() {
		// TODO Auto-generated method stub
		return iDAO.getAll();
	}

	@Override
	public boolean updateissue(Issue issue) {
		// TODO Auto-generated method stub
		return iDAO.updateissue(issue);
	}

	@Override
	public boolean deleteissue(int iid) {
		// TODO Auto-generated method stub
		return iDAO.deleteissue(iid) ;
	}

}
