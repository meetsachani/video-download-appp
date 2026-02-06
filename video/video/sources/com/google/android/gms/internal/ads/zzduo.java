package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzduo extends zzfro {
    @InterfaceC10571ws1
    public final SensorManager a;
    @InterfaceC10571ws1
    public final Sensor b;
    public float c;
    public Float d;
    public long e;
    public int f;
    public boolean g;
    public boolean h;
    @InterfaceC10571ws1
    public zzdun i;
    public boolean j;

    public zzduo(Context context) {
        super("FlickDetector", "ads");
        this.c = 0.0f;
        this.d = Float.valueOf(0.0f);
        this.e = com.google.android.gms.ads.internal.zzv.d().a();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s9)).booleanValue()) {
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            if (this.e + ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u9)).intValue() < a) {
                this.f = 0;
                this.e = a;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            Float valueOf = Float.valueOf(this.d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.c;
            zzbcm zzbcmVar = zzbcv.t9;
            if (floatValue > f + ((Float) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).floatValue()) {
                this.c = this.d.floatValue();
                this.h = true;
            } else if (this.d.floatValue() < this.c - ((Float) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                com.google.android.gms.ads.internal.util.zze.k("Flick detected.");
                this.e = a;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                zzdun zzdunVar = this.i;
                if (zzdunVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v9)).intValue()) {
                        zzdvc zzdvcVar = (zzdvc) zzdunVar;
                        zzdvcVar.i(new zzdva(zzdvcVar), zzdvb.GESTURE);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.j = false;
                    com.google.android.gms.ads.internal.util.zze.k("Stopped listening for flick gestures.");
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
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s9)).booleanValue()) {
                    return;
                }
                if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.j = true;
                    com.google.android.gms.ads.internal.util.zze.k("Listening for flick gestures.");
                }
                if (this.a != null && this.b != null) {
                    return;
                }
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(zzdun zzdunVar) {
        this.i = zzdunVar;
    }
}
