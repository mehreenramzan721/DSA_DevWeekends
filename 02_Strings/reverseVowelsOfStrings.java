/*
345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once
*/
class reverseVowelsOfStrings{
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        String vowels= "aeiouAEIOU";
        int left= 0;
        int right= arr.length-1;
        
        while (left<right){
            while (left<right && vowels.indexOf(arr[left])== -1) {
                left++;
            }
        while (left<right && vowels.indexOf(arr[right])== -1) {
                right--;
            }
            char temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
}
