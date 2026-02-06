package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfsf extends zzfsr {
    public String a;
    public String b;

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final zzfsr a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final zzfsr b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final zzfss c() {
        return new zzfsh(this.a, this.b, null);
    }
}
