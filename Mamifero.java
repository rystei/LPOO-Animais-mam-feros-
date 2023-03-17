public abstract class Mamifero implements Animal{
    private boolean amamentar;

    public Mamifero(boolean amamentar){
        this.amamentar = amamentar;
    }
    public abstract boolean dormir(boolean dorme);
}
