
public class frontend {
    public static void main(String[] args) {
        try {
            new graphics(new backend());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
