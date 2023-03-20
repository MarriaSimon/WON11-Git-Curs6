package interfaces2;

public class Romanian implements Citizen{
    private long identifier;
    private int age;
    private String name;
    public String getCountry = "Romania";
    @Override
    public String getHomeCountry() {
        return getCountry;
    }

    @Override
    public long getIdentifier() {
        return 0;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
