package yorku.eecs.testing;

import org.junit.Assert;
import org.junit.Test;
import yorku.eecs.model.Course;
import yorku.eecs.model.item.Book;

import javax.xml.crypto.Data;
import java.util.Date;

public class CourseTestCases {

    Date startDate = new Date();
    Date endDate = new Date();

    Book text = new Book.Builder().build();

    Course course = new Course("Software Testing", "EECS9999", startDate, endDate, text);

    @Test
    public void testSetCourseName() {
        course.setCourseName("Software Testing");
        Assert.assertEquals(course.getCourseName(), "Software Testing");
    }
    
    @Test
    public void testGetCourseName(){
        course.setCourseName("Software Testing");
        String courseName = course.getCourseName();
        Assert.assertEquals(courseName, "Software Testing");
    }
    
    @Test
    public void testSetCourseCode() {
        course.setCourseCode("EECS9999");
        Assert.assertEquals(course.getCourseCode(), "EECS9999");
    }
    
    @Test
    public void testGetCourseCode() {
        course.setCourseCode("EECS9999");
        String courseCode = course.getCourseCode();
        Assert.assertEquals(courseCode, "EECS9999");
    }

    @Test
    public void testSetStartDate() {
        course.setStartDate(startDate);
        Assert.assertEquals(course.getStartDate(), startDate);
    }

    @Test
    public void testGetStartDate() {
        course.setStartDate(startDate);
        Date testDate = course.getStartDate();
        Assert.assertEquals(testDate, startDate);
    }

    @Test
    public void testSetEndDate() {
        course.setEndDate(endDate);
        Assert.assertEquals(course.getEndDate(), endDate);
    }

    @Test
    public void testGetEndDate() {
        course.setEndDate(endDate);
        Date testDate = course.getEndDate();
        Assert.assertEquals(testDate, endDate);
    }


    @Test
    public void testSetTextbook() {
        course.setTextbook(text);
        Assert.assertEquals(course.getTextbook(), text);
    }

    @Test
    public void testGetTextbook() {
        course.setTextbook(text);
        Book testText = course.getTextbook();
        Assert.assertEquals(testText, text);
    }









}
