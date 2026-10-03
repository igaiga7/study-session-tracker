public class StudySession{
    private String subject;
    private int minutes;

    //constructor
    public StudySession(String subject, int minutes){
        if (minutes <= 0){
            throw new IllegalArgumentException("Minutes must be greater than 0.");
        }
        this.subject = subject;
        this.minutes = minutes;
    }

    //getters
    public String getSubject(){
        return subject;
    }

    public int getMinutes(){
        return minutes;
    }
}