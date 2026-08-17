class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int count=requests[0];
        int m=requests.length;
        for(int i=1;i<m;i++)
            {
                count+=Math.abs(requests[i]-requests[i-1]);
            }
        return count;
    }
}