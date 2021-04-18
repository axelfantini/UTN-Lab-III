package lab3.tpobjects4.enums;

public enum AudienceEnum {
    G,
    PG,
    PG_13,
    R,
    NC_17,
    UNRATED;
    @Override
    public String toString()
    {
        String response = "";
        switch (this)
        {
            case G:
                response = "G";
                break;
            case PG:
                response = "PG";
                break;
            case PG_13:
                response = "PG-13";
                break;
            case R:
                response = "R";
                break;
            case NC_17:
                response = "NC-17";
                break;
            case UNRATED:
                response = "Unrated";
                break;
        }
        return response;
    }

}
