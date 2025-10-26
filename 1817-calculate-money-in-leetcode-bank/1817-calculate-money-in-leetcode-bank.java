class Solution {
    public int totalMoney(int n) {
        int sum = 0, x = 1;
        while(n>7){
            sum+= 7*(x+3);          //sum=(n/2)*(2a+(n-1)d);   n=7,a=x,d=1
            x++;
            n-=7;
        }
        sum+=(int)((n/2.0)*(2*x+(n-1)));
        return sum;
    }
}