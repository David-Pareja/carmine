public class Day4 {

    public static boolean findDupes(String s){
        int n = s.length()

        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            for (int j = i + 1; j < n; j++){
                char c2 = s.charAt(j);
                    if (c == c2) return true;
            }
        }
    }
}