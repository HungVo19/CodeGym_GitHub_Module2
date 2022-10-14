package stop_watch;


import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {

    private LocalTime startTime, endTime;

    public StopWatch(){
        this.startTime = LocalTime.now();
    }

    public LocalTime setStartTime(){
        return this.startTime = LocalTime.now();
    }

    public LocalTime setStopTime(){
        return this.endTime = LocalTime.now();
    }

    public Long getElapsedTime(){
        Duration duration = Duration.between(this.startTime, this.endTime);
        return duration.getSeconds();
    }

}
