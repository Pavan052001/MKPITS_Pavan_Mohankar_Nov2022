package collectionThread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HsahMapSynchro extends Thread{
    static Map<Integer,String> map = new ConcurrentHashMap<>();

    @Override
    public void run() {

            map.put(4,"D");
    }

    public static void main(String[] args) {

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        HsahMapSynchro hsahMapSynchro = new HsahMapSynchro();
        hsahMapSynchro.start();

        for (Object o: map.entrySet()){
            Object s=o;
            System.out.println(s);
        }
        System.out.println(map);

    }
}
