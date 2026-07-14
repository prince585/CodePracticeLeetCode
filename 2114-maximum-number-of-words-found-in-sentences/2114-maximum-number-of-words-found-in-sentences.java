class Solution {
    public int mostWordsFound(String[] sentences) {
        int tword = 0;
        for(int i =0; i < sentences.length; i++){
            String sentence = sentences[i];
            String[] word = sentence.split(" ");
            int number = word.length;
            if(number > tword){
                tword = number;
            }
            

        }
        return tword;
    }
}