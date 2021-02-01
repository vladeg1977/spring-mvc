package web.model;

public class Car {
    private String company;
    private String nameOfModel;
    private int power;

    public Car() {
    }

    public Car(String company, String nameOfModel, int power) {
        this.company = company;
        this.nameOfModel= nameOfModel;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", nameOfModel='" + nameOfModel + '\'' +
                ", power=" + power +
                '}';
    }
}
