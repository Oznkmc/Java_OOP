interface PaymentMethod {
    void pay(double amount);
    boolean refund(double amount);
}

class CreditCardPayment implements PaymentMethod {
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Credit Card " + cardNumber);
    }

    @Override
    public boolean refund(double amount) {
        System.out.println(amount + " refunded to Credit Card " + cardNumber);
        return true;
    }
}

class PayPalPayment implements PaymentMethod {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal account " + email);
    }

    @Override
    public boolean refund(double amount) {
        System.out.println(amount + " refunded to PayPal account " + email);
        return true;
    }
}

public class PaymentSystems {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment("1234-5678-9876-5432");
        PaymentMethod payment2 = new PayPalPayment("user@gmail.com");

        payment1.pay(100.0);
        payment2.pay(250.0);

        payment1.refund(50.0);
        payment2.refund(100.0);
    }
}
