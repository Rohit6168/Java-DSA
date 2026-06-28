package Array;

public class UpdateArray {
    public static void updateArray(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
   public static void main(String[] args) {
        int marks[] ={96,98,95};
        System.out.println("initial array");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        updateArray(marks);
        System.out.println("Updated array");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
    
   }
}
