public class Greeting {
public static void main(String[] args){
        int time = 100;
        String message = "只今の時刻は"+ time + "時です。\n";
        String greeting;
        if(time >= 4 && time <= 12)
        {
                greeting = "おはようございます。";
        }
        else if(time >12 && time <= 18)
        {
                greeting = "こんにちは";
        }
        else if (time<=24 && time <18 || time >0 &&time <4)
        {
                greeting = "こんばんは";
        }
        else
        {
                message = "0 ~ 24の数値を入れてください。";
                greeting = "";
        }
        System.out.print(message);
        System.out.print(greeting);
}
}
