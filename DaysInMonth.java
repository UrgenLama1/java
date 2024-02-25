import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (1 for January, 2 for February, ..., 12 for December): ");
        int month = scanner.nextInt();
        
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        int numberOfDays = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                numberOfDays = 31;
                break;
            case 2:
                monthName = "February";
                // Check for leap year
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case 3:
                monthName = "March";
                numberOfDays = 31;
                break;
            case 4:
                monthName = "April";
                numberOfDays = 30;
                break;
            case 5:
                monthName = "May";
                numberOfDays = 31;
                break;
            case 6:
                monthName = "June";
                numberOfDays = 30;
                break;
            case 7:
                monthName = "July";
                numberOfDays = 31;
                break;
            case 8:
                monthName = "August";
                numberOfDays = 31;
                break;
            case 9:
                monthName = "September";
                numberOfDays = 30;
                break;
            case 10:
                monthName = "October";
                numberOfDays = 31;
                break;
            case 11:
                monthName = "November";
                numberOfDays = 30;
                break;
            case 12:
                monthName = "December";
                numberOfDays = 31;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        if (!monthName.equals("")) {
            System.out.println(monthName + " " + year + " has " + numberOfDays + " days.");
        }
        
        scanner.close();
    }
}
