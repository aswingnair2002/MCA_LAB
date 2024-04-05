class Mult extends Thread{
    public static void main(String[] args) {
        Mult m1 = new Mult();
        m1.start();
    }
    public void run(){
        int n = 5;
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(i*n));
        }
    }
}
