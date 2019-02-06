package App;

public class Fish extends Animals
{
    public Fish(String name, int year)
    {
        super(name, year);
    }

    @Override
    public void move()
    {
        System.out.println(getName() + " swim");
        decFood();

    }
    @Override
    public void breath ()
    {
        System.out.println(getName() + " gills");

    }
    @Override
    public void reproduce ()
    {
        System.out.println(getName() + " eggs");

    }
}

