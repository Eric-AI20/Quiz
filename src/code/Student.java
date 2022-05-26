package code;
/*
    Student Class
    get the answer that student has answered
    keep update for student work progress
 */
public class Student {
    //define student status
    private String isPassedLesson01;//
    private String isPassedLesson02;
    //username
    private String name;

    private AnswerDemo answersLesson01;//lesson 01 quiz answers

    private AnswerDemo answersLesson02;//lesson 02 quiz answers

    //constructor

    public Student(String name) {
        this.name = name;
        this.isPassedLesson01 = "Failed";//by default, the student status will set to failed(not finished)
        this.isPassedLesson02 = "Failed";//by default, the student status will set to failed(not finished)
    }

    //get set method(questions)
    public AnswerDemo getAnswerDemosLesson01() {
        return answersLesson01;
    }

    public void setAnswerDemosLesson01(AnswerDemo answersLesson01) {
        this.answersLesson01 = answersLesson01;
    }

    public AnswerDemo getAnswerDemosLesson02() {
        return answersLesson02;
    }

    public void setAnswerDemosLesson02(AnswerDemo answersLesson02) {
        this.answersLesson02 = answersLesson02;
    }
    //get set method(student status)
    public String getIsPassedLesson01() {
        return isPassedLesson01;
    }

    public void setIsPassedLesson01(String isPassedLesson01) {
        this.isPassedLesson01 = isPassedLesson01;
    }

    public String getIsPassedLesson02() {
        return isPassedLesson02;
    }

    public void setIsPassedLesson02(String isPassedLesson02) {
        this.isPassedLesson02 = isPassedLesson02;
    }
}
