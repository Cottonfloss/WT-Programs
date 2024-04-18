// first class

public class DilKehtaHai {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            soach object=new soach();
            object.start();
        }
    }
}

//second class

public class soach extends Thread{
    public void run(){
        try{
            System.out.println("Hi current::"+Thread.currentThread());
            System.out.println("Hi current Id::"+Thread.currentThread().getId());
            System.out.println("Hi current Name::"+Thread.currentThread().getName());
            System.out.println("Hi current Priority::"+Thread.currentThread().getPriority());
            System.out.println("Hi current ThreadGroup::"+Thread.currentThread().getThreadGroup());
        }
        catch(Exception exception){
            System.out.println("Durgatna="+ exception);
        }
        finally{
            System.out.println("Total::"+Thread.activeCount());
        }

    }
}

// main class

public class life extends soach {
    public static void main(String[] args) {
        life Life=new life();
        Life.run();

    }
}
