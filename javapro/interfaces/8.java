interface play{
void play();
}
 
class football implements play{

public static void main(String s[]){
football obj= new football();
obj.play();
}
public void play(){
System.out.println("Playing Football");}
}
 
class voleyball implements play{

public static void main(String s[]){
voleyball obj1= new voleyball();
obj1.play();
}
public void play(){
System.out.println("Playing voleyball");}
}
 
class basketball implements play{

public static void main(String s[]){
basketball obj2= new basketball();
obj2.play();
}
public void play(){
System.out.println("Playing basketball");}
}