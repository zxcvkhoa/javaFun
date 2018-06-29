import java.util.ArrayList;

public class GroupActivity {
    public void printMMM (ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(0);
        int avg = 0;
        for(int val : array){
            if(val < min){
                min = val;
            }
            if (val > max){
                max = val;
            }
            avg += val;
        }
        avg = avg/array.size();
        System.out.println("Min:" + min + " Max: " + max + " Avg: " + avg);
        
    }
    public void swap(ArrayList<Object> array){
        for(int i =0; i< array.size(); i++){
            int val = (int) array.get(i);
            if(val < 0){
                array.set(i, "Dojo");
            }
        }
        
    } 
    public void square(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            int val = array.get(i);
            array.set(i, (val * val));
        }
    }

    public void printOdd(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=255; i++){
            if( i % 2 != 0 ){
                list.add(i);
            }
        }
        for (Integer val : list){
            System.out.println(val);
        }
    }
    
    public void shift(int[] array){
        for(int i = 0; i < array.length-1; i++){
            array[i] = array[i + 1];

        }
        array[array.length-1] = (int) 0;
    }
}