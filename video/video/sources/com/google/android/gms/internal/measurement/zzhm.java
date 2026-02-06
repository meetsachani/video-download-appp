package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import o.C6566gU0;

/* loaded from: classes3.dex */
public abstract class zzhm implements Serializable, Iterable<Byte> {
    public int X = 0;
    public static final zzhm Y = new zzhw(zziz.d);
    public static final zzht Z = new zzhz();
    public static final Comparator<zzhm> Y0 = new zzho();

    public static zzhv F(int i) {
        return new zzhv(i);
    }

    public static /* synthetic */ int f(byte b) {
        return b & 255;
    }

    public static int h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + C6566gU0.h + i2);
                }
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    public static zzhm j(String str) {
        return new zzhw(str.getBytes(zziz.b));
    }

    public static zzhm k(byte[] bArr) {
        return new zzhw(bArr);
    }

    public static zzhm l(byte[] bArr, int i, int i2) {
        h(i, i + i2, bArr.length);
        return new zzhw(Z.D(bArr, i, i2));
    }

    public abstract int B();

    public abstract int D(int i, int i2, int i3);

    public final String G() {
        Charset charset = zziz.b;
        if (B() == 0) {
            return "";
        }
        return p(charset);
    }

    public abstract boolean H();

    public abstract byte d(int i);

    public final int e() {
        return this.X;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.X;
        if (i == 0) {
            int B = B();
            i = D(B, 0, B);
            if (i == 0) {
                i = 1;
            }
            this.X = i;
        }
        return i;
    }

    public abstract zzhm i(int i, int i2);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhp(this);
    }

    public abstract String p(Charset charset);

    public abstract void r(zzhn zzhnVar) throws IOException;

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(B());
        if (B() <= 50) {
            str = zzlw.a(this);
        } else {
            str = zzlw.a(i(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }

    public abstract byte w(int i);
}
