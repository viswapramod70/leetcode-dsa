class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n+1];
        return sieves(n,primes);
    }
    public int sieves(int n,boolean[] primes){
        int count = 0;
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=2*i;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!primes[i])
                count++;
        }
        return count;
    }
}