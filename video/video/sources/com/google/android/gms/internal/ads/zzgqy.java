package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqy implements zzgew {
    public zzgqy(zzgew zzgewVar, zzguq zzguqVar, byte[] bArr) {
    }

    public static zzgew a(zzgmo zzgmoVar) throws GeneralSecurityException {
        byte[] d;
        zzgoi b = zzgmoVar.b(zzgej.a());
        zzgew zzgewVar = (zzgew) zzgma.c().a(b.g(), zzgew.class).a(b.d());
        zzguq c = b.c();
        int ordinal = c.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    d = zzgnk.a.d();
                }
            }
            d = zzgnk.a(zzgmoVar.d().intValue()).d();
        } else {
            d = zzgnk.b(zzgmoVar.d().intValue()).d();
        }
        return new zzgqy(zzgewVar, c, d);
    }
}
