import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[]args) {
        //Casting examples
        int a = 5;
        double d = 0.4;
        d = a; //implicit casting
        System.out.println("d=" + d);
        d = 3.14;
        a = (int) d;
        System.out.println("a=" + a);


        if (a > 30) {
            System.out.println("Hot Day");}
        else {
            System.out.println("Hot not day");}
        while (a > 0) {
            System.out.println("Looping in a while");
            a--;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }
        for(int i=1; i<13; i++){
            switch(i){
                case 1:
                    System.out.println("on vacation");
                case 2:
                case 3:
                case 4:
                    System.out.println("studying");
                case 6:
                    System.out.println("on vacation");
                case 12:
                    System.out.println("studying");
                default:
                    System.out.println("studying");
            }
        }


        //arrays
        int[] nums=new int[10];
        int i;
        for( i=0; i<nums.length; i++){
            nums[i]=i;
        }
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        for(int x:nums){
            x=i++;
            System.out.println("x=" +x+ " ");
        }
        System.out.println(Arrays.toString(nums));


        int n=3;
        int m=4;
        int [] [] matrix=new int[n] [m];
        for(i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=i+j;
            }
        System.out.println(Arrays.deepToString(matrix));

        double[] darr={1.0,2.0,3.0};
        System.out.println(Arrays.toString(darr));
        int[] iarr={1,2,3,4};
        System.out.println(Arrays.toString(iarr));


        //command line arguments//System.out.println("First parameter " +args[0]);
        //System.out.println("First parameter " +args[1]);


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scan.nextLine();
        System.out.println("Enter your age: ");
        int age =scan.nextInt();
        System.out.println("Enter your GPA: ");
        double gpa=scan.nextDouble();
        System.out.println("Hi " + name);
        if(gpa>=3.5){
            System.out.println("You're High Honor Student");
        }
        else{
            System.out.println("You're a regular Student ");
        }
    }
}

