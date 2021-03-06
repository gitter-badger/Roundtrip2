package com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpData.records;


import com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpModel;
import com.gxwtech.roundtrip2.util.ByteUtil;

public class BGReceivedPumpEvent extends TimeStampedRecord {
    private int amount = 0;
    private byte[] meter = new byte[3];

    public BGReceivedPumpEvent() {
    }

    @Override
    public boolean parseFrom(byte[] data, PumpModel model) {
        if (!super.simpleParse(10,data,2)) {
            return false;
        }
        amount = (asUINT8(data[1]) << 3) + (asUINT8(data[4])>>5);
        meter = ByteUtil.substring(data,7,3);
        return true;
    }
}
