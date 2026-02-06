package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgkx implements zzgee {
    public final zzgee a;
    public final byte[] b;

    public zzgkx(zzgee zzgeeVar, byte[] bArr) {
        this.a = zzgeeVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static zzgee b(zzgmo zzgmoVar) throws GeneralSecurityException {
        byte[] d;
        zzgoi b = zzgmoVar.b(zzgej.a());
        zzgee zzgeeVar = (zzgee) zzgma.c().a(b.g(), zzgee.class).a(b.d());
        zzguq c = b.c();
        int ordinal = c.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(c)));
                    }
                } else {
                    d = zzgnk.a.d();
                }
            }
            d = zzgnk.a(zzgmoVar.d().intValue()).d();
        } else {
            d = zzgnk.b(zzgmoVar.d().intValue()).d();
        }
        return new zzgkx(zzgeeVar, d);
    }

    public static zzgee c(zzgee zzgeeVar, zzgwp zzgwpVar) {
        return new zzgkx(zzgeeVar, zzgwpVar.d());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (zzgou.c(bArr3, bArr)) {
            return this.a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
