/**
 * Created by Mehrbod on 7/11/2017.
 */
public class XPayImpl implements XPay {
    private String fullName;
    private String iD;
    private String money;

    public XPayImpl() {
        this.fullName = null;
        this.iD = null;
        this.money = null;
    }

    public XPayImpl(String fullName, String iD, String money) {
        this.fullName = fullName;
        this.iD = iD;
        this.money = money;
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
        return iD;
    }

    @Override
    public String getMoney() {
        return money;
    }
}
