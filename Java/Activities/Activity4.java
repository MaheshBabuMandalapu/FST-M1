import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        
        int[] arr={94,84,96,75,54,14};
            System.out.println("Before sort :" +Arrays.toString(arr));
        
        //Sort array by importing array util
           Arrays.sort(arr);
          System.out.println("After sort : "+Arrays.toString(arr));
          //By using loops
          int temp;
          for(int i=0;i<arr.length;i++)
          {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("after sort : " +arr[i]);
          }

}
}