import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static WorkerClass worker = new WorkerClass();
    private static ArrayList list = worker.add5000();

    public static void main(String[] args) {
        System.out.println("**************** Welcome to you ********************");
        System.out.println("**************** Press 1 for start ********************");
        Scanner scanner = new Scanner(System.in);

        int deger = scanner.nextInt();

        switch (deger)
        {
            case 1 : {workerMethod();
                System.out.println("\nGOD LUCK :)");
            break;}
            default:
                System.out.println("**************** ERROR ********************\n"+"**************** Press 1 please ********************");
        }
    }

    public static void workerMethod()
    {

        for (int i = 0;i<10;i++)
        {
            int random = (int) (2000*Math.random());
            System.out.println(list.get(random));
        }

    }


}

