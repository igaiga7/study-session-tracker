import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
       //create study tracker
       StudyTracker studyTracker = new StudyTracker();

       //create running Scanner
       Scanner input = new Scanner(System.in);

       //create running boolean
       boolean running = true;

       //while loop with menu
       while(running){
        System.out.println("=== STUDY TRACKER ===\n" + //
                        "\n" + //
                        "1. Add study session\n" + //
                        "2. View all sessions\n" + //
                        "3. View total study time\n" + //
                        "4. View study time by subject\n" + //
                        "5. View statistics\n" + //
                        "6. Exit");
        
        int choice = input.nextInt();
        input.nextLine();

        switch(choice){
            case 1:
                System.out.println("Enter subject: ");
                String subject = input.nextLine();
                System.out.println("Enter minutes: ");
                int minutes = input.nextInt();
                input.nextLine();

                StudySession newSession = new StudySession(subject, minutes);

                studyTracker.addStudySession(newSession);
                System.out.println("New study session added!");
                break;
            
            case 2:
                studyTracker.displayStudyTracker();
                break;
            
            case 3:
                System.out.println("Your current total study time is: " + studyTracker.getTotalMinutes());
                break;
            
            case 4:
                System.out.println();
                System.out.println("Enter the subject: ");
                String subjectForGettingMinutes = input.nextLine();
                System.out.println("You studied "+ subjectForGettingMinutes + " for " + studyTracker.getMinutesBySubject(subjectForGettingMinutes) + " minutes total.");
                break;
            case 5:
            System.out.println("STATISTICS:");
            System.out.println("Number of study sessions: " + studyTracker.countStudySessions());

        StudySession longest = studyTracker.getLongestStudySession();

        if (longest != null) {
            System.out.println(
                "Longest study session: "
                + longest.getSubject()
                + " - "
                + longest.getMinutes()
                + " minutes"
            );
        }else{
            System.out.println("Longest study session: none yet");
        }
            break;
            case 6: 
                running = false;
                break;
            default:
                System.out.println("Invalid option. Enter a number from 1 to 6.");
        }
       }

       input.close();


    }
}