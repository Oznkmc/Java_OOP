class araba
{
    String marka="Renault";
    String model="Megan";
    String modelyil="2005";
    String yakit="Dizel";
    Integer km=5000;
    void BilgileriGoster()
    {
        System.out.println("Araba Markası:"+marka);
        System.out.println("Araba Modeli:"+model);
        System.out.println("Araba Model Yılı:"+modelyil);
        System.out.println("Araba Yakıt Türü:"+yakit);
        System.out.println("Araba Kilometresi:"+km);

    }
}


public class Java_Class {
    public static void main(String[] args) {
        araba Araba=new araba();
        Araba.BilgileriGoster();
    }




}
