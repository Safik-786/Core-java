public class CustomArrayList
{
    private int [] data;
    private static int DEFAULT_SIZE= 2;
    private  int size= 0;
//    when constructor run at that time array obj will be created
    CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public  void add(int object){
        if (isFull()){
            resize();
        }
        data[size]= object;
        size++;
    }
    public void shows(){
        for (int i = 0; i < data.length; i++) {
            if (data[i]== 0){
                continue;
            }
            System.out.print(data[i]+ "  ");
        }
    }
    private void resize() {
        int []temp= new int[data.length * 2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data= temp;
    }
    private boolean isFull(){
        return size==data.length;
    }
    public static void main(String[] args) {
        CustomArrayList cs = new CustomArrayList();
        cs.add(4);
        cs.add(5);
        cs.add(3);
        cs.add(6);
        cs.add(4);
        cs.shows();

    }
}
