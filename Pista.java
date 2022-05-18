
public class Pista extends Thread{
    
    Semaforo s ;
    int tempo;


    public Pista(Semaforo s) {
        this.s = s;
    }

    synchronized public void UsaPista(String nome){
        System.out.println(nome+" è entrato in pista");
        try {
            int start = (int) System.nanoTime();
            for(int i=0;i<15;i++){
            Thread.sleep((long)(Math.random() * 1000));
            }
            int stop = (int) System.nanoTime();
            tempo=(stop-start) / 1000000;
        } catch (Exception e) {
        }
        System.out.println(nome+" è uscito dalla pista");


    }
    
    
}
