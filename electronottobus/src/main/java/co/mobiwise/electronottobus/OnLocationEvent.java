package co.mobiwise.electronottobus;

/**
 * Created by mertsimsek on 11/11/15.
 */
public class OnLocationEvent {

    int latitude;
    int longitude;

    public OnLocationEvent(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
