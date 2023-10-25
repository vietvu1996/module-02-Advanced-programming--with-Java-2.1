public class Main {
    public static void main(String[] args) {
        String input = "abcabcdgabcmnxy";
        String longestSubstring = find(input);
        System.out.println("Chuỗi con có độ dài lớn nhất: " + longestSubstring);
    }

    public static String find(String input){
        input = input + " ";
        String longest = "";

        StringBuilder current = new StringBuilder();
        current.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) > current.charAt(current.length() - 1)){
                current.append(input.charAt(i));
            }
            else {
                if(current.length() > longest.length()){
                    longest = current.toString();
                }
                current = new StringBuilder(String.valueOf(input.charAt(i)));
            }
        }
        return longest;
    }
}