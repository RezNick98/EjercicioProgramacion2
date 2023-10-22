import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private final double MINGRASA = 18.5;
    private final double MAXGRASA = 25;
    private final int MAYORIAEDAD = 18;
    private final int PUEDEVOTAR = 16;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private int dni;
    private int age;
    private String genre;
    private double weight;
    private double height;

    public Persona(int dni) {
        this.name = "N";
        this.surname = "N";
        this.birthDate = LocalDate.of(2000, 1, 1);
        this.dni = dni;
        this.age = 1;
        this.genre = "Femenino";
        this.weight = 1;
        this.height = 1;
    }

    public Persona(int dni, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.of(2000, 1, 1);
        this.dni = dni;
        this.age = 1;
        this.genre = "Femenino";
        this.weight = 1;
        this.height = 1;
    }

    public Persona(int dni, String name, String surname, LocalDate birthDay) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDay;
        this.dni = dni;
        this.age = 1;
        this.genre = "Femenino";
        this.weight = 1;
        this.height = 1;
    }

    public int calcularEdad() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.birthDate, today);
        this.age = age.getYears();
        return this.age;
    }

    public double indiceMasaCorporal() {
        return this.weight / Math.pow(height, 2);
    }

    public boolean enforma() {
        if ((this.indiceMasaCorporal() >= MINGRASA) && (this.indiceMasaCorporal() <= MAXGRASA)) {
            return true;
        }
        return false;
    }

    public boolean estaCumpliendoAnios() {
        if ((this.birthDate.getMonth() == LocalDate.now().getMonth())
                && (this.birthDate.getDayOfMonth() == LocalDate.now().getDayOfMonth())) {
            return true;
        }
        return false;
    }

    public boolean esMayor() {
        return this.calcularEdad() >= MAYORIAEDAD;
    }

    public boolean puedeVotar() {
        return this.calcularEdad() >= PUEDEVOTAR;
    }

    public boolean esCoherente() {
        LocalDate hoy=LocalDate.now();
        Period periodo=Period.between(this.birthDate, hoy);
        if(periodo.getYears()==this.age){
            return true;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "Persona [name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", dni=" + dni + ", age="
                + age + ", genre=" + genre + ", weight=" + weight + ", height=" + height + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age){
        this.age=age;
    }

}
