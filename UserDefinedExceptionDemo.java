public class UserDefinedExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not eligible to vote");
        }
        else{
            
        }
    }
}
