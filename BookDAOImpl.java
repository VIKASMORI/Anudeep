package project.com.LibraryManagementSystem.DAOImpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import project.com.LibraryManagementSystem.DAO.BookDAO;
import project.com.LibraryManagementSystem.Models.Book;
import project.com.LibraryManagementSystem.Utility.HiberUtil;

public class BookDAOImpl implements BookDAO{
	Session session = HiberUtil.getSessionFactory().openSession();

	@Override
	public boolean addbook(Book book) {
		Transaction tx=session.beginTransaction();
		session.save(book);
		tx.commit();
		return true;
     
	}

	@Override
	public Book getById(int bid) {
		
		return session.get(Book.class, bid);

	}

	@Override
	public List<Book> getAll() {
		
			Transaction tx=session.beginTransaction();
			Query q = session.createQuery("From Book");
			return q.getResultList();
		
	}

	@Override
	public boolean updatebook(Book book) {
		Book b1 = session.get(Book.class, book.getBid());
		Transaction tx=session.beginTransaction();
		b1.setBid(book.getBid());
		b1.setBname(book.getBname());
		b1.setAuther(book.getAuther());
		session.save(b1);
		tx.commit();
		return true;

	}

	@Override
	public boolean deletebook(int bid) {
		Book b1 = session.get(Book.class,bid);
		Transaction tx=session.beginTransaction();
		session.delete(b1);
		tx.commit();
		return true;

	}

}
