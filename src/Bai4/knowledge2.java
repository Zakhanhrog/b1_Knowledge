package Bai4;

import java.util.Scanner;

public class knowledge2 {
    class television{
       boolean status = false;
       String channel = "VTV.cab";
       int volume = 0;
       boolean power = false;

       television(){

       }
       String setStatus(boolean status){
           this.status = status;
           if(status == true){
               return "On";
           }
           else{
               return "Off";
           }
       }
       boolean setPower(){
           if(setStatus(status)=="On"){
               this.power = true;
               return true;
           }
           else{
               this.power = false;
               return false;
           }
       }
       String setChannel(String channel){     //truyen vao tham so sau do gan no cho gia tri mac dinh de su dung trong phuong thuc
           this.channel = channel;
           return "Channel: " + channel;
       }
       String setVolume(int volume){
           if(volume == 0){
               return "Volume: Mute";
           }
           this.volume = volume;
           return "Volume: " + volume;
       }
       void showScreen(){
           System.out.println("=========================");

           System.out.println("Status: " + setStatus(status));
           System.out.println(setChannel(channel));
           System.out.println(setVolume(volume));

           System.out.println("=========================");
       }
       int setVolumesUp(int volume){
           volume++;
           if(volume > 10){
               return -1;
           }
           else{
               return volume;
           }
       }
       int setVolumesDown(int volume){
           volume--;
           if(volume < 1){
               return -1;
           }else
               return volume;
       }

    }

    public static void main(String[] args) {
        knowledge2 k = new knowledge2();
        knowledge2.television t = k.new television();

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\t\t1. Showaaaaâaa screen");
            System.out.println("\t\t2. Set status");
            System.out.println("\t\t3. Set channel");
            System.out.println("\t\t4. Set volume up");
            System.out.println("\t\t5. Set volume down");
            System.out.println("\t\t0. Exit");
            System.out.print("\t\tEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    t.showScreen();
                    break;
                case 2:
                    System.out.print("Enter status (true/false): ");
                    boolean status = scanner.nextBoolean();
                    t.setStatus(status);
                    t.showScreen();
                    break;
                case 3:
                    if(t.setPower() == false){
                        System.out.println("==============================");
                        System.out.println("Turn on the television first!");
                        System.out.println("==============================");
                    }else {
                        System.out.print("Enter channel: ");
                        String channel = scanner.next();
                        t.setChannel(channel);
                        t.showScreen();
                    }
                    break;
                case 4:
                    if(t.setPower() == false){
                        System.out.println("==============================");
                        System.out.println("Turn on the television first!");
                        System.out.println("==============================");
                    }else {
                        int volume = t.volume;
                        volume = t.setVolumesUp(volume);
                        if (volume == -1) {
                            t.showScreen();
                            System.out.println("Volume is max!");
                        } else {
                            t.setVolume(volume);
                            t.showScreen();
                        }

                    }
                    break;
                case 5:
                    if(t.setPower() == false){
                        System.out.println("==============================");
                        System.out.println("Turn on the television first!");
                        System.out.println("==============================");
                    }else {
                        int volume1 = t.volume;
                        volume1 = t.setVolumesDown(volume1);
                        if (volume1 == -1) {
                            t.showScreen();
                            System.out.println("Volume is min!");
                        } else {
                            t.setVolume(volume1);
                            t.showScreen();
                        }

                    }
                    break;
                case 0: System.exit(0);

            }
        }while (choice != 0);

    }
}
