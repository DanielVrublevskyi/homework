package aqaOopTask;

public enum PersonRole {
    STUDENT("Student"),
    TEACHER("Teacher"),
    DOCTOR("Doctor"),
    ENGINEER("Engineer"),
    ARTIST("Artist"),
    OTHER("Other");

    private final String personeRoleString;

    public String getPersoneRoleString() {
        return personeRoleString;
    }

    PersonRole(String personeRoleString){
        this.personeRoleString = personeRoleString;
    }
}
