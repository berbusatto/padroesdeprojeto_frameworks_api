import javax.naming.NamingEnumeration;

public class SorveteFactory {
    public static Sorvete get(int tipo){
        return switch (tipo) {
            case 0 -> new Chocolate();
            case 1 -> new Baunilha();
            case 2 -> new Morango();
            default -> null;
        };
    }
}
