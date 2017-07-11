/**
 * Created by Mehrbod on 7/11/2017.
 */
public class PayDToXPayAdapter implements XPay {

    private String fullName;
    private String iD;
    private String money;

    private final PayD payD;

    public PayDToXPayAdapter(PayD payD) {
        this.payD = payD;
        setProp();
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void setID(String iD) {
        this.iD = iD;
    }

    @Override
    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getID() {
        return this.iD;
    }

    @Override
    public String getMoney() {
        return this.money;
    }

    private void setProp() {
        setFullName(payD.getFirstName() + " " + payD.getLastName());
        setID(payD.getIdNumber());
        setMoney(payD.getBalance());
    }
}
