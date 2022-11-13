/**
    Not timed. 
    https://leetcode.com/problems/reverse-words-in-a-string/
 */

class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();

        String[] words = s.split("\\s+");
        for( int i = words.length -1; i >=0; i--){
            if(!words[i].isBlank() && !words[i].isEmpty()){
                reversed.append(words[i] + " ");
            }
        }
        
        return reversed.length() > 0 
            ? reversed.subSequence(0, reversed.length() - 1).toString() 
            : "";
    }
}


// class Solution {
//     public String reverseWords(String s) {
//         Stack<String> allWords = new Stack();
//         StringBuilder word = new StringBuilder();
//         StringBuilder reversed = new StringBuilder();
//         for(int i=0; i<s.length(); i++){
//             char letter = s.charAt(i);
//             if(letter == ' '){
//                 if(word.length() > 0){
//                     allWords.push(word.toString());
//                     word = new StringBuilder();
//                 } 
//             } else {
//                 word.append(s.charAt(i));
//             }
//         }
//         if(word.length() > 0){
//             allWords.push(word.toString());
//         }

//         while(!allWords.isEmpty()){
//             reversed.append(allWords.pop() + " ");
//         }
//         return reversed.subSequence(0, reversed.length() - 1).toString();
//     }
// }