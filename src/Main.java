/**
 * Created by Mehrbod on 7/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        PayD payD = new PayDImpl("Mehrbod", "Khiabani", "93101103", "2900$");

        XPay xPay = new PayDToXPayAdapter(payD);

        System.out.println(xPay.getFullName());
        System.out.println(xPay.getID());
        System.out.println(xPay.getMoney());
    }
}
