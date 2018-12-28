package exercise_factored;

public class ElectronicDuck implements duckSwim
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (!_on) {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (!_on) {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
