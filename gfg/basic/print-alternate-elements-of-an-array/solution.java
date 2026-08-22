class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
       ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2)
        {
            r.add(arr[i]);
        }
        return r;
    }
}