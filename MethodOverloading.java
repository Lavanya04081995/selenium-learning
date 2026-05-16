package week4.day1;

public class MethodOverloading {
    public void reportStep (String msg,String status)
    {
    System.out.println("message: " +msg);
    System.out.println("status: " +status);
    }
    
    public void reportStep(String msg, String status, Boolean snap)
    {
     System.out.println("message: " +msg);
    System.out.println("status: " +status);
    System.out.println("take snapshot: " +snap);
    System.out.println();
    }

public static void main(String[] args) {
    MethodOverloading poly= new MethodOverloading();
   poly.reportStep("login successful", "pass");

    System.out.println("*******************************");

   poly.reportStep("login failed", "fail", true);
    
}
}
