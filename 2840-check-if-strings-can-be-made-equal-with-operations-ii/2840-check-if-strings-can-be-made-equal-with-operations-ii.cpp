class Solution {
public:
    bool checkStrings(string s1, string s2) {
        // vector<char>e1;
        // vector<char>e2;
        // vector<char>o1;
        // vector<char>o2;
        // if(s1.size()!=s2.size())return false;
        // for(int i=0;i<s1.size();i++){
        //     if(i%2==0){
        //         e1.push_back(s1[i]);
        //         e2.push_back(s2[i]);
        //     }
        //     else{
        //         o1.push_back(s1[i]);
        //         o2.push_back(s2[i]);
        //     }
        // }
        // sort(e1.begin(),e1.end());
        // sort(e2.begin(),e2.end());
        // sort(o1.begin(),o1.end());
        // sort(o2.begin(),o2.end());
        // return e1==e2 && o1==o2;

        if(s1.size()!=s2.size())return false;
        vector<int>even(26,0),odd(26,0);
        for(int i=0;i<s1.size();i++){
            if(i%2==0){
                even[s1[i]-'a']++;
                even[s2[i]-'a']--;
            }
            else{
                odd[s1[i]-'a']++;
                odd[s2[i]-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(even[i]!=0 || odd[i]!=0)return false;
        }
        return true;
    }
};