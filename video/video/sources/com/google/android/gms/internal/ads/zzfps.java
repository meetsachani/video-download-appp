package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfps extends Exception {
    public final int X;

    public zzfps(int i, String str) {
        super(str);
        this.X = i;
    }

    public final int a() {
        return this.X;
    }

    public zzfps(int i, Throwable th) {
        super(th);
        this.X = i;
    }
}
