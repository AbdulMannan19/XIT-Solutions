import java.util.*;

class Main{
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 5};
        array = Utility.remove_duplicates(array);
        for(int i:array){
            System.out.println(i);
        }
    }
}

class Utility{
    static int[] remove_duplicates(int[] array){
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for(int x:array){
            if (!set.contains(x)){
                set.add(x);
                array[j++]=x;
            }
        }
        return Arrays.copyOfRange(array, 0, j);
    }
}

