class Solution {
    public int bitwiseComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
        
        
        
        // String str = Integer.toBinaryString(num);
        // String res = "";
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i) == '0'){
        //         res += '1';
        //     }
        //     else{
        //         res += '0';
        //     }
        // }
        // return Integer.parseInt(res,2);
    }
}