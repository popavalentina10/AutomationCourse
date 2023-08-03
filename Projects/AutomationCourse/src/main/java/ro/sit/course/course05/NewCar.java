package ro.sit.course.course05;

abstract public class NewCar implements Engine {
    protected void start() {
        System.out.println("Car start Engine");
    }

    abstract public void stop(String time);
}
