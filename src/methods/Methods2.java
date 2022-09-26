package methods;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel";
        String yeniMesaj= mesaj.substring(0,2);
        System.out.println(sehirVer());
        int sayi = topla(5,7);

        System.out.println(sayi);

        int toplam=topla2(2,34,5,432,3);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    //int... veriable arguments
    //int array gönderilmiş gibi olur.
    public static int topla2(int...sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "ankara";
    }

}
