package kodlamaIoSystem.entities;

public class Course {
    private String name;
    private String id;
    private int lessonNumber;
    private String category;
    private String teacherName;
    private int price;

    public Course(String name, String id, int lessonNumber, String category, String teacherName,int price) {
        this.name = name;
        this.id = id;
        this.lessonNumber = lessonNumber;
        this.category = category;
        this.teacherName = teacherName;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
