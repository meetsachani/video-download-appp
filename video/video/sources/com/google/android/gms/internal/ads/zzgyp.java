package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgyp implements zzgyg {
    public final int X;
    public final zzhbv Y;
    public final boolean Y0;
    public final boolean Z;

    public zzgyp(zzgyx zzgyxVar, int i, zzhbv zzhbvVar, boolean z, boolean z2) {
        this.X = i;
        this.Y = zzhbvVar;
        this.Z = z;
        this.Y0 = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final int a() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final zzhbv b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final zzhbw c() {
        return this.Y.e();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.X - ((zzgyp) obj).X;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final boolean d() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final boolean f() {
        return this.Y0;
    }
}
