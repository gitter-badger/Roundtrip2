package com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpData.records;

import com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpModel;

/**
 * Created by geoff on 6/5/16.
 */
public class DeleteAlarmClockTimePumpEvent extends TimeStampedRecord {
    public DeleteAlarmClockTimePumpEvent() {}

    @Override
    public boolean parseFrom(byte[] data, PumpModel model) {
        return simpleParse(14,data,2);
    }
}
