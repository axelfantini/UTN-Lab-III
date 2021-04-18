package lab3.tpobjects3.exercises.exercise2.enums;

public enum ShiftEnum {
    DAY,
    NIGHT;

    @Override
    public String toString()
    {
        String response = "";
        switch (this){
            case DAY:
                response = "Day";
                break;
            case NIGHT:
                response = "Night";
                break;
        }
        return response;
    }
}
