public class Task4 {
    private String name;

    public Task4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        Task4 cat = new Task4("Whiskers");
        Task4 rex = new Task4 ("Rex");
        cat.meow();
        cat.meow();
        rex.meow();
        cat.meow();

    }
}