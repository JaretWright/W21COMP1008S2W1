public class WarmUpExercises {
    public static void main(String[] args) {
        //challenge 1
        for (int i=100; i>=0 ;i-=5)
            System.out.println(i);

        //challenge 2
        System.out.println("\nChallenge 2 & 3");
        for (int i=0; i<=100 ; i+=10)
        {
//            if (i%20==0)
//                System.out.println(i + " Java");
//            else
//                System.out.println(i);
            System.out.println( i%20==0? i + " Java" : i);
        }

        //Challenge 4 - make a method
        System.out.println("\nChallenge 4");
        System.out.println("timeToSki(31) = " + timeToSki(31));
        System.out.println("timeToSki(30) = " + timeToSki(30));

    }

    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }
}
