class uniquearray{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);

int arr1[];
arr1= new int[5];
for(int i=0; i<5;i++){
System.out.print("Enter value of "+i+" ");
String str1= br.readLine();
int x = Integer.parseInt(str1);
arr1[i]=x;
}
System.out.println("\n unique elements in array are: ");
for(int i=0;i<5;i++){
int count=0;
int key= arr1[i];
for(int j=0; j<5;j++){
if(j!=i){
if(key==arr1[j]){count++;}}
}
if(count==0){
System.out.println(key);}
}}}