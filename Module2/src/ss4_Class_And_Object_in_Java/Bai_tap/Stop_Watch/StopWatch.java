package ss4_Class_And_Object_in_Java.Bai_tap.Stop_Watch;

import java.time.LocalTime;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch(){}

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop(){
        endTime =System.currentTimeMillis() ;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
