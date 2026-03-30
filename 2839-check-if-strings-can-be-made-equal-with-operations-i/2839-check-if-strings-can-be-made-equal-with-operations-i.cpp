class Solution {
public:
    bool canBeEqual(string s1, string s2) {
        vector<char>e1;
        vector<char>e2;
        vector<char>o1;
        vector<char>o2;
        for(int i=0;i<4;i+=2){
            e1.push_back(s1[i]);
            e2.push_back(s2[i]);
        }
        for(int i=1;i<4;i+=2){
            o1.push_back(s1[i]);
            o2.push_back(s2[i]);
        }
        sort(e1.begin(),e1.end());
        sort(e2.begin(),e2.end());
        sort(o1.begin(),o1.end());
        sort(o2.begin(),o2.end());

        return e1==e2 && o1==o2;

    }
};