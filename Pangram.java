// Leetcode Problem No : 1832

class Pangram {
    public boolean checkIfPangram(String sentence) {
        boolean sent[] = new boolean[26];
        int count = 0;

        if(sentence.length() < 26){
            return false;
        }

        for(char c : sentence.toCharArray()){
            int index = c - 'a';
            if(!sent[index]){
                sent[index] = true;
                count++;
                if(count == 26)
                    return true;
            }
        }
        return count == 26;
    }
}