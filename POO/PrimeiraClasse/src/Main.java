public class Main {
    public static void main(String[] args) {
        var male = new Person("João");
        male.incAge();
        male.incAge();
        male.incAge();
        var female = new Person("Maria");
        System.out.println("Male name: " + male.getName() + " Age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " Age: " + female.getAge());
    }
}