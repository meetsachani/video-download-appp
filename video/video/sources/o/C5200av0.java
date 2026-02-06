package o;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* renamed from: o.av0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5200av0 {
    public static final int A = 26;
    public static final int B = 36;
    public static final InterfaceC10457wO1 C = new C2825Ee(new byte[]{0}, 1);
    public static final /* synthetic */ boolean D = false;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;

    /* renamed from: o  reason: collision with root package name */
    public static final int f695o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 19;
    public static final int u = 20;
    public static final int v = 21;
    public static final int w = 22;
    public static final int x = 23;
    public static final int y = 24;
    public static final int z = 25;

    /* renamed from: o.av0$a */
    /* loaded from: classes.dex */
    public static class a extends h {
        public static final a e = new a(C5200av0.C, 1, 1);
        public static final /* synthetic */ boolean f = false;

        public a(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            super(interfaceC10457wO1, i, i2);
        }

        public static a d() {
            return e;
        }

        @Override // o.C5200av0.f
        public StringBuilder a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.a.j(this.b, b()));
            sb.append('\"');
            return sb;
        }

        @Override // o.C5200av0.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.a.h());
            wrap.position(this.b);
            wrap.limit(this.b + b());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i) {
            return this.a.get(this.b + i);
        }

        public byte[] f() {
            int b = b();
            byte[] bArr = new byte[b];
            for (int i = 0; i < b; i++) {
                bArr[i] = this.a.get(this.b + i);
            }
            return bArr;
        }

        @Override // o.C5200av0.f
        public String toString() {
            return this.a.j(this.b, b());
        }
    }

    /* renamed from: o.av0$b */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: o.av0$c */
    /* loaded from: classes.dex */
    public static class c extends f {
        public static final c d = new c(C5200av0.C, 0, 0);

        public c(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            super(interfaceC10457wO1, i, i2);
        }

        public static c d() {
            return d;
        }

        @Override // o.C5200av0.f
        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public int c(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.b;
            int i2 = 0;
            do {
                b = this.a.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || cVar.c != this.c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b ^ this.c;
        }

        @Override // o.C5200av0.f
        public String toString() {
            int i = this.b;
            while (this.a.get(i) != 0) {
                i++;
            }
            int i2 = this.b;
            return this.a.j(i2, i - i2);
        }
    }

    /* renamed from: o.av0$d */
    /* loaded from: classes.dex */
    public static class d {
        public final i a;

        public d(i iVar) {
            this.a = iVar;
        }

        public c a(int i) {
            if (i >= b()) {
                return c.d;
            }
            i iVar = this.a;
            i iVar2 = this.a;
            InterfaceC10457wO1 interfaceC10457wO1 = iVar2.a;
            return new c(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, iVar.b + (i * iVar.c), iVar2.c), 1);
        }

        public int b() {
            return this.a.b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.a.b(); i++) {
                this.a.d(i).z(sb);
                if (i != this.a.b() - 1) {
                    sb.append(C6566gU0.h);
                }
            }
            sb.append(C6566gU0.g);
            return sb.toString();
        }
    }

    /* renamed from: o.av0$e */
    /* loaded from: classes.dex */
    public static class e extends k {
        public static final e f = new e(C5200av0.C, 1, 1);

        public e(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            super(interfaceC10457wO1, i, i2);
        }

        public static e g() {
            return f;
        }

        @Override // o.C5200av0.k, o.C5200av0.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            d j = j();
            int b = b();
            k k = k();
            for (int i = 0; i < b; i++) {
                sb.append('\"');
                sb.append(j.a(i).toString());
                sb.append("\" : ");
                sb.append(k.d(i).toString());
                if (i != b - 1) {
                    sb.append(C6566gU0.h);
                }
            }
            sb.append(" }");
            return sb;
        }

        public final int f(d dVar, byte[] bArr) {
            int b = dVar.b() - 1;
            int i = 0;
            while (i <= b) {
                int i2 = (i + b) >>> 1;
                int c = dVar.a(i2).c(bArr);
                if (c < 0) {
                    i = i2 + 1;
                } else if (c > 0) {
                    b = i2 - 1;
                } else {
                    return i2;
                }
            }
            return -(i + 1);
        }

        public g h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public g i(byte[] bArr) {
            d j = j();
            int b = j.b();
            int f2 = f(j, bArr);
            if (f2 < 0 || f2 >= b) {
                return g.f;
            }
            return d(f2);
        }

        public d j() {
            int i = this.b - (this.c * 3);
            InterfaceC10457wO1 interfaceC10457wO1 = this.a;
            int i2 = C5200av0.i(interfaceC10457wO1, i, this.c);
            InterfaceC10457wO1 interfaceC10457wO12 = this.a;
            int i3 = this.c;
            return new d(new i(interfaceC10457wO1, i2, C5200av0.n(interfaceC10457wO12, i + i3, i3), 4));
        }

        public k k() {
            return new k(this.a, this.b, this.c);
        }
    }

    /* renamed from: o.av0$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        public InterfaceC10457wO1 a;
        public int b;
        public int c;

        public f(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            this.a = interfaceC10457wO1;
            this.b = i;
            this.c = i2;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* renamed from: o.av0$g */
    /* loaded from: classes.dex */
    public static class g {
        public static final g f = new g(C5200av0.C, 0, 1, 0);
        public InterfaceC10457wO1 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public g(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2, int i3) {
            this(interfaceC10457wO1, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            InterfaceC10457wO1 interfaceC10457wO1 = this.a;
            return new a(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
        }

        public boolean c() {
            if (n()) {
                if (this.a.get(this.b) == 0) {
                    return false;
                }
                return true;
            } else if (j() == 0) {
                return false;
            } else {
                return true;
            }
        }

        public double d() {
            int i = this.e;
            if (i == 3) {
                return C5200av0.m(this.a, this.b, this.c);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 10) {
                                        if (i != 26) {
                                            return 0.0d;
                                        }
                                    } else {
                                        return k().b();
                                    }
                                } else {
                                    InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                                    return C5200av0.m(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
                                }
                            } else {
                                InterfaceC10457wO1 interfaceC10457wO12 = this.a;
                                return C5200av0.p(interfaceC10457wO12, C5200av0.i(interfaceC10457wO12, this.b, this.c), this.d);
                            }
                        } else {
                            InterfaceC10457wO1 interfaceC10457wO13 = this.a;
                            return C5200av0.n(interfaceC10457wO13, C5200av0.i(interfaceC10457wO13, this.b, this.c), this.d);
                        }
                    } else {
                        return Double.parseDouble(i());
                    }
                }
                return C5200av0.p(this.a, this.b, this.c);
            }
            return C5200av0.n(this.a, this.b, this.c);
        }

        public int e() {
            int i = this.e;
            if (i == 1) {
                return C5200av0.n(this.a, this.b, this.c);
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 10) {
                                        if (i == 26) {
                                            return C5200av0.n(this.a, this.b, this.c);
                                        }
                                        return 0;
                                    }
                                    return k().b();
                                }
                                InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                                return (int) C5200av0.m(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
                            }
                            InterfaceC10457wO1 interfaceC10457wO12 = this.a;
                            return (int) C5200av0.p(interfaceC10457wO12, C5200av0.i(interfaceC10457wO12, this.b, this.c), this.c);
                        }
                        InterfaceC10457wO1 interfaceC10457wO13 = this.a;
                        return C5200av0.n(interfaceC10457wO13, C5200av0.i(interfaceC10457wO13, this.b, this.c), this.d);
                    }
                    return Integer.parseInt(i());
                }
                return (int) C5200av0.m(this.a, this.b, this.c);
            }
            return (int) C5200av0.p(this.a, this.b, this.c);
        }

        public c f() {
            if (r()) {
                InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                return new c(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
            }
            return c.d();
        }

        public long g() {
            int i = this.e;
            if (i == 1) {
                return C5200av0.o(this.a, this.b, this.c);
            }
            if (i == 2) {
                return C5200av0.p(this.a, this.b, this.c);
            }
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 10) {
                                    if (i != 26) {
                                        return 0L;
                                    }
                                    return C5200av0.n(this.a, this.b, this.c);
                                }
                                return k().b();
                            }
                            InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                            return (long) C5200av0.m(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
                        }
                        InterfaceC10457wO1 interfaceC10457wO12 = this.a;
                        return C5200av0.p(interfaceC10457wO12, C5200av0.i(interfaceC10457wO12, this.b, this.c), this.c);
                    }
                    InterfaceC10457wO1 interfaceC10457wO13 = this.a;
                    return C5200av0.o(interfaceC10457wO13, C5200av0.i(interfaceC10457wO13, this.b, this.c), this.d);
                }
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) C5200av0.m(this.a, this.b, this.c);
        }

        public e h() {
            if (s()) {
                InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                return new e(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
            }
            return e.g();
        }

        public String i() {
            if (v()) {
                int i = C5200av0.i(this.a, this.b, this.c);
                InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                int i2 = this.d;
                return this.a.j(i, (int) C5200av0.p(interfaceC10457wO1, i - i2, i2));
            } else if (r()) {
                int i3 = C5200av0.i(this.a, this.b, this.d);
                int i4 = i3;
                while (this.a.get(i4) != 0) {
                    i4++;
                }
                return this.a.j(i3, i4 - i3);
            } else {
                return "";
            }
        }

        public long j() {
            int i = this.e;
            if (i == 2) {
                return C5200av0.p(this.a, this.b, this.c);
            }
            if (i == 1) {
                return C5200av0.o(this.a, this.b, this.c);
            }
            if (i != 3) {
                if (i != 10) {
                    if (i != 26) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 8) {
                                        return 0L;
                                    }
                                    InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                                    return (long) C5200av0.m(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.c);
                                }
                                InterfaceC10457wO1 interfaceC10457wO12 = this.a;
                                return C5200av0.p(interfaceC10457wO12, C5200av0.i(interfaceC10457wO12, this.b, this.c), this.d);
                            }
                            InterfaceC10457wO1 interfaceC10457wO13 = this.a;
                            return C5200av0.o(interfaceC10457wO13, C5200av0.i(interfaceC10457wO13, this.b, this.c), this.d);
                        }
                        return Long.parseLong(i());
                    }
                    return C5200av0.n(this.a, this.b, this.c);
                }
                return k().b();
            }
            return (long) C5200av0.m(this.a, this.b, this.c);
        }

        public k k() {
            if (y()) {
                InterfaceC10457wO1 interfaceC10457wO1 = this.a;
                return new k(interfaceC10457wO1, C5200av0.i(interfaceC10457wO1, this.b, this.c), this.d);
            }
            int i = this.e;
            if (i == 15) {
                InterfaceC10457wO1 interfaceC10457wO12 = this.a;
                return new i(interfaceC10457wO12, C5200av0.i(interfaceC10457wO12, this.b, this.c), this.d, 4);
            } else if (C5200av0.k(i)) {
                InterfaceC10457wO1 interfaceC10457wO13 = this.a;
                return new i(interfaceC10457wO13, C5200av0.i(interfaceC10457wO13, this.b, this.c), this.d, C5200av0.r(this.e));
            } else {
                return k.c();
            }
        }

        public int l() {
            return this.e;
        }

        public boolean m() {
            if (this.e == 25) {
                return true;
            }
            return false;
        }

        public boolean n() {
            if (this.e == 26) {
                return true;
            }
            return false;
        }

        public boolean o() {
            int i = this.e;
            if (i != 3 && i != 8) {
                return false;
            }
            return true;
        }

        public boolean p() {
            int i = this.e;
            if (i == 1 || i == 6) {
                return true;
            }
            return false;
        }

        public boolean q() {
            if (!p() && !x()) {
                return false;
            }
            return true;
        }

        public boolean r() {
            if (this.e == 4) {
                return true;
            }
            return false;
        }

        public boolean s() {
            if (this.e == 9) {
                return true;
            }
            return false;
        }

        public boolean t() {
            if (this.e == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            if (!q() && !o()) {
                return false;
            }
            return true;
        }

        public boolean v() {
            if (this.e == 5) {
                return true;
            }
            return false;
        }

        public boolean w() {
            return C5200av0.k(this.e);
        }

        public boolean x() {
            int i = this.e;
            if (i != 2 && i != 7) {
                return false;
            }
            return true;
        }

        public boolean y() {
            int i = this.e;
            if (i != 10 && i != 9) {
                return false;
            }
            return true;
        }

        public StringBuilder z(StringBuilder sb) {
            int i = this.e;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        c f2 = f();
                        sb.append('\"');
                        StringBuilder a = f2.a(sb);
                        a.append('\"');
                        return a;
                    case 5:
                        sb.append('\"');
                        sb.append(i());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return h().a(sb);
                    case 10:
                        return k().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b("not_implemented:" + this.e);
                    case 25:
                        return b().a(sb);
                    case 26:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(k());
            return sb;
        }

        public g(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2, int i3, int i4) {
            this.a = interfaceC10457wO1;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* renamed from: o.av0$h */
    /* loaded from: classes.dex */
    public static abstract class h extends f {
        public final int d;

        public h(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            super(interfaceC10457wO1, i, i2);
            this.d = C5200av0.n(this.a, i - i2, i2);
        }

        public int b() {
            return this.d;
        }
    }

    /* renamed from: o.av0$i */
    /* loaded from: classes.dex */
    public static class i extends k {
        public static final i g = new i(C5200av0.C, 1, 1, 1);
        public final int f;

        public i(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2, int i3) {
            super(interfaceC10457wO1, i, i2);
            this.f = i3;
        }

        public static i f() {
            return g;
        }

        @Override // o.C5200av0.k
        public g d(int i) {
            if (i >= b()) {
                return g.f;
            }
            return new g(this.a, this.b + (i * this.c), this.c, 1, this.f);
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            if (this == g) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.av0$j */
    /* loaded from: classes.dex */
    public static class j {
        public static int a(byte b) {
            return b & 255;
        }

        public static long b(int i) {
            return i & 4294967295L;
        }

        public static int c(short s) {
            return s & Xx2.Y0;
        }
    }

    /* renamed from: o.av0$k */
    /* loaded from: classes.dex */
    public static class k extends h {
        public static final k e = new k(C5200av0.C, 1, 1);

        public k(InterfaceC10457wO1 interfaceC10457wO1, int i, int i2) {
            super(interfaceC10457wO1, i, i2);
        }

        public static k c() {
            return e;
        }

        @Override // o.C5200av0.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b = b();
            for (int i = 0; i < b; i++) {
                d(i).z(sb);
                if (i != b - 1) {
                    sb.append(C6566gU0.h);
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // o.C5200av0.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i) {
            long b = b();
            long j = i;
            if (j >= b) {
                return g.f;
            }
            return new g(this.a, this.b + (i * this.c), this.c, j.a(this.a.get((int) (this.b + (b * this.c) + j))));
        }

        public boolean e() {
            if (this == e) {
                return true;
            }
            return false;
        }

        @Override // o.C5200av0.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Deprecated
    public static g g(ByteBuffer byteBuffer) {
        InterfaceC10457wO1 c4258Sr;
        if (byteBuffer.hasArray()) {
            c4258Sr = new C2825Ee(byteBuffer.array(), byteBuffer.limit());
        } else {
            c4258Sr = new C4258Sr(byteBuffer);
        }
        return h(c4258Sr);
    }

    public static g h(InterfaceC10457wO1 interfaceC10457wO1) {
        int g2 = interfaceC10457wO1.g();
        byte b2 = interfaceC10457wO1.get(g2 - 1);
        int i2 = g2 - 2;
        return new g(interfaceC10457wO1, i2 - b2, b2, j.a(interfaceC10457wO1.get(i2)));
    }

    public static int i(InterfaceC10457wO1 interfaceC10457wO1, int i2, int i3) {
        return (int) (i2 - p(interfaceC10457wO1, i2, i3));
    }

    public static boolean j(int i2) {
        if (i2 > 3 && i2 != 26) {
            return false;
        }
        return true;
    }

    public static boolean k(int i2) {
        if ((i2 >= 11 && i2 <= 15) || i2 == 36) {
            return true;
        }
        return false;
    }

    public static boolean l(int i2) {
        if ((i2 >= 1 && i2 <= 4) || i2 == 26) {
            return true;
        }
        return false;
    }

    public static double m(InterfaceC10457wO1 interfaceC10457wO1, int i2, int i3) {
        if (i3 != 4) {
            if (i3 != 8) {
                return -1.0d;
            }
            return interfaceC10457wO1.getDouble(i2);
        }
        return interfaceC10457wO1.getFloat(i2);
    }

    public static int n(InterfaceC10457wO1 interfaceC10457wO1, int i2, int i3) {
        return (int) o(interfaceC10457wO1, i2, i3);
    }

    public static long o(InterfaceC10457wO1 interfaceC10457wO1, int i2, int i3) {
        int i4;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return -1L;
                    }
                    return interfaceC10457wO1.getLong(i2);
                }
                i4 = interfaceC10457wO1.getInt(i2);
            } else {
                i4 = interfaceC10457wO1.getShort(i2);
            }
        } else {
            i4 = interfaceC10457wO1.get(i2);
        }
        return i4;
    }

    public static long p(InterfaceC10457wO1 interfaceC10457wO1, int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return -1L;
                    }
                    return interfaceC10457wO1.getLong(i2);
                }
                return j.b(interfaceC10457wO1.getInt(i2));
            }
            return j.c(interfaceC10457wO1.getShort(i2));
        }
        return j.a(interfaceC10457wO1.get(i2));
    }

    public static int q(int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return 0;
                    }
                    return i2 + 21;
                }
                return i2 + 18;
            }
            return i2 + 15;
        }
        return i2 + 10;
    }

    public static int r(int i2) {
        return i2 - 10;
    }
}
