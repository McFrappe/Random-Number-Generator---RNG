
public class frontend {
    public static void main(String[] args) {
        try {
            new graphics();
        } catch (NoInputException e) {
            System.out.println(e);
        }
    }
}
