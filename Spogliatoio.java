public class Spogliatoio extends Thread{
    Semaforo s ;


    public Spogliatoio(Semaforo s) {
        this.s = s;
    }

    synchronized public void UsaSpogliatoglio(String nome){
        System.out.println(nome+" è entrato nello spoiatoio");
        try {
            Thread.sleep((long)(Math.random() * 1000));
        } catch (Exception e) {
        }
        System.out.println(nome+" è uscito dallo spogliatoglio");

    }

}
