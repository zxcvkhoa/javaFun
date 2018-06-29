import java.util.ArrayList;


public class Run {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<Integer>();
        GroupActivity iD = new GroupActivity();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        iD.printMMM(list);

        ArrayList<Object>list1 = new ArrayList<Object>();
        list1.add(1);
        list1.add(-2);
        list1.add(3);
        list1.add(-5);
        list1.add(6);
        iD.swap(list1);
        for (Object val : list1) {
            System.out.println(val);
        }
        System.out.println("--------------");

        ArrayList<Integer>list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(-2);
        list2.add(3);
        list2.add(-5);
        list2.add(6);
        iD.square(list2);
        for(Integer val : list2){
            System.out.println(val);
        }
        
        iD.printOdd();
        
        int[] array3 = {1,2,3,4,5,6,7,8,8,9};
        iD.shift(array3);
        for(int val : array3){
            System.out.println(val);
        }



    }
}