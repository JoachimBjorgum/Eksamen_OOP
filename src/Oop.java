public class Oop {
    public static void main(String[] args) {
        race();
        shape3d();
        chess();
    }
    private static void race() {
        System.out.println("\nSimulated race runners:");
        new Race();
    }
    private static void shape3d() {
        System.out.println("\nShape3d:");
        new Shape3d();
    }
    private static void chess() {
        System.out.println("\nChess:");
    }
}
