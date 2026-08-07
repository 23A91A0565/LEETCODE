/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len=mountainArr.length();
        int l=0,h=len-1;
        while(l<h){
            int mid=(l+h)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        int ans=l;
        l=0;
        h=ans;
        while(l<=h){
            int mid=(l+h)/2;
            if(mountainArr.get(mid)==target)return mid;
            else if(mountainArr.get(mid)<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }

        l=ans+1;
        h=len-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)<target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}