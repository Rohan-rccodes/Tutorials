class p39{
public static void main(String args[]){
//write the programme to find the surface area of cylinder in java.
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter the surface area of radius:");
double r=s.nextDouble();
double vol= (4.0/3.0)*Math.PI * Math.pow(r,3);
System.out.println("The surface area of cylinder is:"+vol);
}
}
