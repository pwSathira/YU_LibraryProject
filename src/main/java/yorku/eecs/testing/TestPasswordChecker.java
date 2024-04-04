package yorku.eecs.testing;
import static org.junit.Assert.*;
import org.junit.Test;
import yorku.eecs.logic.PasswordChecker;
public class TestPasswordChecker {


    @Test
    public void testConstructor(){
        PasswordChecker checker = new PasswordChecker("New Password");
        assertEquals("New Password", checker.getPassword());
    }

    @Test
    public void testGetter(){
        String password = "Password, I want";
        PasswordChecker checker = new PasswordChecker(password);
        assertEquals(password, checker.getPassword());
    }

    @Test
    public void testSetter(){
        PasswordChecker checker = new PasswordChecker("Donald Trump");
        checker.setPassword("Truedo");
        assertEquals("Truedo", checker.getPassword());
    }

    @Test
    public void testPasswordLength(){
        assertTrue(PasswordChecker.checkLength("12345678"));
        assertFalse("Write appropriate length", PasswordChecker.checkLength("abcdefg"));
    }

    @Test
    public void testUpperCase(){
        assertTrue(PasswordChecker.checkUpperCase("AllisWell"));
        assertFalse("Must contain an upper Case", PasswordChecker.checkUpperCase("alliswell"));
    }

    @Test
    public void testLowerCase(){
        assertTrue(PasswordChecker.checkLowerCase("allIsWell"));
        assertFalse("Must contain atleast 1 lower case", PasswordChecker.checkLowerCase("ALLISWELL"));
    }

    @Test
    public void testDigit(){
        assertTrue(PasswordChecker.checkDigit("Allis11"));
        assertFalse("Must conatain a digit", PasswordChecker.checkDigit("noDigitsHere"));
    }

    @Test
    public void testRepititions(){
        assertTrue(PasswordChecker.checkRepetitions("12312312345"));
        assertFalse("No 3 consecutive letters should be there", PasswordChecker.checkRepetitions("1112222444444"));
    }

    @Test
    public void testStrength(){
        assertTrue(PasswordChecker.checkStrength("AbCde1fhsd"));
        assertFalse("Password is not Strong", PasswordChecker.checkStrength("abcdef"));
    }

    //Need One More

}
