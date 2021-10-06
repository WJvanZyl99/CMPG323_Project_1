package za.ac.nwu.domain.service;

public class GeneralResponse<S> {

    private final boolean successful;
    //private final transient S payload;
    private S payload;


    public GeneralResponse(boolean successful, S payload) {
        this.successful = true;
        this.payload = payload;

    }

    public boolean getSuccessful() {

        return successful;
    }

    public S getPayload() {

        return payload;
    }
}
