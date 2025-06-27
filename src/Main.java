import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmClock;
        try{
            System.out.print("Enter an alarm time (HH:MM:SS): ");
            String inputTime = scanner.nextLine();

            alarmClock = LocalTime.parse(inputTime, formatter);
            System.out.println("Alarm set for " + alarmClock);

        }
        catch (DateTimeParseException e){
            System.out.println("Enter (HH:MM:SS) this order ");
        }

        scanner.close();


    }
}