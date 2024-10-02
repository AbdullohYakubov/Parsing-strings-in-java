import java.time.Period;
import java.util.Scanner;

public class PeriodClass {
    // public static void main(String[] args){
    //     String time = "P21Y3M4D";
    //     Period p = Period.parse(time);
    //     System.out.println("The time is: \n" + p.getYears() + " Years \n" + p.getMonths() + " Months \n" + p.getDays() + " Days \n");
    // }

    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = inputDevice.nextInt();
        System.out.println("Enter the number of months: ");
        int months = inputDevice.nextInt();
        System.out.println("Enter the number of days: ");
        int days = inputDevice.nextInt();
        String time = "P" + years + "Y" + months + "M" + days + "D";
        Period p = Period.parse(time);
        System.out.println("The time is: \n" + p.getYears() + " Years \n" + p.getMonths() + " Months \n" + p.getDays() + " Days \n");
    }
}
