import java.util.Comparator;

public class Amici extends Thread{
    String nome ;
    Pista p1;
    Spogliatoio s1;
    public Amici(String nome, Pista p1, Spogliatoio s1) {
        this.nome = nome;
        this.p1 = p1;
        this.s1 = s1;
    }
    public void run(){
        s1.s.V();
        s1.UsaSpogliatoglio(nome);;
        s1.s.P();
        p1.s.V();
        p1.UsaPista(nome);
        p1.s.P();
        s1.s.V();
        s1.UsaSpogliatoglio(nome);;
        s1.s.P();
    }








    
}
