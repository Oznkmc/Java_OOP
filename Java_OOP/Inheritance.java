
class Product{
    String id;
    String name;
    String price;
    String brand;
    public Product(String id,String name,String price,String brand)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
    }
    void getDetails()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("brand:"+brand);
    }
}

class Electronics extends Product{
    String warrantyPeriod;
    String powerUsage;
    public Electronics(String warrantyPeriod,String powerUsage,String id,String name,String  price,String brand)
    {
        super(id,name,price,brand);
        this.warrantyPeriod=warrantyPeriod;
        this.powerUsage=powerUsage;
    }
    @Override
   void getDetails()
   {
       super.getDetails();
       System.out.println("warranty Period:"+warrantyPeriod);
       System.out.println("power Usage:"+powerUsage);
   }
}
class Clothing extends Product{

   String size,fabricType, gender;

   public Clothing(String size,String fabricType,String gender,String id,String name,String price,String brand)
   {
       super(id,name,price,brand);
       this.size=size;
       this.fabricType=fabricType;
       this.gender=gender;
   }
   @Override
    void getDetails()
   {
       super.getDetails();
       System.out.println("Size:"+size);
       System.out.println("Fabric Type:"+fabricType);
       System.out.println("Gender:"+gender);
   }

}



public class Inheritance {

    public static void main(String[] args) {
        Electronics electronics=new Electronics("2 Years", "115","1"," Laptop"," 40000","Monster");
        electronics.getDetails();

    }
}
