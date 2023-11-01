import java.util.*;

public class panagramFind {
    public static boolean panagram(String str) {
        

        HashSet<Character> StrChar = new HashSet<>();
        
        ArrayList<Character> Alphabets = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            Alphabets.add(i);
        }

        for (int i = 0; i < str.length(); i++) {
            StrChar.add(str.charAt(i));
        }

        return StrChar.size() == Alphabets.size();

    }

    public static boolean panagramMethod2(String str) {

        HashMap<Character, Integer> Alphabets = new HashMap<>();

        for (char i = 'a'; i <= 'z'; i++) {
            Alphabets.put(i, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            Alphabets.put(str.charAt(i), Alphabets.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (Character x : Alphabets.keySet()) {
            if (Alphabets.get(x) >= 2)
                continue;

            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s = str.toLowerCase();
        boolean ans = panagramMethod2(s);

        System.out.print(ans);

    }
}











