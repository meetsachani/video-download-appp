package com.google.android.gms.internal.measurement;

import com.facebook.internal.H;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.ExecutorC9488sQ;
import o.ME;

/* loaded from: classes3.dex */
public abstract class zzig extends zzhn {
    public static final Logger b = Logger.getLogger(zzig.class.getName());
    public static final boolean c = zzmg.w();
    public zzij a;

    /* loaded from: classes3.dex */
    public static class zza extends zzig {
        public final byte[] d;
        public final int e;
        public final int f;
        public int g;

        public zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if (((bArr.length - i2) | i2) >= 0) {
                    this.d = bArr;
                    this.e = 0;
                    this.g = 0;
                    this.f = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException(H.a.b);
        }

        public final void F0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void L(int i) throws IOException {
            if (i >= 0) {
                Z(i);
            } else {
                R(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void O(int i, int i2) throws IOException {
            a0(i, 0);
            L(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void P(int i, long j) throws IOException {
            a0(i, 0);
            R(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void Q(int i, zzhm zzhmVar) throws IOException {
            a0(1, 3);
            g0(2, i);
            p(3, zzhmVar);
            a0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void R(long j) throws IOException {
            if (zzig.c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    zzmg.m(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                zzmg.m(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void T(byte[] bArr, int i, int i2) throws IOException {
            Z(i2);
            F0(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void Z(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr2 = this.d;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            F0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void a0(int i, int i2) throws IOException {
            Z((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final int b() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void g0(int i, int i2) throws IOException {
            a0(i, 0);
            Z(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void l(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void m(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.g = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void n(int i, int i2) throws IOException {
            a0(i, 5);
            m(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void o(int i, long j) throws IOException {
            a0(i, 1);
            u(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void p(int i, zzhm zzhmVar) throws IOException {
            a0(i, 2);
            v(zzhmVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void q(int i, zzkj zzkjVar) throws IOException {
            a0(1, 3);
            g0(2, i);
            a0(3, 2);
            w(zzkjVar);
            a0(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void r(int i, zzkj zzkjVar, zzlb zzlbVar) throws IOException {
            a0(i, 2);
            Z(((zzhd) zzkjVar).h(zzlbVar));
            zzlbVar.h(zzkjVar, this.a);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void s(int i, String str) throws IOException {
            a0(i, 2);
            x(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void t(int i, boolean z) throws IOException {
            a0(i, 0);
            l(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void u(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.g = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.g = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.g = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.g = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.g = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.g = i8;
                bArr[i7] = (byte) (j >> 48);
                this.g = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void v(zzhm zzhmVar) throws IOException {
            Z(zzhmVar.B());
            zzhmVar.r(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void w(zzkj zzkjVar) throws IOException {
            Z(zzkjVar.D0());
            zzkjVar.b(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void x(String str) throws IOException {
            int i = this.g;
            try {
                int A0 = zzig.A0(str.length() * 3);
                int A02 = zzig.A0(str.length());
                if (A02 == A0) {
                    int i2 = i + A02;
                    this.g = i2;
                    int b = zzmh.b(str, this.d, i2, b());
                    this.g = i;
                    Z((b - i) - A02);
                    this.g = b;
                    return;
                }
                Z(zzmh.a(str));
                this.g = zzmh.b(str, this.d, this.g, b());
            } catch (zzmk e) {
                this.g = i;
                y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class zzb extends IOException {
        public zzb() {
            super(ME.f.X);
        }

        public zzb(Throwable th) {
            super(ME.f.X, th);
        }

        public zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i, zzkj zzkjVar) {
        return (A0(8) << 1) + B0(2, i) + A0(24) + Y(zzkjVar);
    }

    public static int A0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    @Deprecated
    public static int B(int i, zzkj zzkjVar, zzlb zzlbVar) {
        return (A0(i << 3) << 1) + ((zzhd) zzkjVar).h(zzlbVar);
    }

    public static int B0(int i, int i2) {
        return A0(i << 3) + A0(i2);
    }

    public static int C(int i, String str) {
        return A0(i << 3) + G(str);
    }

    public static int D(int i, boolean z) {
        return A0(i << 3) + 1;
    }

    public static int E(zzhm zzhmVar) {
        int B = zzhmVar.B();
        return A0(B) + B;
    }

    public static int E0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int F(zzkj zzkjVar) {
        return zzkjVar.D0();
    }

    public static int G(String str) {
        int length;
        try {
            length = zzmh.a(str);
        } catch (zzmk unused) {
            length = str.getBytes(zziz.b).length;
        }
        return A0(length) + length;
    }

    public static zzig H(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int U(int i, long j) {
        return A0(i << 3) + 8;
    }

    public static int V(int i, zzhm zzhmVar) {
        int A0 = A0(i << 3);
        int B = zzhmVar.B();
        return A0 + A0(B) + B;
    }

    public static int W(int i, zzkj zzkjVar, zzlb zzlbVar) {
        return A0(i << 3) + i(zzkjVar, zzlbVar);
    }

    public static int X(long j) {
        return 8;
    }

    public static int Y(zzkj zzkjVar) {
        int D0 = zzkjVar.D0();
        return A0(D0) + D0;
    }

    public static int c(double d) {
        return 8;
    }

    public static int c0(int i) {
        return l0(i);
    }

    public static int d(float f) {
        return 4;
    }

    public static int d0(int i, long j) {
        return A0(i << 3) + s0(j);
    }

    public static int e(int i, double d) {
        return A0(i << 3) + 8;
    }

    public static int e0(int i, zzhm zzhmVar) {
        return (A0(8) << 1) + B0(2, i) + V(3, zzhmVar);
    }

    public static int f(int i, float f) {
        return A0(i << 3) + 4;
    }

    public static int f0(long j) {
        return s0(j);
    }

    public static int g(int i, zzjn zzjnVar) {
        return (A0(8) << 1) + B0(2, i) + z(3, zzjnVar);
    }

    public static int h(zzjn zzjnVar) {
        int b2 = zzjnVar.b();
        return A0(b2) + b2;
    }

    public static int h0(int i) {
        return 4;
    }

    public static int i(zzkj zzkjVar, zzlb zzlbVar) {
        int h = ((zzhd) zzkjVar).h(zzlbVar);
        return A0(h) + h;
    }

    public static int i0(int i, int i2) {
        return A0(i << 3) + l0(i2);
    }

    public static int j(boolean z) {
        return 1;
    }

    public static int j0(int i, long j) {
        return A0(i << 3) + 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return A0(length) + length;
    }

    public static int k0(long j) {
        return 8;
    }

    public static int l0(int i) {
        if (i >= 0) {
            return A0(i);
        }
        return 10;
    }

    public static int m0(int i, int i2) {
        return A0(i << 3) + 4;
    }

    public static int n0(int i, long j) {
        return A0(i << 3) + s0(z0(j));
    }

    public static int o0(long j) {
        return s0(z0(j));
    }

    public static int p0(int i) {
        return 4;
    }

    public static int q0(int i, int i2) {
        return A0(i << 3) + l0(i2);
    }

    public static int r0(int i, long j) {
        return A0(i << 3) + s0(j);
    }

    public static int s0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((ExecutorC9488sQ.s1 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int t0(int i) {
        return A0(E0(i));
    }

    public static int u0(int i, int i2) {
        return A0(i << 3) + 4;
    }

    public static int x0(int i) {
        return A0(i << 3);
    }

    public static int y0(int i, int i2) {
        return A0(i << 3) + A0(E0(i2));
    }

    public static int z(int i, zzjn zzjnVar) {
        int A0 = A0(i << 3);
        int b2 = zzjnVar.b();
        return A0 + A0(b2) + b2;
    }

    public static long z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void C0(int i) throws IOException {
        Z(E0(i));
    }

    public final void D0(int i, int i2) throws IOException {
        g0(i, E0(i2));
    }

    public final void I() {
        if (b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void J(double d) throws IOException {
        u(Double.doubleToRawLongBits(d));
    }

    public final void K(float f) throws IOException {
        m(Float.floatToRawIntBits(f));
    }

    public abstract void L(int i) throws IOException;

    public final void M(int i, double d) throws IOException {
        o(i, Double.doubleToRawLongBits(d));
    }

    public final void N(int i, float f) throws IOException {
        n(i, Float.floatToRawIntBits(f));
    }

    public abstract void O(int i, int i2) throws IOException;

    public abstract void P(int i, long j) throws IOException;

    public abstract void Q(int i, zzhm zzhmVar) throws IOException;

    public abstract void R(long j) throws IOException;

    public final void S(boolean z) throws IOException {
        l(z ? (byte) 1 : (byte) 0);
    }

    public abstract void T(byte[] bArr, int i, int i2) throws IOException;

    public abstract void Z(int i) throws IOException;

    public abstract void a0(int i, int i2) throws IOException;

    public abstract int b();

    public abstract void g0(int i, int i2) throws IOException;

    public abstract void l(byte b2) throws IOException;

    public abstract void m(int i) throws IOException;

    public abstract void n(int i, int i2) throws IOException;

    public abstract void o(int i, long j) throws IOException;

    public abstract void p(int i, zzhm zzhmVar) throws IOException;

    public abstract void q(int i, zzkj zzkjVar) throws IOException;

    public abstract void r(int i, zzkj zzkjVar, zzlb zzlbVar) throws IOException;

    public abstract void s(int i, String str) throws IOException;

    public abstract void t(int i, boolean z) throws IOException;

    public abstract void u(long j) throws IOException;

    public abstract void v(zzhm zzhmVar) throws IOException;

    public final void v0(int i, long j) throws IOException {
        P(i, z0(j));
    }

    public abstract void w(zzkj zzkjVar) throws IOException;

    public final void w0(long j) throws IOException {
        R(z0(j));
    }

    public abstract void x(String str) throws IOException;

    public final void y(String str, zzmk zzmkVar) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmkVar);
        byte[] bytes = str.getBytes(zziz.b);
        try {
            Z(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    private zzig() {
    }
}
