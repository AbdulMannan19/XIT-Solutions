import java.util.*;

class Main{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(3); list1.add(3); list1.add(0); list1.add(1); list1.add(5);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(-3); list2.add(2); list2.add(9); list2.add(-1); list2.add(6);

        List<Integer> list3 = Merge.merge(list1, list2);
        
        for(int x: list3){
            System.out.print(x + "  ");
        }
    }
}

class Merge{

    static List<Integer> merge(List<Integer> list1, List<Integer> list2 ){
        List<Integer> list3 = new ArrayList<Integer>();
        for(int x: list1) 
            list3.add(x);
        for(int x: list2)
            list3.add(x);
        Collections.sort(list3);
        return list3;
    }
}