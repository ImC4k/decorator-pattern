package imc4k.decoratorpattern.person;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNSPECIFIED("unspecified");

    private final String genderString;

    Gender(String genderString) {
        this.genderString = genderString;
    }

    public String getPronoun() {
        switch (this.genderString) {
            case "male": return "he";
            case "female": return "she";
            default: return "they";
        }
    }
}
