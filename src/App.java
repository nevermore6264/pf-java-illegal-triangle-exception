public class App {
    public static void main(String[] args) {

        Triangle triangle;
        try {
            triangle = new Triangle(1, 2, 2000);
        } catch (Triangle.IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
