//Resource
public class Cake {

    private Integer grams;
    private String name;
    private Integer expires;
    private Float price;

    public Cake(Integer grams, String name, Integer expires, Float price) {
        this.setGrams(grams);
        this.setName(name);
        this.setExpires(expires);
        this.setPrice(price);
    }

    public Cake () {

    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "grams=" + grams +
                ", name='" + name + '\'' +
                ", expires=" + expires +
                ", price=" + price +
                '}';
    }
}
