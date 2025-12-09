class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i=1;
        while(memory1>=i || memory2>=i){
            if(memory1>=memory2){
                if(memory1>=i)memory1-=i;
                else break;
            }
            else{
                if(memory2>=i)memory2-=i;
                else break;
            }
            i+=1;
        }
        return new int[]{i,memory1,memory2};
    }
}