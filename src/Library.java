import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libName;
    private Integer libCode;
    private List<Member> members;
    private List<Book> availableBooks;
    private List<Book> borrowedBooks; //------ ((1)): null

    public Boolean borrow(Member member, Book book){
        /*
        1- if member is in members
        2- book is in availableBooks

         */
        return null;
    }


    public Library() {
        System.out.println("default constructor of Library");
    }

    public Library(String libName, Integer libCode, List<Member> members, List<Book> availableBooks, List<Book> borrowedBooks) {
        this.libName = libName;
        this.libCode = libCode;
        this.members = members;
        this.availableBooks = availableBooks;
        this.borrowedBooks = borrowedBooks;
    }

    public Library(String libName, Integer libCode, List<Member> members, List<Book> availableBooks) {
        this.libName = libName;
        this.libCode = libCode;
        this.members = members;
        this.availableBooks = availableBooks;
        this.borrowedBooks = new ArrayList<>();//------ ((1)): not null but is empty.
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public Integer getLibCode() {
        return libCode;
    }

    public void setLibCode(Integer libCode) {
        this.libCode = libCode;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(List<Book> availableBooks) {
        this.availableBooks = availableBooks;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libName='" + libName + '\'' +
                ", libCode=" + libCode +
                ", members=" + members +
                ", availableBooks=" + availableBooks +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
