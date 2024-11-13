public class Proj5 {
    public static void main(String[] args){
        String html = ("<p><b><i>Italics and bold!</i>just bold</b></p>\r");

        while (true) {
            int x = html.indexOf("<");
            int y = html.indexOf("<");  
            String tag = html.substring(x + 1, y);
            System.out.println(tag);
            html = html.substring(y + 1);
        }
    }
}