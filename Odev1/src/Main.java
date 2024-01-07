import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Dersin adını giriniz: ");
        String ders= scn.next();

        System.out.print("Ders ait kaç adet değerlendirme kriteri var? ");
        int kriter= scn.nextInt();
        String [] kriterismi= new String[kriter];
        int [] kriteroran=new int[kriter];

        for (int i = 0; i <kriter ; i++) {
            System.out.print(1+i+".Kriterin ismi nedir? ");
            String ad=scn.next();
            kriterismi[i]=ad;
            System.out.println(1+i+"kriterin etkisi nedir? ");
            int oran= scn.nextInt();
            kriteroran[i]=oran;


        }
        System.out.print("kaç öğrencinin notunu gireceksiniz? ");

        int kişi= scn.nextInt();
        int[][]note =new int[kişi][kriter];
        String[]isim=new String[kişi];

        for (int i = 0; i <kişi ; i++) {
            System.out.print(i+1+"Öğrencinin ismini giriniz: ");
            String name= scn.next();
            isim[i]=name;
            for (int j = 0; j <kriter ; j++) {
                System.out.print(i+1+"Öğrencinin "+kriterismi[j]+" notu: ");
                int not= scn.nextInt();
                note[i][j]=not;



            }


        }
        int ort=0;
        int []ortalama=new int[kişi];

        for (int i = 0; i <kişi; i++) {
            for (int j = 0; j < kriter; j++) {
                ort=ort+(note[i][j]*kriteroran[j]/100);


            }
            ortalama[i]=ort;
            ort=0;

        }

        for (int i = 0; i <1 ; i++) {
            System.out.print("adı\tsoyadı\t");
            for (int j = 0; j < kriter; j++) {
                System.out.print("\t"+kriterismi[j]+"\t");

            }
            System.out.print("ortalama");

        }
        for (int i = 0; i <kişi ; i++) {
            System.out.print("\n"+isim[i]+"\t");
            for (int j = 0; j <kriter ; j++) {
                System.out.print(note[i][j]+"\t");


            }
            System.out.print(ortalama[i]);

        }


    }

}