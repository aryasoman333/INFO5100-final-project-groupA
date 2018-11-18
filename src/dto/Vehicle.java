package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Serializable {

    private String id;
    private String dealerID;
    private String year;
    private String brand;
    private String model;
    private boolean isNew;   // true for new , false for used
    private String price;
    private String exteriorColor;
    private String interiorColor;
    private BodyType bodyType;
    private List<String> features;
    private String miles;
    private List<String> images;


    public Vehicle(String id, String dealerID) {
        this.id = id;
        this.dealerID = dealerID;
    }

    public Vehicle(String id, String dealerID, String year, String brand, String model, boolean isNew, String price, String exteriorColor, String interiorColor, BodyType bodyType) {
        this.id = id;
        this.dealerID = dealerID;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.isNew = isNew;
        this.price = price;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.bodyType = bodyType;
        this.features = new ArrayList<>();
        this.miles = "";
        this.images = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDealerID() {
        return dealerID;
    }

    public void setDealerID(String dealerID) {
        this.dealerID = dealerID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setNewOrUsed(boolean isNew) {
        this.isNew = isNew;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public void addFeature(String feature) { this.features.add(feature); }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public List<String> getImages() { return images; }

    public void setImages(List<String> images) { this.images = images; }

    public void addImages(String url){ this.images.add(url); }

}
