import java.util.Arrays;

//Consumer
public class CakeStore {
//added 19.11.2018
private String name;
private Cake[] cakes;

    public CakeStore(String name) {
        this.name = name;
        //for every object its own array
        this.cakes = new Cake[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cake[] getCakes() {
        return cakes;
    }

    public void setCakes(Cake[] cakes) {
        this.cakes = cakes;
    }

    public void requestCakes(Cake[] cakes){
        // if, available, last
        for (int i = 0; i<cakes.length; i++){
            this.cakes[i] = cakes[i];
        }
    }

    @Override
    public String toString() {
        return "CakeStore{" +
                "name='" + name + '\'' +
                ", cakes=" + Arrays.toString(cakes) +
                '}';
    }
}
