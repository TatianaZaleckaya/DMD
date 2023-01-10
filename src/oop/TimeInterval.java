package oop;

public class TimeInterval {

    private int seconds;
    private int minute;
    private int hours;

    public TimeInterval(int seconds, int minute, int hours) {
        this.seconds = seconds;
        this.minute = minute;
        this.hours = hours;
    }

    public TimeInterval(int totalSeconds){
        this.hours = totalSeconds / 3600;
        this.minute = totalSeconds % 3600 /60;
        this.seconds = totalSeconds %3600 %60;
    }

    public int totalSeconds(){
        return seconds + minute*60 + hours * 3600;
    }
    public TimeInterval sum(TimeInterval seconds){
        return new TimeInterval(totalSeconds() + seconds.totalSeconds());
    }
    public void print(){
        System.out.println("h " + hours + "m " + minute + "s " + seconds );
    }


}
