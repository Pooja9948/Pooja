class Stopwatch{
private long starttime=0;
private long endtime=0;
private boolean running=false;

public void startTime(){
this.starttime=System.currentTimeMillis();
this.running=true;
}

public void endTime(){
this.endtime=System.currentTimeMillis();
this.running=false;
}

public long getElapsedTime(){
long elapsed;
    if (running) {
         elapsed = (System.currentTimeMillis() - starttime);
    }
    else {
        elapsed = (endtime - starttime);
    }
    return elapsed;
}
public static void main(String[] args){
Stopwatch s=new Stopwatch();
s.startTime();
//currentTimeMillis().......code  time waste for getting elapsed time
//..............
//............
//............
s.endTime();
System.out.println("The elapsed time is :"+s.getElapsedTime());
}
}
