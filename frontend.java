
public class frontend {
    public static void main(String[] args) {
        try {
            new graphics(new backend());
        } catch (NoInputException e) {
            System.out.println(e);
        }
    }
}
