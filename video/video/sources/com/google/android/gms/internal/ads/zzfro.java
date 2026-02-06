package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes2.dex */
public abstract class zzfro implements SensorEventListener {
    public zzfro(String str, String str2) {
        zzfrn.a();
        zzfrm.a();
    }

    public abstract void a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
