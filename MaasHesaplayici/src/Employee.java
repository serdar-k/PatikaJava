public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        if (2021 - hireYear < 10) {
            return salary * 0.05;
        } else if ((2021 - hireYear > 9) && (2021 - hireYear < 20)) {
            return salary * 0.1;
        } else if (2021 - hireYear > 19) {
            return salary * 0.15;
        }
        return 0;
    }

    public void toStringInfo() {
        System.out.println("Adi: " + this.name + "\n" + "Maasi: " + this.salary + "\n" + "Calisma Saati: " + this.workHours + "\n" + "Baslangic Yili: " + this.hireYear + "\n" + "Vergi: " + this.tax() + "\n" + "Bonus: " + this.bonus() + "\n" + "Maas Artisi: " + this.raiseSalary() + "\n" + "Vergi ve Bonuslar Ile Birlikte Maas: " + (this.salary + this.raiseSalary() - this.tax() - this.bonus()) + "\n" + "Toplam Maas: " + (this.salary + this.raiseSalary()));
    }
}
