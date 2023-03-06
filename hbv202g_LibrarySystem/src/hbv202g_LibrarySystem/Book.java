package hbv202g_LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Author> authors=new ArrayList<Author>();  
	
	private String title;

	// TODO exception
	public Book(List<Author> authors, String title) throws NotAtLeastOneAuthorProvided {
		super();
		this.authors = authors;
		this.title = title;
	}

	// TODO add
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
