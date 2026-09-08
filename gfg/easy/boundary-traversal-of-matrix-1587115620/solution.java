class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int buttom=n-1;
        ArrayList<Integer> r=new ArrayList<>();
        while(left<=right)
        {
            r.add(mat[top][left]);
            left++;
        }
        top=1;
        while(top<=buttom)
        {
            r.add(mat[top][right]);
            top++;
        }
        if(n==1) return r;
        left=0;
        right-=1;
        if(buttom>0)
        {
        while(right>=left)
        {
            r.add(mat[buttom][right]);
            right--;
        }
        }
        if(m==1) return r;
        top=1;
        buttom-=1;
      while(buttom>=top)
      {
          r.add(mat[buttom][left]);
          buttom--;
      }
        return r;
    }
}
