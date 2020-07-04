public class LongestSubSequence {

    public static int longestSubSeq(int[] arr, int i, int n, int prev){
        //If nothing left
        if(i == n){   return 0;    }
        //case1: including current element
        int case1 = 0;
        if(arr[i]>prev){
         case1 = 1+ longestSubSeq(arr,i+1,n,arr[i]);
        }
        //case 2 excluding current element
        int case2 = longestSubSeq(arr, i+1, n, prev);
        //return max of both cases
        return Integer.max(case1, case2);
    }

    public static void main(){
        int[] arr = {3,10,2,1,20};
        System.out.println(longestSubSeq(arr, 0, arr.length,-999999));

    }
}
