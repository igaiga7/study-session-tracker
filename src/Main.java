public class Main{
    public static void main(String[] args){
        
        //Initialize study sessions

        StudySession studySession = new StudySession("Java", 60);
    

        StudySession studySession2 = new StudySession("Mathematics", 40);

        StudySession studySession3 = new StudySession("Robotics", 50);

        //initialize study tracker
        StudyTracker studyTracker = new StudyTracker();


        //Add study sessions to tracker
        studyTracker.addStudySession(studySession);
        studyTracker.addStudySession(studySession2);
        studyTracker.addStudySession(studySession3);

        //display study tracker
        studyTracker.displayStudyTracker();
        
        //print total minutes studied: 
        System.out.println("Total study time: " + studyTracker.getTotalMinutes());

        System.out.println(studyTracker.getMinutesBySubject("Java"));
    }
}