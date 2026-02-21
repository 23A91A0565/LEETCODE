class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            int num_ones=Integer.bitCount(i);

            // [or]
            
            //String str=Integer.toString(i,2);
            // int num_ones=0;
            // for(int j=0;j<str.length();j++)
            // {
            //     if(str.charAt(j)=='1')
            //     {
            //         num_ones+=1;
            //     }
            // }
            if(isPrime(num_ones))
            {
                c+=1;
            }
        }
        return c;
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}