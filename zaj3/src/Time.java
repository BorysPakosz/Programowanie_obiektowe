public class Time {
    public int hours;
    public int minutes;
    public Time addTime(Time otherTime){
        int godziny=otherTime.hours+hours;
        int minuty =otherTime.minutes+minutes;
        Time returnTime = new Time();
        while (minuty>59)
        {
            minuty-=60;
            godziny=+1;
        }
        while (godziny>23)
        {
            godziny=-24;
        }
        returnTime.hours = godziny;
        returnTime.minutes = minuty;
    return returnTime;
    }
}
