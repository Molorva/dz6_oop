package homework;

public class Main{
    public static void main(String[] args){
        Savers s = new Savers(new User("Bob"));
        s.report();
        s.save();
    }
}