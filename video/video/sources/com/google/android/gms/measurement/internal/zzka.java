package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes3.dex */
final class zzka implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ String Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zzjx Z0;

    public zzka(zzjx zzjxVar, boolean z, Uri uri, String str, String str2) {
        this.Z0 = zzjxVar;
        this.X = z;
        this.Y = uri;
        this.Z = str;
        this.Y0 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjx.a(this.Z0, this.X, this.Y, this.Z, this.Y0);
    }
}
