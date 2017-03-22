import java.util.ArrayList;
import java.util.List;

public class NotifySystem {
    private List<User> users;
    private static NotifySystem system = new NotifySystem();

    public static NotifySystem getInstance(){
        return system;
    }

    public List<User> getUsers() {
        return users;
    }

    public void sendSignal( Incident incident) {
    }

    public void addUser( User user) {
        users.add(user);
    }

    private NotifySystem() {}

    private List<User> getUsersFromLocation(String location) {
        List<User> usersFromLocation = new ArrayList<User>();
        for (User u:users
             ) {
            if (u.getLocation().equals(location)) usersFromLocation.add(u);
        }
         return usersFromLocation;
    }

    private void sendByEmal(String email, Incident incident) {
        System.out.println("Am trimis mail !");
    }

    private void sendByPhone(String phone, Incident incident) {
        System.out.println("Am sunat !");
    }

    private void sendByFacebook(String facebook, Incident incident) {
        System.out.println("Am postat pe facebook !");
    }
}