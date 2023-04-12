package hbv202g_LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Author> authors=new ArrayList<Author>();  
	
	private String title;

	// TODO throw exception if author list is empty
	public Book(String title, List<Author> authors) throws NotAtLeastOneAuthorProvided {
		super();
		this.authors = authors;
		this.title = title;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public List<Author> getAuthors() {
		return authors;
	}

	// TODO throw exception if author list is empty
	public void setAuthors(List<Author> authors) throws NotAtLeastOneAuthorProvided  {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
