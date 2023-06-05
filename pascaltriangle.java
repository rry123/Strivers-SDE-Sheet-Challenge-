class Solution {
    List<Integer> genrow(int row, List<Integer> ans){
        int alpha = 1;
        ans.add(alpha);
        for(int col=1; col<row ; col++){
            alpha = alpha*(row-col)/col;
            ans.add(alpha);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
             List<Integer> ans = new ArrayList<>();
             list.add(genrow(i, ans));
        }
        return list;
    }
}