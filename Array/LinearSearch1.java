package Array;

// for string search
 public class LinearSearch1{
        public static int linearSearch(String menus[],String key){
            for(int i=0;i<menus.length;i++){
                if(menus[i].equals(key)){
                    return i;
                }
            }
            return -1; 
        }
        public static void main(String[] args) {
            String menus[]={"dosa","rice","pavbhaji","misal","burji"};
            String key = "pavbhaji";
            int index=linearSearch(menus, key);
            if(index==-1){
                System.out.println("index not found");
            }else{
                System.out.println("index is at:"+index);
            }   
        }
    }
