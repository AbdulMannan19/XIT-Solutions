import java.util.*;

class Main{
    public static void main(String[] args) {

        int n = 102030;
        int count = 0;
        int r=0;
        LinkedList<Integer> list1 = new LinkedList<Integer>();
    
        while(n!=0){
            r = n%10;
            if(r==0){
                count++;
                n/=10;
            }
            else{
                list1.add(r);
                n/=10;
            }
            
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        for(int i=list1.size()-1; i>-1; i--){
            list2.add(list1.get(i));
        }
        
        for(int i=0; i<count; i++)
            list2.add(0);

    

        int multipler = list2.size();

        int a = 0;
        int index = 0;
        for(int j = multipler-1; j>0; j--){
           a+= Math.pow(10, j)*list2.get(index);
           index++;
        }
        System.out.println(a);
        
    }
}