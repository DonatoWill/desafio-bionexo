package br.com.desafiobionexo.bionexo.dto;

import com.google.maps.model.LatLng;

import java.util.Objects;

public class UbsResponse {

    private int id;
    private String name;
    private String address;
    private String city;
    private String phone;
    private LatLng geocode;
    private Score scores;

    private UbsResponse(int id, String name, String address, String city, String phone, LatLng geocode, Score scores) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setCity(city);
        this.setPhone(phone);
        this.setGeocode(geocode);
        this.setScores(scores);
    }

    public static UbsResponse of(int id, String name, String address, String city, String phone, LatLng geocode, Score scores) {
        return new UbsResponse(id, name, address, city, phone, geocode, scores);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LatLng getGeocode() {
        return geocode;
    }

    public void setGeocode(LatLng geocode) {
        this.geocode = geocode;
    }

    public Score getScores() {
        return scores;
    }

    public void setScores(Score scores) {
        this.scores = scores;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UbsResponse that = (UbsResponse) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "UbsResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", geocode=" + geocode +
                ", scores=" + scores +
                '}';
    }
}
