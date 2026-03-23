public class PersonalDetails{
    int age;
    String name;
    long mobino;
    String gender;

    PersonalDetails(){
    age = 19;
    name = "Samith";
    mobino= 9028292021L;
    gender = "Male";
   }
    void persondetails(){
        System.out.println("Person Details :");      
        System.out.println("Name :"+ name);        
        System.out.println("Age :"+ age);
        System.out.println("Gender :"+ gender);
        System.out.println("Mobile Number :"+ mobino);
}

static void qualificationDetails(){
        System.out.println("\nQulification Details:");
        System.out.println("Degree : B.Tech");
        System.out.println("Branch : AIMl");
        System.out.println("College : AUS");
        System.out.println("Year : 2024");
}

public static void main(String[] args){
    PersonalDetails obj = new PersonalDetails();
    obj.persondetails();
    qualificationDetails();
    

}
}