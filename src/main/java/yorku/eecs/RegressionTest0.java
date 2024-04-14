package yorku.eecs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkLength("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkStrength("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = javax.swing.text.JTextComponent.DEFAULT_KEYMAP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        yorku.eecs.model.item.Magazine.Builder builder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.item.Magazine magazine1 = new yorku.eecs.model.item.Magazine(builder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        yorku.eecs.model.user.NonFaculty nonFaculty0 = new yorku.eecs.model.user.NonFaculty();
        nonFaculty0.setLastName("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        yorku.eecs.model.item.ItemFactory itemFactory0 = new yorku.eecs.model.item.ItemFactory();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.List<java.util.List<java.lang.String>> strListList1 = null; // flaky: yorku.eecs.logic.CsvUtil.readCsv("hi!");
// flaky:         org.junit.Assert.assertNotNull(strListList1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = javax.swing.SwingConstants.LEADING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        yorku.eecs.model.user.NonFaculty nonFaculty0 = new yorku.eecs.model.user.NonFaculty();
        java.lang.String str1 = nonFaculty0.getEmailAddress();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = javax.swing.SwingConstants.TOP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        yorku.eecs.model.item.Item item1 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminController0.deleteItem(item1);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: Invalid item type or class");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        javax.swing.JPanel jPanel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.controller.card.CardController cardController1 = new yorku.eecs.controller.card.CardController(jPanel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.ArrayList<java.util.List<java.lang.String>> strListList0 = new java.util.ArrayList<java.util.List<java.lang.String>>();
        yorku.eecs.logic.CsvUtil.writeCsv((java.util.List<java.util.List<java.lang.String>>) strListList0, "default", true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        // The following exception was thrown during execution in test generation
        try {
            adminController0.readItem("hi!", "");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: Item type not found: ");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user3 = yorku.eecs.model.user.UserFactory.createUser("", "default", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin7 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController8 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin7);
        admin7.setId((-1));
        admin7.setLastName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            userController0.updateUser((yorku.eecs.model.user.User) admin7);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User type not found: Admin");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkLowerCase("default");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String[] strArray4 = new java.lang.String[] { "default", "default", "default" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user7 = yorku.eecs.model.user.UserFactory.createUser("default", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: default");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkDigit("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        javax.swing.ImageIcon imageIcon0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.ImageIcon imageIcon3 = yorku.eecs.logic.ImageProcessor.resizeIcon(imageIcon0, 64, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = javax.swing.SwingConstants.PREVIOUS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        yorku.eecs.model.item.Item item0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "default", "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.item.Item item7 = yorku.eecs.model.item.ItemFactory.updateItem(item0, (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = javax.swing.SwingConstants.HORIZONTAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        yorku.eecs.model.user.UserFactory userFactory0 = new yorku.eecs.model.user.UserFactory();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String[] strArray3 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user6 = yorku.eecs.model.user.UserFactory.createUser("", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkLowerCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        builder2.itemConstructor(64, "hi!", "default", "hi!", (int) ' ', "", 100);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user5 = adminController0.readUser("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User type not found: hi!");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int0 = javax.swing.SwingConstants.WEST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = javax.swing.SwingConstants.CENTER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int0 = javax.swing.SwingConstants.SOUTH_WEST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = javax.swing.SwingConstants.SOUTH_EAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        yorku.eecs.logic.PasswordChecker passwordChecker1 = new yorku.eecs.logic.PasswordChecker("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.List<java.lang.String>> strListList1 = yorku.eecs.logic.CsvUtil.readCsv("0");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.logic.CSVError; message: Error reading CSV file");
        } catch (yorku.eecs.logic.CSVError e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        book16.setLocation("default");
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        yorku.eecs.controller.item.RentListController rentListController1 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController2 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin9 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController10 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin9);
        admin9.setId((-1));
        admin9.setLastName("hi!");
        userController2.addToAdminQueue((yorku.eecs.model.user.User) admin9);
        yorku.eecs.model.item.Textbook.Builder builder16 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book17 = builder16.build();
// flaky:         rentListController1.createEntry((yorku.eecs.model.user.User) admin9, (yorku.eecs.model.item.Item) book17);
        book17.setPrice(0);
        java.util.List<java.util.List<java.lang.String>> strListList22 = book17.toCSV((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            adminController0.updateItem((yorku.eecs.model.item.Item) book17);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: Item update failed");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(strListList22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int0 = javax.swing.SwingConstants.TRAILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkUpperCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int0 = javax.swing.SwingConstants.NEXT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.controller.user.UserController userController2 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin9 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController10 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin9);
        admin9.setId((-1));
        admin9.setLastName("hi!");
        userController2.addToAdminQueue((yorku.eecs.model.user.User) admin9);
        userController1.approveUser((yorku.eecs.model.user.User) admin9, "hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "default", "", "default", "0" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        yorku.eecs.model.user.Faculty faculty25 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray28 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        faculty25.setSubscribedList(strList29);
        double double32 = yorku.eecs.controller.item.ItemController.cosineSimilarity((java.util.List<java.lang.String>) strList23, (java.util.List<java.lang.String>) strList29);
        userController1.printRecords((java.util.List<java.lang.String>) strList29);
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.item.Item item34 = yorku.eecs.model.item.ItemFactory.createItem("", (java.util.List<java.lang.String>) strList29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.7071067811865475d + "'", double32 == 0.7071067811865475d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        yorku.eecs.model.user.Faculty faculty0 = new yorku.eecs.model.user.Faculty();
        java.util.List<java.util.List<java.lang.String>> strListList2 = faculty0.toCSV(0);
        org.junit.Assert.assertNotNull(strListList2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        yorku.eecs.logic.CustomDocumentFilter customDocumentFilter0 = new yorku.eecs.logic.CustomDocumentFilter();
        javax.swing.text.DocumentFilter.FilterBypass filterBypass1 = null;
        javax.swing.text.AttributeSet attributeSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            customDocumentFilter0.replace(filterBypass1, (int) (byte) 0, 0, "default", attributeSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder4.itemID(10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str0 = javax.swing.JTextField.notifyAction;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "notify-field-accept" + "'", str0, "notify-field-accept");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book1 = builder0.build();
        book1.setItemID(64);
        java.lang.String str4 = book1.getStringID();
        book1.setPublisher("0");
        org.junit.Assert.assertNotNull(book1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "64" + "'", str4, "64");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkRepetitions("notify-field-accept");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkStrength("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }



    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.List<java.lang.String> strList3 = yorku.eecs.logic.CsvUtil.getRecordByColumn("default", "64", 13);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkLowerCase("64");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Textbook textbook7 = new yorku.eecs.model.item.Textbook(builder0);
        yorku.eecs.model.item.Book.Builder builder9 = builder0.publisher("notify-field-accept");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Book book7 = builder0.build();
        java.lang.String str8 = book7.getStringId();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int0 = javax.swing.SwingConstants.NORTH_WEST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        yorku.eecs.logic.CustomDocumentFilter customDocumentFilter0 = new yorku.eecs.logic.CustomDocumentFilter();
        javax.swing.text.DocumentFilter.FilterBypass filterBypass1 = null;
        javax.swing.text.AttributeSet attributeSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            customDocumentFilter0.insertString(filterBypass1, 8, "hi!", attributeSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty3 = new yorku.eecs.model.user.NonFaculty();
// flaky:         adminController0.deleteUser((yorku.eecs.model.user.User) nonFaculty3);
        yorku.eecs.controller.user.LibraryController libraryController5 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) nonFaculty3);
        java.lang.String str6 = nonFaculty3.getUserName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Book.Builder builder4 = builder2.price(64);
        yorku.eecs.model.item.Book.Builder builder6 = builder4.itemName("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = itemTableModel15.getValueAt(13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        admin6.setEmailAddress("");
        java.lang.String str9 = admin6.getStringId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.controller.item.RentListController rentListController3 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController4 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin11 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController12 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin11);
        admin11.setId((-1));
        admin11.setLastName("hi!");
        userController4.addToAdminQueue((yorku.eecs.model.user.User) admin11);
        yorku.eecs.model.item.Textbook.Builder builder18 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book19 = builder18.build();
// flaky:         rentListController3.createEntry((yorku.eecs.model.user.User) admin11, (yorku.eecs.model.item.Item) book19);
        book19.setPrice(0);
        java.util.List<java.util.List<java.lang.String>> strListList24 = book19.toCSV((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            adminController0.updateItem((yorku.eecs.model.item.Item) book19);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: Item update failed");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(book19);
        org.junit.Assert.assertNotNull(strListList24);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty3 = new yorku.eecs.model.user.NonFaculty();
// flaky:         adminController0.deleteUser((yorku.eecs.model.user.User) nonFaculty3);
        yorku.eecs.controller.user.UserController userController5 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.controller.user.UserController userController6 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin13 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController14 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin13);
        admin13.setId((-1));
        admin13.setLastName("hi!");
        userController6.addToAdminQueue((yorku.eecs.model.user.User) admin13);
        userController5.approveUser((yorku.eecs.model.user.User) admin13, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            adminController0.updateUser((yorku.eecs.model.user.User) admin13);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User type not found: Admin");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user5 = adminController0.readUser("", "");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User type not found: ");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder2.location("notify-field-accept");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        yorku.eecs.model.item.Textbook.Builder builder10 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book11 = builder10.build();
        course9.setTextbook(book11);
        course9.setCourseName("0");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNotNull(book11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        javax.swing.ImageIcon imageIcon0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.ImageIcon imageIcon3 = yorku.eecs.logic.ImageProcessor.resizeIcon(imageIcon0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book1 = builder0.build();
        book1.setItemID(64);
        java.lang.String str4 = book1.getItemName();
        org.junit.Assert.assertNotNull(book1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        yorku.eecs.model.user.Faculty faculty18 = new yorku.eecs.model.user.Faculty();
        // The following exception was thrown during execution in test generation
        try {
            rentListController0.checkEntry((yorku.eecs.model.user.User) faculty18);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User does not exist");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Book.Builder builder4 = builder2.price(64);
        yorku.eecs.model.item.Book book5 = new yorku.eecs.model.item.Book(builder2);
        java.lang.String str6 = book5.getISBN();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        yorku.eecs.controller.ControllerError controllerError1 = new yorku.eecs.controller.ControllerError("notify-field-accept");
        java.lang.String str2 = controllerError1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yorku.eecs.controller.ControllerError: notify-field-accept" + "'", str2, "yorku.eecs.controller.ControllerError: notify-field-accept");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        java.util.Date date10 = course9.getStartDate();
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Book.Builder builder4 = builder0.location("hi!");
        yorku.eecs.model.item.Book.Builder builder6 = builder0.price((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        yorku.eecs.model.user.Admin admin0 = new yorku.eecs.model.user.Admin();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ToolTipText" + "'", str0, "ToolTipText");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Book book7 = builder0.build();
        yorku.eecs.model.item.Book.Builder builder9 = builder0.location("notify-field-accept");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("64");
        yorku.eecs.model.item.Magazine.Builder builder4 = builder0.location("hi!");
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsUpdated((int) (short) -1, 11);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkDigit("ToolTipText");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        java.lang.String str18 = book16.getPublisher();
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book1 = builder0.build();
        int int2 = book1.getQuantity();
        org.junit.Assert.assertNotNull(book1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkUpperCase("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.NonFaculty nonFaculty1 = new yorku.eecs.model.user.NonFaculty();
        userController0.removeFromAdminQueue((yorku.eecs.model.user.User) nonFaculty1);
        java.lang.String str4 = userController0.determineUserType("64");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Book book7 = builder0.build();
        yorku.eecs.model.item.Textbook textbook8 = new yorku.eecs.model.item.Textbook(builder0);
        yorku.eecs.model.item.Book.Builder builder10 = builder0.ISBN("0");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        yorku.eecs.model.item.CD_DVD.Builder builder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.item.CD_DVD cD_DVD1 = new yorku.eecs.model.item.CD_DVD(builder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }



    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.controller.user.UserController userController2 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin9 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController10 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin9);
        admin9.setId((-1));
        admin9.setLastName("hi!");
        userController2.addToAdminQueue((yorku.eecs.model.user.User) admin9);
        userController1.approveUser((yorku.eecs.model.user.User) admin9, "hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "default", "", "default", "0" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        yorku.eecs.model.user.Faculty faculty25 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray28 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        faculty25.setSubscribedList(strList29);
        double double32 = yorku.eecs.controller.item.ItemController.cosineSimilarity((java.util.List<java.lang.String>) strList23, (java.util.List<java.lang.String>) strList29);
        userController1.printRecords((java.util.List<java.lang.String>) strList29);
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.item.Item item34 = yorku.eecs.model.item.ItemFactory.createItem("notify-field-accept", (java.util.List<java.lang.String>) strList29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown item type: notify-field-accept");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.7071067811865475d + "'", double32 == 0.7071067811865475d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }






    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("64");
        yorku.eecs.model.item.Magazine.Builder builder4 = builder2.ISSN("hi!");
        yorku.eecs.model.item.Magazine.Builder builder6 = builder2.publisher("hi!");
        yorku.eecs.model.item.Magazine.Builder builder8 = builder2.itemID((int) (short) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        book5.setItemName("");
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
    }





    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        java.lang.String str7 = admin6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }



    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        yorku.eecs.model.user.Visitor visitor2 = new yorku.eecs.model.user.Visitor("100", "0");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = itemTableModel15.getValueAt(64, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user3 = yorku.eecs.model.user.UserFactory.createUser("", "100", "notify-field-accept");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = itemTableModel15.isCellEditable((int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = itemTableModel15.getColumnClass((int) (short) 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.List<java.lang.String> strList1 = yorku.eecs.controller.item.ItemController.tokenize("notify-field-accept");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book book5 = new yorku.eecs.model.item.Book((yorku.eecs.model.item.Book.Builder) builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = yorku.eecs.logic.CsvUtil.getLastInstanceByColumn("", 6);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.logic.CSVError; message: Error reading CSV file");
        } catch (yorku.eecs.logic.CSVError e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int0 = javax.swing.SwingConstants.EAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        yorku.eecs.controller.user.AdminController adminController18 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str20 = adminController18.determineUserType("");
        yorku.eecs.model.user.Admin admin27 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController28 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin27);
        admin27.setId((-1));
        admin27.setLastName("hi!");
        java.lang.String str33 = admin27.getPassword();
        yorku.eecs.controller.user.UserController userController34 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin41 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController42 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin41);
        admin41.setId((-1));
        admin41.setLastName("hi!");
        userController34.addToAdminQueue((yorku.eecs.model.user.User) admin41);
        yorku.eecs.model.user.Faculty faculty48 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray51 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        faculty48.setSubscribedList(strList52);
        userController34.addToAdminQueue((yorku.eecs.model.user.User) faculty48);
        boolean boolean56 = adminController18.authenticateUser((yorku.eecs.model.user.User) admin27, (yorku.eecs.model.user.User) faculty48);
        yorku.eecs.controller.user.AdminController adminController57 = new yorku.eecs.controller.user.AdminController();
        yorku.eecs.controller.item.RentListController rentListController58 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.AdminController adminController59 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str61 = adminController59.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty62 = new yorku.eecs.model.user.NonFaculty();
// flaky:         adminController59.deleteUser((yorku.eecs.model.user.User) nonFaculty62);
        yorku.eecs.controller.user.LibraryController libraryController64 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) nonFaculty62);
        java.util.Date date67 = null;
        java.util.Date date68 = null;
        yorku.eecs.model.item.Textbook.Builder builder69 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book70 = builder69.build();
        book70.setItemID(64);
        java.lang.String str73 = book70.getStringID();
        yorku.eecs.model.Course course74 = new yorku.eecs.model.Course("hi!", "0", date67, date68, book70);
        yorku.eecs.model.item.Textbook.Builder builder75 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book76 = builder75.build();
        course74.setTextbook(book76);
        rentListController58.createEntry((yorku.eecs.model.user.User) nonFaculty62, (yorku.eecs.model.item.Item) book76);
        adminController57.deleteItem((yorku.eecs.model.item.Item) book76);
        rentListController0.returnEntry((yorku.eecs.model.user.User) admin27, (yorku.eecs.model.item.Item) book76);
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(book70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "64" + "'", str73, "64");
        org.junit.Assert.assertNotNull(book76);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        javax.swing.text.Keymap keymap2 = null;
        javax.swing.text.Keymap keymap3 = javax.swing.text.JTextComponent.addKeymap("", keymap2);
        javax.swing.text.Keymap keymap4 = javax.swing.text.JTextComponent.addKeymap("64", keymap3);
        javax.swing.text.JTextComponent.KeyBinding keyBinding5 = null;
        javax.swing.text.JTextComponent.KeyBinding[] keyBindingArray6 = new javax.swing.text.JTextComponent.KeyBinding[] { keyBinding5 };
        javax.swing.Action[] actionArray7 = new javax.swing.Action[] {};
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.text.JTextComponent.loadKeymap(keymap4, keyBindingArray6, actionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keymap3);
        org.junit.Assert.assertNotNull(keymap4);
        org.junit.Assert.assertNotNull(keyBindingArray6);
        org.junit.Assert.assertNotNull(actionArray7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        admin6.setId((-1));
        admin6.setLastName("hi!");
        java.lang.String str12 = admin6.getPassword();
        admin6.setPassword("notify-field-accept");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        yorku.eecs.model.item.Textbook.Builder builder10 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book11 = builder10.build();
        course9.setTextbook(book11);
        java.util.Date date13 = course9.getStartDate();
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Item item3 = builder2.build();
        java.util.List<java.util.List<java.lang.String>> strListList5 = item3.toCSV((int) (byte) 0);
        int int6 = item3.getPrice();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(item3);
        org.junit.Assert.assertNotNull(strListList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        userController0.approveUser((yorku.eecs.model.user.User) admin8, "hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "default", "", "default", "0" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        yorku.eecs.model.user.Faculty faculty24 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray27 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        faculty24.setSubscribedList(strList28);
        double double31 = yorku.eecs.controller.item.ItemController.cosineSimilarity((java.util.List<java.lang.String>) strList22, (java.util.List<java.lang.String>) strList28);
        userController0.printRecords((java.util.List<java.lang.String>) strList28);
        java.lang.String[] strArray37 = new java.lang.String[] { "default", "", "default", "0" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        yorku.eecs.model.user.Faculty faculty40 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray43 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        faculty40.setSubscribedList(strList44);
        double double47 = yorku.eecs.controller.item.ItemController.cosineSimilarity((java.util.List<java.lang.String>) strList38, (java.util.List<java.lang.String>) strList44);
        userController0.printRecords((java.util.List<java.lang.String>) strList44);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.7071067811865475d + "'", double31 == 0.7071067811865475d);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.7071067811865475d + "'", double47 == 0.7071067811865475d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        yorku.eecs.logic.CSVError cSVError1 = new yorku.eecs.logic.CSVError("notify-field-accept");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Textbook textbook7 = new yorku.eecs.model.item.Textbook(builder0);
        java.lang.String str8 = textbook7.getStringID();
        textbook7.setQuantity((int) 'a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        javax.swing.event.TableModelListener tableModelListener19 = null;
        itemTableModel15.removeTableModelListener(tableModelListener19);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        java.util.Date date10 = course9.getEndDate();
        java.util.Date date11 = course9.getStartDate();
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder2.location("default");
        yorku.eecs.model.item.Book.Builder builder6 = builder2.itemID((int) (short) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        yorku.eecs.logic.PasswordChecker passwordChecker1 = new yorku.eecs.logic.PasswordChecker("yorku.eecs.controller.ControllerError: notify-field-accept");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean1 = yorku.eecs.logic.EmailChecker.checkLength("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        boolean boolean1 = yorku.eecs.logic.EmailChecker.containsAtAndDotCom("64");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        yorku.eecs.controller.ControllerError controllerError1 = new yorku.eecs.controller.ControllerError("notify-field-accept");
        java.lang.Throwable[] throwableArray2 = controllerError1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Book.Builder builder8 = builder6.price((int) (byte) 1);
        yorku.eecs.model.item.Book book9 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(book9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Student student1 = new yorku.eecs.model.user.Student();
        userController0.approveUser((yorku.eecs.model.user.User) student1, "100");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.List<java.lang.String>> strListList1 = yorku.eecs.logic.CsvUtil.readCsv("64");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.logic.CSVError; message: Error reading CSV file");
        } catch (yorku.eecs.logic.CSVError e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        book16.setPrice(0);
        book16.setLocation("default");
        int int22 = book16.getItemID();
        org.junit.Assert.assertNotNull(book16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin(4, "", "ToolTipText", "100", "64", "notify-field-accept");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = itemTableModel15.isCellEditable((int) 'a', (int) (short) 0);
        int int22 = itemTableModel15.getRowCount();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Textbook textbook1 = new yorku.eecs.model.item.Textbook(builder0);
        yorku.eecs.model.item.Textbook textbook2 = builder0.build();
        yorku.eecs.model.item.Book book3 = builder0.build();
        org.junit.Assert.assertNotNull(textbook2);
        org.junit.Assert.assertNotNull(book3);
    }



    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Faculty faculty1 = new yorku.eecs.model.user.Faculty();
        userController0.removeFromAdminQueue((yorku.eecs.model.user.User) faculty1);
    }



    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("default");
        org.junit.Assert.assertNotNull(builder2);
    }



    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Book book7 = builder0.build();
        java.util.List<java.util.List<java.lang.String>> strListList9 = book7.toCSV((int) ' ');
        book7.setQuantity(2);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(strListList9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        yorku.eecs.model.user.Admin admin24 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        admin24.setEmailAddress("");
        // The following exception was thrown during execution in test generation
        try {
            rentListController0.checkEntry((yorku.eecs.model.user.User) admin24);
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User does not exist");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Item item3 = builder2.build();
        builder2.itemConstructor(1, "0", "0", "hi!", (int) (byte) 10, "hi!", (int) (short) -1);
        yorku.eecs.model.item.Book.Builder builder13 = builder2.expiryDate("0");
        yorku.eecs.model.item.Book.Builder builder15 = builder13.location("yorku.eecs.controller.ControllerError: notify-field-accept");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(item3);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        yorku.eecs.logic.ImageProcessor imageProcessor0 = new yorku.eecs.logic.ImageProcessor();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.ISBN("hi!");
        yorku.eecs.model.item.Item item3 = builder2.build();
        java.util.List<java.util.List<java.lang.String>> strListList5 = item3.toCSV((int) (byte) 0);
        item3.setExpiryDate("default");
        int int8 = item3.getPrice();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(item3);
        org.junit.Assert.assertNotNull(strListList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        boolean boolean1 = yorku.eecs.logic.EmailChecker.mailCheck("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("64");
        yorku.eecs.model.item.Magazine.Builder builder4 = builder2.ISSN("hi!");
        yorku.eecs.model.item.Magazine.Builder builder6 = builder2.publisher("hi!");
        yorku.eecs.model.item.Magazine.Builder builder8 = builder6.itemName("default");
        yorku.eecs.model.item.Magazine magazine9 = builder8.build();
        yorku.eecs.model.item.Magazine.Builder builder11 = builder8.ISSN("0");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(magazine9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty3 = new yorku.eecs.model.user.NonFaculty();
// flaky:         adminController0.deleteUser((yorku.eecs.model.user.User) nonFaculty3);
        java.lang.String str5 = nonFaculty3.getEmailAddress();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("64");
        yorku.eecs.model.item.Magazine.Builder builder4 = builder2.ISSN("hi!");
        yorku.eecs.model.item.Magazine.Builder builder6 = builder2.publisher("hi!");
        yorku.eecs.model.item.Magazine.Builder builder8 = builder2.quantity(8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        yorku.eecs.model.item.Newsletter newsletter0 = new yorku.eecs.model.item.Newsletter();
        newsletter0.loadFrame("yorku.eecs.controller.ControllerError: notify-field-accept");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.lang.Object obj2 = idField0.getTreeLock();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNotNull(obj2);
    }



    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = itemTableModel15.isCellEditable((int) 'a', (int) (short) 0);
        itemTableModel15.fireTableCellUpdated((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = itemTableModel15.getColumnName((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        boolean boolean8 = idField6.isOptimizedDrawingEnabled();
        int int11 = idField6.getBaseline((int) '4', 12);
        java.awt.Point point12 = null;
        // The following exception was thrown during execution in test generation
        try {
            idField6.setLocation(point12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.setAlignmentY((float) (-1L));
        java.awt.Point point3 = null;
        // The following exception was thrown during execution in test generation
        try {
            idField0.setLocation(point3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        yorku.eecs.model.item.Magazine.Builder builder0 = new yorku.eecs.model.item.Magazine.Builder();
        yorku.eecs.model.item.Magazine.Builder builder2 = builder0.ISSN("64");
        yorku.eecs.model.item.Magazine.Builder builder4 = builder2.ISSN("hi!");
        yorku.eecs.model.item.Magazine.Builder builder6 = builder2.publisher("hi!");
        yorku.eecs.model.item.Magazine.Builder builder8 = builder6.itemName("default");
        yorku.eecs.model.item.Magazine magazine9 = builder8.build();
        magazine9.setItemName("64");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(magazine9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        yorku.eecs.model.user.Faculty faculty0 = new yorku.eecs.model.user.Faculty();
        faculty0.setId(11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Throwable throwable1 = null;
        yorku.eecs.controller.ControllerError controllerError2 = new yorku.eecs.controller.ControllerError("default", throwable1);
        yorku.eecs.controller.ControllerError controllerError4 = new yorku.eecs.controller.ControllerError("notify-field-accept");
        controllerError2.addSuppressed((java.lang.Throwable) controllerError4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        yorku.eecs.controller.ControllerError controllerError1 = new yorku.eecs.controller.ControllerError("hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int int0 = javax.swing.SwingConstants.RIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        javax.swing.DropMode dropMode1 = idField0.getDropMode();
        org.junit.Assert.assertTrue("'" + dropMode1 + "' != '" + javax.swing.DropMode.USE_SELECTION + "'", dropMode1.equals(javax.swing.DropMode.USE_SELECTION));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book1 = builder0.build();
        book1.setExpiryDate("0");
        java.lang.String str4 = book1.getISBN();
        org.junit.Assert.assertNotNull(book1);
        org.junit.Assert.assertNull(str4);
    }



    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        boolean boolean1 = idField0.isOpaque();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        yorku.eecs.controller.user.UserController userController0 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        userController0.approveUser((yorku.eecs.model.user.User) admin8, "hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "default", "", "default", "0" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        yorku.eecs.model.user.Faculty faculty24 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray27 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        faculty24.setSubscribedList(strList28);
        double double31 = yorku.eecs.controller.item.ItemController.cosineSimilarity((java.util.List<java.lang.String>) strList22, (java.util.List<java.lang.String>) strList28);
        userController0.printRecords((java.util.List<java.lang.String>) strList28);
        java.lang.String str34 = userController0.determineUserType("hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.7071067811865475d + "'", double31 == 0.7071067811865475d);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int int0 = javax.swing.SwingConstants.NORTH_EAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkDigit("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        boolean boolean6 = idField0.isVisible();
        int int7 = idField0.getComponentCount();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.setAlignmentY((float) (-1L));
        idField0.setName("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        idField6.selectAll();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = idField6.getComponent((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        idField0.removePropertyChangeListener("default", propertyChangeListener2);
        java.awt.dnd.DropTarget dropTarget4 = idField0.getDropTarget();
        org.junit.Assert.assertNotNull(dropTarget4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int int0 = javax.swing.SwingConstants.NORTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        yorku.eecs.model.item.Textbook.Builder builder10 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book11 = builder10.build();
        course9.setTextbook(book11);
        java.lang.String str13 = course9.getCourseCode();
        yorku.eecs.model.item.Textbook.Builder builder14 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book15 = builder14.build();
        course9.setTextbook(book15);
        yorku.eecs.controller.item.RentListController rentListController17 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.AdminController adminController18 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str20 = adminController18.determineUserType("");
        yorku.eecs.model.user.NonFaculty nonFaculty21 = new yorku.eecs.model.user.NonFaculty();
// flaky:         adminController18.deleteUser((yorku.eecs.model.user.User) nonFaculty21);
        yorku.eecs.controller.user.LibraryController libraryController23 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) nonFaculty21);
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        yorku.eecs.model.item.Textbook.Builder builder28 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book29 = builder28.build();
        book29.setItemID(64);
        java.lang.String str32 = book29.getStringID();
        yorku.eecs.model.Course course33 = new yorku.eecs.model.Course("hi!", "0", date26, date27, book29);
        yorku.eecs.model.item.Textbook.Builder builder34 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book35 = builder34.build();
        course33.setTextbook(book35);
// flaky:         rentListController17.createEntry((yorku.eecs.model.user.User) nonFaculty21, (yorku.eecs.model.item.Item) book35);
        course9.setTextbook(book35);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(book15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(book29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "64" + "'", str32, "64");
        org.junit.Assert.assertNotNull(book35);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        yorku.eecs.controller.item.NewsletterController newsletterController0 = new yorku.eecs.controller.item.NewsletterController();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        yorku.eecs.controller.user.LibraryController libraryController8 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        boolean boolean9 = libraryController8.checkOverdue();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        // The following exception was thrown during execution in test generation
        try {
            yorku.eecs.model.user.User user3 = adminController0.readUser("64", "100");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: User type not found: 100");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Textbook textbook7 = new yorku.eecs.model.item.Textbook(builder0);
        textbook7.setEdition("");
        textbook7.setLocation("yorku.eecs.controller.ControllerError: notify-field-accept");
        textbook7.setLocation("0");
        java.util.List<java.util.List<java.lang.String>> strListList15 = textbook7.toCSV(20);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strListList15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        boolean boolean1 = yorku.eecs.logic.EmailChecker.checkLength("notify-field-accept");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.setAlignmentY((float) (-1L));
        java.awt.GraphicsConfiguration graphicsConfiguration3 = idField0.getGraphicsConfiguration();
        org.junit.Assert.assertNull(graphicsConfiguration3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        idField0.setAlignmentX((float) (-1));
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.grabFocus();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        idField0.setAutoscrolls(false);
        org.junit.Assert.assertNotNull(dimension1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        yorku.eecs.controller.user.AdminController adminController0 = new yorku.eecs.controller.user.AdminController();
        java.lang.String str2 = adminController0.determineUserType("");
        yorku.eecs.model.user.Admin admin9 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController10 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin9);
        admin9.setId((-1));
        admin9.setLastName("hi!");
        java.lang.String str15 = admin9.getPassword();
        yorku.eecs.controller.user.UserController userController16 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin23 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController24 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin23);
        admin23.setId((-1));
        admin23.setLastName("hi!");
        userController16.addToAdminQueue((yorku.eecs.model.user.User) admin23);
        yorku.eecs.model.user.Faculty faculty30 = new yorku.eecs.model.user.Faculty();
        java.lang.String[] strArray33 = new java.lang.String[] { "default", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        faculty30.setSubscribedList(strList34);
        userController16.addToAdminQueue((yorku.eecs.model.user.User) faculty30);
        boolean boolean38 = adminController0.authenticateUser((yorku.eecs.model.user.User) admin9, (yorku.eecs.model.user.User) faculty30);
        // The following exception was thrown during execution in test generation
        try {
            adminController0.readItem("default", "64");
            org.junit.Assert.fail("Expected exception of type yorku.eecs.controller.ControllerError; message: Item type not found: 64");
        } catch (yorku.eecs.controller.ControllerError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        idField6.selectAll();
        yorku.eecs.logic.IdField idField9 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension10 = idField9.getPreferredSize();
        java.awt.im.InputContext inputContext11 = idField9.getInputContext();
        yorku.eecs.logic.IdField idField12 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension13 = idField12.getPreferredSize();
        idField9.setPreferredSize(dimension13);
        yorku.eecs.logic.IdField idField15 = new yorku.eecs.logic.IdField();
        idField9.remove((java.awt.Component) idField15);
        idField15.selectAll();
        int int18 = idField6.getComponentZOrder((java.awt.Component) idField15);
        java.awt.Event event19 = null;
        boolean boolean21 = idField15.keyDown(event19, 12);
        boolean boolean22 = idField15.isLightweight();
        idField15.removeNotify();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(inputContext11);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.event.FocusListener focusListener2 = null;
        idField0.removeFocusListener(focusListener2);
        yorku.eecs.logic.IdField idField4 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension5 = idField4.getPreferredSize();
        boolean boolean6 = idField4.isCursorSet();
        idField4.move((int) (byte) -1, (int) (short) 10);
        boolean boolean10 = idField4.isVisible();
        boolean boolean11 = idField0.isAncestorOf((java.awt.Component) idField4);
        boolean boolean12 = idField4.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.setAlignmentY((float) (-1L));
        javax.swing.text.Caret caret3 = idField0.getCaret();
        javax.swing.text.Keymap keymap4 = idField0.getKeymap();
        org.junit.Assert.assertNotNull(caret3);
        org.junit.Assert.assertNotNull(keymap4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.event.FocusListener focusListener2 = null;
        idField0.removeFocusListener(focusListener2);
        yorku.eecs.logic.IdField idField4 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension5 = idField4.getPreferredSize();
        boolean boolean6 = idField4.isCursorSet();
        idField4.move((int) (byte) -1, (int) (short) 10);
        boolean boolean10 = idField4.isVisible();
        boolean boolean11 = idField0.isAncestorOf((java.awt.Component) idField4);
        yorku.eecs.logic.IdField idField12 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension13 = idField12.getPreferredSize();
        boolean boolean14 = idField12.isCursorSet();
        idField12.move((int) (byte) -1, (int) (short) 10);
        java.awt.Dimension dimension18 = idField12.getPreferredScrollableViewportSize();
        idField4.setMinimumSize(dimension18);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dimension18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        javax.swing.text.Keymap keymap1 = javax.swing.text.JTextComponent.getKeymap("");
        org.junit.Assert.assertNotNull(keymap1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        boolean boolean3 = idField0.getVerifyInputWhenFocusTarget();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        java.awt.event.ActionListener actionListener6 = null;
        idField0.removeActionListener(actionListener6);
        idField0.repaint((long) 3, (int) (byte) 0, 11, 13, 64);
        yorku.eecs.logic.IdField idField14 = new yorku.eecs.logic.IdField();
        idField14.setAlignmentY((float) (-1L));
        yorku.eecs.model.user.Admin admin23 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController24 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin23);
        java.lang.String str25 = admin23.getUserName();
        java.lang.String[] strArray28 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        admin23.setSubscribedList(strList29);
        yorku.eecs.logic.ItemTableModel itemTableModel32 = new yorku.eecs.logic.ItemTableModel(strList29);
        itemTableModel32.fireTableStructureChanged();
        // The following exception was thrown during execution in test generation
        try {
            idField0.add((java.awt.Component) idField14, (java.lang.Object) itemTableModel32, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        yorku.eecs.controller.item.RentListController rentListController0 = new yorku.eecs.controller.item.RentListController();
        yorku.eecs.controller.user.UserController userController1 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.Admin admin8 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController9 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin8);
        admin8.setId((-1));
        admin8.setLastName("hi!");
        userController1.addToAdminQueue((yorku.eecs.model.user.User) admin8);
        yorku.eecs.model.item.Textbook.Builder builder15 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book16 = builder15.build();
// flaky:         rentListController0.createEntry((yorku.eecs.model.user.User) admin8, (yorku.eecs.model.item.Item) book16);
        book16.setPrice(0);
        book16.setLocation("default");
        book16.setQuantity(16);
        org.junit.Assert.assertNotNull(book16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        java.awt.Dimension dimension6 = idField0.getPreferredScrollableViewportSize();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = idField0.createImage(imageProducer7);
        javax.swing.border.Border border9 = idField0.getBorder();
        java.util.Locale locale10 = idField0.getLocale();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(border9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        idField6.selectAll();
        java.text.MessageFormat messageFormat9 = null;
        java.text.MessageFormat messageFormat10 = null;
        boolean boolean11 = idField6.print(messageFormat9, messageFormat10);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        java.awt.Dimension dimension6 = idField0.getPreferredScrollableViewportSize();
        java.awt.image.ImageProducer imageProducer7 = null;
        java.awt.Image image8 = idField0.createImage(imageProducer7);
        boolean boolean9 = idField0.isManagingFocus();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkLowerCase("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        yorku.eecs.model.item.Textbook.Builder builder0 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book.Builder builder2 = builder0.price((int) (byte) 100);
        yorku.eecs.model.item.Book.Builder builder4 = builder0.itemID((int) (byte) 0);
        yorku.eecs.model.item.Book.Builder builder6 = builder0.location("default");
        yorku.eecs.model.item.Textbook textbook7 = new yorku.eecs.model.item.Textbook(builder0);
        java.lang.String str8 = textbook7.getStringID();
        java.lang.String str9 = textbook7.getEdition();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNull(str9);
    }



    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        idField0.setFocusTraversalKeysEnabled(false);
        java.awt.Graphics graphics3 = idField0.getGraphics();
        org.junit.Assert.assertNull(graphics3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        boolean boolean3 = idField0.isForegroundSet();
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            idField0.list(printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        javax.swing.text.Keymap keymap2 = null;
        javax.swing.text.Keymap keymap3 = javax.swing.text.JTextComponent.addKeymap("", keymap2);
        javax.swing.text.Keymap keymap4 = javax.swing.text.JTextComponent.addKeymap("100", keymap3);
        org.junit.Assert.assertNotNull(keymap3);
        org.junit.Assert.assertNotNull(keymap4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        idField6.selectAll();
        yorku.eecs.logic.IdField idField9 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension10 = idField9.getPreferredSize();
        java.awt.im.InputContext inputContext11 = idField9.getInputContext();
        yorku.eecs.logic.IdField idField12 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension13 = idField12.getPreferredSize();
        idField9.setPreferredSize(dimension13);
        yorku.eecs.logic.IdField idField15 = new yorku.eecs.logic.IdField();
        idField9.remove((java.awt.Component) idField15);
        idField15.selectAll();
        int int18 = idField6.getComponentZOrder((java.awt.Component) idField15);
        java.awt.Event event19 = null;
        boolean boolean21 = idField15.keyDown(event19, 12);
        java.awt.event.KeyListener[] keyListenerArray22 = idField15.getKeyListeners();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(inputContext11);
        org.junit.Assert.assertNotNull(dimension13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(keyListenerArray22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        idField6.selectAll();
        idField6.setFocusTraversalKeysEnabled(false);
        idField6.setSize((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Date date2 = null;
        java.util.Date date3 = null;
        yorku.eecs.model.item.Textbook.Builder builder4 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book5 = builder4.build();
        book5.setItemID(64);
        java.lang.String str8 = book5.getStringID();
        yorku.eecs.model.Course course9 = new yorku.eecs.model.Course("hi!", "0", date2, date3, book5);
        yorku.eecs.model.item.Textbook.Builder builder10 = new yorku.eecs.model.item.Textbook.Builder();
        yorku.eecs.model.item.Book book11 = builder10.build();
        course9.setTextbook(book11);
        yorku.eecs.model.item.Book book13 = course9.getTextbook();
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64" + "'", str8, "64");
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(book13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        boolean boolean1 = yorku.eecs.logic.PasswordChecker.checkUpperCase("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        yorku.eecs.model.user.Admin admin6 = new yorku.eecs.model.user.Admin((int) (byte) 100, "hi!", "", "", "", "hi!");
        yorku.eecs.controller.user.LibraryController libraryController7 = new yorku.eecs.controller.user.LibraryController((yorku.eecs.model.user.User) admin6);
        java.lang.String str8 = admin6.getUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "default", "default" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        admin6.setSubscribedList(strList12);
        yorku.eecs.logic.ItemTableModel itemTableModel15 = new yorku.eecs.logic.ItemTableModel(strList12);
        itemTableModel15.fireTableRowsInserted((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = itemTableModel15.isCellEditable((int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            itemTableModel15.removeItemAt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.setFocusable(false);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.im.InputContext inputContext2 = idField0.getInputContext();
        yorku.eecs.logic.IdField idField3 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension4 = idField3.getPreferredSize();
        idField0.setPreferredSize(dimension4);
        yorku.eecs.logic.IdField idField6 = new yorku.eecs.logic.IdField();
        idField0.remove((java.awt.Component) idField6);
        boolean boolean8 = idField6.isOptimizedDrawingEnabled();
        java.awt.dnd.DropTarget dropTarget9 = null;
        idField6.setDropTarget(dropTarget9);
        javax.accessibility.AccessibleContext accessibleContext11 = idField6.getAccessibleContext();
        java.awt.Color color12 = idField6.getForeground();
        java.awt.Event event13 = null;
        yorku.eecs.controller.user.UserController userController14 = new yorku.eecs.controller.user.UserController();
        yorku.eecs.model.user.NonFaculty nonFaculty15 = new yorku.eecs.model.user.NonFaculty();
        userController14.removeFromAdminQueue((yorku.eecs.model.user.User) nonFaculty15);
        java.lang.String str17 = nonFaculty15.getStringId();
        boolean boolean18 = idField6.action(event13, (java.lang.Object) str17);
        java.awt.ComponentOrientation componentOrientation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            idField6.setComponentOrientation(componentOrientation19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNull(inputContext2);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(accessibleContext11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String[] strArray7 = new java.lang.String[] { "notify-field-accept", "0", "default", "ToolTipText", "", "hi!", "ToolTipText" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        yorku.eecs.logic.ItemTableModel itemTableModel10 = new yorku.eecs.logic.ItemTableModel(strList8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.event.FocusListener focusListener2 = null;
        idField0.removeFocusListener(focusListener2);
        yorku.eecs.logic.IdField idField4 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension5 = idField4.getPreferredSize();
        boolean boolean6 = idField4.isCursorSet();
        idField4.move((int) (byte) -1, (int) (short) 10);
        boolean boolean10 = idField4.isVisible();
        boolean boolean11 = idField0.isAncestorOf((java.awt.Component) idField4);
        int int12 = idField0.getComponentCount();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        java.awt.ComponentOrientation componentOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            idField0.setComponentOrientation(componentOrientation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        java.awt.Dimension dimension6 = idField0.getPreferredScrollableViewportSize();
        int int7 = idField0.getSelectionEnd();
        java.awt.event.KeyListener[] keyListenerArray8 = idField0.getKeyListeners();
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(keyListenerArray8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.awt.Dimension dimension1 = idField0.getPreferredSize();
        boolean boolean2 = idField0.isCursorSet();
        idField0.move((int) (byte) -1, (int) (short) 10);
        java.awt.Dimension dimension6 = idField0.getPreferredScrollableViewportSize();
        int int7 = idField0.getSelectionEnd();
        boolean boolean10 = idField0.inside((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(dimension1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        yorku.eecs.logic.IdField idField0 = new yorku.eecs.logic.IdField();
        java.text.MessageFormat messageFormat1 = null;
        java.text.MessageFormat messageFormat2 = null;
        boolean boolean3 = idField0.print(messageFormat1, messageFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}
