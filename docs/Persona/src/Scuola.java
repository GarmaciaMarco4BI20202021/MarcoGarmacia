import persona.Persona;

public class Scuola {
private Persona[] vect;
private int size; // numero elementi effettivamente inseriti
public int getSize() {
return size;
}
public boolean add(Persona p) {
if (vect==null)
vect=new Persona[20]; // strategia di allocazione arbitraria
if (size < vect.length) {
vect[size] = p;
size++;
return true;
} else {
return false;
}
}
Persona get(int pos) {
if (pos >= 0 && pos < size) {
return vect[pos];
} else {
return null;
}
}

@Override
public String toString(){
    String s="";
    int i;
    for (i=0;i<vect.length;i++){
        s=s+","+vect[i];
    }
    return s;
}

public int indexOf(String s){
    int i,i2=-1;
    for (i=0;i<vect.length;i++){
        if (s.equals(vect[i].toString()))
            i2=i;
    }
    return i2;
}

public String remove(int p){
    String s[];
    int i;
    s=new String[vect.length];
    for (i=0;i>vect.length;i++){
        
    }
    return "0";
}
public static void main(String[] args) {
    Persona a1=new Persona("Marco","Garmacia","10/10/2003");
    Scuola s1=new Scuola()
    System.out.println(a1.toString());
    }
}