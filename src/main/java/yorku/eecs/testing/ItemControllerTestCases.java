package yorku.eecs.testing;

import org.junit.Test;
import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.item.ItemController;
import yorku.eecs.model.item.*;

import static org.junit.Assert.assertEquals;

public class ItemControllerTestCases {
    Book book = new Book.Builder().build();
    CD_DVD cd = new CD_DVD.Builder().build();

    Magazine mag = new Magazine.Builder().build();

    Textbook text = new Textbook.Builder().build();

    @Test
    public void createBookTest() throws ControllerError {
        book.setItemID(1234);
        book.setItemName("Book name");
        book.setLocation("Library");
        book.setQuantity(20);
        book.setExpiryDate("Date");
        book.setPublisher("Publisher");
        book.setPrice(5);
        book.setISBN("123456789");
        ItemController itemController = new ItemController();
        itemController.createItem(book);
        assertEquals(itemController.readItem(book.getStringId(), "Book"), book);
    }

    @Test
    public void createCDTest() throws ControllerError {
        cd.setItemID(2222);
        cd.setItemName("CD name");
        cd.setLocation("Library");
        cd.setQuantity(20);
        cd.setExpiryDate("Date");
        cd.setPublisher("Publisher");
        cd.setPrice(5);
        cd.setUPC("123456789");
        ItemController itemController = new ItemController();
        itemController.createItem(cd);
        assertEquals(itemController.readItem(cd.getStringId(), "CD_DVD"), cd);
    }

    @Test
    public void createMagazineTest() throws ControllerError {
        mag.setItemID(3333);
        mag.setItemName("Magazine name");
        mag.setLocation("Library");
        mag.setQuantity(20);
        mag.setExpiryDate("Date");
        mag.setPublisher("Publisher");
        mag.setPrice(5);
        mag.setISSN("123456789");
        ItemController itemController = new ItemController();
        itemController.createItem(mag);
        assertEquals(itemController.readItem(mag.getStringId(), "Magazine"), mag);
    }

    @Test
    public void createTextbookTest() throws ControllerError {
        text.setItemID(4444);
        text.setItemName("Magazine name");
        text.setLocation("Library");
        text.setQuantity(20);
        text.setExpiryDate("Date");
        text.setPublisher("Publisher");
        text.setPrice(5);
        text.setISBN("123456789");
        ItemController itemController = new ItemController();
        itemController.createItem(text);
        assertEquals(itemController.readItem(text.getStringId(), "Textbook"), text);
    }

    @Test
    public void testBookType() throws ControllerError {
        ItemController itemController = new ItemController();
        String type = itemController.determineItemType(book.getStringId());
        assertEquals(type, "Book");
    }

    @Test
    public void testCDType() throws ControllerError {
        ItemController itemController = new ItemController();
        String type = itemController.determineItemType(cd.getStringId());
        assertEquals(type, "CD_DVD");
    }

    @Test
    public void testMagazineType() throws ControllerError {
        ItemController itemController = new ItemController();
        String type = itemController.determineItemType(mag.getStringId());
        assertEquals(type, "Magazine");
    }

    @Test
    public void testTextbookType() throws ControllerError {
        ItemController itemController = new ItemController();
        String type = itemController.determineItemType(text.getStringId());
        assertEquals(type, "Textbook");
    }

    @Test
    public void testUpdateBook() throws ControllerError {
        ItemController itemController = new ItemController();
        itemController.updateItem(book);
        assertEquals(itemController.readItem(book.getStringId(), "Book"), book);
    }

    @Test
    public void testUpdateTextbook() throws ControllerError {
        ItemController itemController = new ItemController();
        itemController.updateItem(text);
        assertEquals(itemController.readItem(text.getStringId(), "Textbook"), text);
    }
}
