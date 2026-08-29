class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int ss=source[0];
        int se=source[1];
        int ts=target[0];
        int te=target[1];
        if((ss+se)%2!=(ts+te)%2) return -1;
        if(Math.abs(ss-ts)==Math.abs(se-te)) return 1;
        return 2;
    }
}