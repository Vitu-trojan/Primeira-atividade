import sun.util.calendar.CalendarSystem;
import sun.util.resources.cldr.CalendarData;

import java.util.Calendar;
import java.util.Scanner;

public class ConfirmDate {
    public static void main(String[]args){
        System.out.println("---Confirmação de idade---");
        Calendar c = Calendar.getInstance();
        int now = c.get(Calendar.YEAR);
        Scanner data = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento:");

        //rubens passou aqui

        int year = data.nextInt();
        int ynow = now - year;
        if (ynow<18){
            System.out.println("Sua idade é de " + ynow + " ano(s). Você é menor de idade.");
        }
        else {
            System.out.println("Sua idade é de " + ynow + "ano(s). Você é maior de idade.");
        }
    }
}