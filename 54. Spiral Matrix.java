class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0,r=n-1,t=0,b=m-1;
        while(l<=r&&t<=b){
            for(int i=l;i<=r;i++){
                arr.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                arr.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                arr.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                arr.add(matrix[i][l]);
                }
                l++;
            }
        }
        return arr;
    }
}
