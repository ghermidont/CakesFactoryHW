public class Main {

    public static void main(String[] args) {

        CakeFactory.cookCakes(3);
        CakeFactory.showCakes();
        CakeFactory.cookCakes(2);
        CakeFactory.showCakes();

        // code added on 19.11.2018.
        //create a few objects of Cake Store
        CakeStore store1 = new CakeStore("Store No. 1");
        //...........
        //...........
        System.out.println(store1);

        store1.requestCakes(CakeFactory.supplyCakes(3) );
/*Topics to see
        volatile
        synchronized
        wait()/notify()
        to see Java collections*/
    }
}


