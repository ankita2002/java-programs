
import java.util.*;

class converter {
    public static void main(String[] args) {
        int sec, minutes, hours, days;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nENTER SECONDS:");
        sec = s.nextInt();
        minutes = sec / 60;
        sec = sec % 60;
        hours = minutes / 60;
        minutes = minutes % 60;
        days = hours / 24;
        hours = hours % 24;
        System.out.println("DD:HH:MM:SS = " + days + ":" + hours + ":" + minutes + ":" + sec);
        System.out.println("\n\n");
    }
}
