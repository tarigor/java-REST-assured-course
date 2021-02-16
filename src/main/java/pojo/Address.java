package pojo;

public class Address {
    private String cityName;
    private String streetName;
    private Integer homeNumber;
    private Integer flatNumber;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Address(String cityName, String streetName, Integer homeNumber, Integer flatNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }
}
