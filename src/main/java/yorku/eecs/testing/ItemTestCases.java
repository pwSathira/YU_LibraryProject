package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import yorku.eecs.model.item.Book;
import yorku.eecs.model.item.CD_DVD;
import yorku.eecs.model.item.Magazine;
import yorku.eecs.model.item.Textbook;

import javax.xml.soap.Text;

public class ItemTestCases {

    Book book = new Book.Builder().build();
    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    Textbook text = new Textbook.Builder().build();


    //Book Test Cases
    @Test
    public void testSetBookISBNNumbers() {
        book.setISBN("123");
        Assert.assertEquals(book.getISBN(), "123");
    }

    @Test
    public void testGetBookISBNNumbers() {
        book.setISBN("123");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "123");
    }


    @Test
    public void testSetBookISBNLetters() {
        book.setISBN("Abc");
        Assert.assertEquals(book.getISBN(), "Abc");
    }

    @Test
    public void testGetBookISBNLetters() {
        book.setISBN("Abc");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "Abc");
    }


    @Test
    public void testSetBookISBNUpper() {
        book.setISBN("ABC");
        Assert.assertEquals(book.getISBN(), "ABC");
    }

    @Test
    public void testGetBookISBNUpper() {
        book.setISBN("ABC");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "ABC");
    }

    @Test
    public void testSetBookISBNLower() {
        book.setISBN("abc");
        Assert.assertEquals(book.getISBN(), "abc");
    }

    @Test
    public void testGetBookISBNLower() {
        book.setISBN("abc");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "abc");
    }

    @Test
    public void testSetBookISBNLetterAndNumber() {
        book.setISBN("ABC123");
        Assert.assertEquals(book.getISBN(), "ABC123");
    }

    @Test
    public void testGetBookISBNLetterAndNumber() {
        book.setISBN("ABC123");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "ABC123");
    }

    @Test
    public void testSetBookISBNSpecChar() {
        book.setISBN("!@#");
        Assert.assertEquals(book.getISBN(), "!@#");
    }

    @Test
    public void testGetBookISBNSpecChar() {
        book.setISBN("!@#");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "!@#");
    }










    //CD Test Cases
    @Test
    public void testSetUPCNumbers() {
        cd.setUPC("123");
        Assert.assertEquals(cd.getUPC(), "123");
    }

    @Test
    public void testGetUPCNumbers() {
        cd.setUPC("123");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "123");
    }


    @Test
    public void testSetUPCLetters() {
        cd.setUPC("Abc");
        Assert.assertEquals(cd.getUPC(), "Abc");
    }

    @Test
    public void testGetUPCLetters() {
        cd.setUPC("Abc");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "Abc");
    }


    @Test
    public void testSetUPCUpper() {
        cd.setUPC("ABC");
        Assert.assertEquals(cd.getUPC(), "ABC");
    }

    @Test
    public void testGetUPCUpper() {
        cd.setUPC("ABC");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "ABC");
    }

    @Test
    public void testSetUPCLower() {
        cd.setUPC("abc");
        Assert.assertEquals(cd.getUPC(), "abc");
    }

    @Test
    public void testGetUPCLower() {
        cd.setUPC("abc");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "abc");
    }

    @Test
    public void testSetBookUPCLetterAndNumber() {
        cd.setUPC("ABC123");
        Assert.assertEquals(cd.getUPC(), "ABC123");
    }

    @Test
    public void testGetUPCLetterAndNumber() {
        cd.setUPC("ABC123");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "ABC123");
    }

    @Test
    public void testSetUPCSpecChar() {
        cd.setUPC("!@#");
        Assert.assertEquals(cd.getUPC(), "!@#");
    }

    @Test
    public void testGetUPCSpecChar() {
        cd.setUPC("!@#");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "!@#");
    }



    //Magazine Test Cases
    @Test
    public void testSetISSNNumbers() {
        mag.setISSN("123");
        Assert.assertEquals(mag.getISSN(), "123");
    }

    @Test
    public void testGetISSNNumbers() {
        mag.setISSN("123");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "123");
    }


    @Test
    public void testSetISSNLetters() {
        mag.setISSN("Abc");
        Assert.assertEquals(mag.getISSN(), "Abc");
    }

    @Test
    public void testGetISSNLetters() {
        mag.setISSN("Abc");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "Abc");
    }


    @Test
    public void testSetISSNUpper() {
        mag.setISSN("ABC");
        Assert.assertEquals(mag.getISSN(), "ABC");
    }

    @Test
    public void testGetISSNUpper() {
        mag.setISSN("ABC");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "ABC");
    }

    @Test
    public void testSetISSNLower() {
        mag.setISSN("abc");
        Assert.assertEquals(mag.getISSN(), "abc");
    }

    @Test
    public void testGetISSNLower() {
        mag.setISSN("abc");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "abc");
    }

    @Test
    public void testSetISSNLetterAndNumber() {
        mag.setISSN("ABC123");
        Assert.assertEquals(mag.getISSN(), "ABC123");
    }

    @Test
    public void testGetISSNLetterAndNumber() {
        mag.setISSN("ABC123");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "ABC123");
    }

    @Test
    public void testSetISSNSpecChar() {
        mag.setISSN("!@#");
        Assert.assertEquals(mag.getISSN(), "!@#");
    }

    @Test
    public void testGetISSNSpecChar() {
        mag.setISSN("!@#");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "!@#");
    }



    //Textbook Test Cases

    @Test
    public void testSetTextbookEdition() {
        text.setEdition("First Edition");
        Assert.assertEquals(text.getEdition(), "First Edition");
    }

    @Test
    public void testGetTextbookEdition() {
        text.setEdition("First Edition");
        String edition = text.getEdition();
        Assert.assertEquals(edition, "First Edition");
    }

    @Test
    public void testSetTextbookISBNNumbers() {
        text.setISBN("123");
        Assert.assertEquals(text.getISBN(), "123");
    }

    @Test
    public void testGetTextbookISBNNumbers() {
        text.setISBN("123");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "123");
    }


    @Test
    public void testSetTextbookISBNLetters() {
        text.setISBN("Abc");
        Assert.assertEquals(text.getISBN(), "Abc");
    }

    @Test
    public void testGetTextbookISBNLetters() {
        text.setISBN("Abc");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "Abc");
    }


    @Test
    public void testSetTextbookISBNUpper() {
        text.setISBN("ABC");
        Assert.assertEquals(text.getISBN(), "ABC");
    }

    @Test
    public void testGetTextbookISBNUpper() {
        text.setISBN("ABC");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "ABC");
    }

    @Test
    public void testSetTextbookISBNLower() {
        text.setISBN("abc");
        Assert.assertEquals(text.getISBN(), "abc");
    }

    @Test
    public void testGetTextbookISBNLower() {
        text.setISBN("abc");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "abc");
    }

    @Test
    public void testSetTextbookISBNLetterAndNumber() {
        text.setISBN("ABC123");
        Assert.assertEquals(text.getISBN(), "ABC123");
    }

    @Test
    public void testGetTextbookISBNLetterAndNumber() {
        text.setISBN("ABC123");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "ABC123");
    }

    @Test
    public void testSetTextbookISBNSpecChar() {
        text.setISBN("!@#");
        Assert.assertEquals(text.getISBN(), "!@#");
    }

    @Test
    public void testGetTextbookISBNSpecChar() {
        text.setISBN("!@#");
        String ISBN = text.getISBN();
        Assert.assertEquals(ISBN, "!@#");
    }









}
