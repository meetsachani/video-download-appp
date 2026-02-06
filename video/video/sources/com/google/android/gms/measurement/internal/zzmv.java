package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzmv implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzmw Y0;
    public final /* synthetic */ Bundle Z;

    public zzmv(zzmw zzmwVar, String str, String str2, Bundle bundle) {
        this.Y0 = zzmwVar;
        this.X = str;
        this.Y = str2;
        this.Z = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y0.a.u((zzbg) Preconditions.r(this.Y0.a.n0().G(this.X, this.Y, this.Z, "auto", this.Y0.a.b().a(), false, true)), this.X);
    }
}
