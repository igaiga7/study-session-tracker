import java.util.ArrayList;

public class StudyTracker {
    private ArrayList<StudySession> studySessions;


public StudyTracker(){
    this.studySessions = new ArrayList<>();
}

public void addStudySession(StudySession studySession){
    studySessions.add(studySession);
}

public void displayStudyTracker(){
    for(StudySession studySession : studySessions){
        System.out.println(studySession.getSubject() + " - " + studySession.getMinutes() + " minutes");
    }
}

}

