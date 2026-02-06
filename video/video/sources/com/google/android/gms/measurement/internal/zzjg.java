package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjg implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Bundle Y0;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean Z0;
    public final /* synthetic */ boolean a1;
    public final /* synthetic */ boolean b1;
    public final /* synthetic */ String c1;
    public final /* synthetic */ zziq d1;

    public zzjg(zziq zziqVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.d1 = zziqVar;
        this.X = str;
        this.Y = str2;
        this.Z = j;
        this.Y0 = bundle;
        this.Z0 = z;
        this.a1 = z2;
        this.b1 = z3;
        this.c1 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d1.W(this.X, this.Y, this.Z, this.Y0, this.Z0, this.a1, this.b1, this.c1);
    }
}
