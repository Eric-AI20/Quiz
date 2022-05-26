package code;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EduManager {
    //Main method
    public static void main(String[] args) {
        //new arrayList store student data.
        ArrayList<Student> array = new ArrayList<Student>();
        //default user.
        Student user1 = new Student("ayh");
        array.add(user1);
        Student user2 = new Student("txt");
        array.add(user2);
        //call login method
        login(array);

    }

    //Login interface
    public static void login(ArrayList<Student> array) {
        while (true) {
            //layout
            System.out.println("******* Welcome to the learning system ******");
            System.out.println("******* Hope you will enjoy it ******");
            System.out.println("Enter your username: ");
            //input username
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            Student loginStudent = new Student(name);
            mainPage(loginStudent, array);

        }
    }

    //Main page
    public static void mainPage(Student loginStudent, ArrayList<Student> array) {
        //return to the main menu after every activity
        while (true) {
            //main menu layout
            System.out.println("--------Welcome to the main menu --------");
            System.out.println("1 Lessons list");//lesson details
            System.out.println("2 User setting");//
            System.out.println("3 Log out");
            System.out.println("4 Terminate the system");
            System.out.println("Select your choice：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //select options
            switch (line) {
                case "1":
                    courseList(loginStudent,array);
                    break;
                case "2":
                    manage(loginStudent, array);
                    break;
                case "3":
                    login(array);
                    break;
                case "4":
                    System.out.println("Hope you enjoying this system");
                    System.exit(0);//terminate the system
            }
        }
    }

    // CourseList
    public static void courseList(Student loginStudent, ArrayList<Student> array){
        while (true) {
            //menu
            System.out.println("--------Welcome to JAVA lesson list--------");
            System.out.println("1 Lesson 01 introduction to JAVA programming");
            System.out.println("2 Lesson 02 introduction to JAVA OO");
            System.out.println("3 Back to the main menu");
            System.out.println("Your choice ：");
            //scanner
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //select the option
            switch (line) {
                case "1":
                    lesson01Intro(loginStudent,array);
                    break;
                case "2":
                    lesson02Intro(loginStudent,array);
                    break;
                case "3":
                    mainPage(loginStudent,array);
                    break;
            }
        }
    }

    // Lesson 01
    public static void lesson01Intro(Student loginStudent, ArrayList<Student> array) {
        while (true) {
            //default score
            int count = 0;
            //lesson introduction
            System.out.println("Lesson 01: introduction to JAVA programming");
            System.out.println("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible");
            System.out.println("It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation");
            System.out.println(" Are you ready for the quiz?（Y or N） ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if (line.equals("Y")) {//if the student want to do the quiz
                // check the student have already done the quiz
                if (Objects.nonNull(loginStudent.getAnswerDemosLesson01())) {//student has already done the quiz,show the result.
                    System.out.println("huya!, you have already done the quiz, here are your answer: ");
                    // lesson 01 quiz's answers
                    System.out.println("     Answer for Question 01         ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson01().getAnswer1() + " ");
                    System.out.println("     Answer for Question 02         ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson01().getAnswer2() + " ");
                    System.out.println("     Answer for Question 03         ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson01().getAnswer3() + " ");
                    System.out.println("     Answer for Question 04         ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson01().getAnswer4() + " ");
                    System.out.println("     Answer for Question 05         ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson01().getAnswer5() + " ");
                    System.out.println("");
                    break;
                } else {
                    // quiz
                    System.out.println("Welcome to lesson 01 quiz, good luck!!!");
                    System.out.println("Question 01:  Which statement is not true in java language?\n" +
                            "A.  A public member of a class can be accessed in all the packages.\n" +
                            "B. A private member of a class cannot be accessed by the methods of the same class.\n" +
                            "C.  A private member of a class cannot be accessed from its derived class.\n" +
                            "D. A protected member of a class can be accessed from its derived class.");
                    String answer1 = sc.nextLine();//B
                    if(answer1.equals("B") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L1 Q1 Answer 1
                    System.out.println("Your answer is:" + answer1);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 02:Which one of the following is not true?\n" +
                            "A. A class containing abstract methods is called an abstract class.\n" +
                            "B. Abstract methods should be implemented in the derived class.\n" +
                            "C. An abstract class cannot have non-abstract methods.\n" +
                            "D. A class must be qualified as ‘abstract’ class, if it contains one abstract method.");//C
                    String answer2 = sc.nextLine();//C
                    if(answer2.equals("C") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L1 Q1 Answer 2
                    System.out.println("Your answer is:" + answer2);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 03: Which of the following is true?\n" +
                            "A. A finally block is executed before the catch block but after the try block.\n" +
                            "B. A finally block is executed, only after the catch block is executed.\n" +
                            "C. A finally block is executed whether an exception is thrown or not.\n" +
                            "D.  A finally block is executed, only if an exception occurs.");
                    String answer3 = sc.nextLine();//C
                    if(answer3.equals("C") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L1 Q1 Answer 3
                    System.out.println("Your answer is:" + answer3);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 04: What is the type and value of the following expression? (Notice the integer division)\n" +
                            "A. int -5\n" +
                            "B. double -4.5\n" +
                            "C. int -4\n" +
                            "D. double -5.0");
                    String answer4 = sc.nextLine();//D
                    if(answer4.equals("D") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L1 Q1 Answer 4
                    System.out.println("Your answer is:" + answer4);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 05:  Which of the following variable declaration would NOT compile in a java program?\n" +
                            "A. int var\n" +
                            "B. int VAR\n" +
                            "C. int var1\n" +
                            "D. int 1_var");
                    String answer5 = sc.nextLine();//D
                    if(answer5.equals("D") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L1 Q1 Answer 5
                    System.out.println("Your answer is:" + answer5);
                    //sleep 1s
                    systemSleep(1);
                    //create a new object answer, store 5 answers
                    AnswerDemo answer = new AnswerDemo(answer1,answer2,answer3,answer4,answer5);
                    //pass answer to the loginStudent
                    loginStudent.setAnswerDemosLesson01(answer);
                    //change the student status from failed(default) to passed
                    loginStudent.setIsPassedLesson01("Passed");
                    System.out.println("-------Thanks for answering all questions-------");
                    System.out.println("-------Your score is" + count);
                    System.out.println("-------Redirecting to the JAVA lesson list menu......");
                    //sleep 3 seconds
                    systemSleep(3);
                    System.out.println("");
                    break;
                }
            }
            if (line.equals("N")) {//if no, return to the main page
                System.out.println("Redirecting to the main page......");
                //sleep 1 second
                systemSleep(1);
                mainPage(loginStudent,array);
            }
        }
    }

    // Lesson 02
    public static void lesson02Intro(Student loginStudent, ArrayList<Student> array) {
        while (true) {
            //correct answers(0 by default)
            int count = 0;
            //lesson 02 introduction
            System.out.println("          lesson 02 introduction to JAVA OO");
            System.out.println("According to Wiki, Object-oriented programming (OOP) is a programming paradigm based on the concept of \"objects\", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).");

            System.out.println("Are you ready for the quiz?（Y or N）  ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if (line.equals("Y")) {//if the student want to do the quiz
                //  check the student have already done the quiz
                if (Objects.nonNull(loginStudent.getAnswerDemosLesson02())) {
                    System.out.println("----------You have already answered all the questions----------");
                    // lesson 02 quiz's answers
                    System.out.println("          Answer for Question 01:");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson02().getAnswer1());
                    System.out.println("          Answer for Question 02:");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson02().getAnswer2());
                    System.out.println("          Answer for Question 03 ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson02().getAnswer3());
                    System.out.println("          Answer for Question 04 ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson02().getAnswer4());
                    System.out.println("          Answer for Question 05 ");
                    System.out.println(" " + loginStudent.getAnswerDemosLesson02().getAnswer5());
                } else {
                    // quiz
                    System.out.println("Question 01: The default value of a static integer variable of a class in Java is:\n" +
                            "A. 0\t\t\t B. 1\t\t\t C.Null\t\t\t D.0");
                    String answer1 = sc.nextLine();//A
                    if(answer1.equals("A")){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L2 Q1 answer1
                    System.out.println("Your answer is:" + answer1);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 02:  Multiple inheritance means:\n" +
                            "A. one class inheriting from more super classes\n" +
                            "B. more classes inheriting from one super class\n" +
                            "C. more classes inheriting from more super classes\n" +
                            "D. None of the above");
                    String answer2 = sc.nextLine();//A
                    if(answer2.equals("A") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L2 Q2 answer2
                    System.out.println("Your answer is:" + answer2);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 03: To prevent any method from overriding, we declare the method as\n" +
                            "A. static\n" +
                            "B. const\n" +
                            "C. final\n" +
                            "D. abstract");
                    String answer3 = sc.nextLine();//C
                    if(answer3.equals("C") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L2 Q3 answer3
                    System.out.println("Your answer is:" + answer3);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 04:  The fields in an interface are implicitly specified as\n" +
                            "A. static\n" +
                            "B. protected\n" +
                            "C. private\n" +
                            "D. both static and final");//D
                    String answer4 = sc.nextLine();
                    if(answer4.equals("D") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L2 Q4 answer4
                    System.out.println("Your answer is:" + answer4);
                    //sleep 1s
                    systemSleep(1);
                    System.out.println("Question 05: Which of the following is not true?\n" +
                            "A. An interface can extend another interface." +
                            "B. A class which is implementing an interface must implement all the methods of the interface.\n" +
                            "C. An interface can implement another interface.\n" +
                            "D. An interface is a solution for multiple inheritance in java.");
                    String answer5 = sc.nextLine();//C
                    if(answer2.equals("C") ){
                        System.out.println("You are correct");
                        count += 1;
                    }else {
                        System.out.println("you are wrong");
                    }
                    //L2 Q5 answer5
                    System.out.println("Your answer is:" + answer5);
                    //sleep 1s
                    systemSleep(1);
                    //create a new answer object, store the answers in this object :answer
                    AnswerDemo answer = new AnswerDemo(answer1,answer2,answer3,answer4,answer5);
                    //pass answer to the loginStudent
                    loginStudent.setAnswerDemosLesson02(answer);
                    //set the status up to Passed(failed by default)
                    loginStudent.setIsPassedLesson02("Passed");
                    System.out.println("-------Thanks for answering all questions-------");
                    System.out.println("-------Your score is" + count);
                    System.out.println("-------Redirecting to the JAVA lesson list menu......");
                    //sleep 3 seconds
                    systemSleep(3);
                    System.out.println("");
                    break;
                }
            }
            if (line.equals("N")) {//if no, return to the main page
                System.out.println("Redirecting to the main page......");
                systemSleep(1);
                mainPage(loginStudent,array);
            }
        }
    }

    // student management page
    public static void manage(Student loginStudent, ArrayList<Student> array) {
        //endless loop
        while (true) {
            //main menu
            System.out.println("--------Welcome to the student management system--------");
            System.out.println("1 check student status");
            System.out.println("2 return to the main menu");
            System.out.println("select your choice：");
            //Scanner
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //select options
            switch (line) {

                case "1":
                    studentStatus(loginStudent, array);//check student status(which quiz have been done)
                    break;

                case "2":
                    mainPage(loginStudent,array);//mainpage
                    break;
            }
        }
    }

    //student status
    public static void studentStatus(Student loginStudent, ArrayList<Student> array) {

        //create a table
        //create the table's header
        System.out.println("\t\t\tstatus");

        //check the status


        if(loginStudent.getIsPassedLesson01().equals("Passed")){
            System.out.print("Lesson 01 done" + "\n");
        }else{
            System.out.println("Lesson 01 not finish");
        }

        if(loginStudent.getIsPassedLesson02().equals("Passed")){
            System.out.print("Lesson 02 done" + "\n");
        }else{
            System.out.println("Lesson 02 not finish");
        }



    }

    //system sleep
    public static void systemSleep(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

