class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>(); 

        for (int i = 0; i < rowIndex+1; i++) { 
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i > 0) {
                List<Integer> prevRow = triangle.get(i - 1); 
                for (int j = 1; j < i; j++) { 
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                row.add(1); 
            }

            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}