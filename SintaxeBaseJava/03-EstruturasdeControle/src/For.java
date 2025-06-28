package src.SintaxeBaseJava.EstruturasdeControles;

public class For {
    public static void main(String[] args) {
        for (var i = 0; i < args.length; i++) {
            System.out.println((i+1) + " - " + args[i]);
        }

        // Outra forma de se fazer o for, é mais parecido com o for do Python

//        for(var arg : args) {
//            System.out.println(arg);
//        }
    }
}
