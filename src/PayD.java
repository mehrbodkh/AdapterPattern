/**
 * Created by Mehrbod on 7/11/2017.
 */
public interface PayD {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setIdNumber(String idNumber);
    void setBalance(String balance);

    String getFirstName();
    String getLastName();
    String getIdNumber();
    String getBalance();
}
