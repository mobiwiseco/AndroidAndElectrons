package co.mobiwise.electronottobus;

import com.squareup.otto.Bus;

/**
 * Created by mertsimsek on 11/11/15.
 */
public final class BusProvider {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {
    }
}