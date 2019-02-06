package App;

public class Birds extends Animals
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    @Override
    public void move()
    {
        System.out.println(getName() + " fly");
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
        System.out.println(getName() + " eggs");

    }
}
