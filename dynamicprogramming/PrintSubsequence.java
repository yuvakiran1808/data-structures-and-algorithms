package dynamicprogramming;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class PrintSubsequence {
    
    public static void printAllSubs(int arr[], List<Integer> list ,int index,int len)
    {
            if(index==len)
            {
                System.out.println(list);
                return;
            }
            list.add(arr[index]);
            printAllSubs(arr,list,index+1,len);
            list.remove(list.size() - 1);
            printAllSubs(arr,list,index+1,len);
    }
    public static void main(String[] args) {
         int arr[] = {1,2,5,2};
         List<Integer> list = new ArrayList<>();
         printAllSubs(arr,list,0,4);
    }
}
