public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        System.out.println(creditPaymentService.calculate(12, 1000000, 9.99));
        System.out.println(creditPaymentService.calculate(24, 1000000, 9.99));
        System.out.println(creditPaymentService.calculate(36, 1000000, 9.99));
    }
}
