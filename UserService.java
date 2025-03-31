package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.DAO.UserDAO;
import project.com.LibraryManagementSystem.DAOImpl.UserDAOImpl;
import project.com.LibraryManagementSystem.Models.User;

public class UserService implements IUserService {
	UserDAO uDAO = new UserDAOImpl();
	@Override
	public boolean adduser(User user) {
		// TODO Auto-generated method stub
		return uDAO.adduser(user);
	}

	@Override
	public User getById(int uid) {
		// TODO Auto-generated method stub
		return uDAO.getById(uid);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return uDAO.getAll();
	}

	@Override
	public boolean updateuser(User user) {
		// TODO Auto-generated method stub
		return uDAO.updateuser(user);
	}

	@Override
	public boolean deleteuser(int uid) {
		// TODO Auto-generated method stub
		return uDAO.deleteuser(uid);
	}

}
