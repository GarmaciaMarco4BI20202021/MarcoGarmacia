import java.util.Date;
import persona.Persona;

public class Docente extends Persona{
    private String contratto, cls_concorso;
    
    public Docente(String cognome, String nome, Date d_nasc, String contratto, String cls_concorso){
        super (cognome,nome,d_nasc); 
        this.contratto=contratto;
        this.cls_concorso=cls_concorso;
    }
    public Docente(String cognome, String nome, String d_nasc, String contratto, String cls_concorso){
        super (cognome,nome,d_nasc); 
        this.contratto=contratto;
        this.cls_concorso=cls_concorso;
    }
    
    public void getContratto(String contratto){
        this.contratto=contratto;}
    public void getConcorso(String concorso){
        this.cls_concorso=concorso;}
    
    public String setContratto(){
        return(this.contratto);}
    public String setConcorso(){
        return(this.cls_concorso);}
    
    @Override
    public String toString(){
        String s = super.toString()+","+contratto+","+cls_concorso;
        return(s);
    }
    public static void main(String[] args) {
        Docente a1 = new Docente("Marco","Garmacia","10/10/2003","TD","ss");
        System.out.println(a1.toString());
    }
}
