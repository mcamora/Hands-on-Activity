//1.Base class Exam 
public class Exam {
    String message;
    double price;  //3.Declaring double named price
    boolean status; // 4.Declaring boolean named status
    
//Constructor that assign Good luck message 
    public Exam() {
        this.message = "Good luck";
    }
//2.Overloaded Constructor with 2 string parameter  
    public Exam (String period, String level) {
    }
//3.Accessor to get the value of price
    public double getPrice () {
        return price;
    }
    
//4.Accessor to get the value of status
    public boolean isFinished() {
        return status;
    }
}
//5. Midterm class inherits from Exam
class Midterm extends Exam {
    public Midterm(String period, String level) {
        super(period, level);
    }

}
//6.Demonstrating multiple levels of inheritance (Exam -> Midterm -> Essay)
class Essay extends Midterm {
    public Essay(String period, String level) {
        super(period, level);

        String mess = "Graduate ka na";  
    }
//8. class named Quiz inherits from Essay 
class Quiz extends Essay {
    public Quiz (String period, String level) {
        super(period, level);
        System.out.println("Graduate ka na");
    }
}

}
//7.Constructor for Midterm that prints "Exam has started."
class Midterm extends Exam {
    public Midterm(String a) {
        super(a);

        System.out.println("Exam has Started");

    }
}