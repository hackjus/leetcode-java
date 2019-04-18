import java.util.Arrays;
import java.util.List;

public class minimumTotal {
	int minSum=Integer.MAX_VALUE;
    public int mintotal(List<List<Integer>> triangle) {
    	int minSum;
    if(triangle.size()==0|| triangle.get(0).size()==0) {	
    	return 0;
    }
    return _dfs(triangle, 0, 0,"",0);
    }
    private int _dfs(List<List<Integer>> triangle,int i,int j,String path,int sum) {
    	if(i==triangle.size()-1) {
    		path+=triangle.get(i).get(j);
        	sum+=triangle.get(i).get(j);
        	minSum=Math.min(sum, minSum);
    		System.out.println(path+" with sum: "+ sum);
    		System.out.println(minSum);
    		return 0;
    	}
    	path+=triangle.get(i).get(j)+"->";
    	sum+=triangle.get(i).get(j);
    	_dfs(triangle, i+1, j,path,sum);
    	_dfs(triangle, i+1, j+1,path,sum);
    	return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        minimumTotal oneMinimumTotal=new minimumTotal();
        int result=oneMinimumTotal.mintotal(Arrays.asList(
        		Arrays.asList(2),
        		Arrays.asList(3,4),
        		Arrays.asList(6,5,7),
        		Arrays.asList(4,1,8,3)
        		));
	}

}
