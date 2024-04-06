import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.ArrayList<yorku.eecs.model.user.User> userList1 = userController0.getAdminQueue();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty3 = new yorku.eecs.model.user.NonFaculty();
        adminController0.deleteUser((yorku.eecs.model.user.User) nonFaculty3);
        yorku.eecs.model.user.Faculty faculty5 = new yorku.eecs.model.user.Faculty();
        java.util.List<java.util.List<java.lang.String>> strListList7 = faculty5.toCSV(0);
        yorku.eecs.model.user.Admin admin14 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController15 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin14);
        java.lang.String str16 = admin14.getUserName();
        java.lang.String[] strArray19 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        admin14.setSubscribedList(strList20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = adminController0.authenticateUser((yorku.eecs.model.user.User) faculty5, (yorku.eecs.model.user.User) admin14);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        yorku.eecs.model.user.Student student0 = new yorku.eecs.model.user.Student();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.ArrayList<yorku.eecs.model.item.Book> bookList1 = student0.getCourseBook();
    }
}

