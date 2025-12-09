class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=0;
        int pre=capacity;
        for(int i=0;i<plants.length;i++){
            if(pre>=plants[i]){
                pre-=plants[i];
                c+=1;
            }
            else{
                pre=capacity-plants[i];
                c+=(2*i+1);
            }
        }
        return c;
    }
}