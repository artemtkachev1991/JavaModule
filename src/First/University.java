package First;

import java.util.ArrayList;

public class University {
    public ArrayList<Faculty> facultyList;

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void addFaculty (Faculty fac) {
        facultyList.add(fac);
    }
}
