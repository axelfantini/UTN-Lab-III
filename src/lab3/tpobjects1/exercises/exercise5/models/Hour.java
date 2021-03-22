package lab3.tpobjects1.exercises.exercise5.models;

public class Hour {
    private int Hour;
    private int Minute;
    private int Second;
    public Hour(int hour, int minute, int second)
    {
        this.Hour = hour;
        this.Minute = minute;
        this.Second = second;

    }

    public void PrintHour()
    {
        String hour = "";
        if(this.Hour < 10)
            hour += "0";
        hour += this.Hour + ":";
        if(this.Minute < 10)
            hour += "0";
        hour += this.Minute + ":";
        if(this.Second < 10)
            hour += "0";
        hour += this.Second;
        System.out.println(hour);
    }

    public Hour advanceSecond()
    {
        if(this.Second + 1 == 60)
        {
            this.Second = 0;
            if(this.Minute + 1 == 60)
            {
                this.Minute = 0;
                if(this.Hour + 1 == 24)
                    this.Hour = 0;
                else
                    this.Hour += 1;
            }
            else
                this.Minute += 1;
        }
        else
            this.Second += 1;
        return this;
    }

    public Hour backSecond()
    {
        if(this.Second - 1 == -1)
        {
            this.Second = 59;
            if(this.Minute - 1 == -1)
            {
                this.Minute = 59;
                if(this.Hour - 1 == -1)
                    this.Hour = 23;
                else
                    this.Hour -= 1;
            }
            else
                this.Minute -= 1;
        }
        else
            this.Second -= 1;
        return this;
    }

}
