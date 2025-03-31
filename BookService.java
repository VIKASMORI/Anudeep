package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.DAO.BookDAO;
import project.com.LibraryManagementSystem.DAOImpl.BookDAOImpl;
import project.com.LibraryManagementSystem.Models.Book;

public class BookService implements IBookService {
	BookDAO  bDAO = new BookDAOImpl();	

	@Override
	public boolean addbook(Book book) {
		// TODO Auto-generated method stub
		return bDAO.addbook(book);
	}

	@Override
	public Book getById(int bid) {
		// TODO Auto-generated method stub
		return bDAO.getById(bid);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bDAO.getAll();
	}

	@Override
	public boolean updatebook(Book book) {
		// TODO Auto-generated method stub
		return bDAO.updatebook(book);
	}

	@Override
	public boolean deletebook(int bid) {
		// TODO Auto-generated method stub
		return bDAO.deletebook(bid);
	}

}
