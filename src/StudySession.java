public class StudySession{
    private String subject;
    private int minutes;

    //constructor
    public StudySession(String subject, int minutes){
        this.subject = subject;
        this.minutes = minutes;
    }

    //getters
    public String getSubject(){
        return subject;
    }

    public int minutes(){
        return minutes;
    }
}