package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfsl extends zzfto {
    public int a;
    public String b;
    public byte c;

    @Override // com.google.android.gms.internal.ads.zzfto
    public final zzfto a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfto
    public final zzfto b(int i) {
        this.a = i;
        this.c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfto
    public final zzftp c() {
        if (this.c == 1) {
            return new zzfsn(this.a, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
