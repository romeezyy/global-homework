package Homework6;

public class UserValidationException {

    public void AgeException(){
        System.out.println("Допустимый возраст пользователя: от 0 до 120 лет включительно");
    }
    public void minLengthException(){
        System.out.println("Минимальная длина имени / фамилии пользователя - 3 символа");
    }
    public void maxLengthException(){
        System.out.println("Максимальная длина имени / фамилии пользователя - 15 символов");
    }

}
