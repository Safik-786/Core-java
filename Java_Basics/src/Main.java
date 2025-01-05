public class Main {
    public static int binarysearch(int [] arr, int item){
        int st= 0;
        int end= arr.length-1;
        while (st<=end){
            int mid=( st +end)/1;
            if (arr[mid]==item){
                return mid;
            }
            else if(item < arr[mid]){
                end= mid-1;
            }else {
                st= mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr= {2, 5, 7, 9, 23, 69, 334, 998};
        System.out.println(binarysearch(arr, 69));
    }
}