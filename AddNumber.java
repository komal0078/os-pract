import java.util.Scanner;

public class AddNumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int result = 0;

        if(num1>num2){
            if(num2>num3){
                result = num1+num2;
            }else{
                result = num1+num3;
            }
        }
        else if(num2>num1){
            if(num1>num3){
                result= num2+num1;
            }else{
                result = num2+num3;
            }
        }else{
            if(num1>num2){
                result = num3+num1;
            }else{
                result = num3+num2;
            }
        }

        System.out.println(result);
        sc.close();
    }
}