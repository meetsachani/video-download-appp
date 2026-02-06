package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.Tl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1093Tl implements SensorEventListener {
    public C1093Tl() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C1095Tn.A0D(sensorEvent.values);
        C1095Tn.A04();
    }
}
