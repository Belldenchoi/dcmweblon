package javaapplication3;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Minh
 */
public class solama2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < s.length(); i++){
                char x = s.charAt(i);
                switch (x){ 
                        case 'I': 
                            list.add(1);
                            break;
                        case 'V':
                            list.add(5);
                            break;
                        case 'X':
                            list.add(10);
                            break;
                        case 'L':
                            list.add(50);
                            break;
                        case 'C':
                            list.add(100);
                            break;
                        case 'D':
                            list.add(500);
                            break;
                        case 'M':
                            list.add(1000);
                            break;
                }
            }
            int res = list.get(list.size() - 1);
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) < list.get(i+1)) res -= list.get(i);
                else res += list.get(i);
            }
            System.out.println(res);
        }
    }
}
