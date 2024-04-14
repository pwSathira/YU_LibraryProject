package yorku.eecs.testing;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import yorku.eecs.controller.ControllerError;
import yorku.eecs.controller.item.ItemController;
import yorku.eecs.model.item.Book;
import yorku.eecs.model.item.Item;
public class TestItemController {

    private ItemController itemController;

    @Before
    public void setUp(){
        itemController = new ItemController();
    }

    @Test
    public void testCreateItem() throws ControllerError {
        Item item = new Book.Builder().build();
        item = itemController.createItem(item);
        assertNotNull("Item is null",item);
        assertTrue(item.getItemID() > 0);
    }

    @Test
    public void testUpdateItem() throws ControllerError{
        Item item = new Book.Builder().build();
        item = itemController.createItem(item);
    }
}
