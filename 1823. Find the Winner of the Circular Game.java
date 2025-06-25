class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l.add(i);
        }
        int cur_ind=0;
        while(l.size()>1)
        {
            int next_to_remove = (cur_ind + k - 1) % l.size();
            l.remove(next_to_remove);
            cur_ind = next_to_remove;

        }
        return l.get(0);
    }
}
