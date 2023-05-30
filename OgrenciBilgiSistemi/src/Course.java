public class Course {
    String name;
    String code;
    String prefix;
    int note;
    double sozluNotuMat;
    double sozluNotuFizik;
    double sozluNotuKimya;
    Teacher courseTeacher;
    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotuMat = 0.3;
        this.sozluNotuFizik = 0.2;
        this.sozluNotuKimya = 0.15;
    }

    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("Islem Basarili");
        }else{
            System.out.println(teacher.name + "Adli Akademisyen Bu Dersi Veremez!");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " Dersinin Akademisyeni: " + courseTeacher.name);
        }else{
            System.out.println(this.name + " Dersine Akademisyen Atanmamistir!");
        }
    }
}
