
public class lengthOfLongestSubstring {
	 public int lengthOfLongestSubstring(String s) {

	        int[] freq = new int[256];

	        int l = 0, r = -1; //滑动窗口为s[l...r]
	        int res = 0;

	        // 整个循环从 l == 0; r == -1 这个空窗口开始
	        // 到l == s.size(); r == s.size()-1 这个空窗口截止
	        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
	        while(l < s.length()){

	            if(r + 1 < s.length() && freq[s.charAt(r+1)] == 0)
	                freq[s.charAt(++r)] ++;
	            else    //r已经到头 || freq[s[r+1]] == 1
	                freq[s.charAt(l++)] --;

	            res = Math.max(res, r-l+1);
	        }

	        return res;
	    }

	    public static void main(String[] args) {

	        System.out.println((new lengthOfLongestSubstring()).lengthOfLongestSubstring( "abcabcbb" ));
	        System.out.println((new lengthOfLongestSubstring()).lengthOfLongestSubstring( "bbbbb" ));
	        System.out.println((new lengthOfLongestSubstring()).lengthOfLongestSubstring( "pwwkew" ));
	        System.out.println((new lengthOfLongestSubstring()).lengthOfLongestSubstring( "" ));
	    }
}
