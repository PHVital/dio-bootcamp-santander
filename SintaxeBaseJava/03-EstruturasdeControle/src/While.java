package src.SintaxeBaseJava.EstruturasdeControles;

public class While {
    public static void main(String[] args) {
        var i = 0;
        while (i < args.length) {
            System.out.println(args[i]);
            i++;
        }

        System.out.println("================================");
        i = 0;

        // FORMA COM DO-WHILE
        do {
            System.out.println(args[i]);
            i++;
        } while (i < args.length);

        /*
        OUTRO EXERCICIO
        var scanner = new Scanner(System.in);
        var name = "exit";

        do {
            System.out.println("Digite um nome: ");
            name = scanner.next();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
        */
    }
}
