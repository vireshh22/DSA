package String.Medium;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        if(s.length() != goal.length()) System.out.println("No");
        String concatinated = s + s;
        System.out.println(concatinated.contains(goal));
    }
}
