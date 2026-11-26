class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            char lowChar = s.charAt(low);
            char highChar = s.charAt(high);
            if(!Character.isLetterOrDigit(lowChar)){
                low++;
                continue;
            } 
            if(!Character.isLetterOrDigit(highChar)){
                high--;
                continue;
            } 

            if(Character.toLowerCase(lowChar) != Character.toLowerCase(highChar)){
                return false;
            }
            low++;
            high--;

        }
        return true;
    }
}
