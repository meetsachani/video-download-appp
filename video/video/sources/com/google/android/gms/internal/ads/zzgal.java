package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10671xH0;

/* loaded from: classes2.dex */
final class zzgal extends zzgao {
    public final char[] e;

    public zzgal(zzgak zzgakVar) {
        super(zzgakVar, null);
        char[] cArr;
        this.e = new char[512];
        cArr = zzgakVar.b;
        zzfvc.e(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.e[i] = zzgakVar.a(i >>> 4);
            this.e[i | 256] = zzgakVar.a(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgao, com.google.android.gms.internal.ads.zzgap
    public final int a(byte[] bArr, CharSequence charSequence) throws zzgan {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                zzgak zzgakVar = this.b;
                bArr[i2] = (byte) (zzgakVar.b(charSequence.charAt(i + 1)) | (zzgakVar.b(charSequence.charAt(i)) << 4));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new zzgan("Invalid input length " + charSequence.length());
    }

    @Override // com.google.android.gms.internal.ads.zzgao, com.google.android.gms.internal.ads.zzgap
    public final void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfvc.k(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.e;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgao
    public final zzgap j(zzgak zzgakVar, Character ch) {
        return new zzgal(zzgakVar);
    }

    public zzgal(String str, String str2) {
        this(new zzgak("base16()", C10671xH0.b.toCharArray()));
    }
}
