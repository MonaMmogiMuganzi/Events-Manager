public class AwardCategories {
    private String nameOfCategory;

    public AwardCategories(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public String toString() {
        return "Category: " + nameOfCategory;
    }

}
