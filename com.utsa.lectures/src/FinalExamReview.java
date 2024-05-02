public class FinalExamReview {


    String s = "99 Red Balloons";

    public static void main(String[] args) {

        String s = "99 Red Balloons";
        String[] words = s.split(" ");
        for (String word : words) {
            try {
                int i = Integer.parseInt(word);
                //printing just the value
                System.out.println(i);

                // print the index location of the integer
                System.out.println(s.indexOf(word));
            } catch (NumberFormatException e) {
                // Do nothing
            }
        }

        reverseString();
    }

    public static void reverseString(){

        String song = "99 Red Balloons";

        int length = song.length();
        // print the string in reverse
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(song.charAt(i));
        }

        String reverse = "";
        // print the string in reverse
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + song.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }
}
