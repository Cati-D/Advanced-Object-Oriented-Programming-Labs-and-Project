package Netflix.Shows;

import java.util.Scanner;
import java.util.TimerTask;

public abstract class Commands {

    protected int numberOfMinutes;
    protected float currentMinute;
    protected float currentSecond;

    public Commands(int numberOfMinutes, float currentMinute, float currentSecond) {
        this.numberOfMinutes = numberOfMinutes;
        this.currentMinute = currentMinute;
        this.currentSecond = currentSecond;
    }

    public Commands() {

    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public float getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(float currentMinute) {
        this.currentMinute = currentMinute;
    }

    public float getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(float currentSecond) {
        this.currentSecond = currentSecond;
    }


    public void skip(){
        System.out.println(">>");
        this.currentSecond += 10;
        if (this.currentSecond > 59) {
            this.currentSecond %= 60;
            this.currentMinute++;
        }
        System.out.println("currentMinute = " + this.currentMinute + " and currentSecond = " + this.currentSecond);
    }

    public void back() {
        System.out.println("<<");
        this.currentSecond -= 0.34;
        if (this.currentSecond < 0) {
            this.currentSecond = 60 - this.currentSecond;
            this.currentMinute--;
        }
        System.out.println("currentMinute = " + this.currentMinute + " and currentSecond = " + this.currentSecond);
    }

    public void refresh() {
        System.out.println("Welcome back! You left off at:  " + this.currentMinute +
                ":" + this.currentSecond + ". Would you like to resume watching where you left off?(1.Yes, please/2.No, thanks)");

            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            switch(answer.trim()){
                case "1":
                    System.out.println("Wait a second.");
                    break;
                case "2":
                    System.out.println("You are at the beginning of the movie.");
                    break;
                default:
                    System.out.println("You don't give an answer. We will restart the show.");
            }
        System.out.println("currentMinute = " + this.currentMinute + " and currentSecond = " + this.currentSecond);
    }

    public void pause() {
        System.out.println("|>");
        System.out.println("currentMinute = " + this.currentMinute + " and currentSecond = " + this.currentSecond);
    }

    public void resume() {
        System.out.println("||");
        System.out.println("currentMinute = " + this.currentMinute + " and currentSecond = " + this.currentSecond);
    }

    @Override
    public String toString() {
        return "Commands{" +
                "numberOfMinutes=" + numberOfMinutes +
                ", currentMinute=" + currentMinute +
                ", currentSecond=" + currentSecond +
                '}';
    }
}
