package thalita.meira.segundasemana;
public class MyClass {

    public static void main(String[] args) {

        String firstName = "Thalita";
        String lastName = "Meira";

        String completeName = completeName(firstName, lastName);

        System.out.print(completeName);
        
        
    }

    public static String completeName (String firstName,  String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
    
}
