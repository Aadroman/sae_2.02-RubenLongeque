package eraser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eraser {


    public static String eraseV0(String str) {
        String st = str.trim().replaceAll("\\s{1,}", "");
        return st;
    }

    public static String erase(String str){
        // Pattern pattern = Pattern.compile(".*\\s+.*");
        // Matcher matcher = pattern.matcher(str);
        // boolean found = matcher.find();
        //boolean isWhitespace = str.matches(".*\\s+.*");

        // String st;
        for(int i=0; i<str.length();i++){
            if(/*!Character.isWhitespace(str.charAt(i-1)) &&*/ Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i+1)) ){
                str.trim().replaceAll("\\s", "");
                return str;
            }
        }
        //st = str.replace("\\s+", "");
        return null;
    }

}
