class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2))
			return "0";
        int n=num1.length();
        int m=num2.length();
        int ans[]=new int[n+m-1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i+j]+=(num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        for(int i=ans.length-1;i>=1;i--)
        {
            ans[i-1]+=ans[i]/10;
            ans[i]=ans[i]%10;
        }
        StringBuilder sb = new StringBuilder();
		for (int i : ans) {
			sb.append(i);
		}
		return sb.toString();
    }
}