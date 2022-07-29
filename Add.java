import java.util.Scanner;

class Add
{

    public static void main(String[] args)
	{
        int first, second;
        float average;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        first = sc.nextInt();

        System.out.println("Enter the second number: ");
        second = sc.nextInt();

        //average = (float) (first + second) / 2;

        System.out.println("Average value: " + average);
    }
}
