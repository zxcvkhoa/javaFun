
public class StringManipulator {
    public String trimAndConcat(String String1, String String2){
        String c = String1.trim().concat(String2.trim());
        return c;
    }
    public Integer getIndexOrNull(String str, char letter){
        int a = str.indexOf(letter);
        if(a > 0){
            return a;
        } else {
            return null;
        }
    }
    public Integer getIndexOrNull(String str1, String str2){
        int a = str1.indexOf(str2);
        if(a>0){
            return a;
        } else {
            return null;
        }
    }
    public String concatSubstring(String str1, int start, int end, String str2){
        String a = str1.substring(start, end);
        String c = a.concat(str2);
        return c;

    }




}