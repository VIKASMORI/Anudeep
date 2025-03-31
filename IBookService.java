package project.com.LibraryManagementSystem.Services;

import java.util.List;

import project.com.LibraryManagementSystem.Models.Book;

public interface IBookService {
	 public boolean addbook(Book book);
	   public Book getById(int bid);
	   public List<Book> getAll();
	   public boolean updatebook(Book book);
	   public boolean deletebook(int bid);
	
}
