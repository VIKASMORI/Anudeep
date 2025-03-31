package project.com.LibraryManagementSystem.DAO;


import java.util.List;

import org.hibernate.Session;
import project.com.LibraryManagementSystem.Models.Book;

import project.com.LibraryManagementSystem.Utility.HiberUtil;

public interface BookDAO {
	Session session = HiberUtil.getSessionFactory().openSession();
	   public boolean addbook(Book book);
	   public Book getById(int bid);
	   public List<Book> getAll();
	   public boolean updatebook(Book book);
	   public boolean deletebook(int bid);
	
	
}
