package yorku.eecs.model.user;

import yorku.eecs.model.user.User;

public class Faculty extends User {
    public Faculty() {
        super();
    }
    public Faculty(int id, String userName, String firstName, String lastName, String emailAddress, String password) {
        super(Integer.toString(id),password);
    }



}
