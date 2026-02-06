package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgwm implements zzgew {
    public static final byte[] e = {0};
    public final zzgqz a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public zzgwm(zzgox zzgoxVar) throws GeneralSecurityException {
        this.a = new zzgwj(zzgoxVar.e().d(zzgej.a()));
        this.b = zzgoxVar.d().b();
        this.c = zzgoxVar.b().d();
        if (zzgoxVar.d().f().equals(zzgpd.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public static zzgew a(zzgox zzgoxVar) throws GeneralSecurityException {
        return new zzgwm(zzgoxVar);
    }

    public static zzgew b(zzgpm zzgpmVar) throws GeneralSecurityException {
        return new zzgwm(zzgpmVar);
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.d;
        if (bArr2.length > 0) {
            return zzgvp.b(this.c, this.a.a(zzgvp.b(bArr, bArr2), this.b));
        }
        return zzgvp.b(this.c, this.a.a(bArr, this.b));
    }

    public zzgwm(zzgpm zzgpmVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(zzgpmVar.d().f());
        this.a = new zzgwl("HMAC".concat(valueOf), new SecretKeySpec(zzgpmVar.e().d(zzgej.a()), "HMAC"));
        this.b = zzgpmVar.d().b();
        this.c = zzgpmVar.b().d();
        if (zzgpmVar.d().g().equals(zzgpu.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public zzgwm(zzgqz zzgqzVar, int i) throws GeneralSecurityException {
        this.a = zzgqzVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        zzgqzVar.a(new byte[0], i);
    }
}
