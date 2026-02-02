package Collection.ArrayList;

import java.util.ArrayList;

public class SwapArraylist {
    public static void swappArraylist(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(5);
        list.add(1); //index 1
        list.add(4);
        list.add(3); //index 3
        list.add(2);

        System.out.println(list);
        int idx1=1,idx2=3;
        swappArraylist(list, idx1, idx2);
        
}
}
