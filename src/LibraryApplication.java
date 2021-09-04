import java.util.ArrayList;
import java.util.List;

public class LibraryApplication {//shift+f6: rename

    public static void main(String[] args) {
        //testObjectInstantiation();
        //testToString();
        //testValues();
        testBorrow();

    }

    private static void testBorrow() {
        Book book1 = new Book("IR123", "Alice in Wonderland", "Alice", "5-15");
        Member member1 = new Member("Elnaz", "Gharoon", 143);
        System.out.println("Reserved Books before borrow:"+member1.getReservedBooks());
        member1.offer(book1);
        System.out.println("Reserved Books after borrow:"+member1.getReservedBooks());
    }


    private static void testValues() {
        Book book1 = new Book("IR123", "Alice in Wonderland", "Alice", "5-15");
        Book book2 = new Book("IR009", "Third Waive", "Bob", "25-70");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        //String firstName, String lastName, Integer membershipCode, List<Book> reservedBooks
        Member member1 = new Member("Elnaz", "Gharoon", 143);
        Member member2 = new Member("Morteza", "Hoseini", 675);
        List<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        Library library = new Library("Melli e Tehran", 100, members, books);
        System.out.println(library);
    }

    static void testToString(){
        //Library library = new Library("Melli e Tehran", 100, null, null, null);
        Book book1 = new Book("IR123", "Alice in Wonderland", "Alice", "5-15");
        System.out.println(book1);
        // ((4)): ----- > toString is not overridden: Book@65ab7765: memory address of book1
        // ((4)): ----- > toString is overridden: Book{isbn='IR123', bookName='Alice in Wonderland', authorName='Alice', ageGroup='5-15'}
    }

    static void testObjectInstantiation(){
        System.out.println("1");
        Library library = new Library();
        System.out.println("2");
        Library libraryNational = new NationalLibrary();
        System.out.println("3");
        Library libraryPrivate = new PrivateLibrary();
        System.out.println("4");
        NationalLibrary libraryNational2 = new NationalLibrary();
        System.out.println("5");
        PrivateLibrary libraryPrivate2 = new PrivateLibrary();
    }
}
