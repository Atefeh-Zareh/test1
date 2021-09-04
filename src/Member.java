import java.util.ArrayList;
import java.util.List;

public class Member {
    private String firstName;
    private String lastName;
    private Integer membershipCode;
    private List<Book> reservedBooks;

    public void offer(Book book){
        if(reservedBooks == null){
            reservedBooks = new ArrayList<>();
        }
        reservedBooks.add(book);
    }

    public Member() {
    }

    public Member(String firstName, String lastName, Integer membershipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipCode = membershipCode;
    }

    public Member(String firstName, String lastName, Integer membershipCode, List<Book> reservedBooks) {
        this(firstName, lastName, membershipCode); //----- ((5)): call constructor in this class
        this.reservedBooks = reservedBooks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMembershipCode() {
        return membershipCode;
    }

    public void setMembershipCode(Integer membershipCode) {
        this.membershipCode = membershipCode;
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

   /* public void setReservedBooks(List<Book> reservedBooks) {
        this.reservedBooks = reservedBooks;
    }*/

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", membershipCode=" + membershipCode +
                ", reservedBooks=" + reservedBooks +
                '}';
    }
}
