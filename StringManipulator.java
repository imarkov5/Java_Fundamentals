public class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim().concat(str2.trim());
        // String trimStr1 = str1.trim();
        // String trimStr2 = str2.trim();
        // String concatStr = trimStr1.concat(trimStr2);

        // return concatStr;
    }
    public static Integer getIndexOrNull(String input, char letter){
        return input.indexOf(letter) != -1 ? input.indexOf(letter) : null;
    }
    public static Integer getIndexOrNull(String word, String subString ){
        return word.indexOf(subString) != -1 ? word.indexOf(subString): null;
    }
    public static String concatSubstring(String string1, int idxA, int idxB, String string2){
        // return string1.substring(idxA, idxB).concat(string2);
        String substr;
        try{
            substr = string1.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e){
            System.out.println(String.format("Exception caught: %s", e));
            substr = "LOL";
        }
        return substr.concat(string2);
    }
}
