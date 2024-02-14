public class encapsulation
{
    private String color;
    private String breed;
    private String name;
    private int age;

    public void setColor(String x)
    {
        color= x;
    }
    public void setBreed(String y)
    {
        breed= y;
    }
    public void setName(String z)
    {
        name= z;
    }
    public void setAge(int b)
    {
        age=b;;
    }


    public String getColor()
    {
        return color;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }


    public static void main(String[] args)
    {
        encapsulation r = new encapsulation();
        r.setColor("white");
        r.setBreed("bull dog");
        r.setName("tommy");
        r.setAge(10);
        System.out.println("color is "+r.getColor());
        System.out.println("breed is "+r.getBreed());
        System.out.println("name is "+r.getName());
        System.out.println("age is "+r.getAge());
    }


}
