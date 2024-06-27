package homework;

public class Savers{
    private final User user;

    public Savers(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}

