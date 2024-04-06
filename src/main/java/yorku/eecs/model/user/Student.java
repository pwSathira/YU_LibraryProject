package yorku.eecs.model.user;

import yorku.eecs.model.Course;
import yorku.eecs.model.item.Book;

import java.util.ArrayList;
import java.util.List;


public class Student extends User {
    private ArrayList<Course> courseList;

    public Student() {
        super();
    }

    public Student(ArrayList<Course> courseList){
        this.courseList = courseList;
    }

    public Student(int id, String userName, String firstName, String lastName, String emailAddress, String password) {
        super(Integer.toString(id),password);

    }


    //GETTERS
    public List<Course> getCourseList() {
        return courseList;
    }

    //SETTERS
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Book> getCourseBook() {
        /* creates an ArrayList of Books that will add books
           to the ArrayList by getting the books from the CourseList
        * */
        ArrayList<Book> bookList = new ArrayList<Book>();
        for (Course course : courseList) {
            bookList.add(course.getTextbook());
        }
        return bookList;
    }

}
