package com.google.android.gms.internal.ads;

import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzqe extends Exception {
    public final int X;
    public final boolean Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqe(int i, int i2, int i3, int i4, int i5, zzz zzzVar, boolean z, @InterfaceC11300zs1 Exception exc) {
        super(r0.toString(), exc);
        String str;
        String valueOf = String.valueOf(zzzVar);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(C6566gU0.h);
        sb.append(i3);
        sb.append(C6566gU0.h);
        sb.append(i4);
        sb.append(C6566gU0.h);
        sb.append(i5);
        sb.append(") ");
        sb.append(valueOf);
        if (true != z) {
            str = "";
        } else {
            str = " (recoverable)";
        }
        sb.append(str);
        this.X = i;
        this.Y = z;
    }
}
