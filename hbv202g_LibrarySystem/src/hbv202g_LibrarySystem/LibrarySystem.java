package hbv202g_LibrarySystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// TODO AI may help filling stuff
public class LibrarySystem {
    private List<Book> books = new ArrayList<Book>();
    private List<User> users = new ArrayList<User>();

    private List<Lending> lendings = new ArrayList<Lending>();

    // TODO: initialise fields in constructor or field?
    public LibrarySystem() {
        // TODO Auto-generated constructor stub
    }


    // TODO Exception
    // Add book using title and author
    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws NotAtLeastOneAuthorProvided {
        books.add(new Book(title, authors));

    }

    // Add new user of type student with a name and feePaid flag
    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));
    }

    // Add new user of type FacultyMember with a name and department
    public void addFacultyMemberUser(String name, String department) {
        users.add(new FacultyMember(name, department));
    }

    // find book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // find user by name
    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // a user of type User can borrow a book of type Book
    public void borrowBook(User user, Book book) {
        lendings.add(new Lending(book, user));
    }

    // extend a lending of a book of type Book for a user of type FacultyMember
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws NotAtLeastOneAuthorProvided {

    }

    // return a book from a user
    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }


}
