package yorku.eecs.testing;
import org.junit.Test;
import yorku.eecs.model.item.*;
import java.util.*;
import java.util.List;
import static org.junit.Assert.*;
public class ItemFactoryTestCases {
    @Test
    public void testCreateItemWithBookType() {
        List<String> record = Arrays.asList("1", "Harry Potter", "Shelf 1", "Bloomsbury", "20", "5", "N/A");
        Item item = ItemFactory.createItem("Book", record);
        assertTrue(item instanceof Book);
        assertEquals(1, item.getItemID());
    }

    @Test
    public void testCreateItemWithCDType() {
        List<String> record = Arrays.asList("2", "Inception", "Shelf 2", "Warner Bros", "20", "5", "N/A");
        Item item = ItemFactory.createItem("CD_DVD", record);
        assertTrue(item instanceof CD_DVD);
        assertEquals(1, item.getItemID());
    }

    @Test
    public void testCreateMagazineItem() {
        // Setup record for magazine creation
        List<String> magazineRecord = Arrays.asList("100", "National Geographic", "Library Shelf 1", "National Geographic Society", "5", "20", "2024-01");

        // Create magazine item
        Item magazineItem = ItemFactory.createItem("Magazine", magazineRecord);

        // Assertions to verify the magazine item's properties
        assertTrue(magazineItem instanceof Magazine);
        assertEquals(100, magazineItem.getItemID());
        assertEquals("National Geographic", magazineItem.getItemName());
        assertEquals("Library Shelf 1", magazineItem.getLocation());
        assertEquals("National Geographic Society", magazineItem.getPublisher());
        assertEquals(5, magazineItem.getPrice());
        assertEquals(20, magazineItem.getQuantity());
        assertEquals("2024-01", magazineItem.getExpiryDate());
    }

    @Test
    public void testCreateTextbookItem() {
        // Setup record for textbook creation
        List<String> textbookRecord = Arrays.asList("101", "Introduction to Java", "Library Shelf 2", "Pearson", "60", "15", "N/A");

        // Create textbook item
        Item textbookItem = ItemFactory.createItem("Textbook", textbookRecord);

        // Assertions to verify the textbook item's properties
        assertTrue(textbookItem instanceof Textbook);
        assertEquals(101, textbookItem.getItemID());
        assertEquals("Introduction to Java", textbookItem.getItemName());
        assertEquals("Library Shelf 2", textbookItem.getLocation());
        assertEquals("Pearson", textbookItem.getPublisher());
        assertEquals(60, textbookItem.getPrice());
        assertEquals(15, textbookItem.getQuantity());
        assertEquals("N/A", textbookItem.getExpiryDate());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCreateItemWithEmptyRecord() {
        List<String> record = new ArrayList<>();
        ItemFactory.createItem("Book", record);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateItemWithInvalidType() {
        List<String> record = Arrays.asList("1", "Harry Potter", "Shelf 1", "Bloomsbury", "20", "5", "N/A");
        ItemFactory.createItem("InvalidType", record);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateItemWithInvalidRecord() {
        List<String> record = Arrays.asList("1", "Harry Potter", "Shelf 1", "Bloomsbury", "20", "5");
        ItemFactory.createItem("Book", record);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateItemWithInvalidRecordSize() {
        List<String> record = Arrays.asList("1", "Harry Potter", "Shelf 1", "Bloomsbury", "20", "5", "N/A", "ExtraField");
        ItemFactory.createItem("Book", record);
    }

    @Test
    public void testUpdateItemTextbookSpecificFields() {
        Textbook textbook = new Textbook.Builder().build();
        textbook.setISBN("1122334455");
        textbook.setEdition("3rd");
        textbook.setItemID(4);
        List<String> record = new ArrayList<>(Arrays.asList("4", "Updated Textbook", "Updated Shelf", "Updated Publisher", "50", "7", "N/A", "", ""));
        Item updatedItem = ItemFactory.updateItem(textbook, record);
        assertTrue(updatedItem instanceof Textbook);
        assertEquals("3rd", ((Textbook) updatedItem).getEdition());
    }



}
