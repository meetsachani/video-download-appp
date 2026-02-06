package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzdwe extends zzfro {
    public final Context a;
    @InterfaceC10571ws1
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zzdwd f;
    public boolean g;

    public zzdwe(Context context) {
        super("ShakeDetector", "ads");
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n9)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = f / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o9)).floatValue()) {
                long a = com.google.android.gms.ads.internal.zzv.d().a();
                if (this.d + ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p9)).intValue() <= a) {
                    if (this.d + ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q9)).intValue() < a) {
                        this.e = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.k("Shake detected.");
                    this.d = a;
                    int i = this.e + 1;
                    this.e = i;
                    zzdwd zzdwdVar = this.f;
                    if (zzdwdVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r9)).intValue()) {
                            zzdvc zzdvcVar = (zzdvc) zzdwdVar;
                            zzdvcVar.i(new zzduz(zzdvcVar), zzdvb.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.g) {
                    SensorManager sensorManager = this.b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.c);
                        com.google.android.gms.ads.internal.util.zze.k("Stopped listening for shake gestures.");
                    }
                    this.g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n9)).booleanValue()) {
                    return;
                }
                if (this.b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                    this.b = sensorManager2;
                    if (sensorManager2 == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.d = com.google.android.gms.ads.internal.zzv.d().a() - ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p9)).intValue();
                    this.g = true;
                    com.google.android.gms.ads.internal.util.zze.k("Listening for shake gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(zzdwd zzdwdVar) {
        this.f = zzdwdVar;
    }
}
