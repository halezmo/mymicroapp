package no.jansoren.mymicroservice.something;

public class SomethingDoneEventNewNew extends SomethingDoneEventNew {
    @Override
    public String getDescription() {
        return "Something New New has been done";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
