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
        int choice = input.nextInt();
        System.out.println("=== STUDY TRACKER ===\n" + //
                        "\n" + //
                        "1. Add study session\n" + //
                        "2. View all sessions\n" + //
                        "3. View total study time\n" + //
                        "4. View study time by subject\n" + //
                        "5. View statistics\n" + //
                        "6. Exit");
        if(choice == 6){
            running = false;
        }else if(choice == 1){
            
            studyTracker.addStudySession(null);
        }
       }

       input.close();


    }
}