package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import o.BD2;
import o.C9740tS0;
import o.IM2;
import o.NN2;
import o.O71;

/* renamed from: o.sn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9574sn extends AbstractC6898hs implements NN2 {
    public static final int e = 4096;
    public static final int f = 1;
    public static final int g = 2;
    public final AbstractC6149eq a;
    public final int b;
    public final ArrayDeque<AbstractC10391w8> c;
    public int d;

    /* renamed from: o.sn$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.e1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[IM2.b.Y0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[IM2.b.Z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[IM2.b.h1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[IM2.b.i1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: o.sn$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC9574sn {
        public ByteBuffer h;
        public int i;
        public int j;

        public b(AbstractC6149eq abstractC6149eq, int i) {
            super(abstractC6149eq, i, null);
            Z0();
        }

        private int Y0() {
            return this.i - this.j;
        }

        private int c1() {
            return this.j + 1;
        }

        @Override // o.NN2
        public void A(int i, Object obj) throws IOException {
            int c0 = c0();
            XJ1.a().k(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.AbstractC9574sn
        public void A0(long j) {
            int i = this.j;
            this.j = i - 8;
            this.h.putLong(i - 7, j);
        }

        @Override // o.NN2
        public void C(int i, boolean z) {
            r0(6);
            T(z ? (byte) 1 : (byte) 0);
            R0(i, 0);
        }

        @Override // o.NN2
        public void F(int i) {
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void F0(int i) {
            if (i >= 0) {
                W0(i);
            } else {
                X0(i);
            }
        }

        @Override // o.NN2
        public void J(int i, Object obj) throws IOException {
            R0(i, 4);
            XJ1.a().k(obj, this);
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void K0(int i) {
            W0(ME.c1(i));
        }

        @Override // o.NN2
        public void M(int i) {
            R0(i, 4);
        }

        @Override // o.AbstractC9574sn
        public void N0(long j) {
            X0(ME.d1(j));
        }

        @Override // o.AbstractC9574sn
        public void Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.j -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.h.put(this.j + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.j--;
                return;
            }
            this.j += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.j) >= 0) {
                    ByteBuffer byteBuffer = this.h;
                    this.j = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.j) > 0) {
                    ByteBuffer byteBuffer2 = this.h;
                    this.j = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.h;
                    int i4 = this.j;
                    this.j = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.j) > 1) {
                    ByteBuffer byteBuffer4 = this.h;
                    this.j = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.h;
                    int i5 = this.j;
                    this.j = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.h;
                    int i6 = this.j;
                    this.j = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1));
                } else if (this.j > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.h;
                            int i7 = this.j;
                            this.j = i7 - 1;
                            byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.h;
                            int i8 = this.j;
                            this.j = i8 - 1;
                            byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.h;
                            int i9 = this.j;
                            this.j = i9 - 1;
                            byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.h;
                            int i10 = this.j;
                            this.j = i10 - 1;
                            byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new BD2.d(length - 1, length);
                } else {
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // o.NN2
        public void R(int i, int i2) {
            r0(10);
            K0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void R0(int i, int i2) {
            W0(IM2.c(i, i2));
        }

        @Override // o.AbstractC6898hs
        public void T(byte b) {
            ByteBuffer byteBuffer = this.h;
            int i = this.j;
            this.j = i - 1;
            byteBuffer.put(i, b);
        }

        @Override // o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                a1(remaining);
            }
            int i = this.j - remaining;
            this.j = i;
            this.h.position(i + 1);
            this.h.put(byteBuffer);
        }

        @Override // o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) {
            if (c1() < i2) {
                a1(i2);
            }
            int i3 = this.j - i2;
            this.j = i3;
            this.h.position(i3 + 1);
            this.h.put(bArr, i, i2);
        }

        @Override // o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                this.d += remaining;
                this.c.addFirst(AbstractC10391w8.j(byteBuffer));
                Z0();
                return;
            }
            int i = this.j - remaining;
            this.j = i;
            this.h.position(i + 1);
            this.h.put(byteBuffer);
        }

        @Override // o.AbstractC9574sn
        public void W0(int i) {
            if ((i & (-128)) == 0) {
                f1(i);
            } else if ((i & (-16384)) == 0) {
                h1(i);
            } else if (((-2097152) & i) == 0) {
                g1(i);
            } else if (((-268435456) & i) == 0) {
                e1(i);
            } else {
                d1(i);
            }
        }

        @Override // o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) {
            if (c1() < i2) {
                this.d += i2;
                this.c.addFirst(AbstractC10391w8.l(bArr, i, i2));
                Z0();
                return;
            }
            int i3 = this.j - i2;
            this.j = i3;
            this.h.position(i3 + 1);
            this.h.put(bArr, i, i2);
        }

        @Override // o.AbstractC9574sn
        public void X0(long j) {
            switch (AbstractC9574sn.a0(j)) {
                case 1:
                    n1(j);
                    return;
                case 2:
                    s1(j);
                    return;
                case 3:
                    r1(j);
                    return;
                case 4:
                    l1(j);
                    return;
                case 5:
                    k1(j);
                    return;
                case 6:
                    p1(j);
                    return;
                case 7:
                    o1(j);
                    return;
                case 8:
                    i1(j);
                    return;
                case 9:
                    m1(j);
                    return;
                case 10:
                    q1(j);
                    return;
                default:
                    return;
            }
        }

        public final void Z0() {
            b1(f0());
        }

        public final void a1(int i) {
            b1(g0(i));
        }

        @Override // o.AbstractC9574sn
        public void b0() {
            if (this.h != null) {
                this.d += Y0();
                this.h.position(this.j + 1);
                this.h = null;
                this.j = 0;
                this.i = 0;
            }
        }

        public final void b1(AbstractC10391w8 abstractC10391w8) {
            if (abstractC10391w8.d()) {
                ByteBuffer f = abstractC10391w8.f();
                if (f.isDirect()) {
                    b0();
                    this.c.addFirst(abstractC10391w8);
                    this.h = f;
                    f.limit(f.capacity());
                    this.h.position(0);
                    this.h.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.h.limit() - 1;
                    this.i = limit;
                    this.j = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // o.NN2
        public void c(int i, int i2) {
            r0(9);
            x0(i2);
            R0(i, 5);
        }

        @Override // o.AbstractC9574sn
        public int c0() {
            return this.d + Y0();
        }

        public final void d1(int i) {
            ByteBuffer byteBuffer = this.h;
            int i2 = this.j;
            this.j = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.j;
            this.j = i3 - 4;
            this.h.putInt(i3 - 3, (i & 127) | 128 | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | ((((i >>> 7) & 127) | 128) << 8));
        }

        @Override // o.NN2
        public void e(int i, AbstractC8616os abstractC8616os) {
            try {
                abstractC8616os.L0(this);
                r0(10);
                W0(abstractC8616os.size());
                R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public final void e1(int i) {
            int i2 = this.j;
            this.j = i2 - 4;
            this.h.putInt(i2 - 3, (i & 127) | 128 | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (((i & 16256) | 16384) << 1));
        }

        public final void f1(int i) {
            ByteBuffer byteBuffer = this.h;
            int i2 = this.j;
            this.j = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        @Override // o.NN2
        public void g(int i, String str) {
            int c0 = c0();
            Q0(str);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        public final void g1(int i) {
            int i2 = this.j - 3;
            this.j = i2;
            this.h.putInt(i2, (((i & 127) | 128) << 8) | ((2080768 & i) << 10) | (((i & 16256) | 16384) << 9));
        }

        @Override // o.NN2
        public void h(int i, long j) {
            r0(15);
            X0(j);
            R0(i, 0);
        }

        public final void h1(int i) {
            int i2 = this.j;
            this.j = i2 - 2;
            this.h.putShort(i2 - 1, (short) ((i & 127) | 128 | ((i & 16256) << 1)));
        }

        @Override // o.NN2
        public void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            int c0 = c0();
            interfaceC9026qY1.f(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        public final void i1(long j) {
            int i = this.j;
            this.j = i - 8;
            this.h.putLong(i - 7, (j & 127) | 128 | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        public final void j1(long j) {
            int i = this.j;
            this.j = i - 8;
            this.h.putLong(i - 7, (j & 127) | 128 | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (((16256 & j) | 16384) << 1));
        }

        public final void k1(long j) {
            int i = this.j;
            this.j = i - 5;
            this.h.putLong(i - 7, (((j & 127) | 128) << 24) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((16256 & j) | 16384) << 25));
        }

        @Override // o.NN2
        public void l(int i, int i2) {
            r0(15);
            F0(i2);
            R0(i, 0);
        }

        public final void l1(long j) {
            e1((int) j);
        }

        public final void m1(long j) {
            ByteBuffer byteBuffer = this.h;
            int i = this.j;
            this.j = i - 1;
            byteBuffer.put(i, (byte) (j >>> 56));
            j1(j & 72057594037927935L);
        }

        public final void n1(long j) {
            f1((int) j);
        }

        public final void o1(long j) {
            int i = this.j - 7;
            this.j = i;
            this.h.putLong(i, (((j & 127) | 128) << 8) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((16256 & j) | 16384) << 9));
        }

        public final void p1(long j) {
            int i = this.j;
            this.j = i - 6;
            this.h.putLong(i - 7, (((j & 127) | 128) << 16) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((16256 & j) | 16384) << 17));
        }

        @Override // o.NN2
        public void q(int i, long j) {
            r0(15);
            N0(j);
            R0(i, 0);
        }

        public final void q1(long j) {
            ByteBuffer byteBuffer = this.h;
            int i = this.j;
            this.j = i - 1;
            byteBuffer.put(i, (byte) (j >>> 63));
            ByteBuffer byteBuffer2 = this.h;
            int i2 = this.j;
            this.j = i2 - 1;
            byteBuffer2.put(i2, (byte) (((j >>> 56) & 127) | 128));
            j1(j & 72057594037927935L);
        }

        @Override // o.AbstractC9574sn
        public void r0(int i) {
            if (c1() < i) {
                a1(i);
            }
        }

        public final void r1(long j) {
            g1((int) j);
        }

        @Override // o.NN2
        public void s(int i, int i2) {
            r0(10);
            W0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void s0(boolean z) {
            T(z ? (byte) 1 : (byte) 0);
        }

        public final void s1(long j) {
            h1((int) j);
        }

        @Override // o.NN2
        public void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            R0(i, 4);
            interfaceC9026qY1.f(obj, this);
            R0(i, 3);
        }

        @Override // o.NN2
        public void x(int i, long j) {
            r0(13);
            A0(j);
            R0(i, 1);
        }

        @Override // o.AbstractC9574sn
        public void x0(int i) {
            int i2 = this.j;
            this.j = i2 - 4;
            this.h.putInt(i2 - 3, i);
        }
    }

    /* renamed from: o.sn$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC9574sn {
        public AbstractC10391w8 h;
        public byte[] i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        public c(AbstractC6149eq abstractC6149eq, int i) {
            super(abstractC6149eq, i, null);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int i) {
            b1(k0(i));
        }

        private void b1(AbstractC10391w8 abstractC10391w8) {
            if (abstractC10391w8.c()) {
                b0();
                this.c.addFirst(abstractC10391w8);
                this.h = abstractC10391w8;
                this.i = abstractC10391w8.a();
                int b = abstractC10391w8.b();
                this.k = abstractC10391w8.e() + b;
                int g = b + abstractC10391w8.g();
                this.j = g;
                this.l = g - 1;
                int i = this.k - 1;
                this.m = i;
                this.n = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void d1(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            int i3 = i2 - 1;
            this.n = i3;
            bArr[i2] = (byte) (i >>> 28);
            int i4 = i2 - 2;
            this.n = i4;
            bArr[i3] = (byte) (((i >>> 21) & 127) | 128);
            int i5 = i2 - 3;
            this.n = i5;
            bArr[i4] = (byte) (((i >>> 14) & 127) | 128);
            int i6 = i2 - 4;
            this.n = i6;
            bArr[i5] = (byte) (((i >>> 7) & 127) | 128);
            this.n = i2 - 5;
            bArr[i6] = (byte) ((i & 127) | 128);
        }

        private void e1(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            int i3 = i2 - 1;
            this.n = i3;
            bArr[i2] = (byte) (i >>> 21);
            int i4 = i2 - 2;
            this.n = i4;
            bArr[i3] = (byte) (((i >>> 14) & 127) | 128);
            int i5 = i2 - 3;
            this.n = i5;
            bArr[i4] = (byte) (((i >>> 7) & 127) | 128);
            this.n = i2 - 4;
            bArr[i5] = (byte) ((i & 127) | 128);
        }

        private void f1(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            this.n = i2 - 1;
            bArr[i2] = (byte) i;
        }

        private void g1(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            int i3 = i2 - 1;
            this.n = i3;
            bArr[i2] = (byte) (i >>> 14);
            int i4 = i2 - 2;
            this.n = i4;
            bArr[i3] = (byte) (((i >>> 7) & 127) | 128);
            this.n = i2 - 3;
            bArr[i4] = (byte) ((i & 127) | 128);
        }

        private void h1(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            int i3 = i2 - 1;
            this.n = i3;
            bArr[i2] = (byte) (i >>> 7);
            this.n = i2 - 2;
            bArr[i3] = (byte) ((i & 127) | 128);
        }

        private void i1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 49);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 42) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 35) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 28) & 127) | 128);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((j >>> 21) & 127) | 128);
            int i7 = i - 6;
            this.n = i7;
            bArr[i6] = (byte) (((j >>> 14) & 127) | 128);
            int i8 = i - 7;
            this.n = i8;
            bArr[i7] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 8;
            bArr[i8] = (byte) ((j & 127) | 128);
        }

        private void j1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 28);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 21) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 14) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 5;
            bArr[i5] = (byte) ((j & 127) | 128);
        }

        private void k1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 21);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 14) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 4;
            bArr[i4] = (byte) ((j & 127) | 128);
        }

        private void l1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 56);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 49) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 42) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 35) & 127) | 128);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((j >>> 28) & 127) | 128);
            int i7 = i - 6;
            this.n = i7;
            bArr[i6] = (byte) (((j >>> 21) & 127) | 128);
            int i8 = i - 7;
            this.n = i8;
            bArr[i7] = (byte) (((j >>> 14) & 127) | 128);
            int i9 = i - 8;
            this.n = i9;
            bArr[i8] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 9;
            bArr[i9] = (byte) ((j & 127) | 128);
        }

        private void m1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            this.n = i - 1;
            bArr[i] = (byte) j;
        }

        private void n1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 42);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 35) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 28) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 21) & 127) | 128);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((j >>> 14) & 127) | 128);
            int i7 = i - 6;
            this.n = i7;
            bArr[i6] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 7;
            bArr[i7] = (byte) ((j & 127) | 128);
        }

        private void o1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 35);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 28) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 21) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 14) & 127) | 128);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 6;
            bArr[i6] = (byte) ((j & 127) | 128);
        }

        private void p1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 63);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 56) & 127) | 128);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((j >>> 49) & 127) | 128);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((j >>> 42) & 127) | 128);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((j >>> 35) & 127) | 128);
            int i7 = i - 6;
            this.n = i7;
            bArr[i6] = (byte) (((j >>> 28) & 127) | 128);
            int i8 = i - 7;
            this.n = i8;
            bArr[i7] = (byte) (((j >>> 21) & 127) | 128);
            int i9 = i - 8;
            this.n = i9;
            bArr[i8] = (byte) (((j >>> 14) & 127) | 128);
            int i10 = i - 9;
            this.n = i10;
            bArr[i9] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 10;
            bArr[i10] = (byte) ((j & 127) | 128);
        }

        private void q1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (((int) j) >>> 14);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((j >>> 7) & 127) | 128);
            this.n = i - 3;
            bArr[i3] = (byte) ((j & 127) | 128);
        }

        private void r1(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (j >>> 7);
            this.n = i - 2;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
        }

        @Override // o.NN2
        public void A(int i, Object obj) throws IOException {
            int c0 = c0();
            XJ1.a().k(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.AbstractC9574sn
        public void A0(long j) {
            byte[] bArr = this.i;
            int i = this.n;
            int i2 = i - 1;
            this.n = i2;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            int i3 = i - 2;
            this.n = i3;
            bArr[i2] = (byte) (((int) (j >> 48)) & 255);
            int i4 = i - 3;
            this.n = i4;
            bArr[i3] = (byte) (((int) (j >> 40)) & 255);
            int i5 = i - 4;
            this.n = i5;
            bArr[i4] = (byte) (((int) (j >> 32)) & 255);
            int i6 = i - 5;
            this.n = i6;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i - 6;
            this.n = i7;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i8 = i - 7;
            this.n = i8;
            bArr[i7] = (byte) (((int) (j >> 8)) & 255);
            this.n = i - 8;
            bArr[i8] = (byte) (((int) j) & 255);
        }

        @Override // o.NN2
        public void C(int i, boolean z) throws IOException {
            r0(6);
            T(z ? (byte) 1 : (byte) 0);
            R0(i, 0);
        }

        @Override // o.NN2
        public void F(int i) {
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void F0(int i) {
            if (i >= 0) {
                W0(i);
            } else {
                X0(i);
            }
        }

        @Override // o.NN2
        public void J(int i, Object obj) throws IOException {
            R0(i, 4);
            XJ1.a().k(obj, this);
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void K0(int i) {
            W0(ME.c1(i));
        }

        @Override // o.NN2
        public void M(int i) {
            R0(i, 4);
        }

        @Override // o.AbstractC9574sn
        public void N0(long j) {
            X0(ME.d1(j));
        }

        @Override // o.AbstractC9574sn
        public void Q0(String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            r0(str.length());
            int length = str.length() - 1;
            this.n -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.i[this.n + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.n--;
                return;
            }
            this.n += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i3 = this.n) > this.l) {
                    byte[] bArr = this.i;
                    this.n = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.n) > this.j) {
                    byte[] bArr2 = this.i;
                    int i4 = i2 - 1;
                    this.n = i4;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.n = i2 - 2;
                    bArr2[i4] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.n) > this.j + 1) {
                    byte[] bArr3 = this.i;
                    int i5 = i - 1;
                    this.n = i5;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    int i6 = i - 2;
                    this.n = i6;
                    bArr3[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.n = i - 3;
                    bArr3[i6] = (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1);
                } else if (this.n > this.j + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.i;
                            int i7 = this.n;
                            int i8 = i7 - 1;
                            this.n = i8;
                            bArr4[i7] = (byte) ((codePoint & 63) | 128);
                            int i9 = i7 - 2;
                            this.n = i9;
                            bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i10 = i7 - 3;
                            this.n = i10;
                            bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.n = i7 - 4;
                            bArr4[i10] = (byte) ((codePoint >>> 18) | 240);
                        }
                    }
                    throw new BD2.d(length - 1, length);
                } else {
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // o.NN2
        public void R(int i, int i2) throws IOException {
            r0(10);
            K0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void R0(int i, int i2) {
            W0(IM2.c(i, i2));
        }

        @Override // o.AbstractC6898hs
        public void T(byte b) {
            byte[] bArr = this.i;
            int i = this.n;
            this.n = i - 1;
            bArr[i] = b;
        }

        @Override // o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                a1(remaining);
            }
            int i = this.n - remaining;
            this.n = i;
            byteBuffer.get(this.i, i + 1, remaining);
        }

        @Override // o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) {
            if (c1() < i2) {
                a1(i2);
            }
            int i3 = this.n - i2;
            this.n = i3;
            System.arraycopy(bArr, i, this.i, i3 + 1, i2);
        }

        @Override // o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (c1() < remaining) {
                this.d += remaining;
                this.c.addFirst(AbstractC10391w8.j(byteBuffer));
                Z0();
            }
            int i = this.n - remaining;
            this.n = i;
            byteBuffer.get(this.i, i + 1, remaining);
        }

        @Override // o.AbstractC9574sn
        public void W0(int i) {
            if ((i & (-128)) == 0) {
                f1(i);
            } else if ((i & (-16384)) == 0) {
                h1(i);
            } else if (((-2097152) & i) == 0) {
                g1(i);
            } else if (((-268435456) & i) == 0) {
                e1(i);
            } else {
                d1(i);
            }
        }

        @Override // o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) {
            if (c1() < i2) {
                this.d += i2;
                this.c.addFirst(AbstractC10391w8.l(bArr, i, i2));
                Z0();
                return;
            }
            int i3 = this.n - i2;
            this.n = i3;
            System.arraycopy(bArr, i, this.i, i3 + 1, i2);
        }

        @Override // o.AbstractC9574sn
        public void X0(long j) {
            switch (AbstractC9574sn.a0(j)) {
                case 1:
                    m1(j);
                    return;
                case 2:
                    r1(j);
                    return;
                case 3:
                    q1(j);
                    return;
                case 4:
                    k1(j);
                    return;
                case 5:
                    j1(j);
                    return;
                case 6:
                    o1(j);
                    return;
                case 7:
                    n1(j);
                    return;
                case 8:
                    i1(j);
                    return;
                case 9:
                    l1(j);
                    return;
                case 10:
                    p1(j);
                    return;
                default:
                    return;
            }
        }

        public int Y0() {
            return this.m - this.n;
        }

        @Override // o.AbstractC9574sn
        public void b0() {
            if (this.h != null) {
                this.d += Y0();
                AbstractC10391w8 abstractC10391w8 = this.h;
                abstractC10391w8.h((this.n - abstractC10391w8.b()) + 1);
                this.h = null;
                this.n = 0;
                this.m = 0;
            }
        }

        @Override // o.NN2
        public void c(int i, int i2) throws IOException {
            r0(9);
            x0(i2);
            R0(i, 5);
        }

        @Override // o.AbstractC9574sn
        public int c0() {
            return this.d + Y0();
        }

        public int c1() {
            return this.n - this.l;
        }

        @Override // o.NN2
        public void e(int i, AbstractC8616os abstractC8616os) throws IOException {
            try {
                abstractC8616os.L0(this);
                r0(10);
                W0(abstractC8616os.size());
                R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // o.NN2
        public void g(int i, String str) throws IOException {
            int c0 = c0();
            Q0(str);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void h(int i, long j) throws IOException {
            r0(15);
            X0(j);
            R0(i, 0);
        }

        @Override // o.NN2
        public void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            int c0 = c0();
            interfaceC9026qY1.f(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void l(int i, int i2) throws IOException {
            r0(15);
            F0(i2);
            R0(i, 0);
        }

        @Override // o.NN2
        public void q(int i, long j) throws IOException {
            r0(15);
            N0(j);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void r0(int i) {
            if (c1() < i) {
                a1(i);
            }
        }

        @Override // o.NN2
        public void s(int i, int i2) throws IOException {
            r0(10);
            W0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void s0(boolean z) {
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.NN2
        public void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            R0(i, 4);
            interfaceC9026qY1.f(obj, this);
            R0(i, 3);
        }

        @Override // o.NN2
        public void x(int i, long j) throws IOException {
            r0(13);
            A0(j);
            R0(i, 1);
        }

        @Override // o.AbstractC9574sn
        public void x0(int i) {
            byte[] bArr = this.i;
            int i2 = this.n;
            int i3 = i2 - 1;
            this.n = i3;
            bArr[i2] = (byte) ((i >> 24) & 255);
            int i4 = i2 - 2;
            this.n = i4;
            bArr[i3] = (byte) ((i >> 16) & 255);
            int i5 = i2 - 3;
            this.n = i5;
            bArr[i4] = (byte) ((i >> 8) & 255);
            this.n = i2 - 4;
            bArr[i5] = (byte) (i & 255);
        }
    }

    /* renamed from: o.sn$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC9574sn {
        public ByteBuffer h;
        public long i;
        public long j;
        public long k;

        public d(AbstractC6149eq abstractC6149eq, int i) {
            super(abstractC6149eq, i, null);
            c1();
        }

        public static /* synthetic */ boolean Y0() {
            return b1();
        }

        private int a1() {
            return (int) (this.j - this.k);
        }

        private static boolean b1() {
            return TB2.T();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int i) {
            e1(g0(i));
        }

        private void e1(AbstractC10391w8 abstractC10391w8) {
            if (abstractC10391w8.d()) {
                ByteBuffer f = abstractC10391w8.f();
                if (f.isDirect()) {
                    b0();
                    this.c.addFirst(abstractC10391w8);
                    this.h = f;
                    f.limit(f.capacity());
                    this.h.position(0);
                    long i = TB2.i(this.h);
                    this.i = i;
                    long limit = i + (this.h.limit() - 1);
                    this.j = limit;
                    this.k = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) (i >>> 28));
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) ((i & 127) | 128));
        }

        private void h1(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) (i >>> 21));
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) ((i & 127) | 128));
        }

        private void i1(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) i);
        }

        private void j1(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) (i >>> 14));
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) ((i & 127) | 128));
        }

        private void k1(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) (i >>> 7));
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) ((i & 127) | 128));
        }

        private void l1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 49));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 42) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 35) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 28) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((j >>> 21) & 127) | 128));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) (((j >>> 14) & 127) | 128));
            long j8 = this.k;
            this.k = j8 - 1;
            TB2.b0(j8, (byte) (((j >>> 7) & 127) | 128));
            long j9 = this.k;
            this.k = j9 - 1;
            TB2.b0(j9, (byte) ((j & 127) | 128));
        }

        private void m1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 28));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 21) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 14) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 7) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) ((j & 127) | 128));
        }

        private void n1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 21));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 14) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 7) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) ((j & 127) | 128));
        }

        private void o1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 56));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 49) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 42) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 35) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((j >>> 28) & 127) | 128));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) (((j >>> 21) & 127) | 128));
            long j8 = this.k;
            this.k = j8 - 1;
            TB2.b0(j8, (byte) (((j >>> 14) & 127) | 128));
            long j9 = this.k;
            this.k = j9 - 1;
            TB2.b0(j9, (byte) (((j >>> 7) & 127) | 128));
            long j10 = this.k;
            this.k = j10 - 1;
            TB2.b0(j10, (byte) ((j & 127) | 128));
        }

        private void p1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) j);
        }

        private void q1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 42));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 35) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 28) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 21) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((j >>> 14) & 127) | 128));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) (((j >>> 7) & 127) | 128));
            long j8 = this.k;
            this.k = j8 - 1;
            TB2.b0(j8, (byte) ((j & 127) | 128));
        }

        private void r1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 35));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 28) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 21) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 14) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((j >>> 7) & 127) | 128));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) ((j & 127) | 128));
        }

        private void s1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 63));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 56) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((j >>> 49) & 127) | 128));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((j >>> 42) & 127) | 128));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((j >>> 35) & 127) | 128));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) (((j >>> 28) & 127) | 128));
            long j8 = this.k;
            this.k = j8 - 1;
            TB2.b0(j8, (byte) (((j >>> 21) & 127) | 128));
            long j9 = this.k;
            this.k = j9 - 1;
            TB2.b0(j9, (byte) (((j >>> 14) & 127) | 128));
            long j10 = this.k;
            this.k = j10 - 1;
            TB2.b0(j10, (byte) (((j >>> 7) & 127) | 128));
            long j11 = this.k;
            this.k = j11 - 1;
            TB2.b0(j11, (byte) ((j & 127) | 128));
        }

        private void t1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (((int) j) >>> 14));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((j >>> 7) & 127) | 128));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) ((j & 127) | 128));
        }

        private void u1(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (j >>> 7));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) ((((int) j) & 127) | 128));
        }

        @Override // o.NN2
        public void A(int i, Object obj) throws IOException {
            int c0 = c0();
            XJ1.a().k(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.AbstractC9574sn
        public void A0(long j) {
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.k;
            this.k = j5 - 1;
            TB2.b0(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.k;
            this.k = j6 - 1;
            TB2.b0(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.k;
            this.k = j7 - 1;
            TB2.b0(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.k;
            this.k = j8 - 1;
            TB2.b0(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.k;
            this.k = j9 - 1;
            TB2.b0(j9, (byte) (((int) j) & 255));
        }

        @Override // o.NN2
        public void C(int i, boolean z) {
            r0(6);
            T(z ? (byte) 1 : (byte) 0);
            R0(i, 0);
        }

        @Override // o.NN2
        public void F(int i) {
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void F0(int i) {
            if (i >= 0) {
                W0(i);
            } else {
                X0(i);
            }
        }

        @Override // o.NN2
        public void J(int i, Object obj) throws IOException {
            R0(i, 4);
            XJ1.a().k(obj, this);
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void K0(int i) {
            W0(ME.c1(i));
        }

        @Override // o.NN2
        public void M(int i) {
            R0(i, 4);
        }

        @Override // o.AbstractC9574sn
        public void N0(long j) {
            X0(ME.d1(j));
        }

        @Override // o.AbstractC9574sn
        public void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j = this.k;
                this.k = j - 1;
                TB2.b0(j, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.k;
                        if (j2 >= this.i) {
                            this.k = j2 - 1;
                            TB2.b0(j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.k;
                        if (j3 > this.i) {
                            this.k = j3 - 1;
                            TB2.b0(j3, (byte) ((charAt2 & '?') | 128));
                            long j4 = this.k;
                            this.k = j4 - 1;
                            TB2.b0(j4, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.k;
                        if (j5 > this.i + 1) {
                            this.k = j5 - 1;
                            TB2.b0(j5, (byte) ((charAt2 & '?') | 128));
                            long j6 = this.k;
                            this.k = j6 - 1;
                            TB2.b0(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j7 = this.k;
                            this.k = j7 - 1;
                            TB2.b0(j7, (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1));
                            length--;
                        }
                    }
                    if (this.k > this.i + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j8 = this.k;
                                this.k = j8 - 1;
                                TB2.b0(j8, (byte) ((codePoint & 63) | 128));
                                long j9 = this.k;
                                this.k = j9 - 1;
                                TB2.b0(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j10 = this.k;
                                this.k = j10 - 1;
                                TB2.b0(j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = this.k;
                                this.k = j11 - 1;
                                TB2.b0(j11, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new BD2.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                    length--;
                }
            }
        }

        @Override // o.NN2
        public void R(int i, int i2) {
            r0(10);
            K0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void R0(int i, int i2) {
            W0(IM2.c(i, i2));
        }

        @Override // o.AbstractC6898hs
        public void T(byte b) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, b);
        }

        @Override // o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                d1(remaining);
            }
            this.k -= remaining;
            this.h.position(Z0() + 1);
            this.h.put(byteBuffer);
        }

        @Override // o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) {
            if (f1() < i2) {
                d1(i2);
            }
            this.k -= i2;
            this.h.position(Z0() + 1);
            this.h.put(bArr, i, i2);
        }

        @Override // o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (f1() < remaining) {
                this.d += remaining;
                this.c.addFirst(AbstractC10391w8.j(byteBuffer));
                c1();
                return;
            }
            this.k -= remaining;
            this.h.position(Z0() + 1);
            this.h.put(byteBuffer);
        }

        @Override // o.AbstractC9574sn
        public void W0(int i) {
            if ((i & (-128)) == 0) {
                i1(i);
            } else if ((i & (-16384)) == 0) {
                k1(i);
            } else if (((-2097152) & i) == 0) {
                j1(i);
            } else if (((-268435456) & i) == 0) {
                h1(i);
            } else {
                g1(i);
            }
        }

        @Override // o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) {
            if (f1() < i2) {
                this.d += i2;
                this.c.addFirst(AbstractC10391w8.l(bArr, i, i2));
                c1();
                return;
            }
            this.k -= i2;
            this.h.position(Z0() + 1);
            this.h.put(bArr, i, i2);
        }

        @Override // o.AbstractC9574sn
        public void X0(long j) {
            switch (AbstractC9574sn.a0(j)) {
                case 1:
                    p1(j);
                    return;
                case 2:
                    u1(j);
                    return;
                case 3:
                    t1(j);
                    return;
                case 4:
                    n1(j);
                    return;
                case 5:
                    m1(j);
                    return;
                case 6:
                    r1(j);
                    return;
                case 7:
                    q1(j);
                    return;
                case 8:
                    l1(j);
                    return;
                case 9:
                    o1(j);
                    return;
                case 10:
                    s1(j);
                    return;
                default:
                    return;
            }
        }

        public final int Z0() {
            return (int) (this.k - this.i);
        }

        @Override // o.AbstractC9574sn
        public void b0() {
            if (this.h != null) {
                this.d += a1();
                this.h.position(Z0() + 1);
                this.h = null;
                this.k = 0L;
                this.j = 0L;
            }
        }

        @Override // o.NN2
        public void c(int i, int i2) {
            r0(9);
            x0(i2);
            R0(i, 5);
        }

        @Override // o.AbstractC9574sn
        public int c0() {
            return this.d + a1();
        }

        @Override // o.NN2
        public void e(int i, AbstractC8616os abstractC8616os) {
            try {
                abstractC8616os.L0(this);
                r0(10);
                W0(abstractC8616os.size());
                R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // o.NN2
        public void g(int i, String str) {
            int c0 = c0();
            Q0(str);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void h(int i, long j) {
            r0(15);
            X0(j);
            R0(i, 0);
        }

        @Override // o.NN2
        public void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            int c0 = c0();
            interfaceC9026qY1.f(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void l(int i, int i2) {
            r0(15);
            F0(i2);
            R0(i, 0);
        }

        @Override // o.NN2
        public void q(int i, long j) {
            r0(15);
            N0(j);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void r0(int i) {
            if (f1() < i) {
                d1(i);
            }
        }

        @Override // o.NN2
        public void s(int i, int i2) {
            r0(10);
            W0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void s0(boolean z) {
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.NN2
        public void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            R0(i, 4);
            interfaceC9026qY1.f(obj, this);
            R0(i, 3);
        }

        @Override // o.NN2
        public void x(int i, long j) {
            r0(13);
            A0(j);
            R0(i, 1);
        }

        @Override // o.AbstractC9574sn
        public void x0(int i) {
            long j = this.k;
            this.k = j - 1;
            TB2.b0(j, (byte) ((i >> 24) & 255));
            long j2 = this.k;
            this.k = j2 - 1;
            TB2.b0(j2, (byte) ((i >> 16) & 255));
            long j3 = this.k;
            this.k = j3 - 1;
            TB2.b0(j3, (byte) ((i >> 8) & 255));
            long j4 = this.k;
            this.k = j4 - 1;
            TB2.b0(j4, (byte) (i & 255));
        }
    }

    /* renamed from: o.sn$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC9574sn {
        public AbstractC10391w8 h;
        public byte[] i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;

        public e(AbstractC6149eq abstractC6149eq, int i) {
            super(abstractC6149eq, i, null);
            b1();
        }

        public static boolean a1() {
            return TB2.S();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int i) {
            d1(k0(i));
        }

        private void d1(AbstractC10391w8 abstractC10391w8) {
            if (abstractC10391w8.c()) {
                b0();
                this.c.addFirst(abstractC10391w8);
                this.h = abstractC10391w8;
                this.i = abstractC10391w8.a();
                int b = abstractC10391w8.b();
                this.k = abstractC10391w8.e() + b;
                long g = b + abstractC10391w8.g();
                this.j = g;
                this.l = g - 1;
                long j = this.k - 1;
                this.m = j;
                this.n = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void f1(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr5, j5, (byte) ((i & 127) | 128));
        }

        private void g1(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr4, j4, (byte) ((i & 127) | 128));
        }

        private void h1(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) i);
        }

        private void i1(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr3, j3, (byte) ((i & 127) | 128));
        }

        private void j1(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr2, j2, (byte) ((i & 127) | 128));
        }

        private void k1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 49));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr7 = this.i;
            long j8 = this.n;
            this.n = j8 - 1;
            TB2.d0(bArr7, j8, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr8 = this.i;
            long j9 = this.n;
            this.n = j9 - 1;
            TB2.d0(bArr8, j9, (byte) ((j & 127) | 128));
        }

        private void l1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 28));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) ((j & 127) | 128));
        }

        private void m1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 21));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) ((j & 127) | 128));
        }

        private void n1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 56));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr7 = this.i;
            long j8 = this.n;
            this.n = j8 - 1;
            TB2.d0(bArr7, j8, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr8 = this.i;
            long j9 = this.n;
            this.n = j9 - 1;
            TB2.d0(bArr8, j9, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr9 = this.i;
            long j10 = this.n;
            this.n = j10 - 1;
            TB2.d0(bArr9, j10, (byte) ((j & 127) | 128));
        }

        private void o1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) j);
        }

        private void p1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 42));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr7 = this.i;
            long j8 = this.n;
            this.n = j8 - 1;
            TB2.d0(bArr7, j8, (byte) ((j & 127) | 128));
        }

        private void q1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 35));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) ((j & 127) | 128));
        }

        private void r1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 63));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 56) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr7 = this.i;
            long j8 = this.n;
            this.n = j8 - 1;
            TB2.d0(bArr7, j8, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr8 = this.i;
            long j9 = this.n;
            this.n = j9 - 1;
            TB2.d0(bArr8, j9, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr9 = this.i;
            long j10 = this.n;
            this.n = j10 - 1;
            TB2.d0(bArr9, j10, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr10 = this.i;
            long j11 = this.n;
            this.n = j11 - 1;
            TB2.d0(bArr10, j11, (byte) ((j & 127) | 128));
        }

        private void s1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) ((j & 127) | 128));
        }

        private void t1(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (j >>> 7));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        @Override // o.NN2
        public void A(int i, Object obj) throws IOException {
            int c0 = c0();
            XJ1.a().k(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.AbstractC9574sn
        public void A0(long j) {
            byte[] bArr = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.i;
            long j5 = this.n;
            this.n = j5 - 1;
            TB2.d0(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.i;
            long j6 = this.n;
            this.n = j6 - 1;
            TB2.d0(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.i;
            long j7 = this.n;
            this.n = j7 - 1;
            TB2.d0(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.i;
            long j8 = this.n;
            this.n = j8 - 1;
            TB2.d0(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.i;
            long j9 = this.n;
            this.n = j9 - 1;
            TB2.d0(bArr8, j9, (byte) (((int) j) & 255));
        }

        @Override // o.NN2
        public void C(int i, boolean z) {
            r0(6);
            T(z ? (byte) 1 : (byte) 0);
            R0(i, 0);
        }

        @Override // o.NN2
        public void F(int i) {
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void F0(int i) {
            if (i >= 0) {
                W0(i);
            } else {
                X0(i);
            }
        }

        @Override // o.NN2
        public void J(int i, Object obj) throws IOException {
            R0(i, 4);
            XJ1.a().k(obj, this);
            R0(i, 3);
        }

        @Override // o.AbstractC9574sn
        public void K0(int i) {
            W0(ME.c1(i));
        }

        @Override // o.NN2
        public void M(int i) {
            R0(i, 4);
        }

        @Override // o.AbstractC9574sn
        public void N0(long j) {
            X0(ME.d1(j));
        }

        @Override // o.AbstractC9574sn
        public void Q0(String str) {
            char charAt;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.i;
                long j = this.n;
                this.n = j - 1;
                TB2.d0(bArr, j, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j2 = this.n;
                        if (j2 > this.l) {
                            byte[] bArr2 = this.i;
                            this.n = j2 - 1;
                            TB2.d0(bArr2, j2, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j3 = this.n;
                        if (j3 > this.j) {
                            byte[] bArr3 = this.i;
                            this.n = j3 - 1;
                            TB2.d0(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.i;
                            long j4 = this.n;
                            this.n = j4 - 1;
                            TB2.d0(bArr4, j4, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j5 = this.n;
                        if (j5 > this.j + 1) {
                            byte[] bArr5 = this.i;
                            this.n = j5 - 1;
                            TB2.d0(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.i;
                            long j6 = this.n;
                            this.n = j6 - 1;
                            TB2.d0(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.i;
                            long j7 = this.n;
                            this.n = j7 - 1;
                            TB2.d0(bArr7, j7, (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1));
                            length--;
                        }
                    }
                    if (this.n > this.j + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.i;
                                long j8 = this.n;
                                this.n = j8 - 1;
                                TB2.d0(bArr8, j8, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.i;
                                long j9 = this.n;
                                this.n = j9 - 1;
                                TB2.d0(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.i;
                                long j10 = this.n;
                                this.n = j10 - 1;
                                TB2.d0(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.i;
                                long j11 = this.n;
                                this.n = j11 - 1;
                                TB2.d0(bArr11, j11, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new BD2.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                    length--;
                }
            }
        }

        @Override // o.NN2
        public void R(int i, int i2) {
            r0(10);
            K0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void R0(int i, int i2) {
            W0(IM2.c(i, i2));
        }

        @Override // o.AbstractC6898hs
        public void T(byte b) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, b);
        }

        @Override // o.AbstractC6898hs
        public void U(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            r0(remaining);
            this.n -= remaining;
            byteBuffer.get(this.i, Y0() + 1, remaining);
        }

        @Override // o.AbstractC6898hs
        public void V(byte[] bArr, int i, int i2) {
            if (i >= 0 && i + i2 <= bArr.length) {
                r0(i2);
                this.n -= i2;
                System.arraycopy(bArr, i, this.i, Y0() + 1, i2);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // o.AbstractC6898hs
        public void W(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (e1() < remaining) {
                this.d += remaining;
                this.c.addFirst(AbstractC10391w8.j(byteBuffer));
                b1();
            }
            this.n -= remaining;
            byteBuffer.get(this.i, Y0() + 1, remaining);
        }

        @Override // o.AbstractC9574sn
        public void W0(int i) {
            if ((i & (-128)) == 0) {
                h1(i);
            } else if ((i & (-16384)) == 0) {
                j1(i);
            } else if (((-2097152) & i) == 0) {
                i1(i);
            } else if (((-268435456) & i) == 0) {
                g1(i);
            } else {
                f1(i);
            }
        }

        @Override // o.AbstractC6898hs
        public void X(byte[] bArr, int i, int i2) {
            if (i >= 0 && i + i2 <= bArr.length) {
                if (e1() < i2) {
                    this.d += i2;
                    this.c.addFirst(AbstractC10391w8.l(bArr, i, i2));
                    b1();
                    return;
                }
                this.n -= i2;
                System.arraycopy(bArr, i, this.i, Y0() + 1, i2);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // o.AbstractC9574sn
        public void X0(long j) {
            switch (AbstractC9574sn.a0(j)) {
                case 1:
                    o1(j);
                    return;
                case 2:
                    t1(j);
                    return;
                case 3:
                    s1(j);
                    return;
                case 4:
                    m1(j);
                    return;
                case 5:
                    l1(j);
                    return;
                case 6:
                    q1(j);
                    return;
                case 7:
                    p1(j);
                    return;
                case 8:
                    k1(j);
                    return;
                case 9:
                    n1(j);
                    return;
                case 10:
                    r1(j);
                    return;
                default:
                    return;
            }
        }

        public final int Y0() {
            return (int) this.n;
        }

        public int Z0() {
            return (int) (this.m - this.n);
        }

        @Override // o.AbstractC9574sn
        public void b0() {
            if (this.h != null) {
                this.d += Z0();
                this.h.h((Y0() - this.h.b()) + 1);
                this.h = null;
                this.n = 0L;
                this.m = 0L;
            }
        }

        @Override // o.NN2
        public void c(int i, int i2) {
            r0(9);
            x0(i2);
            R0(i, 5);
        }

        @Override // o.AbstractC9574sn
        public int c0() {
            return this.d + Z0();
        }

        @Override // o.NN2
        public void e(int i, AbstractC8616os abstractC8616os) {
            try {
                abstractC8616os.L0(this);
                r0(10);
                W0(abstractC8616os.size());
                R0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int e1() {
            return (int) (this.n - this.l);
        }

        @Override // o.NN2
        public void g(int i, String str) {
            int c0 = c0();
            Q0(str);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void h(int i, long j) {
            r0(15);
            X0(j);
            R0(i, 0);
        }

        @Override // o.NN2
        public void i(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            int c0 = c0();
            interfaceC9026qY1.f(obj, this);
            r0(10);
            W0(c0() - c0);
            R0(i, 2);
        }

        @Override // o.NN2
        public void l(int i, int i2) {
            r0(15);
            F0(i2);
            R0(i, 0);
        }

        @Override // o.NN2
        public void q(int i, long j) {
            r0(15);
            N0(j);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void r0(int i) {
            if (e1() < i) {
                c1(i);
            }
        }

        @Override // o.NN2
        public void s(int i, int i2) {
            r0(10);
            W0(i2);
            R0(i, 0);
        }

        @Override // o.AbstractC9574sn
        public void s0(boolean z) {
            T(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.NN2
        public void t(int i, Object obj, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
            R0(i, 4);
            interfaceC9026qY1.f(obj, this);
            R0(i, 3);
        }

        @Override // o.NN2
        public void x(int i, long j) {
            r0(13);
            A0(j);
            R0(i, 1);
        }

        @Override // o.AbstractC9574sn
        public void x0(int i) {
            byte[] bArr = this.i;
            long j = this.n;
            this.n = j - 1;
            TB2.d0(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.i;
            long j2 = this.n;
            this.n = j2 - 1;
            TB2.d0(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.i;
            long j3 = this.n;
            this.n = j3 - 1;
            TB2.d0(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.i;
            long j4 = this.n;
            this.n = j4 - 1;
            TB2.d0(bArr4, j4, (byte) (i & 255));
        }
    }

    public /* synthetic */ AbstractC9574sn(AbstractC6149eq abstractC6149eq, int i, a aVar) {
        this(abstractC6149eq, i);
    }

    public static final void J0(NN2 nn2, int i, IM2.b bVar, Object obj) throws IOException {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                nn2.C(i, ((Boolean) obj).booleanValue());
                return;
            case 2:
                nn2.c(i, ((Integer) obj).intValue());
                return;
            case 3:
                nn2.x(i, ((Long) obj).longValue());
                return;
            case 4:
                nn2.l(i, ((Integer) obj).intValue());
                return;
            case 5:
                nn2.B(i, ((Long) obj).longValue());
                return;
            case 6:
                nn2.E(i, ((Integer) obj).intValue());
                return;
            case 7:
                nn2.m(i, ((Long) obj).longValue());
                return;
            case 8:
                nn2.R(i, ((Integer) obj).intValue());
                return;
            case 9:
                nn2.q(i, ((Long) obj).longValue());
                return;
            case 10:
                nn2.g(i, (String) obj);
                return;
            case 11:
                nn2.s(i, ((Integer) obj).intValue());
                return;
            case 12:
                nn2.h(i, ((Long) obj).longValue());
                return;
            case 13:
                nn2.L(i, ((Float) obj).floatValue());
                return;
            case 14:
                nn2.u(i, ((Double) obj).doubleValue());
                return;
            case 15:
                nn2.A(i, obj);
                return;
            case 16:
                nn2.e(i, (AbstractC8616os) obj);
                return;
            case 17:
                if (obj instanceof C9740tS0.c) {
                    nn2.O(i, ((C9740tS0.c) obj).k());
                    return;
                } else if (obj instanceof Integer) {
                    nn2.O(i, ((Integer) obj).intValue());
                    return;
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + bVar);
        }
    }

    public static byte a0(long j) {
        byte b2;
        if (((-128) & j) == 0) {
            return (byte) 1;
        }
        if (j < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j) != 0) {
            b2 = (byte) 6;
            j >>>= 28;
        } else {
            b2 = 2;
        }
        if ((ExecutorC9488sQ.s1 & j) != 0) {
            b2 = (byte) (b2 + 2);
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return (byte) (b2 + 1);
        }
        return b2;
    }

    public static boolean d0() {
        return d.Y0();
    }

    public static boolean e0() {
        return e.a1();
    }

    public static AbstractC9574sn h0(AbstractC6149eq abstractC6149eq) {
        return i0(abstractC6149eq, 4096);
    }

    public static AbstractC9574sn i0(AbstractC6149eq abstractC6149eq, int i) {
        if (d0()) {
            return p0(abstractC6149eq, i);
        }
        return n0(abstractC6149eq, i);
    }

    public static AbstractC9574sn l0(AbstractC6149eq abstractC6149eq) {
        return m0(abstractC6149eq, 4096);
    }

    public static AbstractC9574sn m0(AbstractC6149eq abstractC6149eq, int i) {
        if (e0()) {
            return q0(abstractC6149eq, i);
        }
        return o0(abstractC6149eq, i);
    }

    public static AbstractC9574sn n0(AbstractC6149eq abstractC6149eq, int i) {
        return new b(abstractC6149eq, i);
    }

    public static AbstractC9574sn o0(AbstractC6149eq abstractC6149eq, int i) {
        return new c(abstractC6149eq, i);
    }

    public static AbstractC9574sn p0(AbstractC6149eq abstractC6149eq, int i) {
        if (d0()) {
            return new d(abstractC6149eq, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static AbstractC9574sn q0(AbstractC6149eq abstractC6149eq, int i) {
        if (e0()) {
            return new e(abstractC6149eq, i);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public abstract void A0(long j);

    @Override // o.NN2
    public final void B(int i, long j) throws IOException {
        h(i, j);
    }

    public final void B0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 8) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                A0(list.get(size).longValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x(i, list.get(size2).longValue());
        }
    }

    public final void C0(int i, B41 b41, boolean z) throws IOException {
        if (z) {
            r0((b41.size() * 8) + 10);
            int c0 = c0();
            for (int size = b41.size() - 1; size >= 0; size--) {
                A0(b41.getLong(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = b41.size() - 1; size2 >= 0; size2--) {
            x(i, b41.getLong(size2));
        }
    }

    @Override // o.NN2
    public final void D(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            i(i, list.get(size), interfaceC9026qY1);
        }
    }

    public final void D0(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 4) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                x0(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            L(i, list.get(size2).floatValue());
        }
    }

    @Override // o.NN2
    public final void E(int i, int i2) throws IOException {
        c(i, i2);
    }

    public final void E0(int i, C6413fv0 c6413fv0, boolean z) throws IOException {
        if (z) {
            r0((c6413fv0.size() * 4) + 10);
            int c0 = c0();
            for (int size = c6413fv0.size() - 1; size >= 0; size--) {
                x0(Float.floatToRawIntBits(c6413fv0.getFloat(size)));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c6413fv0.size() - 1; size2 >= 0; size2--) {
            L(i, c6413fv0.getFloat(size2));
        }
    }

    public abstract void F0(int i);

    @Override // o.NN2
    public final void G(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof B41) {
            C0(i, (B41) list, z);
        } else {
            B0(i, list, z);
        }
    }

    public final void G0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 10) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                F0(list.get(size).intValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            l(i, list.get(size2).intValue());
        }
    }

    @Override // o.NN2
    public final void H(int i, List<Integer> list, boolean z) throws IOException {
        n(i, list, z);
    }

    public final void H0(int i, C6299fR0 c6299fR0, boolean z) throws IOException {
        if (z) {
            r0((c6299fR0.size() * 10) + 10);
            int c0 = c0();
            for (int size = c6299fR0.size() - 1; size >= 0; size--) {
                F0(c6299fR0.getInt(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c6299fR0.size() - 1; size2 >= 0; size2--) {
            l(i, c6299fR0.getInt(size2));
        }
    }

    @Override // o.NN2
    public final void I(int i, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof C3170Ho) {
            u0(i, (C3170Ho) list, z);
        } else {
            t0(i, list, z);
        }
    }

    public final void I0(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            g(i, (String) obj);
        } else {
            e(i, (AbstractC8616os) obj);
        }
    }

    @Override // o.NN2
    public <K, V> void K(int i, O71.b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int c0 = c0();
            J0(this, 2, bVar.c, entry.getValue());
            J0(this, 1, bVar.a, entry.getKey());
            W0(c0() - c0);
            R0(i, 2);
        }
    }

    public abstract void K0(int i);

    @Override // o.NN2
    public final void L(int i, float f2) throws IOException {
        c(i, Float.floatToRawIntBits(f2));
    }

    public final void L0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 5) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                K0(list.get(size).intValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            R(i, list.get(size2).intValue());
        }
    }

    public final void M0(int i, C6299fR0 c6299fR0, boolean z) throws IOException {
        if (z) {
            r0((c6299fR0.size() * 5) + 10);
            int c0 = c0();
            for (int size = c6299fR0.size() - 1; size >= 0; size--) {
                K0(c6299fR0.getInt(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c6299fR0.size() - 1; size2 >= 0; size2--) {
            R(i, c6299fR0.getInt(size2));
        }
    }

    @Override // o.NN2
    public final void N(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C6299fR0) {
            M0(i, (C6299fR0) list, z);
        } else {
            L0(i, list, z);
        }
    }

    public abstract void N0(long j);

    @Override // o.NN2
    public final void O(int i, int i2) throws IOException {
        l(i, i2);
    }

    public final void O0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 10) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                N0(list.get(size).longValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            q(i, list.get(size2).longValue());
        }
    }

    @Override // o.NN2
    public final void P(int i, List<Long> list, boolean z) throws IOException {
        w(i, list, z);
    }

    public final void P0(int i, B41 b41, boolean z) throws IOException {
        if (z) {
            r0((b41.size() * 10) + 10);
            int c0 = c0();
            for (int size = b41.size() - 1; size >= 0; size--) {
                N0(b41.getLong(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = b41.size() - 1; size2 >= 0; size2--) {
            q(i, b41.getLong(size2));
        }
    }

    @Override // o.NN2
    public final void Q(int i, List<Double> list, boolean z) throws IOException {
        if (list instanceof X40) {
            w0(i, (X40) list, z);
        } else {
            v0(i, list, z);
        }
    }

    public abstract void Q0(String str);

    public abstract void R0(int i, int i2);

    @Override // o.NN2
    public final void S(int i, List<AbstractC8616os> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(i, list.get(size));
        }
    }

    public final void S0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 5) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                W0(list.get(size).intValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s(i, list.get(size2).intValue());
        }
    }

    public final void T0(int i, C6299fR0 c6299fR0, boolean z) throws IOException {
        if (z) {
            r0((c6299fR0.size() * 5) + 10);
            int c0 = c0();
            for (int size = c6299fR0.size() - 1; size >= 0; size--) {
                W0(c6299fR0.getInt(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c6299fR0.size() - 1; size2 >= 0; size2--) {
            s(i, c6299fR0.getInt(size2));
        }
    }

    public final void U0(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 10) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                X0(list.get(size).longValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            h(i, list.get(size2).longValue());
        }
    }

    public final void V0(int i, B41 b41, boolean z) throws IOException {
        if (z) {
            r0((b41.size() * 10) + 10);
            int c0 = c0();
            for (int size = b41.size() - 1; size >= 0; size--) {
                X0(b41.getLong(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = b41.size() - 1; size2 >= 0; size2--) {
            h(i, b41.getLong(size2));
        }
    }

    public abstract void W0(int i);

    public abstract void X0(long j);

    public final Queue<AbstractC10391w8> Z() {
        b0();
        return this.c;
    }

    @Override // o.NN2
    public final void a(int i, List<Float> list, boolean z) throws IOException {
        if (list instanceof C6413fv0) {
            E0(i, (C6413fv0) list, z);
        } else {
            D0(i, list, z);
        }
    }

    @Override // o.NN2
    public final void b(int i, Object obj) throws IOException {
        R0(1, 4);
        if (obj instanceof AbstractC8616os) {
            e(3, (AbstractC8616os) obj);
        } else {
            A(3, obj);
        }
        s(2, i);
        R0(1, 3);
    }

    public abstract void b0();

    public abstract int c0();

    @Override // o.NN2
    public final void d(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            J(i, list.get(size));
        }
    }

    @Override // o.NN2
    public final void f(int i, List<String> list) throws IOException {
        if (list instanceof InterfaceC6581gZ0) {
            InterfaceC6581gZ0 interfaceC6581gZ0 = (InterfaceC6581gZ0) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                I0(i, interfaceC6581gZ0.w5(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            g(i, list.get(size2));
        }
    }

    public final AbstractC10391w8 f0() {
        return this.a.a(this.b);
    }

    public final AbstractC10391w8 g0(int i) {
        return this.a.a(Math.max(i, this.b));
    }

    @Override // o.NN2
    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C6299fR0) {
            H0(i, (C6299fR0) list, z);
        } else {
            G0(i, list, z);
        }
    }

    public final AbstractC10391w8 j0() {
        return this.a.b(this.b);
    }

    @Override // o.NN2
    public final void k(int i, List<?> list, InterfaceC9026qY1 interfaceC9026qY1) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            t(i, list.get(size), interfaceC9026qY1);
        }
    }

    public final AbstractC10391w8 k0(int i) {
        return this.a.b(Math.max(i, this.b));
    }

    @Override // o.NN2
    public final void m(int i, long j) throws IOException {
        x(i, j);
    }

    @Override // o.NN2
    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C6299fR0) {
            z0(i, (C6299fR0) list, z);
        } else {
            y0(i, list, z);
        }
    }

    @Override // o.NN2
    public final void o(int i, List<Integer> list, boolean z) throws IOException {
        if (list instanceof C6299fR0) {
            T0(i, (C6299fR0) list, z);
        } else {
            S0(i, list, z);
        }
    }

    @Override // o.NN2
    public final void p(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof B41) {
            P0(i, (B41) list, z);
        } else {
            O0(i, list, z);
        }
    }

    @Override // o.NN2
    public final void r(int i, List<Integer> list, boolean z) throws IOException {
        j(i, list, z);
    }

    public abstract void r0(int i);

    public abstract void s0(boolean z);

    public final void t0(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            r0(list.size() + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                s0(list.get(size).booleanValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            C(i, list.get(size2).booleanValue());
        }
    }

    @Override // o.NN2
    public final void u(int i, double d2) throws IOException {
        x(i, Double.doubleToRawLongBits(d2));
    }

    public final void u0(int i, C3170Ho c3170Ho, boolean z) throws IOException {
        if (z) {
            r0(c3170Ho.size() + 10);
            int c0 = c0();
            for (int size = c3170Ho.size() - 1; size >= 0; size--) {
                s0(c3170Ho.getBoolean(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c3170Ho.size() - 1; size2 >= 0; size2--) {
            C(i, c3170Ho.getBoolean(size2));
        }
    }

    @Override // o.NN2
    public final void v(int i, List<Long> list, boolean z) throws IOException {
        G(i, list, z);
    }

    public final void v0(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 8) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                A0(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            u(i, list.get(size2).doubleValue());
        }
    }

    @Override // o.NN2
    public final void w(int i, List<Long> list, boolean z) throws IOException {
        if (list instanceof B41) {
            V0(i, (B41) list, z);
        } else {
            U0(i, list, z);
        }
    }

    public final void w0(int i, X40 x40, boolean z) throws IOException {
        if (z) {
            r0((x40.size() * 8) + 10);
            int c0 = c0();
            for (int size = x40.size() - 1; size >= 0; size--) {
                A0(Double.doubleToRawLongBits(x40.getDouble(size)));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = x40.size() - 1; size2 >= 0; size2--) {
            u(i, x40.getDouble(size2));
        }
    }

    public abstract void x0(int i);

    @Override // o.NN2
    public final NN2.a y() {
        return NN2.a.DESCENDING;
    }

    public final void y0(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            r0((list.size() * 4) + 10);
            int c0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                x0(list.get(size).intValue());
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            c(i, list.get(size2).intValue());
        }
    }

    @Override // o.NN2
    public final void z(int i, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            A(i, list.get(size));
        }
    }

    public final void z0(int i, C6299fR0 c6299fR0, boolean z) throws IOException {
        if (z) {
            r0((c6299fR0.size() * 4) + 10);
            int c0 = c0();
            for (int size = c6299fR0.size() - 1; size >= 0; size--) {
                x0(c6299fR0.getInt(size));
            }
            W0(c0() - c0);
            R0(i, 2);
            return;
        }
        for (int size2 = c6299fR0.size() - 1; size2 >= 0; size2--) {
            c(i, c6299fR0.getInt(size2));
        }
    }

    public AbstractC9574sn(AbstractC6149eq abstractC6149eq, int i) {
        this.c = new ArrayDeque<>(4);
        if (i > 0) {
            this.a = (AbstractC6149eq) C9740tS0.e(abstractC6149eq, "alloc");
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize must be > 0");
    }
}
