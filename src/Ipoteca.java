public class Ipoteca {
    public static void main(String[]args){
        double summa=100000;
        double interestRate=6;
        int creditYears=30;

        double month=(interestRate/100)/12;
        int totalMonth=creditYears*12;

        double monthlyPayment=(summa*interestRate*Math.pow(1+month,totalMonth))/
                (Math.pow(1+interestRate,totalMonth)-1);

        System.out.println( monthlyPayment);

    }
}
