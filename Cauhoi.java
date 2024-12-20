package tracnghiem;

public class Cauhoi {

    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private int answer;
    private int status;

    public Cauhoi(String question, String answerA, String answerB, String answerC, String answerD, int answer, int status) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.answer = answer;
        this.status = status;
    }

    public String getCauhoi() {
        return question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public int getAnswer() {
        return answer;
    }

    public int getStatus() {
        return status;
    }

    public void setCauhoi(String question) {
        this.question = question;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
