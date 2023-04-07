import java.util.Scanner;

public class burclar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum tarihinizi ay olarak giriniz: ");
        int ay = input.nextInt();

        System.out.println("Doğum tarihinizi gün olarak giriniz: ");
        int gün = input.nextInt();

        if(ay > 0 && ay < 13){
            if(ay == 1){
                if(gün <= 21){
                    System.out.println("OĞLAK");
                }else{
                    System.out.println("KOVA");
                }
            }
            if(ay == 2){
                if(gün <= 19){
                    System.out.println("KOVA");
                }else{
                    System.out.println("BALIK");
                }
            }
            if(ay == 3){
                if(gün <= 20){
                    System.out.println("BALIK");
                }else{
                    System.out.println("KOÇ");
                }
            }
            if(ay == 4){
                if(gün <= 20){
                    System.out.println("KOÇ");
                }else{
                    System.out.println("BOĞA");
                }
            }
            if(ay == 5){
                if(gün <= 21){
                    System.out.println("BOĞA");
                }else{
                    System.out.println("İKİZLER");
                }
            }
            if(ay == 6){
                if(gün <= 22){
                    System.out.println("İKİZLER");
                }else{
                    System.out.println("YENGEÇ");
                }
            }
            if(ay == 7){
                if(gün <= 22){
                    System.out.println("YENGEÇ");
                }else{
                    System.out.println("ASLAN");
                }
            }
            if(ay == 8){
                if(gün <= 22){
                    System.out.println("ASLAN");
                }else{
                    System.out.println("BAŞAK");
                }
            }
            if(ay == 9){
                if(gün <= 22){
                    System.out.println("BAŞAK");
                }else{
                    System.out.println("TERAZİ");
                }
            }
            if(ay == 10){
                if(gün <= 22){
                    System.out.println("TERAZİ");
                }else{
                    System.out.println("AKREP");
                }
            }
            if(ay == 11){
                if(gün <= 21){
                    System.out.println("AKREP");
                }else{
                    System.out.println("YAY");
                }
            }
            if(ay == 12){
                if(gün <= 21){
                    System.out.println("YAY");
                }else{
                    System.out.println("OĞLAK");
                }
            }
        }else{
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}