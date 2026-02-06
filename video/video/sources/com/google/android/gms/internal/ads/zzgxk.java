package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import o.C2555Bk;
import o.C6566gU0;

/* loaded from: classes2.dex */
public abstract class zzgxk implements Iterable<Byte>, Serializable {
    public static final zzgxk Y = new zzgxh(zzgzf.b);
    public int X = 0;

    static {
        int i = zzgwx.a;
    }

    public static int J(int i, int i2, int i3) {
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

    public static zzgxi M() {
        return new zzgxi(128);
    }

    public static zzgxk Q(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return Y;
        }
        return h(iterable.iterator(), size);
    }

    public static zzgxk U(byte[] bArr, int i, int i2) {
        J(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgxh(bArr2);
    }

    public static zzgxk V(String str) {
        return new zzgxh(str.getBytes(zzgzf.a));
    }

    public static void Y(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + C6566gU0.h + i2);
        }
    }

    public static zzgxk h(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgxk) it.next();
            }
            int i2 = i >>> 1;
            zzgxk h = h(it, i2);
            zzgxk h2 = h(it, i - i2);
            if (Integer.MAX_VALUE - h.i() >= h2.i()) {
                return zzhav.d0(h, h2);
            }
            int i3 = h.i();
            int i4 = h2.i();
            throw new IllegalArgumentException("ByteString would be too long: " + i3 + C2555Bk.p1 + i4);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public abstract zzgxq B();

    public abstract String D(Charset charset);

    public abstract ByteBuffer F();

    public abstract void G(zzgxb zzgxbVar) throws IOException;

    public abstract boolean H();

    public final int K() {
        return this.X;
    }

    @Override // java.lang.Iterable
    /* renamed from: L */
    public zzgxf iterator() {
        return new zzgxc(this);
    }

    public final String X() {
        Charset charset = zzgzf.a;
        if (i() == 0) {
            return "";
        }
        return D(charset);
    }

    @Deprecated
    public final void a0(byte[] bArr, int i, int i2, int i3) {
        J(0, i3, i());
        J(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            j(bArr, 0, i2, i3);
        }
    }

    public final byte[] d() {
        int i = i();
        if (i == 0) {
            return zzgzf.b;
        }
        byte[] bArr = new byte[i];
        j(bArr, 0, 0, i);
        return bArr;
    }

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public final int hashCode() {
        int i = this.X;
        if (i == 0) {
            int i2 = i();
            i = p(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.X = i;
        }
        return i;
    }

    public abstract int i();

    public abstract void j(byte[] bArr, int i, int i2, int i3);

    public abstract int k();

    public abstract boolean l();

    public abstract int p(int i, int i2, int i3);

    public abstract int r(int i, int i2, int i3);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(i());
        if (i() <= 50) {
            concat = zzhbg.a(this);
        } else {
            concat = zzhbg.a(w(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, concat);
    }

    public abstract zzgxk w(int i, int i2);
}
