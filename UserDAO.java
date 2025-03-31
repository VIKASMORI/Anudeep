package project.com.LibraryManagementSystem.DAO;

import java.util.List;

import org.hibernate.Session;

import project.com.LibraryManagementSystem.Models.Book;
import project.com.LibraryManagementSystem.Models.User;
import project.com.LibraryManagementSystem.Utility.HiberUtil;

public interface UserDAO {
	Session session = HiberUtil.getSessionFactory().openSession();
   public boolean adduser(User user);
   public User getById(int uid);
   public List<User> getAll();
   public boolean updateuser(User user);
   public boolean deleteuser(int uid);

}
