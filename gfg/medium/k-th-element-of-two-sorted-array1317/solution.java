class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
        int pos=0;
        int r=0;
        while(pos!=k)
        {
            if(i==a.length) r=b[j++];
            else if(j==b.length) r=a[i++];
           else if(a[i]<b[j]) r=a[i++];
            else r=b[j++];
            pos++;
        }
        return r;
    }
}