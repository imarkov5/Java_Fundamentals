public class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        String trimStr1 = str1.trim();
        String trimStr2 = str2.trim();
        String concatStr = trimStr1.concat(trimStr2);

        return concatStr;
    }
}