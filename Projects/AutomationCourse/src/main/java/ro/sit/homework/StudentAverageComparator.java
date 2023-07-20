package ro.sit.homework;

public class StudentAverageComparator implements java.util.Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getAverage().compareTo(b.getAverage());
    }
}
