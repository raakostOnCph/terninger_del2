import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class Main {

///*
//* Repetion.
//*
//* Sidst så vi på følgende :
//*  Konstruktører
//*  Ooverloading
//*  Switch
//*  referancer
//
//    Vi lavede følgende.®
//    Vores program kan indtil videre lave et array fuld af terninger med et fastsat sideantal.
//   vi kan slå alle terningerne , og vi kan vælge at skrive deres værdi eller tegne dem.
//    Vi kan fjerne terningerne fra vores array ved at sætte et feltet "aktiv" på terningen til false.
//
//   På baggrund af det forestiller jeg mig at vi kan lave et spil, hvor det gælder om at fjerne
//   alle terningerne på så få slag så mulgt. For hvert slag kan man vælge at fjerne alle
//   terninger med en bestemt værdi f.eks. 4'er.
//* */


    /*Disposition for i dag.
     *
     * Vi har lavet noget kode i main der kan fjerne terninger, så vi mangler bare at lave det til en funktion.
     *
     * så skal vi lave resten af funktionerne der skal til for at vi kan spille spille, og så skal vi se om vi ikke
     * kan gøre spillet automatisk.
     * */


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here




        int antalTerninger = getInput("hvor mange terninger skal vi have ?");  //   her opretter vi og tilskriver i et trin, men det kan også gøre i to hvis du synes det er lettere at læse

        int sideAntal = getInput("hvor mange sider skal de have");

        Terning[] ternings = new Terning[antalTerninger];                       // her laver vi et array


        fyldTerningeArray(ternings,sideAntal);

        kastAlleTerningerne(ternings);

        viseAlleTerninger(ternings);

        tegnTerningerne(ternings);


        // det er så det følgende stykke kode vi skal have lavet til en funktion. Det er her vi starter !
        int fjern = getInput("hvilke terninger vil du fjerne !");

        for (int i = 0; i < ternings.length; i++) {

            if (ternings[i].getSlag() == fjern ) {
                ternings[i].setAktiv(false);
            }


        }

        tegnTerningerne(ternings);



    }

    //
    //TODO: 1) lav en funktion der kan fjerne en terning Koden er allerede lavet i main. Fortsæt på samme møde med resten af opgaverne.

    //TODO: 2) lav en funktion der kan lave et histogram over terninger i et slaget. Hvordan siker vi os at de terninger vi har fjernet ikke kommer med i optællingen ?

    //TODO: 3 )lav en funktion der kan udskrive histogrammet. Husk at vi ikke er interessert i at få i = 0 med, 0 ikke er et slag

    //TODO: 4) lav en funktion der kan finde den værdi der er flest af.

    // TODO 5) pak det hele ind i et while loop, så vi kan spille spillet.

    //TODO: 6) find på noget det gør det muligt at holde øje med hvor mange kast man har brugt

    //TODO: 7) lav et felt(variable) på klassen der kan holde øje med hvor mange terninger der til tilbage i spillet.

//    def:  heuristik, retningslinjer eller regler for tænkning og handling i forbindelse med udformning
//    af en bestemt videnskab eller udførelse af bestemte handlinger.

    //TODO: 8) Se om du ikke kan benytte de forskellige metoder vi har lavet til at beskrive en heuristike der kan spille spille automatisk.






    private static void tegnTerningerne(Terning[] ternings) {
        for (int i = 0; i < ternings.length; i++) {

            System.out.println(ternings[i].tegnTerning());
        }
    }

    // funktionen spørg brugeren efter input.
    private static int getInput(String s) {

        int svar = 0;

        System.out.print(s);
        svar = Integer.parseInt(scanner.nextLine());
        return svar;


    }

    private static void viseAlleTerninger(Terning[] ternings) {
        for (int i = 0; i < ternings.length; i++) {

            System.out.println(ternings[i].getSlag());
        }
    }

    private static void kastAlleTerningerne(Terning[] ternings) {
        for (int i = 0; i < ternings.length; i++) {

            ternings[i].kastTerning();


        }
    }

    private static void fyldTerningeArray(Terning[] ternings, int sideAntal) {
        for (int i = 0; i < ternings.length; i++) {

            ternings[i] = new Terning(sideAntal);
        }
    }




}

