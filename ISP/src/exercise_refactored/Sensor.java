package exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(sensor_door sensor_door)
    {
        while (true) {
            if (isPersonClose()) {
            	sensor_door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
