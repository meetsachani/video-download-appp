package o;

import com.facebook.internal.H;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.BD2;

/* loaded from: classes.dex */
public abstract class ME extends AbstractC6898hs {
    public static final Logger c = Logger.getLogger(ME.class.getName());
    public static final boolean d = TB2.S();
    @Deprecated
    public static final int e = 4;
    public static final int f = 4096;
    public NE a;
    public boolean b;

    /* loaded from: classes.dex */
    public static abstract class b extends ME {
        public final byte[] g;
        public final int h;
        public int i;
        public int j;

        public b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.g = bArr;
                this.h = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // o.ME
        public final int f1() {
            return this.j;
        }

        public final void j2(byte b) {
            byte[] bArr = this.g;
            int i = this.i;
            this.i = i + 1;
            bArr[i] = b;
            this.j++;
        }

        public final void k2(int i) {
            byte[] bArr = this.g;
            int i2 = this.i;
            int i3 = i2 + 1;
            this.i = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.i = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.i = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.i = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.j += 4;
        }

        public final void l2(long j) {
            byte[] bArr = this.g;
            int i = this.i;
            int i2 = i + 1;
            this.i = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.i = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.i = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.i = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.i = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.i = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.i = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.i = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.j += 8;
        }

        public final void m2(int i) {
            if (i >= 0) {
                o2(i);
            } else {
                p2(i);
            }
        }

        public final void n2(int i, int i2) {
            o2(IM2.c(i, i2));
        }

        public final void o2(int i) {
            if (ME.d) {
                long j = this.i;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.g;
                    int i2 = this.i;
                    this.i = i2 + 1;
                    TB2.d0(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.g;
                int i3 = this.i;
                this.i = i3 + 1;
                TB2.d0(bArr2, i3, (byte) i);
                this.j += (int) (this.i - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.g;
                int i4 = this.i;
                this.i = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.j++;
                i >>>= 7;
            }
            byte[] bArr4 = this.g;
            int i5 = this.i;
            this.i = i5 + 1;
            bArr4[i5] = (byte) i;
            this.j++;
        }

        public final void p2(long j) {
            if (ME.d) {
                long j2 = this.i;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.g;
                    int i = this.i;
                    this.i = i + 1;
                    TB2.d0(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.g;
                int i2 = this.i;
                this.i = i2 + 1;
                TB2.d0(bArr2, i2, (byte) j);
                this.j += (int) (this.i - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.g;
                int i3 = this.i;
                this.i = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.j++;
                j >>>= 7;
            }
            byte[] bArr4 = this.g;
            int i4 = this.i;
            this.i = i4 + 1;
            bArr4[i4] = (byte) j;
            this.j++;
        }

        @Override // o.ME
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {
        public final AbstractC6898hs k;

        public d(AbstractC6898hs abstractC6898hs, int i) {
            super(i);
            if (abstractC6898hs != null) {
                this.k = abstractC6898hs;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // o.ME
        public void C(int i, boolean z) throws IOException {
            r2(11);
            n2(i, 0);
            j2(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.ME
        public void C1(int i) throws IOException {
            r2(4);
            k2(i);
        }

        @Override // o.ME
        public void D1(long j) throws IOException {
            r2(8);
            l2(j);
        }

        @Override // o.ME
        public void J1(int i) throws IOException {
            if (i >= 0) {
                h2(i);
            } else {
                i2(i);
            }
        }

        @Override // o.ME
        public void L1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(i, 2);
            N1(interfaceC3540Li1);
        }

        @Override // o.ME
        public void M1(int i, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            g2(i, 2);
            O1(interfaceC3540Li1, interfaceC9026qY1);
        }

        @Override // o.ME
        public void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            h2(interfaceC3540Li1.N());
            interfaceC3540Li1.r0(this);
        }

        @Override // o.ME
        public void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public void P1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(1, 3);
            s(2, i);
            L1(3, interfaceC3540Li1);
            g2(1, 4);
        }

        @Override // o.ME
        public void S1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void T(byte b) throws IOException {
            if (this.i == this.h) {
                q2();
            }
            j2(b);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.k.U(byteBuffer);
            this.j += remaining;
        }

        @Override // o.ME, o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) throws IOException {
            e1();
            this.k.V(bArr, i, i2);
            this.j += i2;
        }

        @Override // o.ME, o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) throws IOException {
            e1();
            int remaining = byteBuffer.remaining();
            this.k.W(byteBuffer);
            this.j += remaining;
        }

        @Override // o.ME, o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) throws IOException {
            e1();
            this.k.X(bArr, i, i2);
            this.j += i2;
        }

        @Override // o.ME
        public void Y1(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(1, 3);
            s(2, i);
            e(3, abstractC8616os);
            g2(1, 4);
        }

        @Override // o.ME
        public void c(int i, int i2) throws IOException {
            r2(14);
            n2(i, 5);
            k2(i2);
        }

        @Override // o.ME
        public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(i, 2);
            z1(abstractC8616os);
        }

        @Override // o.ME
        public void e1() throws IOException {
            if (this.i > 0) {
                q2();
            }
        }

        @Override // o.ME
        public void f2(String str) throws IOException {
            int length = str.length() * 3;
            int Z0 = ME.Z0(length);
            int i = Z0 + length;
            int i2 = this.h;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = BD2.i(str, bArr, 0, length);
                h2(i3);
                X(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.i) {
                q2();
            }
            int i4 = this.i;
            try {
                int Z02 = ME.Z0(str.length());
                if (Z02 == Z0) {
                    int i5 = i4 + Z02;
                    this.i = i5;
                    int i6 = BD2.i(str, this.g, i5, this.h - i5);
                    this.i = i4;
                    int i7 = (i6 - i4) - Z02;
                    o2(i7);
                    this.i = i6;
                    this.j += i7;
                    return;
                }
                int k = BD2.k(str);
                o2(k);
                this.i = BD2.i(str, this.g, this.i, k);
                this.j += k;
            } catch (IndexOutOfBoundsException e) {
                throw new f(e);
            } catch (BD2.d e2) {
                this.j -= this.i - i4;
                this.i = i4;
                g1(str, e2);
            }
        }

        @Override // o.ME
        public void g(int i, String str) throws IOException {
            g2(i, 2);
            f2(str);
        }

        @Override // o.ME
        public void g2(int i, int i2) throws IOException {
            h2(IM2.c(i, i2));
        }

        @Override // o.ME
        public void h(int i, long j) throws IOException {
            r2(20);
            n2(i, 0);
            p2(j);
        }

        @Override // o.ME
        public void h2(int i) throws IOException {
            r2(5);
            o2(i);
        }

        @Override // o.ME
        public void i2(long j) throws IOException {
            r2(10);
            p2(j);
        }

        @Override // o.ME
        public void l(int i, int i2) throws IOException {
            r2(20);
            n2(i, 0);
            m2(i2);
        }

        public final void q2() throws IOException {
            this.k.V(this.g, 0, this.i);
            this.i = 0;
        }

        public final void r2(int i) throws IOException {
            if (this.h - this.i < i) {
                q2();
            }
        }

        @Override // o.ME
        public void s(int i, int i2) throws IOException {
            r2(20);
            n2(i, 0);
            o2(i2);
        }

        @Override // o.ME
        public void u1(int i, byte[] bArr) throws IOException {
            v1(i, bArr, 0, bArr.length);
        }

        @Override // o.ME
        public void v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            g2(i, 2);
            x1(bArr, i2, i3);
        }

        @Override // o.ME
        public void x(int i, long j) throws IOException {
            r2(18);
            n2(i, 1);
            l2(j);
        }

        @Override // o.ME
        public void x1(byte[] bArr, int i, int i2) throws IOException {
            h2(i2);
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void y1(int i, ByteBuffer byteBuffer) throws IOException {
            g2(i, 2);
            h2(byteBuffer.capacity());
            S1(byteBuffer);
        }

        @Override // o.ME
        public void z1(AbstractC8616os abstractC8616os) throws IOException {
            h2(abstractC8616os.size());
            abstractC8616os.J0(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {
        public final ByteBuffer k;
        public int l;

        public e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.k = byteBuffer;
            this.l = byteBuffer.position();
        }

        @Override // o.ME.c, o.ME
        public void e1() {
            this.k.position(this.l + f1());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends IOException {
        public static final String X = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public f() {
            super(X);
        }

        public f(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public f(Throwable th) {
            super(X, th);
        }

        public f(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends b {
        public final OutputStream k;

        public g(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.k = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void q2() throws IOException {
            this.k.write(this.g, 0, this.i);
            this.i = 0;
        }

        private void r2(int i) throws IOException {
            if (this.h - this.i < i) {
                q2();
            }
        }

        @Override // o.ME
        public void C(int i, boolean z) throws IOException {
            r2(11);
            n2(i, 0);
            j2(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.ME
        public void C1(int i) throws IOException {
            r2(4);
            k2(i);
        }

        @Override // o.ME
        public void D1(long j) throws IOException {
            r2(8);
            l2(j);
        }

        @Override // o.ME
        public void J1(int i) throws IOException {
            if (i >= 0) {
                h2(i);
            } else {
                i2(i);
            }
        }

        @Override // o.ME
        public void L1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(i, 2);
            N1(interfaceC3540Li1);
        }

        @Override // o.ME
        public void M1(int i, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            g2(i, 2);
            O1(interfaceC3540Li1, interfaceC9026qY1);
        }

        @Override // o.ME
        public void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            h2(interfaceC3540Li1.N());
            interfaceC3540Li1.r0(this);
        }

        @Override // o.ME
        public void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public void P1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(1, 3);
            s(2, i);
            L1(3, interfaceC3540Li1);
            g2(1, 4);
        }

        @Override // o.ME
        public void S1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void T(byte b) throws IOException {
            if (this.i == this.h) {
                q2();
            }
            j2(b);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.h;
            int i2 = this.i;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.g, i2, remaining);
                this.i += remaining;
                this.j += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.g, i2, i3);
            int i4 = remaining - i3;
            this.i = this.h;
            this.j += i3;
            q2();
            while (true) {
                int i5 = this.h;
                if (i4 > i5) {
                    byteBuffer.get(this.g, 0, i5);
                    this.k.write(this.g, 0, this.h);
                    int i6 = this.h;
                    i4 -= i6;
                    this.j += i6;
                } else {
                    byteBuffer.get(this.g, 0, i4);
                    this.i = i4;
                    this.j += i4;
                    return;
                }
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.h;
            int i4 = this.i;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.g, i4, i2);
                this.i += i2;
                this.j += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.g, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.i = this.h;
            this.j += i5;
            q2();
            if (i7 <= this.h) {
                System.arraycopy(bArr, i6, this.g, 0, i7);
                this.i = i7;
            } else {
                this.k.write(bArr, i6, i7);
            }
            this.j += i7;
        }

        @Override // o.ME, o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) throws IOException {
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void Y1(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(1, 3);
            s(2, i);
            e(3, abstractC8616os);
            g2(1, 4);
        }

        @Override // o.ME
        public void c(int i, int i2) throws IOException {
            r2(14);
            n2(i, 5);
            k2(i2);
        }

        @Override // o.ME
        public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(i, 2);
            z1(abstractC8616os);
        }

        @Override // o.ME
        public void e1() throws IOException {
            if (this.i > 0) {
                q2();
            }
        }

        @Override // o.ME
        public void f2(String str) throws IOException {
            int k;
            try {
                int length = str.length() * 3;
                int Z0 = ME.Z0(length);
                int i = Z0 + length;
                int i2 = this.h;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int i3 = BD2.i(str, bArr, 0, length);
                    h2(i3);
                    X(bArr, 0, i3);
                    return;
                }
                if (i > i2 - this.i) {
                    q2();
                }
                int Z02 = ME.Z0(str.length());
                int i4 = this.i;
                try {
                    if (Z02 == Z0) {
                        int i5 = i4 + Z02;
                        this.i = i5;
                        int i6 = BD2.i(str, this.g, i5, this.h - i5);
                        this.i = i4;
                        k = (i6 - i4) - Z02;
                        o2(k);
                        this.i = i6;
                    } else {
                        k = BD2.k(str);
                        o2(k);
                        this.i = BD2.i(str, this.g, this.i, k);
                    }
                    this.j += k;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new f(e);
                } catch (BD2.d e2) {
                    this.j -= this.i - i4;
                    this.i = i4;
                    throw e2;
                }
            } catch (BD2.d e3) {
                g1(str, e3);
            }
        }

        @Override // o.ME
        public void g(int i, String str) throws IOException {
            g2(i, 2);
            f2(str);
        }

        @Override // o.ME
        public void g2(int i, int i2) throws IOException {
            h2(IM2.c(i, i2));
        }

        @Override // o.ME
        public void h(int i, long j) throws IOException {
            r2(20);
            n2(i, 0);
            p2(j);
        }

        @Override // o.ME
        public void h2(int i) throws IOException {
            r2(5);
            o2(i);
        }

        @Override // o.ME
        public void i2(long j) throws IOException {
            r2(10);
            p2(j);
        }

        @Override // o.ME
        public void l(int i, int i2) throws IOException {
            r2(20);
            n2(i, 0);
            m2(i2);
        }

        @Override // o.ME
        public void s(int i, int i2) throws IOException {
            r2(20);
            n2(i, 0);
            o2(i2);
        }

        @Override // o.ME
        public void u1(int i, byte[] bArr) throws IOException {
            v1(i, bArr, 0, bArr.length);
        }

        @Override // o.ME
        public void v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            g2(i, 2);
            x1(bArr, i2, i3);
        }

        @Override // o.ME
        public void x(int i, long j) throws IOException {
            r2(18);
            n2(i, 1);
            l2(j);
        }

        @Override // o.ME
        public void x1(byte[] bArr, int i, int i2) throws IOException {
            h2(i2);
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void y1(int i, ByteBuffer byteBuffer) throws IOException {
            g2(i, 2);
            h2(byteBuffer.capacity());
            S1(byteBuffer);
        }

        @Override // o.ME
        public void z1(AbstractC8616os abstractC8616os) throws IOException {
            h2(abstractC8616os.size());
            abstractC8616os.J0(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends ME {
        public final ByteBuffer g;
        public final ByteBuffer h;
        public final int i;

        public h(ByteBuffer byteBuffer) {
            super();
            this.g = byteBuffer;
            this.h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.i = byteBuffer.position();
        }

        @Override // o.ME
        public void C(int i, boolean z) throws IOException {
            g2(i, 0);
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.ME
        public void C1(int i) throws IOException {
            try {
                this.h.putInt(i);
            } catch (BufferOverflowException e) {
                throw new f(e);
            }
        }

        @Override // o.ME
        public void D1(long j) throws IOException {
            try {
                this.h.putLong(j);
            } catch (BufferOverflowException e) {
                throw new f(e);
            }
        }

        @Override // o.ME
        public void J1(int i) throws IOException {
            if (i >= 0) {
                h2(i);
            } else {
                i2(i);
            }
        }

        @Override // o.ME
        public void L1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(i, 2);
            N1(interfaceC3540Li1);
        }

        @Override // o.ME
        public void M1(int i, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            g2(i, 2);
            O1(interfaceC3540Li1, interfaceC9026qY1);
        }

        @Override // o.ME
        public void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            h2(interfaceC3540Li1.N());
            interfaceC3540Li1.r0(this);
        }

        @Override // o.ME
        public void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public void P1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(1, 3);
            s(2, i);
            L1(3, interfaceC3540Li1);
            g2(1, 4);
        }

        @Override // o.ME
        public void S1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void T(byte b) throws IOException {
            try {
                this.h.put(b);
            } catch (BufferOverflowException e) {
                throw new f(e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.h.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new f(e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.h.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new f(e);
            } catch (BufferOverflowException e2) {
                throw new f(e2);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) throws IOException {
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void Y1(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(1, 3);
            s(2, i);
            e(3, abstractC8616os);
            g2(1, 4);
        }

        @Override // o.ME
        public void c(int i, int i2) throws IOException {
            g2(i, 5);
            C1(i2);
        }

        @Override // o.ME
        public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(i, 2);
            z1(abstractC8616os);
        }

        @Override // o.ME
        public void e1() {
            this.g.position(this.h.position());
        }

        @Override // o.ME
        public int f1() {
            return this.h.position() - this.i;
        }

        @Override // o.ME
        public void f2(String str) throws IOException {
            int position = this.h.position();
            try {
                int Z0 = ME.Z0(str.length() * 3);
                int Z02 = ME.Z0(str.length());
                if (Z02 == Z0) {
                    int position2 = this.h.position() + Z02;
                    this.h.position(position2);
                    j2(str);
                    int position3 = this.h.position();
                    this.h.position(position);
                    h2(position3 - position2);
                    this.h.position(position3);
                    return;
                }
                h2(BD2.k(str));
                j2(str);
            } catch (BD2.d e) {
                this.h.position(position);
                g1(str, e);
            } catch (IllegalArgumentException e2) {
                throw new f(e2);
            }
        }

        @Override // o.ME
        public void g(int i, String str) throws IOException {
            g2(i, 2);
            f2(str);
        }

        @Override // o.ME
        public void g2(int i, int i2) throws IOException {
            h2(IM2.c(i, i2));
        }

        @Override // o.ME
        public void h(int i, long j) throws IOException {
            g2(i, 0);
            i2(j);
        }

        @Override // o.ME
        public void h2(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.h.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new f(e);
                }
            }
            this.h.put((byte) i);
        }

        @Override // o.ME
        public void i2(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.h.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new f(e);
                }
            }
            this.h.put((byte) j);
        }

        public final void j2(String str) throws IOException {
            try {
                BD2.j(str, this.h);
            } catch (IndexOutOfBoundsException e) {
                throw new f(e);
            }
        }

        @Override // o.ME
        public void l(int i, int i2) throws IOException {
            g2(i, 0);
            J1(i2);
        }

        @Override // o.ME
        public int r1() {
            return this.h.remaining();
        }

        @Override // o.ME
        public void s(int i, int i2) throws IOException {
            g2(i, 0);
            h2(i2);
        }

        @Override // o.ME
        public void u1(int i, byte[] bArr) throws IOException {
            v1(i, bArr, 0, bArr.length);
        }

        @Override // o.ME
        public void v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            g2(i, 2);
            x1(bArr, i2, i3);
        }

        @Override // o.ME
        public void x(int i, long j) throws IOException {
            g2(i, 1);
            D1(j);
        }

        @Override // o.ME
        public void x1(byte[] bArr, int i, int i2) throws IOException {
            h2(i2);
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void y1(int i, ByteBuffer byteBuffer) throws IOException {
            g2(i, 2);
            h2(byteBuffer.capacity());
            S1(byteBuffer);
        }

        @Override // o.ME
        public void z1(AbstractC8616os abstractC8616os) throws IOException {
            h2(abstractC8616os.size());
            abstractC8616os.J0(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends ME {
        public final ByteBuffer g;
        public final ByteBuffer h;
        public final long i;
        public final long j;
        public final long k;
        public final long l;
        public long m;

        public i(ByteBuffer byteBuffer) {
            super();
            this.g = byteBuffer;
            this.h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long i = TB2.i(byteBuffer);
            this.i = i;
            long position = byteBuffer.position() + i;
            this.j = position;
            long limit = i + byteBuffer.limit();
            this.k = limit;
            this.l = limit - 10;
            this.m = position;
        }

        public static boolean k2() {
            return TB2.T();
        }

        @Override // o.ME
        public void C(int i, boolean z) throws IOException {
            g2(i, 0);
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.ME
        public void C1(int i) throws IOException {
            this.h.putInt(j2(this.m), i);
            this.m += 4;
        }

        @Override // o.ME
        public void D1(long j) throws IOException {
            this.h.putLong(j2(this.m), j);
            this.m += 8;
        }

        @Override // o.ME
        public void J1(int i) throws IOException {
            if (i >= 0) {
                h2(i);
            } else {
                i2(i);
            }
        }

        @Override // o.ME
        public void L1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(i, 2);
            N1(interfaceC3540Li1);
        }

        @Override // o.ME
        public void M1(int i, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            g2(i, 2);
            O1(interfaceC3540Li1, interfaceC9026qY1);
        }

        @Override // o.ME
        public void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            h2(interfaceC3540Li1.N());
            interfaceC3540Li1.r0(this);
        }

        @Override // o.ME
        public void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public void P1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(1, 3);
            s(2, i);
            L1(3, interfaceC3540Li1);
            g2(1, 4);
        }

        @Override // o.ME
        public void S1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void T(byte b) throws IOException {
            long j = this.m;
            if (j < this.k) {
                this.m = 1 + j;
                TB2.b0(j, b);
                return;
            }
            throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.m), Long.valueOf(this.k), 1));
        }

        @Override // o.ME, o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                l2(this.m);
                this.h.put(byteBuffer);
                this.m += remaining;
            } catch (BufferOverflowException e) {
                throw new f(e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.m;
                if (this.k - j >= j2) {
                    TB2.o(bArr, i, j2, j);
                    this.m += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.m), Long.valueOf(this.k), Integer.valueOf(i2)));
        }

        @Override // o.ME, o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // o.ME, o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) throws IOException {
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void Y1(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(1, 3);
            s(2, i);
            e(3, abstractC8616os);
            g2(1, 4);
        }

        @Override // o.ME
        public void c(int i, int i2) throws IOException {
            g2(i, 5);
            C1(i2);
        }

        @Override // o.ME
        public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(i, 2);
            z1(abstractC8616os);
        }

        @Override // o.ME
        public void e1() {
            this.g.position(j2(this.m));
        }

        @Override // o.ME
        public int f1() {
            return (int) (this.m - this.j);
        }

        @Override // o.ME
        public void f2(String str) throws IOException {
            long j = this.m;
            try {
                int Z0 = ME.Z0(str.length() * 3);
                int Z02 = ME.Z0(str.length());
                if (Z02 == Z0) {
                    int j2 = j2(this.m) + Z02;
                    this.h.position(j2);
                    BD2.j(str, this.h);
                    int position = this.h.position() - j2;
                    h2(position);
                    this.m += position;
                    return;
                }
                int k = BD2.k(str);
                h2(k);
                l2(this.m);
                BD2.j(str, this.h);
                this.m += k;
            } catch (IllegalArgumentException e) {
                throw new f(e);
            } catch (IndexOutOfBoundsException e2) {
                throw new f(e2);
            } catch (BD2.d e3) {
                this.m = j;
                l2(j);
                g1(str, e3);
            }
        }

        @Override // o.ME
        public void g(int i, String str) throws IOException {
            g2(i, 2);
            f2(str);
        }

        @Override // o.ME
        public void g2(int i, int i2) throws IOException {
            h2(IM2.c(i, i2));
        }

        @Override // o.ME
        public void h(int i, long j) throws IOException {
            g2(i, 0);
            i2(j);
        }

        @Override // o.ME
        public void h2(int i) throws IOException {
            if (this.m <= this.l) {
                while ((i & (-128)) != 0) {
                    long j = this.m;
                    this.m = j + 1;
                    TB2.b0(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.m;
                this.m = 1 + j2;
                TB2.b0(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.m;
                if (j3 < this.k) {
                    if ((i & (-128)) == 0) {
                        this.m = 1 + j3;
                        TB2.b0(j3, (byte) i);
                        return;
                    }
                    this.m = j3 + 1;
                    TB2.b0(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                } else {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.m), Long.valueOf(this.k), 1));
                }
            }
        }

        @Override // o.ME
        public void i2(long j) throws IOException {
            if (this.m <= this.l) {
                while ((j & (-128)) != 0) {
                    long j2 = this.m;
                    this.m = j2 + 1;
                    TB2.b0(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.m;
                this.m = 1 + j3;
                TB2.b0(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.m;
                if (j4 < this.k) {
                    if ((j & (-128)) == 0) {
                        this.m = 1 + j4;
                        TB2.b0(j4, (byte) j);
                        return;
                    }
                    this.m = j4 + 1;
                    TB2.b0(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } else {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.m), Long.valueOf(this.k), 1));
                }
            }
        }

        public final int j2(long j) {
            return (int) (j - this.i);
        }

        @Override // o.ME
        public void l(int i, int i2) throws IOException {
            g2(i, 0);
            J1(i2);
        }

        public final void l2(long j) {
            this.h.position(j2(j));
        }

        @Override // o.ME
        public int r1() {
            return (int) (this.k - this.m);
        }

        @Override // o.ME
        public void s(int i, int i2) throws IOException {
            g2(i, 0);
            h2(i2);
        }

        @Override // o.ME
        public void u1(int i, byte[] bArr) throws IOException {
            v1(i, bArr, 0, bArr.length);
        }

        @Override // o.ME
        public void v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            g2(i, 2);
            x1(bArr, i2, i3);
        }

        @Override // o.ME
        public void x(int i, long j) throws IOException {
            g2(i, 1);
            D1(j);
        }

        @Override // o.ME
        public void x1(byte[] bArr, int i, int i2) throws IOException {
            h2(i2);
            V(bArr, i, i2);
        }

        @Override // o.ME
        public void y1(int i, ByteBuffer byteBuffer) throws IOException {
            g2(i, 2);
            h2(byteBuffer.capacity());
            S1(byteBuffer);
        }

        @Override // o.ME
        public void z1(AbstractC8616os abstractC8616os) throws IOException {
            h2(abstractC8616os.size());
            abstractC8616os.J0(this);
        }
    }

    public static int A0(int i2, PY0 py0) {
        return (X0(1) * 2) + Y0(2, i2) + B0(3, py0);
    }

    public static int B0(int i2, PY0 py0) {
        return X0(i2) + C0(py0);
    }

    public static int C0(PY0 py0) {
        return D0(py0.f());
    }

    public static int D0(int i2) {
        return Z0(i2) + i2;
    }

    public static int E0(int i2, InterfaceC3540Li1 interfaceC3540Li1) {
        return (X0(1) * 2) + Y0(2, i2) + F0(3, interfaceC3540Li1);
    }

    public static int F0(int i2, InterfaceC3540Li1 interfaceC3540Li1) {
        return X0(i2) + H0(interfaceC3540Li1);
    }

    public static int G0(int i2, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) {
        return X0(i2) + I0(interfaceC3540Li1, interfaceC9026qY1);
    }

    public static int H0(InterfaceC3540Li1 interfaceC3540Li1) {
        return D0(interfaceC3540Li1.N());
    }

    public static int I0(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) {
        return D0(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
    }

    public static int J0(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int K0(int i2, AbstractC8616os abstractC8616os) {
        return (X0(1) * 2) + Y0(2, i2) + g0(3, abstractC8616os);
    }

    @Deprecated
    public static int L0(int i2) {
        return Z0(i2);
    }

    @Deprecated
    public static int M0(long j) {
        return b1(j);
    }

    public static int N0(int i2, int i3) {
        return X0(i2) + O0(i3);
    }

    public static int O0(int i2) {
        return 4;
    }

    public static int P0(int i2, long j) {
        return X0(i2) + Q0(j);
    }

    public static int Q0(long j) {
        return 8;
    }

    public static int R0(int i2, int i3) {
        return X0(i2) + S0(i3);
    }

    public static int S0(int i2) {
        return Z0(c1(i2));
    }

    public static int T0(int i2, long j) {
        return X0(i2) + U0(j);
    }

    public static int U0(long j) {
        return b1(d1(j));
    }

    public static int V0(int i2, String str) {
        return X0(i2) + W0(str);
    }

    public static int W0(String str) {
        int length;
        try {
            length = BD2.k(str);
        } catch (BD2.d unused) {
            length = str.getBytes(C9740tS0.a).length;
        }
        return D0(length);
    }

    public static int X0(int i2) {
        return Z0(IM2.c(i2, 0));
    }

    public static int Y0(int i2, int i3) {
        return X0(i2) + Z0(i3);
    }

    public static int Z0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        if ((i2 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int a0(int i2, boolean z) {
        return X0(i2) + b0(z);
    }

    public static int a1(int i2, long j) {
        return X0(i2) + b1(j);
    }

    public static int b0(boolean z) {
        return 1;
    }

    public static int b1(long j) {
        int i2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((ExecutorC9488sQ.s1 & j) != 0) {
            i2 += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i2 + 1;
        }
        return i2;
    }

    public static int c0(int i2, byte[] bArr) {
        return X0(i2) + d0(bArr);
    }

    public static int c1(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int d0(byte[] bArr) {
        return D0(bArr.length);
    }

    public static long d1(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int e0(int i2, ByteBuffer byteBuffer) {
        return X0(i2) + f0(byteBuffer);
    }

    public static int f0(ByteBuffer byteBuffer) {
        return D0(byteBuffer.capacity());
    }

    public static int g0(int i2, AbstractC8616os abstractC8616os) {
        return X0(i2) + h0(abstractC8616os);
    }

    public static int h0(AbstractC8616os abstractC8616os) {
        return D0(abstractC8616os.size());
    }

    public static int i0(int i2, double d2) {
        return X0(i2) + j0(d2);
    }

    public static ME i1(OutputStream outputStream) {
        return j1(outputStream, 4096);
    }

    public static int j0(double d2) {
        return 8;
    }

    public static ME j1(OutputStream outputStream, int i2) {
        return new g(outputStream, i2);
    }

    public static int k0(int i2, int i3) {
        return X0(i2) + l0(i3);
    }

    public static ME k1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (i.k2()) {
                return q1(byteBuffer);
            }
            return p1(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static int l0(int i2) {
        return x0(i2);
    }

    @Deprecated
    public static ME l1(ByteBuffer byteBuffer, int i2) {
        return k1(byteBuffer);
    }

    public static int m0(int i2, int i3) {
        return X0(i2) + n0(i3);
    }

    public static ME m1(AbstractC6898hs abstractC6898hs, int i2) {
        if (i2 >= 0) {
            return new d(abstractC6898hs, i2);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int n0(int i2) {
        return 4;
    }

    public static ME n1(byte[] bArr) {
        return o1(bArr, 0, bArr.length);
    }

    public static int o0(int i2, long j) {
        return X0(i2) + p0(j);
    }

    public static ME o1(byte[] bArr, int i2, int i3) {
        return new c(bArr, i2, i3);
    }

    public static int p0(long j) {
        return 8;
    }

    public static ME p1(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static int q0(int i2, float f2) {
        return X0(i2) + r0(f2);
    }

    public static ME q1(ByteBuffer byteBuffer) {
        return new i(byteBuffer);
    }

    public static int r0(float f2) {
        return 4;
    }

    @Deprecated
    public static int s0(int i2, InterfaceC3540Li1 interfaceC3540Li1) {
        return (X0(i2) * 2) + u0(interfaceC3540Li1);
    }

    @Deprecated
    public static int t0(int i2, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) {
        return (X0(i2) * 2) + v0(interfaceC3540Li1, interfaceC9026qY1);
    }

    @Deprecated
    public static int u0(InterfaceC3540Li1 interfaceC3540Li1) {
        return interfaceC3540Li1.N();
    }

    @Deprecated
    public static int v0(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) {
        return ((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1);
    }

    public static int w0(int i2, int i3) {
        return X0(i2) + x0(i3);
    }

    public static int x0(int i2) {
        if (i2 >= 0) {
            return Z0(i2);
        }
        return 10;
    }

    public static int y0(int i2, long j) {
        return X0(i2) + z0(j);
    }

    public static int z0(long j) {
        return b1(j);
    }

    public final void A1(double d2) throws IOException {
        D1(Double.doubleToRawLongBits(d2));
    }

    public final void B(int i2, long j) throws IOException {
        h(i2, j);
    }

    public final void B1(int i2) throws IOException {
        J1(i2);
    }

    public abstract void C(int i2, boolean z) throws IOException;

    public abstract void C1(int i2) throws IOException;

    public abstract void D1(long j) throws IOException;

    public final void E(int i2, int i3) throws IOException {
        c(i2, i3);
    }

    public final void E1(float f2) throws IOException {
        C1(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void F1(int i2, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
        g2(i2, 3);
        H1(interfaceC3540Li1);
        g2(i2, 4);
    }

    @Deprecated
    public final void G1(int i2, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        g2(i2, 3);
        I1(interfaceC3540Li1, interfaceC9026qY1);
        g2(i2, 4);
    }

    @Deprecated
    public final void H1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
        interfaceC3540Li1.r0(this);
    }

    @Deprecated
    public final void I1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        interfaceC9026qY1.f(interfaceC3540Li1, this.a);
    }

    public abstract void J1(int i2) throws IOException;

    public final void K1(long j) throws IOException {
        i2(j);
    }

    public final void L(int i2, float f2) throws IOException {
        c(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void L1(int i2, InterfaceC3540Li1 interfaceC3540Li1) throws IOException;

    public abstract void M1(int i2, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    public abstract void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException;

    public final void O(int i2, int i3) throws IOException {
        l(i2, i3);
    }

    public abstract void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException;

    public abstract void P1(int i2, InterfaceC3540Li1 interfaceC3540Li1) throws IOException;

    public final void Q1(byte b2) throws IOException {
        T(b2);
    }

    public final void R(int i2, int i3) throws IOException {
        s(i2, c1(i3));
    }

    public final void R1(int i2) throws IOException {
        T((byte) i2);
    }

    public abstract void S1(ByteBuffer byteBuffer) throws IOException;

    @Override // o.AbstractC6898hs
    public abstract void T(byte b2) throws IOException;

    public final void T1(AbstractC8616os abstractC8616os) throws IOException {
        abstractC8616os.J0(this);
    }

    @Override // o.AbstractC6898hs
    public abstract void U(ByteBuffer byteBuffer) throws IOException;

    public final void U1(byte[] bArr) throws IOException {
        V(bArr, 0, bArr.length);
    }

    @Override // o.AbstractC6898hs
    public abstract void V(byte[] bArr, int i2, int i3) throws IOException;

    public final void V1(byte[] bArr, int i2, int i3) throws IOException {
        V(bArr, i2, i3);
    }

    @Override // o.AbstractC6898hs
    public abstract void W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    public final void W1(int i2) throws IOException {
        C1(i2);
    }

    @Override // o.AbstractC6898hs
    public abstract void X(byte[] bArr, int i2, int i3) throws IOException;

    @Deprecated
    public final void X1(long j) throws IOException {
        D1(j);
    }

    public abstract void Y1(int i2, AbstractC8616os abstractC8616os) throws IOException;

    public final void Z() {
        if (r1() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    @Deprecated
    public final void Z1(int i2) throws IOException {
        h2(i2);
    }

    @Deprecated
    public final void a2(long j) throws IOException {
        i2(j);
    }

    public final void b2(int i2) throws IOException {
        C1(i2);
    }

    public abstract void c(int i2, int i3) throws IOException;

    public final void c2(long j) throws IOException {
        D1(j);
    }

    public final void d2(int i2) throws IOException {
        h2(c1(i2));
    }

    public abstract void e(int i2, AbstractC8616os abstractC8616os) throws IOException;

    public abstract void e1() throws IOException;

    public final void e2(long j) throws IOException {
        i2(d1(j));
    }

    public abstract int f1();

    public abstract void f2(String str) throws IOException;

    public abstract void g(int i2, String str) throws IOException;

    public final void g1(String str, BD2.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C9740tS0.a);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new f(e2);
        } catch (f e3) {
            throw e3;
        }
    }

    public abstract void g2(int i2, int i3) throws IOException;

    public abstract void h(int i2, long j) throws IOException;

    public boolean h1() {
        return this.b;
    }

    public abstract void h2(int i2) throws IOException;

    public abstract void i2(long j) throws IOException;

    public abstract void l(int i2, int i3) throws IOException;

    public final void m(int i2, long j) throws IOException {
        x(i2, j);
    }

    public final void q(int i2, long j) throws IOException {
        h(i2, d1(j));
    }

    public abstract int r1();

    public abstract void s(int i2, int i3) throws IOException;

    public void s1() {
        this.b = true;
    }

    public final void t1(boolean z) throws IOException {
        T(z ? (byte) 1 : (byte) 0);
    }

    public final void u(int i2, double d2) throws IOException {
        x(i2, Double.doubleToRawLongBits(d2));
    }

    public abstract void u1(int i2, byte[] bArr) throws IOException;

    public abstract void v1(int i2, byte[] bArr, int i3, int i4) throws IOException;

    public final void w1(byte[] bArr) throws IOException {
        x1(bArr, 0, bArr.length);
    }

    public abstract void x(int i2, long j) throws IOException;

    public abstract void x1(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void y1(int i2, ByteBuffer byteBuffer) throws IOException;

    public abstract void z1(AbstractC8616os abstractC8616os) throws IOException;

    public ME() {
    }

    /* loaded from: classes.dex */
    public static class c extends ME {
        public final byte[] g;
        public final int h;
        public final int i;
        public int j;

        public c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.g = bArr;
                    this.h = i;
                    this.j = i;
                    this.i = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException(H.a.b);
        }

        @Override // o.ME
        public final void C(int i, boolean z) throws IOException {
            g2(i, 0);
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.ME
        public final void C1(int i) throws IOException {
            try {
                byte[] bArr = this.g;
                int i2 = this.j;
                int i3 = i2 + 1;
                this.j = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.j = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.j = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.j = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // o.ME
        public final void D1(long j) throws IOException {
            try {
                byte[] bArr = this.g;
                int i = this.j;
                int i2 = i + 1;
                this.j = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.j = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.j = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.j = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.j = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.j = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.j = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.j = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // o.ME
        public final void J1(int i) throws IOException {
            if (i >= 0) {
                h2(i);
            } else {
                i2(i);
            }
        }

        @Override // o.ME
        public final void L1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(i, 2);
            N1(interfaceC3540Li1);
        }

        @Override // o.ME
        public final void M1(int i, InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            g2(i, 2);
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public final void N1(InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            h2(interfaceC3540Li1.N());
            interfaceC3540Li1.r0(this);
        }

        @Override // o.ME
        public final void O1(InterfaceC3540Li1 interfaceC3540Li1, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            h2(((AbstractC5713d2) interfaceC3540Li1).E0(interfaceC9026qY1));
            interfaceC9026qY1.f(interfaceC3540Li1, this.a);
        }

        @Override // o.ME
        public final void P1(int i, InterfaceC3540Li1 interfaceC3540Li1) throws IOException {
            g2(1, 3);
            s(2, i);
            L1(3, interfaceC3540Li1);
            g2(1, 4);
        }

        @Override // o.ME
        public final void S1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            U(duplicate);
        }

        @Override // o.ME, o.AbstractC6898hs
        public final void T(byte b) throws IOException {
            try {
                byte[] bArr = this.g;
                int i = this.j;
                this.j = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public final void U(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.g, this.j, remaining);
                this.j += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(remaining)), e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public final void V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.g, this.j, i2);
                this.j += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(i2)), e);
            }
        }

        @Override // o.ME, o.AbstractC6898hs
        public final void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // o.ME, o.AbstractC6898hs
        public final void X(byte[] bArr, int i, int i2) throws IOException {
            V(bArr, i, i2);
        }

        @Override // o.ME
        public final void Y1(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(1, 3);
            s(2, i);
            e(3, abstractC8616os);
            g2(1, 4);
        }

        @Override // o.ME
        public final void c(int i, int i2) throws IOException {
            g2(i, 5);
            C1(i2);
        }

        @Override // o.ME
        public final void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            g2(i, 2);
            z1(abstractC8616os);
        }

        @Override // o.ME
        public final int f1() {
            return this.j - this.h;
        }

        @Override // o.ME
        public final void f2(String str) throws IOException {
            int i = this.j;
            try {
                int Z0 = ME.Z0(str.length() * 3);
                int Z02 = ME.Z0(str.length());
                if (Z02 == Z0) {
                    int i2 = i + Z02;
                    this.j = i2;
                    int i3 = BD2.i(str, this.g, i2, r1());
                    this.j = i;
                    h2((i3 - i) - Z02);
                    this.j = i3;
                    return;
                }
                h2(BD2.k(str));
                this.j = BD2.i(str, this.g, this.j, r1());
            } catch (IndexOutOfBoundsException e) {
                throw new f(e);
            } catch (BD2.d e2) {
                this.j = i;
                g1(str, e2);
            }
        }

        @Override // o.ME
        public final void g(int i, String str) throws IOException {
            g2(i, 2);
            f2(str);
        }

        @Override // o.ME
        public final void g2(int i, int i2) throws IOException {
            h2(IM2.c(i, i2));
        }

        @Override // o.ME
        public final void h(int i, long j) throws IOException {
            g2(i, 0);
            i2(j);
        }

        @Override // o.ME
        public final void h2(int i) throws IOException {
            if (ME.d && !T8.c() && r1() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.g;
                    int i2 = this.j;
                    this.j = i2 + 1;
                    TB2.d0(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.g;
                int i3 = this.j;
                this.j = i3 + 1;
                TB2.d0(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.g;
                    int i5 = this.j;
                    this.j = i5 + 1;
                    TB2.d0(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.g;
                int i6 = this.j;
                this.j = i6 + 1;
                TB2.d0(bArr4, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.g;
                    int i8 = this.j;
                    this.j = i8 + 1;
                    TB2.d0(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.g;
                int i9 = this.j;
                this.j = i9 + 1;
                TB2.d0(bArr6, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.g;
                    int i11 = this.j;
                    this.j = i11 + 1;
                    TB2.d0(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.g;
                int i12 = this.j;
                this.j = i12 + 1;
                TB2.d0(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.g;
                int i13 = this.j;
                this.j = i13 + 1;
                TB2.d0(bArr9, i13, (byte) (i >>> 28));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.g;
                    int i14 = this.j;
                    this.j = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
                }
            }
            byte[] bArr11 = this.g;
            int i15 = this.j;
            this.j = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // o.ME
        public final void i2(long j) throws IOException {
            if (ME.d && r1() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.g;
                    int i = this.j;
                    this.j = i + 1;
                    TB2.d0(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.g;
                int i2 = this.j;
                this.j = i2 + 1;
                TB2.d0(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.g;
                    int i3 = this.j;
                    this.j = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
                }
            }
            byte[] bArr4 = this.g;
            int i4 = this.j;
            this.j = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // o.ME
        public final void l(int i, int i2) throws IOException {
            g2(i, 0);
            J1(i2);
        }

        @Override // o.ME
        public final int r1() {
            return this.i - this.j;
        }

        @Override // o.ME
        public final void s(int i, int i2) throws IOException {
            g2(i, 0);
            h2(i2);
        }

        @Override // o.ME
        public final void u1(int i, byte[] bArr) throws IOException {
            v1(i, bArr, 0, bArr.length);
        }

        @Override // o.ME
        public final void v1(int i, byte[] bArr, int i2, int i3) throws IOException {
            g2(i, 2);
            x1(bArr, i2, i3);
        }

        @Override // o.ME
        public final void x(int i, long j) throws IOException {
            g2(i, 1);
            D1(j);
        }

        @Override // o.ME
        public final void x1(byte[] bArr, int i, int i2) throws IOException {
            h2(i2);
            V(bArr, i, i2);
        }

        @Override // o.ME
        public final void y1(int i, ByteBuffer byteBuffer) throws IOException {
            g2(i, 2);
            h2(byteBuffer.capacity());
            S1(byteBuffer);
        }

        @Override // o.ME
        public final void z1(AbstractC8616os abstractC8616os) throws IOException {
            h2(abstractC8616os.size());
            abstractC8616os.J0(this);
        }

        @Override // o.ME
        public void e1() {
        }
    }
}
