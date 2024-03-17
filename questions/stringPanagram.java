public class stringPanagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) < 0) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Panagram");
        } else {
            System.out.println("Not Panagram");
        }
    }
}
