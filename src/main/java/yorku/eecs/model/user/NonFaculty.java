package yorku.eecs.model.user;

import yorku.eecs.model.user.User;

public class NonFaculty extends User {

    public NonFaculty() {
        super();
    }
    public NonFaculty(int id, String userName, String firstName, String lastName, String emailAddress, String password) {
        super(Integer.toString(id),password);
    }
}
