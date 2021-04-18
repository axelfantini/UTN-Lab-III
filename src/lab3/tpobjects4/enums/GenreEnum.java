package lab3.tpobjects4.enums;

public enum GenreEnum {
    ACTION,
    ADVENTURE,
    COMEDY,
    DRAMA,
    HORROR,
    DOCUMENTARY;
    @Override
    public String toString()
    {
        String response = "";
        switch (this)
        {
            case ACTION:
                response = "Action";
                break;
            case ADVENTURE:
                response = "Adventure";
                break;
            case COMEDY:
                response = "Comedy";
                break;
            case DRAMA:
                response = "Drama";
                break;
            case HORROR:
                response = "Horror";
                break;
            case DOCUMENTARY:
                response = "Documentary";
                break;
        }
        return response;
    }
}
