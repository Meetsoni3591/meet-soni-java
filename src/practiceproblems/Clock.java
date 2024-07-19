package practiceproblems;
// Question 2 


class Clock {
    private int hours;
    private int minutes;
    private int seconds;


    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hours = (secondsSinceMidnight / 3600) % 24;
        this.minutes = (secondsSinceMidnight % 3600) / 60;
        this.seconds = secondsSinceMidnight % 60;
    }


    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }  
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

   
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours--;
                if (hours < 0) {
                    hours = 23;
                }
            }
        }
    }

    public void addClock(Clock c) {
        int totalSeconds = this.toSeconds() + c.toSeconds();
        setClock(totalSeconds);
    }

    public Clock subtractClock(Clock c) {
        int totalSeconds = this.toSeconds() - c.toSeconds();
        if (totalSeconds < 0) {
            totalSeconds += 24 * 3600; 
        }
        return new Clock(totalSeconds);
    }

    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}
