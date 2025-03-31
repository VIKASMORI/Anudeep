package project.com.LibraryManagementSystem.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import project.com.LibraryManagementSystem.DAO.IssueDAO;
import project.com.LibraryManagementSystem.Models.Issue;
import project.com.LibraryManagementSystem.Utility.HiberUtil;

public class IssueDAOImpl implements IssueDAO {
	Session session = HiberUtil.getSessionFactory().openSession();

	@Override
	public boolean addissue(Issue issue) {
		Transaction tx=session.beginTransaction();
		session.save(issue);
		tx.commit();
		return true;
	}

	@Override
	public Issue getById(int iid) {
		// TODO Auto-generated method stub
		return  session.get(Issue.class, iid);

	}

	@Override
	public List<Issue> getAll() {
		Transaction tx=session.beginTransaction();
		Query q = session.createQuery("From Issue");
		return q.getResultList();
	}

	@Override
	public boolean updateissue(Issue issue) {
		Issue i1 = session.get(Issue.class, issue.getIid());
		Transaction tx=session.beginTransaction();
		i1.setIid(issue.getIid());
		i1.setIssuedate(issue.getIssuedate());
		i1.setReturndate(issue.getReturndate());
		
		session.save(i1);
		tx.commit();
		return true;

	}

	@Override
	public boolean deleteissue(int iid) {
		Issue i1 = session.get(Issue.class,iid);
		Transaction tx=session.beginTransaction();
		session.delete(i1);
		tx.commit();
		return true;

	}


}
