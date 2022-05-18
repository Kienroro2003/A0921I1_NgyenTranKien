package codegym.entity;

public class Declaration {
    private String fullName;
    private String date;
    private String gender;
    private String country;
    private String idCard;
    private String travel;
    private String startDate;
    private String endDate;
    private String moreInformation;

    public Declaration() {
    }

    public Declaration(String fullName, String date, String gender, String country, String idCard, String travel, String startDate, String endDate, String moreInformation) {
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.country = country;
        this.idCard = idCard;
        this.travel = travel;
        this.startDate = startDate;
        this.endDate = endDate;
        this.moreInformation = moreInformation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }
}
