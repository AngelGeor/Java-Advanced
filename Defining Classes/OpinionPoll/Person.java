package DefiningClasses_Ex.OpinionPoll;

public class Person {  //Poleta -> vinagi sa "private":
   private String name;
   private int age;

   public Person (String name, int age) {
      this.name = name;
      this.age = age;
   }
//getter:
   public String getName(){
      return name;
   }
public int getAge(){
      return age;
}

@Override
   public String toString(){
      return name + " - " + age;
}
}
