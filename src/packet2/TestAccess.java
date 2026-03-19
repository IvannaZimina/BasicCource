package packet2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println("Public variable: " + obj.publicVar); // доступно
        System.out.println("Protected variable: " + obj.protectedVar); // доступно, так как TestAccess находится в том же пакете
        System.out.println("Default variable: " + obj.defaultVar); // доступно, так как TestAccess находится в том же пакете
        // System.out.println("Private variable: " + obj.privateVar); // ошибка, privateVar недоступен
    }
}
