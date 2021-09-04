import java.util.List;

public class PrivateLibrary  extends  Library{
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public PrivateLibrary() {
        System.out.println("default constructor of PrivateLibrary");
    }

    public PrivateLibrary(String ownerName) {
        this.ownerName = ownerName;
    }

    public PrivateLibrary(String libName, Integer libCode, List<Member> members, List<Book> availableBooks, List<Book> borrowedBooks, String ownerName) {
        super(libName, libCode, members, availableBooks, borrowedBooks);
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "PrivateLibrary{" +
                "ownerName='" + ownerName + '\'' +
                '}';
    }
}
