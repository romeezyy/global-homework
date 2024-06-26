package Homework6;

public class UserValidationService {

    public static void validate(User user){
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3 ){
            new UserValidationException().minLengthException();
        }
        if (user.getFirstName().length() > 15 || user.getLastName().length() > 15 ) {
            new UserValidationException().maxLengthException();
        }
        if (user.getAge() < 0 || user.getAge() > 120){
            new UserValidationException().AgeException();
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Ваня", "Kазантипчик", 25);
        validate(user1);
    }


}
