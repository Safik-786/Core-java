interface pizza
{
    void displaySize();
}
enum size implements pizza
{
    SMALL ,MEDIUM, LARGE, EXTRALARGE ;

    @Override
    public void displaySize() {
        System.out.println("the size is :"+this);
    }
}

public class Main45
{
    public static void main(String[] args) {
        size.LARGE.displaySize();
    }
}
