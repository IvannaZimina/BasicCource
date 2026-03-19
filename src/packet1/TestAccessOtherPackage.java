// модификаторы доступа: public, private, protected, default
// public - доступен везде
// private - доступен только внутри класса
// protected - доступен внутри пакета и в подклассах
// default (package-private) - доступен только внутри пакета

package packet1;

import packet2.AccessLevels;

// extends AccessLevels позволяет TestAccessOtherPackage наследовать protected переменные, но не дает доступа к ним через объект класса AccessLevels
public class TestAccessOtherPackage  extends AccessLevels{
    public static void main(String[] args) {
        AccessLevels obj = new packet2.AccessLevels();

        System.out.println("Testing access levels from another package:");
        System.out.println("Public variable: " + obj.publicVar); // доступно
        System.out.println("Protected, default, and private variables are not accessible from another package.");

        // ошибка, protectedVar недоступен, так как TestAccessOtherPackage находится в другом пакете
        // System.out.println("Protected variable: " + obj.protectedVar);
        
        // ошибка, defaultVar недоступен, так как TestAccessOtherPackage находится в другом пакете
        // System.out.println("Default variable: " + obj.defaultVar);

        // ошибка, privateVar недоступен, так как privateVar недоступен в любом другом классе, даже в том же пакете
        // System.out.println("Private variable: " + obj.privateVar);
    }

    public void testProtect() {
        System.out.println(protectedVar);
    }
}
