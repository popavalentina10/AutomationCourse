package ro.sit.homework;

public class StudentNameComparator implements java.util.Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
