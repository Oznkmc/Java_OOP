
class BankAccount{
    private String accountNumber;
    private double balance;
    private String password;


    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
            System.out.println(amount+" TL başarıyla hesabınıza yatırılmıştır.");
        }
        else {
            System.out.println("Hatalı Giriş Olmuştur.Girilen bakiye 0 veya 0'dan büyük olmalı!");
        }

    }
  public void withdraw(double amount, String inputPassword)
  {
      if(inputPassword.equals(password) && balance>=amount && amount>0 )
      {
          balance-=amount;
          System.out.println(amount+" TL hesabınızdan başarıyla çekilmiştir.");
      }
      else {
          System.out.println("İşlem Hatalı! Lütfen Şifrenizi ve Girdiğiniz Bakiyeyi Kontrol Ediniz.");
      }
  }
  public void checkBalance(String inputpassword)
  {
      if(inputpassword.equals(password))
      {
          System.out.println("Mevcut Bakiyeniz:"+balance);
      }
      else
      {
          System.out.println("Hatalı Şifre!");
      }
  }


}






public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber("TR12 0006 2000 1234 0006 7890 12");
        bankAccount.setBalance(150.50);
        bankAccount.setPassword("1647");
        bankAccount.deposit(100);
        bankAccount.checkBalance("1647");
        bankAccount.withdraw(100,"1647");
        bankAccount.checkBalance("1647");

    }



}
