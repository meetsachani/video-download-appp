package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10671xH0;

/* loaded from: classes2.dex */
public abstract class zzgap {
    public static final zzgap a;

    static {
        new zzgam("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzgam("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzgao("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgao("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        a = new zzgal("base16()", C10671xH0.b);
    }

    public static zzgap g() {
        return a;
    }

    public abstract int a(byte[] bArr, CharSequence charSequence) throws zzgan;

    public abstract void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int c(int i);

    public abstract int d(int i);

    public abstract zzgap e();

    public CharSequence f(CharSequence charSequence) {
        throw null;
    }

    public final String h(byte[] bArr, int i, int i2) {
        zzfvc.k(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(d(i2));
        try {
            b(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence f = f(charSequence);
            int c = c(f.length());
            byte[] bArr = new byte[c];
            int a2 = a(bArr, f);
            if (a2 == c) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (zzgan e) {
            throw new IllegalArgumentException(e);
        }
    }
}
