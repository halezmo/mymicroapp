package no.jansoren.mymicroservice.something;

public class SomethingDoneEventNew extends SomethingDoneEvent {
    public String data() {
        return "data";
    }

    @Override
    public String getDescription() {
        return "Something New has been done";
    }

    public String dataMore() {
        return "data";
    }
}

