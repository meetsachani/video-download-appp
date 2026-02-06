package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzdwf extends Exception {
    public final int X;

    public zzdwf(int i) {
        this.X = i;
    }

    public final int a() {
        return this.X;
    }

    public zzdwf(int i, String str) {
        super(str);
        this.X = i;
    }

    public zzdwf(int i, String str, Throwable th) {
        super(str, th);
        this.X = 1;
    }
}
