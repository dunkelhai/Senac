package application;

import java.util.Scanner;

public class DesafioBateria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade inicial de bateria:");
        Integer battery = input.nextInt();
        System.out.println("Digite a quantidade de eventos:");
        Integer escolha = input.nextInt();
        Integer result = null;
        Integer[] events = new Integer[escolha];

        for (int i = 0; i < events.length; i++){
            System.out.println("Digite o evento " + i + ":");
            events[i] = input.nextInt();
        }

        result = getBattery(events, battery);
        System.out.println(result);

    }

    public static Integer getBattery(Integer events[], Integer battery) {
        for (int i = 0; i < events.length; i++) {
            if (events[i] > 0) {
                battery = battery + events[i];
                if (battery > 100){
                    battery = 100;
                }
            } else if (events[i] < 0) {
                battery = battery + events[i];
                if (battery < 0){
                    battery = 0;
                }
            } else {
                battery = battery + 0;
            }
        }
        return battery;
    }
}
