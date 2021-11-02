public class Praktikum_29_oct {

    public static void main(String[] args) {
        System.out.println("NIM: 1201200027");
        System.out.println("Nama: Rizky Agung Prayogi");
        System.out.print("\n");
        System.out.println("Karakter1 = 1");
        System.out.println("Karakter2 = 2");
        //deklarasi
        int width;
        int height;
        int karakter1=1;
        int karakter2=2;

        //Buat perulangan
        for (height = 1; height <=8; height++){
            for (width = 1; width<=16; width++){
                //Tambahkan if else dan juga print
                if (height==1||height==8||width==1||width==16){
                    System.out.print("=");
                }else{
                    System.out.print(" ");
                }if (height==7&&width==3){
                    System.out.print(karakter1);
                }else{
                    System.out.print(" ");
                }if (height==7&&width==13){
                    System.out.print(karakter2);
                }else {
                    System.out.print(" ");
                }
            }//Tambahkan \n agar objek yang di print tidak lurus ke kanan
            System.out.print("\n");
        }
    }
}