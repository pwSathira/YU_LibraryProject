package yorku.eecs.testing;
import static org.junit.Assert.*;
import org.junit.Test;
import yorku.eecs.logic.EmailChecker;

public class TestEmailChecker {

    @Test
    public void testConstructor(){
        EmailChecker checker = new EmailChecker("sareen.akul@gmail.com");
        assertEquals("sareen.akul@gmail.com", checker.getEmail());
    }

    @Test
    public void testGetter(){
        String mail = "sareen.akul@gmail.com";
        EmailChecker checker = new EmailChecker(mail);
        assertEquals(mail, checker.getEmail());
    }

    @Test
    public void testSetter(){
        EmailChecker checker = new EmailChecker("sareen.akul@gmail.com");
        checker.setEmail("akuls18@my.yorku.ca");
        assertEquals("akuls18@my.yorku.ca", checker.getEmail());
    }

    @Test
    public void testMinLengthCheck(){
        assertTrue(EmailChecker.checkLength("akuls18"));
        assertFalse(EmailChecker.checkLength("akul"));
    }

    @Test
    public void testMaxLengthCheck(){
        assertTrue(EmailChecker.checkLength("this@under25.comrs"));
        assertFalse(EmailChecker.checkLength("12345678912345678912345678"));
    }

    @Test
    public void testContainsAT(){
        assertTrue(EmailChecker.containsAtAndDotCom("sareen.akul@gmail.com"));
        assertFalse("Does not contain @", EmailChecker.containsAtAndDotCom("sareen.akulgmail.com"));
    }

    @Test
    public void testDot(){
        assertTrue(EmailChecker.containsAtAndDotCom("sareen.akul@gmail.com"));
        assertFalse("Does not contain Dot", EmailChecker.containsAtAndDotCom("sareenakul@gmailcom"));
    }

    @Test
    public void testCom(){
        assertTrue(EmailChecker.containsAtAndDotCom("sareen.akul@gmail.com"));
        assertFalse("Does not contain com", EmailChecker.containsAtAndDotCom("sareen.akul@gmail"));
    }

    @Test
    public void testDotCom(){
        assertTrue(EmailChecker.containsAtAndDotCom("sareen.akul@gmail.com"));
        assertFalse("Does not contain . and com in right order", EmailChecker.containsAtAndDotCom("sareen.akul@.gmailcom"));
    }

    @Test
    public void testMailCheck(){
        assertTrue(EmailChecker.mailCheck("sareen.akul@gmail.com"));
        assertFalse("Invalid Email", EmailChecker.mailCheck("sareen.akulgmail"));
    }
}
