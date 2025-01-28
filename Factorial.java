import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();
        int factorial=1;
        if(num<0){
            System.out.println("foctorial doesnot exist");
        }else if (num==1){
            System.out.println("the factorial is 1");
        }else{
            for(int i=1;i<=num;i++){
                factorial=factorial*i;
                System.out.println(factorial);
            }
        }
        scanner.close();
    }
    
}
