package ss4_Class_And_Object_in_Java.Bai_tap.Stop_Watch;

import java.time.LocalTime;

public class StopWatch {
    private long startTime, endTime;

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

//    public void stop(){
//        endTime = ;
//    }
//
//    public void start(){
//        startTime = ;
//    }

    public double getElapsedTime(){
        return endTime - startTime;
    }
}
