import java.util.*;
interface Calculator{
    void addition(int x,int y);
    void subtraction(int x,int y);
    void multiplication(int x,int y);
    void division(int x,int y);
} 
class ArithmeticOperation implements Calculator{
    public void addition(int x,int y){
        System.out.println(x+y);
    }
    public void subtraction(int x,int y){
        System.out.println(x-y);
    }
    public void multiplication(int x,int y){
        System.out.println(x*y);

    }
    public void division(int x,int y){
        System.out.println(x/y);
}
}
class Task5 extends ArithmeticOperation{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArithmeticOperation obj=new ArithmeticOperation(); 
        System.out.println("Enter 1st number : ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2=sc.nextInt();
        System.out.println("Enter The Operation to be performed :\n +   -   *  /\n");
        int result;
        String option=sc.next();
        switch(option){
            case "+":
                obj.addition(num1,num2);
                break;
            case "-":
                obj.subtraction(num1,num2);
                break;
            
            case "*" : 
                obj.multiplication(num1,num2);
                break;
            case "/":
                obj.division(num1,num2);
                break;
            default:
                System.out.println("Invalid Input!!!");
        }

    }
}
