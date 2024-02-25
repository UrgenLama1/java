class Time {
    int hr, min, sec;

    // Constructor for Time class
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Method to sum two Time objects
    static Time Sum(Time t1, Time t2) {
        int totalSec = t1.sec + t2.sec;
        int totalMin = t1.min + t2.min + totalSec / 60;
        int totalHr = t1.hr + t2.hr + totalMin / 60;
        
        return new Time(totalHr % 24, totalMin % 60, totalSec % 60); // Assuming a 24-hour format for simplicity
    }

    // Method to display time in a specific format
    void display() {
        System.out.printf("%d:%02d:%02d\n", hr, min, sec);
    }
}

public class Lab30 {
    public static void main(String[] args) {
        Time t1 = new Time(5, 40, 40);
        Time t2 = new Time(4, 40, 50);
        
        System.out.print("t1—>");
        t1.display();
        
        System.out.print("t2—>");
        t2.display();
        
        Time t3 = Time.Sum(t1, t2);
        System.out.print("Total Sum t3—>");
        t3.display();
    }
}
