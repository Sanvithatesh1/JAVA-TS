class Patient{
    String name;
    double height,weight;
    Patient(String name,double weight,double height)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    double BMI()
    {
       
       double val=((weight/(height*height))*703);
       return val;
    }
}
    class Patients
{
  public static void main (String args[])
 {
  Patient p=new Patient("abc",120,450);
  double BMIval=p.BMI()
  System.out.println("The BMI is:"+BMIval);
  
 }
}