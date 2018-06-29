import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {
    public int puzzle1(int[] array){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 10){
                list.add(array[i]);
                sum += array[i];
            }else{
                sum += array[i];
            }
        }
        for(Integer val: list){
            System.out.println(val);
        }
        System.out.println(sum);
        return sum;
    }

    public Object puzzle2(ArrayList<Object> array){
        ArrayList<Object> list = new ArrayList<Object>();
        shuffle(ArrayList<Object> list);
        for(int i = 0; i < array.size(); i++){
            if(i.length > 5){
                list.add(i);
            }
            System.out.println(i);
        }
        return list;

    }




}