public class Main {
    public static void main(String[] args) {
        
        // Problème 1
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
            // Attendu : Number at index 1: 1, Number at index 2: 2, Number at index 3: 3,
            // Number at index 4: 4, Number at index 5: 5
            // Erreur : ArrayIndexOutOfBoundsException due à i<=numbers.length
            // Correction : i < numbers.length
        }

        // Problème 2
        double result = calculateValue(5, 0);
        System.out.println("Result: " + result);
        // Attendu : arithmetic exception due to division by zero
        // Erreur : ArithmeticException due à la division par zéro
        // Correction : Vérifier si le dénominateur est différent de zéro avant de faire
        // la division

        // Problème 3
        int count = 10;
        while (count > 0) {
            System.out.println("Count: " + count);
            count -= 2;
            // Attendu : Count: 10, Count: 12, Count: 14, Count: 16, Count: 18, Count: 20
            // Erreur : boucle infinie car count est toujours supérieur à 0
            // Correction : décrémenter count au lieu de l'incrémenter
        }

        // Problème 4
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        int index = 7;
        if (index < message.length()) {
            char character = message.charAt(index);
            System.out.println("Caractère à l'indice 10 : " + character);

        }

        // Attendu : Longueur du message : 7 (à la ligne) caractère à l'indice 10 :
        // erreur
        // Erreur : StringIndexOutOfBoundsException due à l'indice 10 qui est hors de la
        // longueur de la chaîne
        // Correction : créer un char character vide. Et intialiser l'indice en variable.

        // Problème 5
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + (str1.equals(str2)));
        // Attendu : Comparaison de chaînes : True
        // Erreur : False car == compare les références des objets
        // Correction : Utiliser la méthode equals pour comparer les valeurs des chaînes

        // Problème 6
        Main mainObj = new Main();
        mainObj.method();
        // Attendu : Méthode appelée !
        // Erreur : NullPointerException due à l'appel d'une méthode sur un objet null
        // Correction : instancier l'objet avant d'appeler la méthode 
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) {
        if (b == 0) {
            System.out.println("Division par zéro !");
            return 0;
        } else {
            return a / b;
        }
    }

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de classe
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
