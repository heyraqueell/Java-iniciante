package introducao_poo_02.matriculacurso;

public class DataCourse {
    public String name;
    public String course;

    public void updateCourse(String newCourse) {
        this.course = newCourse;
    }

    public String toString() {
        return name + ", Course: " + course;
    }
}
