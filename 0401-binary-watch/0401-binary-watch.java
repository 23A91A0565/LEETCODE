class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<=11;i++){
            for(int j=0;j<=59;j++){
                int count=Integer.bitCount(i)+Integer.bitCount(j);
                if(count==turnedOn){
                    if(j<=9){
                        res.add(i+":0"+j);
                    }
                    else{
                        res.add(i+":"+j);
                    }
                }
            }
        }
        return res;
    }
}