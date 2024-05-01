class Solution {
    public String reversePrefix(String word, char ch) {
        int firstOccurence = word.indexOf(ch);
        if(firstOccurence == -1){
            return word;
        }
        
        StringBuilder prefix = new StringBuilder(word.substring(0, firstOccurence+1));
        return prefix.reverse().toString() + word.substring(firstOccurence+1);
        // int n = word.length();
        // int indx = -1;
        // int i;
        // int flag = 0;
        // for(i=0; i<n; i++) {
        //     if(word.charAt(i) == ch) {
        //         indx = i;
        //         i++;
        //         flag = 1;
        //         break;
        //     }
        // }

        // if(flag == 0) {
        //     return word;
        // }
        // String ss = "";

        // while(indx>=0) {
        //     ss += word.charAt(indx);
        //     indx--;
        // }
        // while(i < n) {
        //     ss += word.charAt(i);
        //     i++;
        // }

        // return ss;
    }
}