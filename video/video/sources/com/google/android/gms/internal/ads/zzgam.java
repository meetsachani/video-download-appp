package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzgam extends zzgao {
    public zzgam(zzgak zzgakVar, Character ch) {
        super(zzgakVar, ch);
        char[] cArr;
        cArr = zzgakVar.b;
        zzfvc.e(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgao, com.google.android.gms.internal.ads.zzgap
    public final int a(byte[] bArr, CharSequence charSequence) throws zzgan {
        CharSequence f = f(charSequence);
        int length = f.length();
        zzgak zzgakVar = this.b;
        if (zzgakVar.d(length)) {
            int i = 0;
            int i2 = 0;
            while (i < f.length()) {
                int i3 = i2 + 1;
                int b = (zzgakVar.b(f.charAt(i + 1)) << 12) | (zzgakVar.b(f.charAt(i)) << 18);
                bArr[i2] = (byte) (b >>> 16);
                int i4 = i + 2;
                if (i4 < f.length()) {
                    int i5 = i + 3;
                    int b2 = b | (zzgakVar.b(f.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((b2 >>> 8) & 255);
                    if (i5 < f.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((b2 | zzgakVar.b(f.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new zzgan("Invalid input length " + f.length());
    }

    @Override // com.google.android.gms.internal.ads.zzgao, com.google.android.gms.internal.ads.zzgap
    public final void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfvc.k(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            zzgak zzgakVar = this.b;
            int i5 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
            appendable.append(zzgakVar.a(i5 >>> 18));
            appendable.append(zzgakVar.a((i5 >>> 12) & 63));
            appendable.append(zzgakVar.a((i5 >>> 6) & 63));
            appendable.append(zzgakVar.a(i5 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            k(appendable, bArr, i3, i2 - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgao
    public final zzgap j(zzgak zzgakVar, Character ch) {
        return new zzgam(zzgakVar, ch);
    }

    public zzgam(String str, String str2, Character ch) {
        this(new zzgak(str, str2.toCharArray()), ch);
    }
}
