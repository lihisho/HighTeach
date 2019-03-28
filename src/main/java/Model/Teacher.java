package Model;

import java.util.HashMap;
import java.util.List;

public class Teacher extends User {

    //region Fields
    private int amountOfClasses;
    private int rank;
    private HashMap<Course, Integer> priceOfCourse;
    private List<Course> coursesTeaching;
    //endregion Fields


    public Teacher(String userName, int password, String privateName, String lastName, int teacherId, int amountOfClasses, int rank, HashMap<Course, Integer> priceOfCourse, List<Course> coursesTeaching) {
        super(userName, password, privateName, lastName, teacherId);
        this.amountOfClasses = amountOfClasses;
        this.rank = rank;
        this.priceOfCourse = priceOfCourse;
        this.coursesTeaching = coursesTeaching;
    }

    //region Getters&Setters
    public int getAmountOfClasses() {
        return amountOfClasses;
    }

    public void setAmountOfClasses(int amountOfClasses) {
        this.amountOfClasses = amountOfClasses;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public HashMap<Course, Integer> getPriceOfCourse() {
        return priceOfCourse;
    }

    public void setPriceOfCourse(HashMap<Course, Integer> priceOfCourse) {
        this.priceOfCourse = priceOfCourse;
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(List<Course> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }
    //endregion Getters&Setters


}
