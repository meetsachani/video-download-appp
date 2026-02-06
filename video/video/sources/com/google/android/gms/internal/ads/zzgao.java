package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes2.dex */
class zzgao extends zzgap {
    public final zzgak b;
    public final Character c;
    public volatile zzgap d;

    public zzgao(zzgak zzgakVar, Character ch) {
        this.b = zzgakVar;
        boolean z = true;
        if (ch != null && zzgakVar.e('=')) {
            z = false;
        }
        zzfvc.i(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public int a(byte[] bArr, CharSequence charSequence) throws zzgan {
        int i;
        CharSequence f = f(charSequence);
        int length = f.length();
        zzgak zzgakVar = this.b;
        if (zzgakVar.d(length)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < f.length()) {
                long j = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = zzgakVar.e;
                    if (i4 >= i) {
                        break;
                    }
                    j <<= zzgakVar.d;
                    if (i2 + i4 < f.length()) {
                        j |= zzgakVar.b(f.charAt(i5 + i2));
                        i5++;
                    }
                    i4++;
                }
                int i6 = zzgakVar.f;
                int i7 = i5 * zzgakVar.d;
                int i8 = (i6 - 1) * 8;
                while (i8 >= (i6 * 8) - i7) {
                    bArr[i3] = (byte) ((j >>> i8) & 255);
                    i8 -= 8;
                    i3++;
                }
                i2 += i;
            }
            return i3;
        }
        throw new zzgan("Invalid input length " + f.length());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfvc.k(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.b.f;
            k(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final int c(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final int d(int i) {
        zzgak zzgakVar = this.b;
        return zzgakVar.e * zzgay.b(i, zzgakVar.f, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final zzgap e() {
        zzgap zzgapVar = this.d;
        if (zzgapVar == null) {
            zzgak zzgakVar = this.b;
            zzgak c = zzgakVar.c();
            if (c == zzgakVar) {
                zzgapVar = this;
            } else {
                zzgapVar = j(c, this.c);
            }
            this.d = zzgapVar;
        }
        return zzgapVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgao) {
            zzgao zzgaoVar = (zzgao) obj;
            if (this.b.equals(zzgaoVar.b) && Objects.equals(this.c, zzgaoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final CharSequence f(CharSequence charSequence) {
        charSequence.getClass();
        if (this.c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    public zzgap j(zzgak zzgakVar, Character ch) {
        return new zzgao(zzgakVar, ch);
    }

    public final void k(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzfvc.k(i, i + i2, bArr.length);
        zzgak zzgakVar = this.b;
        int i3 = zzgakVar.f;
        int i4 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.e(z);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgakVar.d;
        while (i4 < i2 * 8) {
            appendable.append(zzgakVar.a(zzgakVar.c & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        if (this.c != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgak zzgakVar = this.b;
        sb.append(zzgakVar);
        if (8 % zzgakVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zzgao(String str, String str2, Character ch) {
        this(new zzgak(str, str2.toCharArray()), ch);
    }
}
