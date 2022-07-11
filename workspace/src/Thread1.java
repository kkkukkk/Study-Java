public class Thread1 extends Thread {
    String data;

    public Thread1(){;}

    public Thread1(String data){
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try { sleep(500); } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(data);
        }
    }
}
