public class Main {
    public static void main(String[] args) {
        Mamifero gato = new Gato(true);
        gato.dormir(true);
        Mamifero cachorro = new Cachorro(true);
        cachorro.dormir(true);
    }
}