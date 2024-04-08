package yorku.eecs.testing;
import org.junit.Test;
import yorku.eecs.logic.CSVError;
import yorku.eecs.logic.CsvUtil;
import yorku.eecs.model.item.*;
import java.util.*;
import java.util.List;
import static org.junit.Assert.*;
public class CSVUtilTestCases {
    @Test
    public void testReadCsvWithStudentData() throws CSVError {
        String filePath = "src/main/resources/data/studentdata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithVisitorData() throws CSVError {
        String filePath = "src/main/resources/data/visitordata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithItemData() throws CSVError {
        String filePath = "src/main/resources/data/itemdata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithFacultyData() throws CSVError {
        String filePath = "src/main/resources/data/facultydata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithNonFacultyData() throws CSVError {
        String filePath = "src/main/resources/data/nonfacultydata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithAdminData() throws CSVError {
        String filePath = "src/main/resources/data/adminqueuedata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithCourseListData() throws CSVError {
        String filePath = "src/main/resources/data/courselist.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithRentListData() throws CSVError {
        String filePath = "src/main/resources/data/rentlist.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithSubscriptionListData() throws CSVError {
        String filePath = "src/main/resources/data/subscriptiondata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

    @Test
    public void testReadCSVWithBookListData() throws CSVError {
        String filePath = "src/main/resources/data/bookdata.csv";
        List<List<String>> records = CsvUtil.readCsv(filePath);
        assertFalse(records.isEmpty());
    }

}
