public class Gato extends Mamifero implements Animal{

    public Gato(boolean amamentar) {
        super(amamentar);
    }

    @Override
    public String EmitirSom() {
        return "Miau";
    }

    @Override
    public boolean dormir(boolean dorme) {
        if(dorme==true){return true;}
        else{return false;}
    }
}
