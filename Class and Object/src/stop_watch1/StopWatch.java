package stop_watch1;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        //phương thức System....: trả về thời gian của hệ thống theo milliseconds
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(int a, int b) {
        return (endTime - startTime);
    }
}


