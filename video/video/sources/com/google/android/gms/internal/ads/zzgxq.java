package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzgxq {
    public static volatile int d = 100;
    public static final /* synthetic */ int e = 0;
    public int a;
    public final int b = d;
    public zzgxr c;

    private zzgxq() {
    }

    public static int c(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int d(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new zzgzh("CodedInputStream encountered a malformed varint.");
    }

    public static long e(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgxq f(InputStream inputStream, int i) {
        if (inputStream == null) {
            byte[] bArr = zzgzf.b;
            int length = bArr.length;
            return g(bArr, 0, 0, false);
        }
        return new zzgxn(inputStream, 4096, null);
    }

    public static zzgxq g(byte[] bArr, int i, int i2, boolean z) {
        zzgxl zzgxlVar = new zzgxl(bArr, i, i2, z, null);
        try {
            zzgxlVar.k(i2);
            return zzgxlVar;
        } catch (zzgzh e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i) throws zzgzh;

    public abstract void B(int i);

    public abstract boolean a() throws IOException;

    public abstract boolean b() throws IOException;

    public abstract double h() throws IOException;

    public abstract float i() throws IOException;

    public abstract int j();

    public abstract int k(int i) throws zzgzh;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract long t() throws IOException;

    public abstract long u() throws IOException;

    public abstract long v() throws IOException;

    public abstract long w() throws IOException;

    public abstract zzgxk x() throws IOException;

    public abstract String y() throws IOException;

    public abstract String z() throws IOException;

    public /* synthetic */ zzgxq(zzgxp zzgxpVar) {
    }
}
