public class FullStackCourse implements Course {
    int id=0;
    private PriceCalc cal;
    public FullStackCourse(PriceCalc cal) {
        this.cal=cal;
        System.out.println("created");
    }

    @Override
    public String getName() {
        return "Full Stack Course";
    }

    @Override
    public double getPrice() {
        return cal.getPrice();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("removed");
    }
}
