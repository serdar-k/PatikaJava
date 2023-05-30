public class Student {
    String name, studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    int sozlu;

    public Student(String name, int classes, String studentNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        calcAverage();
    }

    public void calcAverage() {
        this.average = ((this.fizik.note*(1-sozlu) + this.fizik.sozluNotuFizik*sozlu) + (this.kimya.note*(1-sozlu) + this.kimya.sozluNotuKimya*sozlu) + (this.mat.note*(1-sozlu) + this.mat.sozluNotuMat*sozlu)) / 3.0;
    }

    public void addBulkExamNote(int mat, int matSozlu, int fizik, int fizikSozlu, int kimya, int kimyaSozlu) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if(matSozlu >= 0 && matSozlu <= 100){
            this.mat.sozluNotuMat = matSozlu;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if(fizikSozlu >= 0 && fizikSozlu <= 100){
            this.mat.sozluNotuFizik = fizikSozlu;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if(kimyaSozlu >= 0 && kimyaSozlu <= 100){
            this.mat.sozluNotuKimya = kimyaSozlu;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlariniz Tam Olarak Girilmemis!");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sinifi Gecti!");
            } else {
                System.out.println("Sinifta Kaldi!");
            }
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("==========");
        System.out.println("Ogrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }
}
