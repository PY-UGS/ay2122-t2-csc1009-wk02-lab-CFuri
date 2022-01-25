public class Lab2_Question3 {
    public static void main(String[] args){
        long totalMilliseconds,totalSeconds,totalMinutes,totalHours = 0;
        int currentSecond, currentMinute, currentHour = 0;
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / 1000;
        currentSecond = (int)(totalSeconds % 60);
        totalMinutes = totalSeconds / 60;
        currentMinute = (int)(totalMinutes % 60);
        totalHours = totalMinutes / 60;
        currentHour = (int)(totalHours % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        //System.out.println("Current time is " + (currentHour+8) + ":" + currentMinute + ":" + currentSecond + " SGT");
    }
}
