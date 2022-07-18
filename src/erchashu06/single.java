package erchashu06;

public class single {
    private volatile static single uniqueInstance;
    private single(){

    }
    private static single getUniqueInstance(){
        if(uniqueInstance==null){
            synchronized (single.class){
                if(uniqueInstance==null){
                    uniqueInstance=new single();
                    System.out.println("chuangjian");
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run() {
                single.getUniqueInstance();
            }
        };
        Thread thread1=new Thread(){
            @Override
            public void run() {
                single.getUniqueInstance();
            }
        };
        thread.start();
        thread1.start();
    }
}
