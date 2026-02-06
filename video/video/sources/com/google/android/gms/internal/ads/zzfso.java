package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfso extends zzftr {
    public String a;
    public String b;

    @Override // com.google.android.gms.internal.ads.zzftr
    public final zzftr a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final zzftr b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final zzfts c() {
        return new zzfsq(this.a, this.b, null);
    }
}
