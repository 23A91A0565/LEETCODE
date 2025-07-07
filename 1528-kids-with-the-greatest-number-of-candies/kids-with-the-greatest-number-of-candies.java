class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;

    }
}