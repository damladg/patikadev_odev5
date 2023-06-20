import java.util.Scanner;

public class daireAlanCevreHesaplama {
    public static void main(String[] args) {
        /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        int r ;
        double pi = 3.14 ;

        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = scan.nextInt();
        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        */

        //ÖDEV: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r ;
        double pi = 3.14 ;
        int aci ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = scan.nextInt();

        System.out.print("Açıyı giriniz : ");
        aci = scan.nextInt();

        double alan = (pi *(r * r) * aci )/ 360.0 ;
        System.out.println("Alan : "+ alan);





    }

}
