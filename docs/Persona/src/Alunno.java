import java.util.Date;
import persona.Persona;

public class Alunno extends Persona{
    private String classe;
    public Alunno(String cognome, String nome, Date d_nasc, String classe) {
        super(cognome,nome,d_nasc);
        this.classe = classe;
    }
    public Alunno(String cognome, String nome, String d_nasc,String classe) {
        super(cognome,nome,d_nasc);
        this.classe = classe;
    }
//get e set ...
    public void setClasse(String classe){
    this.classe=classe;}
    public String getClasse(){
    return(this.classe);}

@Override
    public String toString() {
        return super.toString()+"," + classe ;
    }

    public static void main(String[] args) {
        Alunno a1 = new Alunno("Marco","Garmacia","10/10/2003","4BI");
        System.out.println(a1.toString());
    }
}
