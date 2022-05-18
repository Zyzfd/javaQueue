import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class zyzf {
    public static void main(String[] args) {
        //final int kolvo_proverok = 50000000;
        
        for (int kolvo = 0; kolvo < 10000000; kolvo += 100000) {
            long memObjNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            //MyQueue myQueue = new MyQueue(kolvo);
            Queue<Integer> queue = new LinkedList<Integer>();
            long memObj = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            

            //long time;

            Random rand = new Random();
            int[] value = new int[kolvo];
            
            for (int i = 0; i < kolvo; i++) {
                value[i] = rand.nextInt(100);
            }

            //long timeNow = System.currentTimeMillis();
            long memNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            for (int i = 0; i < kolvo; i++) {
                //myQueue.inpueue(value[i]);
                queue.add(value[i]);
            }
            long mem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            //time = System.currentTimeMillis() - timeNow;

            // long timeNow = System.currentTimeMillis();
            // for (int i = 0; i < kolvo; i++) {
            //     queue.remove();
            //     myQueue.decueue();
            // }
            // time = System.currentTimeMillis() - timeNow;

            //System.out.println(time);

            System.out.println(((mem-memNow)/1024) + ((memObj-memObjNow)/1024));
        }
    }
}