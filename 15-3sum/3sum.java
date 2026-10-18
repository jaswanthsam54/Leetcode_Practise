import java.util.*;
public class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        if(a==null||a.length<3) return new ArrayList<>();
        Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            int l=i+1;
            int r=a.length-1;
            while(l<r){
                int sum=a[i]+a[r]+a[l];
                if(sum==0){
                    result.add(Arrays.asList(a[i],a[l],a[r]));
                    l++;
                    r--;
                }
                else if(sum<0) l++;
                else r--;
            }
        }
        return new ArrayList<>(result);
    }
}