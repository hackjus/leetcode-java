import java.util.Stack;

public class TrappingRainWater {
	  public int trap(int[] height) {
	        int left = 0;
	        int right = height.length - 1;
	        int res = 0;
	        int leftMax = 0;
	        int rightMax = 0;
	        while (left < right) {
	            if (height[left] < height[right]) {
	                leftMax = Math.max(height[left], leftMax);
	                res += leftMax - height[left];
	                left++;
	            } else {
	                rightMax = Math.max(height[right], rightMax);
	                res += rightMax - height[right];
	                right--;
	            }
	        }
	        return res;
	    }
	  public int trap1(int[] A) {
	        if (A==null) return 0;
	        Stack<Integer> s = new Stack<Integer>();
	        int i = 0, maxWater = 0, maxBotWater = 0;
	        while (i < A.length){
	            if (s.isEmpty() || A[i]<=A[s.peek()]){
	                s.push(i++);
	            }
	            else {
	                int bot = s.pop();
	                maxBotWater = s.isEmpty()? // empty means no il
	                0:(Math.min(A[s.peek()],A[i])-A[bot])*(i-s.peek()-1);
	                maxWater += maxBotWater;
	            }
	        }
	        return maxWater;
	    }
	
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	int s[]= {0,1,0,2,1,0,1,3,2,1,2,1};
	    	int num1[]= {2,1,0,3,0,0,4};
	    	int n=new TrappingRainWater().trap1(num1);
	    	System.out.println(n);
		}
}
