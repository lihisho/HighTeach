public class Teacher extends User {

    //region Fields
    private int amountOfClasses;
    private int rank;
    //endregion Fields


    public Teacher(String userName, int password, String privateName, String lastName, int teacherId, int amountOfClasses, int rank) {
        super(userName, password, privateName, lastName, teacherId);
        this.amountOfClasses = amountOfClasses;
        this.rank = rank;
    }

    //region Getters&Setters
    public int getAmountOfClasses() {
        return amountOfClasses;
    }

    public void setAmountOfClasses(int amountOfClasses) {
        this.amountOfClasses = amountOfClasses;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    //endregion Getters&Setters


}
