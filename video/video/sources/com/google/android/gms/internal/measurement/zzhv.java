package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhv {
    public final zzig a;
    public final byte[] b;

    public final zzhm a() {
        this.a.I();
        return new zzhw(this.b);
    }

    public final zzig b() {
        return this.a;
    }

    public zzhv(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = zzig.H(bArr);
    }
}
