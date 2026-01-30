package Collection.ArrayList;

import java.util.ArrayList;

public class MaxInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(4);

        int max =Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            //approach 1
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            //approach 2
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
