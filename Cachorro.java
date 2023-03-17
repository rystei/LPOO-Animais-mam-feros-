public class Cachorro extends Mamifero implements Animal {

    public Cachorro(boolean amamentar) {
        super(amamentar);
    }

    @Override
    public boolean dormir(boolean dorme) {
        if(dorme==true){return true;}
        else{return false;}
    }
    @Override
    public String EmitirSom() {
        return "Auau";
    }
}
