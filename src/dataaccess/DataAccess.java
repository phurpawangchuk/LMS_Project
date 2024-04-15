package dataaccess;

import java.util.HashMap;

import business.Book;
import business.LibraryMember;


public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
	public void saveNewMember(LibraryMember member); 
	public void saveNewBook(Book book);
	public void updateBook(Book book);
	public  void updateLibraryMember(LibraryMember member);
    public void removeBook();
}
