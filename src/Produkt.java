public class Produkt{
    private String name;
    private String descripshen;
    private  int prise;
    private int count;
    private int madeInDate;
    private String isAlhogolik;

    public Produkt(String name, String descripshen, int prise, int count, int madeInDate, String isAlhogolik) {
        this.name = name;
        this.descripshen = descripshen;
        this.prise = prise;
        this.count = count;
        this.madeInDate = madeInDate;
        this.isAlhogolik = isAlhogolik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripshen() {
        return descripshen;
    }

    public void setDescripshen(String descripshen) {
        this.descripshen = descripshen;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMadeInDate() {
        return madeInDate;
    }

    public void setMadeInDate(int madeInDate) {
        this.madeInDate = madeInDate;
    }

    public String getIsAlhogolik() {
        return isAlhogolik;
    }

    public void setIsAlhogolik(String isAlhogolik) {
        this.isAlhogolik = isAlhogolik;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", descripshen='" + descripshen + '\'' +
                ", prise=" + prise +
                ", count='" + count + '\'' +
                ", madeInDate=" + madeInDate +
                ", isAlhogolik='" + isAlhogolik + '\'' +
                '}';
    }
}
