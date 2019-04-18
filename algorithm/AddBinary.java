
public class AddBinary {
public static String addBinary(String a, String b) {
        StringBuilder sBuilder=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0) {
        	int sum=carry;
        	if(i>=0) sum+=a.charAt(i--)-'0';
        	if(j>=0) sum+=b.charAt(j--)-'0';
        	sBuilder.append(sum%2);
        	carry=sum/2;
        }
        if(carry!=0) {
        	sBuilder.append(carry);
        
        }
        return sBuilder.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="11";
		String s2="1";
		System.out.println(addBinary(s1, s2));
	}

}
