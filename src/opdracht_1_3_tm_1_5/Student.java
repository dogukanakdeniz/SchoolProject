package opdracht_1_3_tm_1_5;

public class Student {

    private String naam;
    private Integer studentNummer;


    public Student (String nm, Integer stNr) { naam = nm; studentNummer = stNr; }

    public String getNaam() {

        return "getter: " + naam;
    }

    public Integer getstudentNummer() {

        return studentNummer;
    }

    public void setstudentNummer(Integer studentNummer) {

        this.studentNummer = studentNummer;
    }

    @Override
    public String toString() {
        return "toString: Deze student heet " + naam + " en heeft nummer: " + studentNummer;
    }
}
