package o;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C3503Kz;
import o.C7284jS;

@Deprecated
/* renamed from: o.Iz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3307Iz extends AbstractC3698Mz {
    public static final long A = 16000;
    public static final String B = "Cea608Decoder";
    public static final int C = 4;
    public static final int D = 2;
    public static final int E = 1;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int Q = 7;
    public static final int R = 8;
    public static final int S = 4;
    public static final byte T = -4;
    public static final byte U = 32;
    public static final byte V = 33;
    public static final byte W = 36;
    public static final byte X = 37;
    public static final byte Y = 38;
    public static final byte Z = 39;
    public static final byte a0 = 41;
    public static final byte b0 = 42;
    public static final byte c0 = 43;
    public static final byte d0 = 44;
    public static final byte e0 = 45;
    public static final byte f0 = 46;
    public static final byte g0 = 47;
    public final int j;
    public final int k;
    public final int l;
    public final long m;
    @InterfaceC11300zs1
    public List<C7284jS> p;
    @InterfaceC11300zs1
    public List<C7284jS> q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public byte v;
    public byte w;
    public boolean y;
    public long z;
    public static final int[] N = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] O = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] P = {-1, -16711936, -16776961, -16711681, InterfaceMenuC9553sh2.c, -256, -65281};
    public static final int[] h0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, C10997yd1.n1, 247, C3503Kz.b.y, C10997yd1.o2, 9632};
    public static final int[] i0 = {C10997yd1.y1, 176, CK1.w, 191, 8482, 162, C10997yd1.o1, 9834, 224, 32, 232, C9276rZ.p, 234, C10997yd1.u1, 244, C10997yd1.w1};
    public static final int[] j0 = {C8463oE0.u, 201, 211, C9276rZ.l, 220, 252, 8216, C10997yd1.q1, 42, 39, 8212, C7834lj1.G, 8480, 8226, 8220, 8221, CK1.x, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, C9680tD0.j, 219, 171, C10997yd1.l2};
    public static final int[] k0 = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, C10997yd1.v1, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] l0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C3012Fy1 i = new C3012Fy1();
    public final ArrayList<a> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public a f499o = new a(0, 4);
    public int x = 0;

    /* renamed from: o.Iz$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int i = 32;
        public static final int j = 15;
        public final List<C0191a> a = new ArrayList();
        public final List<SpannableString> b = new ArrayList();
        public final StringBuilder c = new StringBuilder();
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* renamed from: o.Iz$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0191a {
            public final int a;
            public final boolean b;
            public int c;

            public C0191a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i2, int i3) {
            j(i2);
            this.h = i3;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        public void e(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0191a c0191a = this.a.get(size);
                    int i2 = c0191a.c;
                    if (i2 == length) {
                        c0191a.c = i2 - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        @InterfaceC11300zs1
        public C7284jS g(int i2) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i4 = this.e + this.f;
            int length = (32 - i4) - spannableStringBuilder.length();
            int i5 = i4 - length;
            if (i2 == Integer.MIN_VALUE) {
                if (this.g == 2 && (Math.abs(i5) < 3 || length < 0)) {
                    i2 = 1;
                } else if (this.g == 2 && i5 > 0) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = 32 - length;
                }
                f = ((i4 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new C7284jS.c().A(spannableStringBuilder).B(Layout.Alignment.ALIGN_NORMAL).t(i6, 1).w(f).x(i2).a();
        }

        public final SpannableString h() {
            int i2;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            int i8 = 0;
            boolean z2 = false;
            while (i7 < this.a.size()) {
                C0191a c0191a = this.a.get(i7);
                boolean z3 = c0191a.b;
                int i9 = c0191a.a;
                if (i9 != 8) {
                    if (i9 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i9 != 7) {
                        i6 = C3307Iz.P[i9];
                    }
                    z2 = z;
                }
                int i10 = c0191a.c;
                i7++;
                if (i7 < this.a.size()) {
                    i2 = this.a.get(i7).c;
                } else {
                    i2 = length;
                }
                if (i10 != i2) {
                    if (i3 != -1 && !z3) {
                        q(spannableStringBuilder, i3, i10);
                        i3 = -1;
                    } else if (i3 == -1 && z3) {
                        i3 = i10;
                    }
                    if (i4 != -1 && !z2) {
                        o(spannableStringBuilder, i4, i10);
                        i4 = -1;
                    } else if (i4 == -1 && z2) {
                        i4 = i10;
                    }
                    if (i6 != i5) {
                        n(spannableStringBuilder, i8, i10, i5);
                        i5 = i6;
                        i8 = i10;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                q(spannableStringBuilder, i3, length);
            }
            if (i4 != -1 && i4 != length) {
                o(spannableStringBuilder, i4, length);
            }
            if (i8 != length) {
                n(spannableStringBuilder, i8, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
                return true;
            }
            return false;
        }

        public void j(int i2) {
            this.g = i2;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void l(int i2) {
            this.g = i2;
        }

        public void m(int i2) {
            this.h = i2;
        }

        public void p(int i2, boolean z) {
            this.a.add(new C0191a(i2, z, this.c.length()));
        }
    }

    public C3307Iz(String str, int i, long j) {
        long j2;
        int i2;
        if (j > 0) {
            j2 = j * 1000;
        } else {
            j2 = -9223372036854775807L;
        }
        this.m = j2;
        if (C4128Rj1.D0.equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.j = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        I31.n(B, "Invalid channel. Defaulting to CC1.");
                        this.l = 0;
                        this.k = 0;
                    } else {
                        this.l = 1;
                        this.k = 1;
                    }
                } else {
                    this.l = 0;
                    this.k = 1;
                }
            } else {
                this.l = 1;
                this.k = 0;
            }
        } else {
            this.l = 0;
            this.k = 0;
        }
        N(0);
        M();
        this.y = true;
        this.z = C10323vs.b;
    }

    public static boolean A(byte b) {
        if ((b & 224) == 0) {
            return true;
        }
        return false;
    }

    public static boolean B(byte b, byte b2) {
        if ((b & 246) == 18 && (b2 & 224) == 32) {
            return true;
        }
        return false;
    }

    public static boolean C(byte b, byte b2) {
        if ((b & 247) == 17 && (b2 & 240) == 32) {
            return true;
        }
        return false;
    }

    public static boolean D(byte b, byte b2) {
        if ((b & 246) == 20 && (b2 & 240) == 32) {
            return true;
        }
        return false;
    }

    public static boolean E(byte b, byte b2) {
        if ((b & 240) == 16 && (b2 & C2638Cg0.o7) == 64) {
            return true;
        }
        return false;
    }

    public static boolean F(byte b) {
        if ((b & 240) == 16) {
            return true;
        }
        return false;
    }

    public static boolean H(byte b) {
        if ((b & 246) == 20) {
            return true;
        }
        return false;
    }

    public static boolean I(byte b, byte b2) {
        if ((b & 247) == 17 && (b2 & 240) == 48) {
            return true;
        }
        return false;
    }

    public static boolean J(byte b, byte b2) {
        if ((b & 247) == 23 && b2 >= 33 && b2 <= 35) {
            return true;
        }
        return false;
    }

    public static boolean K(byte b) {
        if (1 <= b && b <= 15) {
            return true;
        }
        return false;
    }

    public static char q(byte b) {
        return (char) h0[(b & Byte.MAX_VALUE) - 32];
    }

    public static int r(byte b) {
        return (b >> 3) & 1;
    }

    public static char t(byte b) {
        return (char) j0[b & 31];
    }

    public static char u(byte b) {
        return (char) k0[b & 31];
    }

    public static char v(byte b, byte b2) {
        if ((b & 1) == 0) {
            return t(b2);
        }
        return u(b2);
    }

    public static char w(byte b) {
        return (char) i0[b & C8077mf.q];
    }

    public final boolean G(boolean z, byte b, byte b2) {
        if (z && F(b)) {
            if (this.u && this.v == b && this.w == b2) {
                this.u = false;
                return true;
            }
            this.u = true;
            this.v = b;
            this.w = b2;
        } else {
            this.u = false;
        }
        return false;
    }

    public final void L(byte b, byte b2) {
        if (K(b)) {
            this.y = false;
        } else if (H(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.y = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.y = true;
        }
    }

    public final void M() {
        this.f499o.j(this.r);
        this.n.clear();
        this.n.add(this.f499o);
    }

    public final void N(int i) {
        int i2 = this.r;
        if (i2 != i) {
            this.r = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.n.size(); i3++) {
                    this.n.get(i3).l(i);
                }
                return;
            }
            M();
            if (i2 != 3 && i != 1 && i != 0) {
                return;
            }
            this.p = Collections.EMPTY_LIST;
        }
    }

    public final void O(int i) {
        this.s = i;
        this.f499o.m(i);
    }

    public final boolean P() {
        if (this.m == C10323vs.b || this.z == C10323vs.b || k() - this.z < this.m) {
            return false;
        }
        return true;
    }

    public final boolean Q(byte b) {
        if (A(b)) {
            this.x = r(b);
        }
        if (this.x == this.l) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC4117Rg2
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // o.AbstractC3698Mz
    public InterfaceC4020Qg2 e() {
        List<C7284jS> list = this.p;
        this.q = list;
        return new C3796Nz((List) C9542sf.g(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0017 A[SYNTHETIC] */
    @Override // o.AbstractC3698Mz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(C4508Vg2 c4508Vg2) {
        int L2;
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c4508Vg2.Y0);
        this.i.W(byteBuffer.array(), byteBuffer.limit());
        boolean z2 = false;
        while (true) {
            int a2 = this.i.a();
            int i = this.j;
            if (a2 < i) {
                break;
            }
            if (i == 2) {
                L2 = -4;
            } else {
                L2 = this.i.L();
            }
            int L3 = this.i.L();
            int L4 = this.i.L();
            if ((L2 & 2) == 0 && (L2 & 1) == this.k) {
                byte b = (byte) (L3 & 127);
                byte b2 = (byte) (L4 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.t;
                    if ((L2 & 4) == 4) {
                        boolean[] zArr = l0;
                        if (zArr[L3] && zArr[L4]) {
                            z = true;
                            this.t = z;
                            if (!G(z, b, b2)) {
                                if (!this.t) {
                                    if (z3) {
                                        M();
                                        z2 = true;
                                    }
                                } else {
                                    L(b, b2);
                                    if (this.y && Q(b)) {
                                        if (A(b)) {
                                            if (I(b, b2)) {
                                                this.f499o.e(w(b2));
                                            } else if (B(b, b2)) {
                                                this.f499o.f();
                                                this.f499o.e(v(b, b2));
                                            } else if (C(b, b2)) {
                                                x(b2);
                                            } else if (E(b, b2)) {
                                                z(b, b2);
                                            } else if (J(b, b2)) {
                                                this.f499o.f = b2 - 32;
                                            } else if (D(b, b2)) {
                                                y(b2);
                                            }
                                        } else {
                                            this.f499o.e(q(b));
                                            if ((b2 & 224) != 0) {
                                                this.f499o.e(q(b2));
                                            }
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    this.t = z;
                    if (!G(z, b, b2)) {
                    }
                }
            }
        }
        if (z2) {
            int i2 = this.r;
            if (i2 == 1 || i2 == 3) {
                this.p = s();
                this.z = k();
            }
        }
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public void flush() {
        super.flush();
        this.p = null;
        this.q = null;
        N(0);
        O(4);
        M();
        this.t = false;
        this.u = false;
        this.v = (byte) 0;
        this.w = (byte) 0;
        this.x = 0;
        this.y = true;
        this.z = C10323vs.b;
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public String getName() {
        return B;
    }

    @Override // o.AbstractC3698Mz
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ C4508Vg2 h() throws C4217Sg2 {
        return super.d();
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: i */
    public AbstractC4605Wg2 b() throws C4217Sg2 {
        AbstractC4605Wg2 j;
        AbstractC4605Wg2 b = super.b();
        if (b != null) {
            return b;
        }
        if (P() && (j = j()) != null) {
            this.p = Collections.EMPTY_LIST;
            this.z = C10323vs.b;
            j.w(k(), e(), Long.MAX_VALUE);
            return j;
        }
        return null;
    }

    @Override // o.AbstractC3698Mz
    public boolean l() {
        if (this.p != this.q) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3698Mz
    public /* bridge */ /* synthetic */ void m(C4508Vg2 c4508Vg2) throws C4217Sg2 {
        super.c(c4508Vg2);
    }

    public final List<C7284jS> s() {
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C7284jS g = this.n.get(i2).g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.d1);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C7284jS c7284jS = (C7284jS) arrayList.get(i3);
            if (c7284jS != null) {
                if (c7284jS.d1 != i) {
                    c7284jS = (C7284jS) C9542sf.g(this.n.get(i3).g(i));
                }
                arrayList2.add(c7284jS);
            }
        }
        return arrayList2;
    }

    public final void x(byte b) {
        boolean z;
        this.f499o.e(' ');
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f499o.p((b >> 1) & 7, z);
    }

    public final void y(byte b) {
        if (b != 32) {
            if (b != 41) {
                switch (b) {
                    case 37:
                        N(1);
                        O(2);
                        return;
                    case 38:
                        N(1);
                        O(3);
                        return;
                    case 39:
                        N(1);
                        O(4);
                        return;
                    default:
                        int i = this.r;
                        if (i != 0) {
                            if (b != 33) {
                                switch (b) {
                                    case 44:
                                        this.p = Collections.EMPTY_LIST;
                                        if (i != 1 && i != 3) {
                                            return;
                                        }
                                        M();
                                        return;
                                    case 45:
                                        if (i == 1 && !this.f499o.i()) {
                                            this.f499o.k();
                                            return;
                                        }
                                        return;
                                    case 46:
                                        M();
                                        return;
                                    case 47:
                                        this.p = s();
                                        M();
                                        return;
                                    default:
                                        return;
                                }
                            }
                            this.f499o.f();
                            return;
                        }
                        return;
                }
            }
            N(3);
            return;
        }
        N(2);
    }

    public final void z(byte b, byte b2) {
        boolean z;
        int i;
        int i2 = N[b & 7];
        if ((b2 & 32) != 0) {
            i2++;
        }
        if (i2 != this.f499o.d) {
            if (this.r != 1 && !this.f499o.i()) {
                a aVar = new a(this.r, this.s);
                this.f499o = aVar;
                this.n.add(aVar);
            }
            this.f499o.d = i2;
        }
        boolean z2 = false;
        if ((b2 & C8077mf.r) == 16) {
            z = true;
        } else {
            z = false;
        }
        if ((b2 & 1) == 1) {
            z2 = true;
        }
        int i3 = (b2 >> 1) & 7;
        a aVar2 = this.f499o;
        if (z) {
            i = 8;
        } else {
            i = i3;
        }
        aVar2.p(i, z2);
        if (z) {
            this.f499o.e = O[i3];
        }
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public void g() {
    }
}
