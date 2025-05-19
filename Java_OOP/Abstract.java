
abstract class Hayvan{

    void HayvanSesCikar()
    {
        System.out.println("Hayvan Ses Çıkardı!");
    }


}

class Kedi extends Hayvan
{
    @Override
    void HayvanSesCikar()
    {
        System.out.println("Kedi Miyavladı!");
    }
}

class Kopek extends Hayvan
{
    @Override
    void HayvanSesCikar()
    {
        System.out.println("Kopek Havladi!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Hayvan Kedi=new Kedi();
        Kedi.HayvanSesCikar();    // Kedi Ses Çıkardı
        Hayvan kopek=new Kopek();
        kopek.HayvanSesCikar();   //Kopek Ses Çıkardı
    }

}
