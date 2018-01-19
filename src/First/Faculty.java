package First;


public class Faculty {
    private String ecomonyFaculty;
    private String chemistryFaculty;
    private String physicsFaculty;
    private String historyFaculty;

    public void economistWelcome(Matriculant matriculant){
        System.out.println(matriculant.getName() + " будет Экономистом, ура, ура");
    }

    public void chemistryWelcome(Matriculant matriculant){
        System.out.println(matriculant.getName() + " будет Химиком, ура, ура");
    }

    public void physicsWelcome(Matriculant matriculant){
        System.out.println(matriculant.getName() + " будет Физиком, ура, ура");
    }

    public void historyWelcome(Matriculant matriculant){
        System.out.println(matriculant.getName() + " будет Историком, ура, ура");
    }

    public String getEcomonyFaculty() {
        return ecomonyFaculty;
    }

    public void setEcomonyFaculty(String ecomonyFaculty) {
        this.ecomonyFaculty = ecomonyFaculty;
    }

    public String getChemistryFaculty() {
        return chemistryFaculty;
    }

    public void setChemistryFaculty(String chemistryFaculty) {
        this.chemistryFaculty = chemistryFaculty;
    }

    public String getPhysicsFaculty() {
        return physicsFaculty;
    }

    public void setPhysicsFaculty(String physicsFaculty) {
        this.physicsFaculty = physicsFaculty;
    }

    public String getHistoryFaculty() {
        return historyFaculty;
    }

    public void setHistoryFaculty(String historyFaculty) {
        this.historyFaculty = historyFaculty;
    }
}
