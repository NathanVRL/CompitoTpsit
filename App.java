import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Semaforo semPist=new Semaforo(4);
        Semaforo semSpogl=new Semaforo(2);
        Pista mugello= new Pista(semPist);
        Spogliatoio s1=new Spogliatoio(semSpogl);
        Amici a1= new Amici("Nat", mugello, s1);
        Amici a2= new Amici("Fili", mugello, s1);
        Amici a3= new Amici("Ed", mugello, s1);
        Amici a4= new Amici("Haitam", mugello, s1);
        Amici a5= new Amici("Jacopo", mugello, s1);
        Amici a6= new Amici("Andre", mugello, s1);
        Amici a7= new Amici("Marchino", mugello, s1);
        Amici a8= new Amici("Leonardo", mugello, s1);
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();

        a5.start();
        a6.start();
        a7.start();
        a8.start();
      

    }
}
