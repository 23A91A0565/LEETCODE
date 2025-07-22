class Solution {
    public int minSteps(String s, String t) {
        int n=s.length();
        int m=s.length();
        int count=0;
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<n;i++){
        int index=s.charAt(i)-'a';
        a[index]+=1;
       }
    
       for(int j=0;j<m;j++){
        int index2=t.charAt(j)-'a';
        b[index2]+=1;
       }
      for(int i=0;i<26;i++){
        count+=Math.abs(a[i]-b[i]);
      }
      return count/2;

      // [ OR ]
       
       /* HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqS.put(ch, freqS.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            freqT.put(ch, freqT.getOrDefault(ch, 0) + 1);
        }

        int steps = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int countS = freqS.getOrDefault(ch, 0);
            int countT = freqT.getOrDefault(ch, 0);
            steps += Math.abs(countS - countT);
        }

        return steps / 2;*/
    }
}