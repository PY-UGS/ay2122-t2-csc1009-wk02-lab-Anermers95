package lab02;

public class Q3Time {
    long totalMiliseconds;
    long totalSeconds,currentSecond;
    long totalMinutes,currentMinute;
    long totalhours,currentHour;


    Q3Time()
    {
        totalMiliseconds = 0;
        totalSeconds = 0;
        totalMinutes = 0;
        currentSecond = 0;

        CalulateTotalmilliseconds();
        CalculateCurrentSecond();
        CalculateCurrentMinutes();
        CalculateCurrentHours();
    }

    void CalulateTotalmilliseconds()
    {
        totalMiliseconds = System.currentTimeMillis();
    }

    void CalculateCurrentSecond()
    {
        totalSeconds = totalMiliseconds/1000;
        currentSecond = totalSeconds%60;
    }

    void CalculateCurrentMinutes()
    {
        totalMinutes = totalSeconds/60;
        currentMinute = totalMinutes%60;
    }

    void CalculateCurrentHours()
    {
        totalhours = totalMinutes/60;
        currentHour = totalhours%24;
    }
    
    void printTime()
    {
        System.out.printf("\nCurrent time is %d:%d:%d", currentHour,currentMinute,currentSecond);
    }
}
