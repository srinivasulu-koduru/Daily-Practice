class Solution {
    public String intToRoman(int num) {
        String[] th={"","M","MM","MMM"};
        String[] hun={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ten={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] one={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        int t=num/1000;
        int h=(num/100)%10;
        int te=(num/10)%10;
        int o=num%10;
        return th[t]+hun[h]+ten[te]+one[o];
    }
}