package lab3.tpobjects3.exercises.exercise2.enums;

public enum CareerEnum {
    TECHNICAL,
    SOCIAL,
    NATURAL;

    @Override
    public String toString()
    {
        String response = "";
        switch (this){
            case TECHNICAL:
                response = "Technical";
                break;
            case SOCIAL:
                response = "Social";
                break;
            case NATURAL:
                response = "Natural";
                break;
        }
        return response;
    }
}
