import java.util.ArrayList;

public class Main
{
    private static WorkerClass worker = new WorkerClass();
    private static ArrayList list = worker.add5000();

    public static void main(String[] args) {
        workerMethod();
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

