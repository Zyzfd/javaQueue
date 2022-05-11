import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class zyzf {
    public static void main(String[] args) {
        //final int kolvo_proverok = 50000000;
        
        for (int kolvo = 0; kolvo < 10000000; kolvo += 100000) {
            MyQueue myQueue = new MyQueue(kolvo);
            Queue<Integer> queue = new LinkedList<Integer>();

            long time;

            Random rand = new Random();
            int[] value = new int[kolvo];
            
            for (int i = 0; i < kolvo; i++) {
                value[i] = rand.nextInt(100);
            }

            long timeNow = System.currentTimeMillis();
            for (int i = 0; i < kolvo; i++) {
                //myQueue.insert(value[i]);
                queue.add(value[i]);
            }
            time = System.currentTimeMillis() - timeNow;

            // long timeNow = System.currentTimeMillis();
            // for (int i = 0; i < kolvo; i++) {
            //     queue.remove();
            //     myQueue.remove();
            // }
            // time = System.currentTimeMillis() - timeNow;

            System.out.println(time);
        }
    }
}