
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int r=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)<=x) r++;
        }
        return r;
    }
}