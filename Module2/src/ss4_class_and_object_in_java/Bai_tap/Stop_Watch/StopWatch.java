package ss4_class_and_object_in_java.Bai_tap.Stop_Watch;

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
