package generic;

public class AcademyStudent extends Student {
    private String academyname;

    public String getAcademyname() {
        return academyname;
    }

    public void setAcademyname(String academyname) {
        this.academyname = academyname;
    }

    @Override
    public String toString() {
        return "AcademyStduent{" +
                "academyname=" + academyname +
                "} " + super.toString();
    }
}
