package MainTask;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        for(int i=1;i<5;i++){
            student = student.generate(i);
            System.out.println(student.toCSV());
        }
    }
}
