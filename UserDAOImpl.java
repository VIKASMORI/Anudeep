package project.com.LibraryManagementSystem.DAOImpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import project.com.LibraryManagementSystem.DAO.UserDAO;
import project.com.LibraryManagementSystem.Models.User;
import project.com.LibraryManagementSystem.Utility.HiberUtil;


public class UserDAOImpl implements UserDAO{
	Session session = HiberUtil.getSessionFactory().openSession();
	   
	@Override
	public boolean adduser(User user) {
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		return true;


	}

	@Override
	public User getById(int uid) {
		
		return session.get(User.class, uid);
	}

	@Override
	public List<User> getAll() {
		Transaction tx=session.beginTransaction();
		Query q = session.createQuery("From User");
		return q.getResultList();
	}

	@Override
	public boolean updateuser(User user) {
		User u1 = session.get(User.class, user.getUid());
		Transaction tx=session.beginTransaction();
		u1.setUid(user.getUid());
		u1.setUname(user.getUname());
		u1.setSubject(user.getSubject());
		u1.setContact(user.getContact());
		session.save(u1);
		tx.commit();
		return true;

	}

	@Override
	public boolean deleteuser(int uid) {
		User u1 = session.get(User.class,uid);
		Transaction tx=session.beginTransaction();
		session.delete(u1);
		tx.commit();
		return true;

	}
	
}
