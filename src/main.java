import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double radius,alan,cevre,pi,mAlan;
        int angle = 0;
        Scanner input=new Scanner(System.in);
        pi=3.14;

        System.out.print("Dairenin Yarıçapını Giriniz :");
        radius = input.nextDouble();
        System.out.print("Dairenin Merkez Açısını Giriniz :");
        angle =input.nextInt();
        alan=pi*(radius*radius);
        cevre=2.0*pi*radius;
        mAlan=(pi*(radius*radius)*angle)/360;

        System.out.println("Dairenin Alanı" + alan);
        System.out.println("Dairenin Çevresi" + cevre);
        System.out.println("merkez açısının ölçüsü a olan daire diliminin alanı :" +mAlan);









    }
}
