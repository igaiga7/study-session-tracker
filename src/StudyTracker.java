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

public int getTotalMinutes(){
    int minutesTotal = 0;
    for(StudySession studySession : studySessions){
        minutesTotal += studySession.getMinutes();
    }
    return minutesTotal;
}

public int getMinutesBySubject(String subject){
    int minutesTotalBySubject = 0;
    for(StudySession studySession : studySessions){
        if (subject.equals(studySession.getSubject())){
            minutesTotalBySubject += studySession.getMinutes();
        }
    }
    return minutesTotalBySubject;
}

    public int countStudySessions(){
        int studySessionCount = 0;
        for(StudySession studySession : studySessions){
            studySessionCount += 1;
        }
        return studySessionCount;
    }

    public StudySession getLongestStudySession(){
        if (studySessions.isEmpty()) {
        return null;
    }
        StudySession longest = studySessions.get(0);
        for (StudySession studySession : studySessions){
            if (studySession.getMinutes() > longest.getMinutes()){
                longest = studySession;
            }
        }
        return longest;
    }
}

