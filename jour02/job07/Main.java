package jour02.job07;

public class Main {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder repeatedAlphabet = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            repeatedAlphabet.append(alphabet);
        }

        for (int i = 0; i < repeatedAlphabet.length(); i += 2) {
            System.out.println(repeatedAlphabet.substring(0,i + 1));
        }
    }
}
