import java.util.Scanner;
class Task1
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrneheit to Celsius");
        int option=input.nextInt();
        switch(option)
        {
            case 1:
                  System.out.println("Enter temperature in Celsius:");
                  float celsius=input.nextFloat();
                  float fahrenheit=(celsius*9/5)+32;
                  System.out.println(celsius+" Celsius is equal to "+fahrenheit+" Fahrenheit ");
                   break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                float f=input.nextFloat();
                float c=(f-32)*5/9;
                System.out.println(f+" Fahrenheit is equal to "+c+" Celsius ");
                break;

            default:
                System.out.println("1please enter valid input!!!");
        }
        
      
    }
}