package persona;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Persona {
    protected String cognome, nome;
    protected Date data_nasc;
    public Persona(String cognome, String nome, Date d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        this.data_nasc = d_nasc;
    }
    public Persona(String cognome, String nome, String d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
    try {
        this.data_nasc = new SimpleDateFormat("dd/MM/yyyy").parse(d_nasc);
    } catch (ParseException ex) {
        this.data_nasc= new Date(0);//1 1 1970
    }
}
//get e set ….
    public void setCognome(String cognome){
        this.cognome=cognome;}
    public void setNome(String nome){
        this.nome=nome;}
    public void setData(Date data){
        this.data_nasc=data;}
    
    public String getCognome(){
        return (this.cognome);}
    public String geNome(){
        return (this.nome);}
    public Date getData(){
        return (this.data_nasc);}
@Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return cognome+"," +nome+"," + df.format(data_nasc);
    }

public static void main(String[] args) {
        Persona a1 = new Persona("Marco","Garmacia","10/10/2003");
        System.out.println(a1.toString());
    }
}
