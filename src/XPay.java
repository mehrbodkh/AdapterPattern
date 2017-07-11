/**
 * Created by Mehrbod on 7/11/2017.
 */
public interface XPay {
    void setFullName(String fullName);
    void setID(String iD);
    void setMoney(String money);

    String getFullName();
    String getID();
    String getMoney();
}
