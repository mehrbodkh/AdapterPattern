/**
 * Created by Mehrbod on 7/11/2017.
 */
public class PayDImpl implements PayD {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String balance;

    public PayDImpl() {
        firstName = null;
        lastName = null;
        idNumber = null;
        balance = null;
    }

    public PayDImpl(String firstName, String lastName, String idNumber, String balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.balance = balance;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String getBalance() {
        return balance;
    }
}
