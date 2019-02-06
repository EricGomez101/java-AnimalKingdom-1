package App;

public class Mammals extends Animals
{
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    @Override
    public void move ()
    {
        System.out.println(getName() + " walks");
        decFood();

    }
    @Override
    public void breath ()
    {
        System.out.println(getName() + " lungs");

    }
    @Override
    public void reproduce ()
    {
        System.out.println(getName() + " live births");

    }


}
