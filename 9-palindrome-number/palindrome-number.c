bool isPalindrome(int x) {
    long long sum=0;
    long long temp=x;
    while(x>0)
    {
sum=sum*10+(x%10);
    x=x/10;    
    
    }
    if(sum==temp)
        return true;
    else
        return false;
    
    
    
    
}