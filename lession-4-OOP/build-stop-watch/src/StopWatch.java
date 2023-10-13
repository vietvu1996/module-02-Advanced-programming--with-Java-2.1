public class StopWatch {
    long startTime, endTime;
    private StopWatch (long startTime,long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime= System.currentTimeMillis();
    }
    public void end(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
