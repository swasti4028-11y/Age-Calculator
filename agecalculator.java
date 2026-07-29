 import java.util.Scanner;

class agecalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int bDay, bMonth, bYear;
        int cDay, cMonth, cYear;

        System.out.print("Enter Birth Day: ");
        bDay = sc.nextInt();

        System.out.print("Enter Birth Month: ");
        bMonth = sc.nextInt();

        System.out.print("Enter Birth Year: ");
        bYear = sc.nextInt();

        System.out.print("Enter Current Day: ");
        cDay = sc.nextInt();

        System.out.print("Enter Current Month: ");
        cMonth = sc.nextInt();

        System.out.print("Enter Current Year: ");
        cYear = sc.nextInt();

        int age = cYear - bYear;

        if (cMonth < bMonth)
        {
            age--;
        }
        else if (cMonth == bMonth && cDay < bDay)
        {
            age--;
        }

        System.out.println("Your age is " + age + " years.");
    }
}

