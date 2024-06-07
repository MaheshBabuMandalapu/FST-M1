public class Activity2 {
    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};
        int sum=0;
        for(int num :array)
        {
            if(num==10)
            {
                sum+=num;
            }
        }
        //Approach 1
        System.out.println("By using boolean expression whether true r flase");
          boolean isEqualTo30 = sum == 30;
          System.out.println("sum is equal :"+isEqualTo30);
          //Approach 2 
          System.out.println("using if condition");
        if (sum == 30) {
            System.out.println("The sum of 10's is equal to 30");
        } else {
            System.out.println("The sum of 10's is not equal t 30");
        }

       }

    }

