package hbv202g_LibrarySystem;

import java.time.LocalDate;

public class Lending {
    private Book book;
    private User user;

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    private LocalDate dueDate;

    // TODO
    public Lending(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dueDate = dueDate.plusDays(30);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}