class Prime extends Thread{
    public static void main(String[] args) {
        Prime p1 = new Prime();
        p1.start();
    }
    public void run(){
        int num = 20;
        for(int i=2;i<=num;i++){
            int f = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(i);
            }
        }
    }
}
