package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import yorku.eecs.model.item.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.Text;

public class ItemTestCases {

    Book book = new Book.Builder().build();
    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    Textbook text = new Textbook.Builder().build();

    Newsletter news = new Newsletter();



    //Item Abstract Class Test Cases
    @Test
    public void testSetItemID() {
        book.setItemID(123);
        Assert.assertEquals(book.getItemID(), 123);
    }


    @Test
    public void testGetItemID() {
        book.setItemID(123);
        int ID = book.getItemID();
        Assert.assertEquals(ID, 123);
    }

    @Test
    public void testSetItemName() {
        book.setItemName("Book Name");
        Assert.assertEquals(book.getItemName(), "Book Name");
    }

    @Test
    public void testGetItemName() {
        book.setItemName("Book Name");
        String itemName = book.getItemName();
        Assert.assertEquals(itemName, "Book Name");
    }
    
    @Test
    public void testSetItemLocation() {
        book.setLocation("Upper Floor");
        Assert.assertEquals(book.getLocation(), "Upper Floor");
    }
    
    @Test
    public void testGetItemLocation() {
        book.setLocation("Upper Floor");
        String location = book.getLocation();
        Assert.assertEquals(location, "Upper Floor");
    }
    
    @Test
    public void testSetItemPublisher() {
        book.setPublisher("Publisher");
        Assert.assertEquals(book.getPublisher(), "Publisher");
    }

    @Test
    public void testGetItemPublisher() {
        book.setPublisher("Publisher");
        String publisher = book.getPublisher();
        Assert.assertEquals(publisher, "Publisher");
    }

    @Test
    public void testSetItemPrice() {
        book.setPrice(5);
        Assert.assertEquals(book.getPrice(), 5);
    }

    @Test
    public void testGetItemPrice() {
        book.setPrice(5);
        int price = book.getPrice();
        Assert.assertEquals(price, 5);
    }

    @Test
    public void testSetItemQuantity() {
        book.setQuantity(20);
        Assert.assertEquals(book.getQuantity(),20);
    }

    @Test
    public void testGetItemQuantity() {
        book.setQuantity(20);
        int quantity = book.getQuantity();
        Assert.assertEquals(quantity, 20);
    }

    @Test
    public void testSetItemExpiry() {
        book.setExpiryDate("April 10 2024");
        Assert.assertEquals(book.getExpiryDate(), "April 10 2024");
    }

    @Test
    public void testGetItemExpiry() {
        book.setExpiryDate("April 10 2024");
        String expiry = book.getExpiryDate();
        Assert.assertEquals(expiry, "April 10 2024");
    }



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



    //Newsletter Test Cases
    @Test
    public void testSetNewsName() {
        news.setNewsLetterName("Name");
        Assert.assertEquals(news.getNewsLetterName(), "Name");
    }

    @Test
    public void testGetNewsName() {
        news.setNewsLetterName("Name");
        String name = news.getNewsLetterName();
        Assert.assertEquals(name, "Name");
    }

    @Test
    public void testSetNewsArticleTitle() {
        news.setArticleTitle("Title");
        Assert.assertEquals(news.getArticleTitle(), "Title");
    }


    @Test
    public void testGetNewsArticleTitle() {
        news.setArticleTitle("Title");
        String title = news.getArticleTitle();
        Assert.assertEquals(title, "Title");
    }

    @Test
    public void testSetNewsArticleTitleNumbers() {
        news.setArticleTitle("123");
        Assert.assertEquals(news.getArticleTitle(), "123");
    }

    @Test
    public void testGetNewsArticleTitleNumbers() {
        news.setArticleTitle("123");
        String title = news.getArticleTitle();
        Assert.assertEquals(title, "123");
    }

    @Test
    public void testSetNewsArticleTitleSpecChar() {
        news.setArticleTitle("!@#");
        Assert.assertEquals(news.getArticleTitle(), "!@#");
    }

    @Test
    public void testGetNewsArticleTitleSpecChar() {
        news.setArticleTitle("!@#");
        String title = news.getArticleTitle();
        Assert.assertEquals(title, "!@#");
    }

    @Test
    public void testSetNewsURL() {
        news.setUrl("URL");
        Assert.assertEquals(news.getUrl(), "URL");
    }

    @Test
    public void testGetNewsURL() {
        news.setUrl("URL");
        String URL = news.getUrl();
        Assert.assertEquals(URL, "URL");
    }

    Book itemForTesting;
    // ItemFactory test cases
    @Test
    public void testItemFactory() {
        ItemFactory itemFactory = new ItemFactory();
        String bookID = "100000006";
        String name = "spider man 3";
        String location = "Library";
        String publisher = "Marvel Comics";
        String price = "4";
        String quantity = "20";
        String date = "DATE";
        String ISBN = "123";
        String[] arr = {bookID, name, location, publisher, price, quantity, date, ISBN};
        List<String> record = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            record.add(arr[i]);
        }
        // Add all attributes to record
        this.itemForTesting = (Book) itemFactory.createItem("Book", record);
        this.itemForTesting.setISBN(ISBN);
        String[] arr2 = {this.itemForTesting.getStringId(), this.itemForTesting.getItemName(), this.itemForTesting.getLocation(),
                this.itemForTesting.getPublisher(), Integer.toString(this.itemForTesting.getPrice()), Integer.toString(this.itemForTesting.getQuantity()),
                this.itemForTesting.getExpiryDate(), this.itemForTesting.getISBN()};

        Assert.assertEquals(arr, arr2);
    }








}
