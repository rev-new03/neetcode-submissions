class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return "";
        }
      String[] result = new String[strs.size()];
      char ch = '#';
      for(int i = 0; i< strs.size(); i++){
        result[i] = strs.get(i).length() + "" + ch + strs.get(i);  
      }
      String combined = "";
      for(int i = 0; i<strs.size();i++){
        combined += result;
      }
      return combined;
    }
    //["5#hello5#world"]
    public List<String> decode(String str) {
        if(str == null || str.length() == 0){
            return new ArrayList<>();
        }
        List<String> output = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int length = 0;
            while(i<str.length() && str.charAt(i) != '#'){
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String word = "";
            for(int j = 0; j<length && j<str.length; j++){
                word = word + str.charAt(i);
                i++;
            }
            output.add(word);
        }
        return output;
    }
}
