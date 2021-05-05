package Commons;

public class StringUtils {
    public static final String COMMA = ",";
    public static final String CSV = ".csv";

    public static String concat( String[] content , String character){
        StringBuffer uotStr = new StringBuffer(content[0]);

        for (int i = 0; i < content.length ; i++) {

            uotStr.append(character);
            uotStr.append(content[i]);

        }
        return uotStr.toString() ;

    }

}
