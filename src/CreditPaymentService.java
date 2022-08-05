public class CreditPaymentService {
    public int calculate(int day , int summ , double percent){
        double monthlyPayment = summ*((percent/100/12)+((percent/100/12)/(((Math.pow((1+percent/100/12),day))-1))));
        return (int) monthlyPayment;
    }
}
