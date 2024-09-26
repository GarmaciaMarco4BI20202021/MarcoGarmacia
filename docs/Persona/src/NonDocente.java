import java.util.Date;
import persona.Persona;

public class NonDocente extends Persona{
    private String contratto, incarico;
    
    public NonDocente(String cognome, String nome, Date d_nasc, String contratto, String incarico){
        super (cognome,nome,d_nasc); 
        this.contratto=contratto;
        this.incarico=incarico;
    }
    public NonDocente(String cognome, String nome, String d_nasc, String contratto, String incarico){
        super (cognome,nome,d_nasc); 
        this.contratto=contratto;
        this.incarico=incarico;
    }
    
    public void getContratto(String contratto){
        this.contratto=contratto;}
    public void getIncarico(String incarico){
        this.incarico=incarico;}
    
    public String setContratto(){
        return(this.contratto);}
    public String setIncarico(){
        return(this.incarico);}
    
    @Override
    public String toString(){
        String s = super.toString()+","+contratto+","+incarico;
        return(s);
    }
    public static void main(String[] args) {
        Docente a1 = new Docente("Marco","Garmacia","10/10/2003","TD","TECN");
        System.out.println(a1.toString());
    }
}
