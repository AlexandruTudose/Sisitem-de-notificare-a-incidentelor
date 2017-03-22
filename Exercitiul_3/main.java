public class main {

    public static void main (String args[]){
    NotifySystem system;
    system = NotifySystem.getInstance();

    User user = new User("A", "B");
    Incident incident = new Incident();

    system.addUser(user);
    }
}
