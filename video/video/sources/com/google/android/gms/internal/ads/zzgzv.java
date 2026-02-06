package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgzv implements zzhax {
    public static final zzhab b = new zzgzt();
    public final zzhab a;

    public zzgzv() {
        zzgyl a = zzgyl.a();
        int i = zzhan.d;
        zzgzu zzgzuVar = new zzgzu(a, b);
        byte[] bArr = zzgzf.b;
        this.a = zzgzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    public final zzhaw a(Class cls) {
        zzgyd zzgydVar;
        int i = zzhay.b;
        if (!zzgys.class.isAssignableFrom(cls)) {
            int i2 = zzhan.d;
        }
        zzhaa b2 = this.a.b(cls);
        if (!b2.b()) {
            int i3 = zzhan.d;
            zzhaj a = zzhak.a();
            zzgzq a2 = zzgzr.a();
            zzhbi w = zzhay.w();
            if (b2.c() - 1 != 1) {
                zzgydVar = zzgyf.a();
            } else {
                zzgydVar = null;
            }
            return zzhag.G(cls, b2, a, a2, w, zzgydVar, zzgzz.a());
        }
        int i4 = zzhan.d;
        return zzhah.k(zzhay.w(), zzgyf.a(), b2.a());
    }
}
