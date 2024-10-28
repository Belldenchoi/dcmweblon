package javaapplication3;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class songuyentotrongfilenhiphan{
    public static boolean checkprime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            if(checkprime(list.get(i))){
                mp.put(list.get(i), mp.getOrDefault(list.get(i),0) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(mp.entrySet());
        Collections.sort(lst, Map.Entry.comparingByKey());
        for(Map.Entry<Integer, Integer> m : lst){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("dcm apploz");
    }
}