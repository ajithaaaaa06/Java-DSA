import java.util.*;
public class ThirdMaxNum{
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int x:nums){
            set.add(x);
            if(set.size()>3) 
                set.pollFirst();
        }
        return set.size()==3 ? set.first() :set.last();
    }
    public static void main(String[] args){
        ThirdMaxNum obj = new ThirdMaxNum();
        int[] nums = {3, 2, 1};
        System.out.println(obj.thirdMax(nums));
    }
}