class Spreadsheet {
    HashMap<String, Integer> ans;

    public Spreadsheet(int rows) {
        ans = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        ans.put(cell, value);
    }

    public void resetCell(String cell) {
        ans.put(cell, 0);
    }

    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] parts = formula.split("\\+");
        String s1 = parts[0];
        String s2 = parts[1];

        int left = isCellRef(s1) ? ans.getOrDefault(s1, 0) : Integer.parseInt(s1);
        int right = isCellRef(s2) ? ans.getOrDefault(s2, 0) : Integer.parseInt(s2);

        return left + right;
    }
    private boolean isCellRef(String s) {
        return Character.isUpperCase(s.charAt(0));
    }
}
