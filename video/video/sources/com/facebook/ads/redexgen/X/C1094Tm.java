package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.Tm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1094Tm implements SensorEventListener {
    public C1094Tm() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C1095Tn.A0B = sensorEvent.values;
        C1095Tn.A05();
    }
}
