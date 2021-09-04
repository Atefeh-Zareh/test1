import java.util.List;

public class NationalLibrary extends Library {
    private Integer budget;

    public NationalLibrary() {
        //super(); // ------- ((2)) ->IST EGAL!!!!
        System.out.println("default constructor of NationalLibrary");
        //------- ((3)) ctrl+shilt+alt + L -> formating code
    }

    public NationalLibrary(Integer budget) {
        super(); // ------- ((2)) ->IST EGAL!!!!
        this.budget = budget;
    }

    public NationalLibrary(String libName, Integer libCode, List<Member> members, List<Book> availableBooks, List<Book> borrowedBooks, Integer budget) {
        super(libName, libCode, members, availableBooks, borrowedBooks);
        this.budget = budget;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "NationalLibrary{" +
                "budget=" + budget +
                '}';
    }
}
