package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import yorku.eecs.model.item.Book;
import yorku.eecs.model.item.CD_DVD;
import yorku.eecs.model.item.Magazine;

public class ItemTestCases {

    Book book = new Book.Builder().build();
    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    @Test
    public void testSetBookISBN() {
        book.setISBN("123");
        Assert.assertEquals(book.getISBN(), "123");
    }

    @Test
    public void testGetBookISBN() {
        book.setISBN("123");
        String ISBN = book.getISBN();
        Assert.assertEquals(ISBN, "123");
    }

    @Test
    public void testSetUPC() {
        cd.setUPC("12345");
        Assert.assertEquals(cd.getUPC(), "123");
    }

    @Test
    public void testGetUPC() {
        cd.setUPC("111");
        String UPC = cd.getUPC();
        Assert.assertEquals(UPC, "111");
    }

    @Test
    public void testSetISSN() {
        mag.setISSN("222");
        Assert.assertEquals(mag.getISSN(), "222");
    }

    @Test
    public void testGetISSN() {
        mag.setISSN("222");
        String ISSN = mag.getISSN();
        Assert.assertEquals(ISSN, "222");
    }







}
