public class Proj5 {
    public static void main(String[] args){
        String html = ("<p><b><i>Italics and bold!</i>just bold</b></p>\r");

        while (true) {
            int x = html.indexOf("<");
            if ( x < 0) break;
            int y = html.indexOf(">"); 
            if ( y < 0 ) break; 
            String tag = html.substring(x + 1, y);


            //System.out.println(tag);
            html = html.substring(y + 1);
        }
    }
}