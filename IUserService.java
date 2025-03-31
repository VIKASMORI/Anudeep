package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.Models.User;

public interface IUserService {
	 public boolean adduser(User user);
	   public User getById(int uid);
	   public List<User> getAll();
	   public boolean updateuser(User user);
	   public boolean deleteuser(int uid);

	
}
