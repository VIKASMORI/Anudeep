package project.com.LibraryManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import project.com.LibraryManagementSystem.DAOImpl.BookDAOImpl;
import project.com.LibraryManagementSystem.DAOImpl.IssueDAOImpl;
import project.com.LibraryManagementSystem.DAOImpl.UserDAOImpl;
import project.com.LibraryManagementSystem.Models.Book;
import project.com.LibraryManagementSystem.Models.Issue;
import project.com.LibraryManagementSystem.Models.User;
import project.com.LibraryManagementSystem.Services.BookService;
import project.com.LibraryManagementSystem.Services.IBookService;
import project.com.LibraryManagementSystem.Services.IIssueService;
import project.com.LibraryManagementSystem.Services.IUserService;
import project.com.LibraryManagementSystem.Services.IssueService;
import project.com.LibraryManagementSystem.Services.UserService;
import project.com.LibraryManagementSystem.DAO.UserDAO;
import project.com.LibraryManagementSystem.DAO.IssueDAO;
import project.com.LibraryManagementSystem.DAO.BookDAO;

public class Menu {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void displayMenu() throws NumberFormatException, IOException {
		System.out.println("1 : Book");
		System.out.println("2 : User");
		System.out.println("3 : Issue");
		System.out.println("Enter Your choice : ");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {
		case 1:
			displayBookMenu();
			break;
		case 2:
			displayUserMenu();
			break;
		case 3 :
			displayIssueMenu();
			break;
		default:
			System.out.println("Please enter valid choice :");
		}
	}

	public void displayBookMenu() throws NumberFormatException, IOException {
		
    do {
		//BookDAO  bDAO = new BookDAOImpl();
    	IBookService ibs=new BookService();
        
		System.out.println("1 : Add New Book");
		System.out.println("2 : View Book");
		System.out.println("3 : View All Book");
		System.out.println("4 : Update Book");
		System.out.println("5 : Delete Book");
		System.out.println("6 : Return to main menu");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {
		case 1:{
			System.out.println("Enter New Book Id :");
			int bid = Integer.parseInt(br.readLine());

			System.out.println("Enter Book Name :");
			String bname = br.readLine();

			System.out.println("Enter Author Name :");
			String auther = br.readLine();

			Book book = new Book(bid, bname, auther);
			boolean res = ibs.addbook(book);
			if (res) {
				System.out.println("Book Added Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}
		case 2:{
			System.out.println("Enter Book Id : ");
			int bid = Integer.parseInt(br.readLine());
			System.out.println(ibs.getById(bid));
			break;
		}
		case 3:{
			List<Book> blist =  ibs.getAll();
			for(Book b:blist) {
				System.out.println(b);
			}
			break;
		}
		case 4:{
			System.out.println("Enter Book Id for Update : ");
			int bid = Integer.parseInt(br.readLine());
			System.out.println("Enter Book Name : ");
			String bname = br.readLine();
			System.out.println("Enter Book Author Name : ");
			String auther = br.readLine();
			
			Book book = new Book(bid,bname,auther);
			boolean res = ibs.updatebook(book);
			if(res){
				System.out.println("Book Update Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}
		case 5:{
			System.out.println("Enter Book Id : ");
			int bid = Integer.parseInt(br.readLine());
			boolean res = (ibs.deletebook(bid));
			if(res){
				System.out.println("Book Delete Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
			}
		case 6: {
			displayMenu();
		}
		default:
			System.out.println("Please enter valid choice :");
		}

		System.out.println("Do you want to continue? (yes/no): ");

	} while (br.readLine().equalsIgnoreCase("yes"));

}   
public void displayUserMenu() throws NumberFormatException, IOException {

	do {
		//UserDAO uDAO = new UserDAOImpl();
		IUserService ius= new UserService();
		
		System.out.println("1 : Add New User");
		System.out.println("2 : View User");
		System.out.println("3 : View All User");
		System.out.println("4 : Update User");
		System.out.println("5 : Delete User");
		System.out.println("6 : Back to Main Menu");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {
		case 1: {
			System.out.println("Enter New User Id :");
			int uid = Integer.parseInt(br.readLine());

			System.out.println("Enter User Name :");
			String uname = br.readLine();

			System.out.println("Enter Subject :");
			String subject= br.readLine();

			System.out.println("Enter Contact :");
			String contact = br.readLine();

			User user = new User(uid, uname, subject, contact);
			boolean res = ius.adduser(user);
			if (res) {
				System.out.println("User Added Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}

		case 2: {
			System.out.println("Enter User Id : ");
			int uid = Integer.parseInt(br.readLine());
			System.out.println(ius.getById(uid));
			break;
		}

		case 3: {
			List<User> ulist = ius.getAll();
			for (User u : ulist) {
				System.out.println(u);
			}
			break;
		}

		case 4: {
			System.out.println("Enter User Id for Update : ");
			int uid = Integer.parseInt(br.readLine());
			System.out.println("Enter User Name : ");
			String uname = br.readLine();
			System.out.println("Enter Subject : ");
			String subject = br.readLine();
			System.out.println("Enter User Contact : ");
			String contact = br.readLine();

			User user = new User(uid, uname, subject, contact);
			boolean res = ius.updateuser(user);
			if (res) {
				System.out.println("User Update Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}

		case 5: {
			System.out.println("Enter User Id : ");
			int uid = Integer.parseInt(br.readLine());
			boolean res = ius.deleteuser(uid);
			if (res) {
				System.out.println("User Delete Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}
		case 6: {
			displayMenu();
		}
		default:
			System.out.println("Please enter valid choice :");
		}

		System.out.println("Do you want to continue? (yes/no): ");

	} while (br.readLine().equalsIgnoreCase("yes"));
}

public void displayIssueMenu() throws NumberFormatException, IOException {

	do {

//		IssueDAO iDAO = new IssueDAOImpl();
//		UserDAO uDAO = new UserDAOImpl();
//		BookDAO bDAO = new BookDAOImpl();
		IBookService ibs=new BookService();
		IUserService ius= new UserService();
		IIssueService iis = new IssueService();
		System.out.println("1 : Issue new Book");
		System.out.println("2 : View Issue");
		System.out.println("3 : View All Issue");
		System.out.println("4 : Update Issue");
		System.out.println("5 : Delete Issue");
		System.out.println("6 : Back to Main Menu");

		int ch = Integer.parseInt(br.readLine());

		switch (ch) {
		case 1: {
			System.out.println("Enter Issue Id :");
			int iid = Integer.parseInt(br.readLine());

			System.out.println("Enter User id : ");
			int uid = Integer.parseInt(br.readLine());

			System.out.println("Enter Book id : ");
			int bid = Integer.parseInt(br.readLine());

			User user = ius.getById(uid);
			if (user == null) {
				System.out.println("User ID not found!");
				return;
			}

			Book book = ibs.getById(bid);
			if (book == null) {
				System.out.println("Book ID not found!");
				return;
			}

			LocalDate issueDate = LocalDate.now();
			LocalDate returnDate = issueDate.plusDays(10);
            Issue issue=new Issue(iid,user,book,issueDate,returnDate);
			boolean res = iis.addissue(issue);
			if (res) {
				System.out.println("Book Issue Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}
		case 2: {
			System.out.println("Enter Issue Id : ");
			int iid = Integer.parseInt(br.readLine());
			System.out.println(iis.getById(iid));
			break;
		}
		case 3: {
			List<Issue> ulist = iis.getAll();
			for (Issue i : ulist) {
				System.out.println(i);
			}
			break;
		}
		case 4: {
			System.out.println("Enter Issue Id for Update : ");
			int iid = Integer.parseInt(br.readLine());
			System.out.println("Enter User Id : ");
			int uid = Integer.parseInt(br.readLine());
			System.out.println("Enter Book Id : ");
			int bid = Integer.parseInt(br.readLine());

			User user = ius.getById(uid);
			Book book = ibs.getById(bid);

			if (user == null || book == null) {
				System.out.println("Invalid User ID or Book ID.");
				break;
			}

			LocalDate issueDate = LocalDate.now();
			LocalDate returnDate = issueDate.plusDays(10);

			Issue issue = new Issue(iid,user ,book ,issueDate, returnDate);
			boolean res = iis.updateissue(issue);
			if (res) {
				System.out.println("Issue Update Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}

		case 5: {
			System.out.println("Enter Issue Id : ");
			int iid = Integer.parseInt(br.readLine());
			boolean res = iis.deleteissue(iid);
			if (res) {
				System.out.println("Issue Delete Succesfully.");
			} else {
				System.out.println("Somethong went wrong !");
			}
			break;
		}

		case 6: {
			displayMenu();
		}
		default: {
			System.out.println("Please enter valid choice :");
		}

		}
		System.out.println("Do you want to continue? (yes/no): ");

	} while (br.readLine().equalsIgnoreCase("yes"));
}
}