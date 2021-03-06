/*
 * This is the file with your answer, do not rename or move it.
 * Write your code in it, and save it before submitting your answer.
 */

/**
 * This class is a container for your answer,
 * and its declaration must be kept unmodified.
 */
public class Answer {
    /**
     * Returns an abbreviated version of a full name. All names except the 
     * last are abbreviated with one letter.
     *
     * This method declaration must be kept unmodified.
     *
     * @param abbreviateFullName the full name of the person
     * @return the abbreviated version of the full name
     */
    public static String abbreviateFullName(String name) {
        String[] names = name.split(" ");
        String rname = names[0];
        for (int i = 1; i < names.length; i++) {
          rname += " "+names[i].charAt(0)+"."; 
        }
        return rname;
    }

    /**
     * Tests the method abbreviate with the examples given in the question. 
     * This test code is provided only for your convenience.
     */
    public static void main(String[] args) {
        System.out.print(Answer.abbreviateFullName("John Smith") + "\n");
        System.out.print(Answer.abbreviateFullName("Anna Maria Simpson") + "\n");
        System.out.print(Answer.abbreviateFullName("Bob Alan Faria Stewart") + "\n");
    }
}
