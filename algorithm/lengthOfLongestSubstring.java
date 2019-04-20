
public class lengthOfLongestSubstring {
	 public int lengthOfLongestSubstring(String s) {

	        int[] freq = new int[256];

	        int l = 0, r = -1; //��������Ϊs[l...r]
	        int res = 0;

	        // ����ѭ���� l == 0; r == -1 ����մ��ڿ�ʼ
	        // ��l == s.size(); r == s.size()-1 ����մ��ڽ�ֹ
	        // ��ÿ��ѭ�����𽥸ı䴰��, ά��freq, ����¼��ǰ�������Ƿ��ҵ���һ���µ�����ֵ
	        while(l < s.length()){

	            if(r + 1 < s.length() && freq[s.charAt(r+1)] == 0)
	                freq[s.charAt(++r)] ++;
	            else    //r�Ѿ���ͷ || freq[s[r+1]] == 1
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
