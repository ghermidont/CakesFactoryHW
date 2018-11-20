//Producer
public class CakeFactory {

    static String name = "Happiness & Co.";
    static Cake[] cakes = new Cake[20];

    public static void cookCakes(Integer quantity){

        if(quantity>checkAvailable()){

            System.err.println("TO MANY CAKES");
        }else{

            System.out.println("COOKING" + quantity+ "cakes!");
           int start = cakes.length-checkAvailable();
           int stop = start + quantity;
            for( int i = start; i< stop; i++){
                Cake test_cake = new Cake(300, "Donat sugar - " + i, 10, 1.5f );
                cakes[i] = test_cake;

            }

        }

        /*reserve space for the needed objects.
          cakes = new Cake[quantity];*/

    }

    public static Integer checkAvailable(){
        Integer free = 0;
        for(int i=0; i<cakes.length; i++){
            if(cakes[i]==null){
                free++;
            }
        }
        return free;
    }


    public static void showCakes(){
        for(Cake cake : cakes){
            System.out.println(cake);
        }
    }

    //HW 1 method "get total cost"
    // Create a method that returns a float that contains the total price of all the cakes that are present now.
    //2 method:
    // getCakes(int quantity) --> returns Cake[] array that will take the int quantity and from the end of the
    // cakes array takes the elements from the end to the beginning + puts them in a temporary array (temp[] =
    // new Cake[quantity],...temp[i] = cakes[position],...cakes[position]=null)


}
