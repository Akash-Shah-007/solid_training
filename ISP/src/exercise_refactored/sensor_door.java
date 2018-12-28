package exercise_refactored;

public interface sensor_door {
    void lock();

    void unlock();

    void open();

    void close();
    
    void proximityCallback();
}