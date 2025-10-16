class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        solve(ans,a,n,k,new ArrayList<>(),0);
        return ans;
    }
    public void solve(List<List<Integer>> ans,int a[],int n,int k,ArrayList<Integer> store,int index){
        if(store.size()==k){
            ans.add(new ArrayList<>(store));
            return;
        }
        for(int i=index;i<n;i++){
            store.add(a[i]);
            solve(ans,a,n,k,store,i+1);
            store.remove(store.size()-1);
        }
    }
}
