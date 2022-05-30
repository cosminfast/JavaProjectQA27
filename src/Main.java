public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Altceva!");


        String author = "Cristina";
        int busNumber = 35;
        long longValue = 6512343523452342L;
        float kgDeMereAuthor = 4.5F;
        int additionalApplesKg = 2;

        System.out.println(author + " vrea sa cumpere mere.\n" +
                "Pentru a cumpara mere, " + author + " trebuie sa mearga la piata,\n" +
                "pe strada Avram Iancu. Pe strada Avram Iancu, exista\n" +
                "cea mai mare piata agricola. " + author + " va merge la piata \n" +
                "cu autobuzul numarul " + busNumber + ". Pe autobuz, " + author + " se intalneste cu\n" +
                "George, care si el merge sa cumpere mere. " + author + " vrea sa cumpere\n" +
                kgDeMereAuthor + " kg de mere, iar George 10 ca e barbat. Pe drum inapoi \n" + author  +
                "se razgandeste, si se intoarce sa mai cumpere "+additionalApplesKg+" kg de mere. " + author + " are acum\n" +
                (kgDeMereAuthor + additionalApplesKg) + " kg de mere.");


        int x = 2;
        double y = 4;
        double z = x + y;
        System.out.println(z);

        z++;
        System.out.println(z);
//        x+=2; // x = x + 2;
        x+=x+=x++ + ++x;
        System.out.println(x);

        System.out.println(x++);
        System.out.println(x);



    }
}