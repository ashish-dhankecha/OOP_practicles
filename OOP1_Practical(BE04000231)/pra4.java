package OOP_Practicle;
class Time{
    int hours;
    int minutes;
    void Settime(int h ,int m){
        hours = h;
        minutes = m;
    }
    void displayTime(){
        System.out.printf("\ntime is %d hours and %d minutes.",hours,minutes);
    }
    void addTime(Time t1 , Time t2){
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;
        if(minutes > 60){
            hours += minutes/60;
            minutes = minutes % 60;
        }
    }
}
public class pra4 {
    public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time();
    Time t3 = new Time();
    t1.Settime(3,45);
    t2.Settime(4,45);
    t3.addTime(t1,t2);
    t1.displayTime();
    t2.displayTime();
    t3.displayTime();
    }
}
