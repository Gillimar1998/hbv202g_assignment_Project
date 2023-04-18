package hbv202g_LibrarySystem;

public class Main {
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("BC_IMPOSSIBLE_CAST")
    public static void main(String[] args) throws NotAtLeastOneAuthorProvided {
        LibrarySystem librarySystem = new LibrarySystem();
        Author George = new Author("George");
        librarySystem.addStudentUser("Paul", false);
        librarySystem.addFacultyMemberUser("Anna", "Book Keeper");
        librarySystem.borrowBook(librarySystem.findUserByName("Paul"), librarySystem.findBookByTitle("Game of thrones"));
        System.out.println(George.getName() + librarySystem.findUserByName("Paul").getName());

    }
}
