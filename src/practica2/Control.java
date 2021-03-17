package practica2;

import javax.swing.JLabel;

public class Control extends Thread {

    int seg, min, hrs,pe,pe1;
    JLabel tiempo, total;

    public Control(JLabel tiempo, JLabel total, int pe1) {
        this.tiempo = tiempo;
        this.total = total;
        this.pe1=pe1;
    }
    
    @Override
    public void run() {
        for (hrs = 0; hrs < 24; hrs++) {
            for (min = 0; min < 60; min++) {
                if (min>30){
                    pe=(hrs*(pe1+pe1))+(pe1+pe1);
                }else{
                    pe=(hrs*(pe1+pe1))+pe1;
                }
                total.setText(pe+".00");
                for (seg = 1; seg < 60; seg++) {
                    try{
                        Thread.sleep(999);
                        tiempo.setText(hrs+":"+min+":"+seg);
                    }catch(InterruptedException e){
                        System.out.println("error");
                    }
                }
            }

        }
    }

}
