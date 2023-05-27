

//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger result;
        result=a.multiply(b);
        String r  = result.toString();
        return r;
        //code here.
    }
}
