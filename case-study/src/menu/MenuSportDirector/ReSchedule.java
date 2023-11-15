package menu.MenuSportDirector;

import menu.Command;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ReSchedule implements Command {
    private LocalTime matchTime;

    public ReSchedule() {
    }

    public ReSchedule(LocalTime initialMatchTime) {
        this.matchTime = initialMatchTime;
    }

    public void reScheduleEarlier(LocalTime newTime) {
        if (newTime.isBefore(matchTime) && !newTime.isBefore(LocalTime.of(0, 0))) { // LocalTime.of(Hour, Minute, Second, Nano);
            matchTime = newTime;
        } else {
            System.out.println("Can only reschedule to an earlier time in the same day.");
        }
    }

    public void reScheduleLater(LocalTime newTime) {
        if (newTime.isAfter(matchTime) && !newTime.isAfter(LocalTime.of(23, 59))) {
            matchTime = newTime;
        } else {
            System.out.println("Can only reschedule to a later time in the same day.");
        }
    }

    public LocalTime getMatchTime() {
        return matchTime;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial match time (HH:MM): ");
        String initialTimeInput = scanner.nextLine();
        LocalTime initialMatchTime;
        try {
            initialMatchTime = LocalTime.parse(initialTimeInput);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format. Please enter time in HH:MM format");
            return;
        }
        ReSchedule reSchedule = new ReSchedule(initialMatchTime);

        System.out.println("Do you want to reschedule earlier or later? (Enter 'earlier' or 'later')");
        String reScheduleChoice = scanner.nextLine();
        if (reScheduleChoice.equalsIgnoreCase("earlier")) {
            System.out.println("Enter the new time to reschedule earlier (HH:MM): ");
            String earlierTimeInput = scanner.nextLine();
            LocalTime earlierTime;
            try {
                earlierTime = LocalTime.parse(earlierTimeInput);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please enter time in HH:MM format.");
                return;
            }
            reSchedule.reScheduleEarlier(earlierTime);
        } else if (reScheduleChoice.equalsIgnoreCase("later")) {
            System.out.println("Enter the new time to reschedule later (HH:MM): ");
            String laterTimeInput = scanner.nextLine();
            LocalTime laterTime;
            try {
                laterTime = LocalTime.parse(laterTimeInput);
            } catch (DateTimeParseException e){
                System.out.println("Invalid time format. Please enter time in HH:MM format");
                return;
            }
            reSchedule.reScheduleLater(laterTime);
        } else {
            System.out.println("Invalid choice. Please enter 'earlier' or 'later'.");
            return;
        }
        System.out.println("The final time of match is: " + reSchedule.getMatchTime());
    }

    public static void main(String[] args) {
        ReSchedule reSchedule = new ReSchedule();
        reSchedule.execute();
    }
}
