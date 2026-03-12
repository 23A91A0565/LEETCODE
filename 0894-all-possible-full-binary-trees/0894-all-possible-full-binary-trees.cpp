/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<TreeNode*> allPossibleFBT(int n) {
        vector<TreeNode*>ans;

        if(n%2==0)return ans;
        if(n==1){
            ans.push_back(new TreeNode(0));
            return ans;
        }

        for(int i=1;i<n;i+=2){
            int left=i;
            int right=n-1-i;
            vector<TreeNode*> l_nodes=allPossibleFBT(left);
            vector<TreeNode*> r_nodes=allPossibleFBT(right);
            for(auto l:l_nodes){
                for(auto r:r_nodes){
                    TreeNode *root=new TreeNode(0);
                    root->left=l;
                    root->right=r;
                    ans.push_back(root);
                }
            }
        }
        return ans;
    }
};