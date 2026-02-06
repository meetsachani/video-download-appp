package o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.C3503Kz;
import o.C7284jS;

@Deprecated
/* renamed from: o.Kz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3503Kz extends AbstractC3698Mz {
    public static final int A = 159;
    public static final int A0 = 49;
    public static final int B = 255;
    public static final int B0 = 50;
    public static final int C = 31;
    public static final int C0 = 51;
    public static final int D = 127;
    public static final int D0 = 52;
    public static final int E = 159;
    public static final int E0 = 53;
    public static final int F = 255;
    public static final int F0 = 57;
    public static final int G = 0;
    public static final int G0 = 58;
    public static final int H = 3;
    public static final int H0 = 60;
    public static final int I = 8;
    public static final int I0 = 61;
    public static final int J = 12;
    public static final int J0 = 63;
    public static final int K = 13;
    public static final int K0 = 118;
    public static final int L = 14;
    public static final int L0 = 119;
    public static final int M = 16;
    public static final int M0 = 120;
    public static final int N = 17;
    public static final int N0 = 121;
    public static final int O = 23;
    public static final int O0 = 122;
    public static final int P = 24;
    public static final int P0 = 123;
    public static final int Q = 31;
    public static final int Q0 = 124;
    public static final int R = 128;
    public static final int R0 = 125;
    public static final int S = 129;
    public static final int S0 = 126;
    public static final int T = 130;
    public static final int T0 = 127;
    public static final int U = 131;
    public static final int V = 132;
    public static final int W = 133;
    public static final int X = 134;
    public static final int Y = 135;
    public static final int Z = 136;
    public static final int a0 = 137;
    public static final int b0 = 138;
    public static final int c0 = 139;
    public static final int d0 = 140;
    public static final int e0 = 141;
    public static final int f0 = 142;
    public static final int g0 = 143;
    public static final int h0 = 144;
    public static final int i0 = 145;
    public static final int j0 = 146;
    public static final int k0 = 151;
    public static final int l0 = 152;
    public static final int m0 = 153;
    public static final int n0 = 154;
    public static final int o0 = 155;
    public static final int p0 = 156;
    public static final int q0 = 157;
    public static final int r0 = 158;
    public static final int s0 = 159;
    public static final String t = "Cea708Decoder";
    public static final int t0 = 127;
    public static final int u = 8;
    public static final int u0 = 32;
    public static final int v = 2;
    public static final int v0 = 33;
    public static final int w = 3;
    public static final int w0 = 37;
    public static final int x = 4;
    public static final int x0 = 42;
    public static final int y = 31;
    public static final int y0 = 44;
    public static final int z = 127;
    public static final int z0 = 48;
    public final C3012Fy1 i = new C3012Fy1();
    public final C2903Ey1 j = new C2903Ey1();
    public int k = -1;
    public final boolean l;
    public final int m;
    public final b[] n;

    /* renamed from: o  reason: collision with root package name */
    public b f524o;
    @InterfaceC11300zs1
    public List<C7284jS> p;
    @InterfaceC11300zs1
    public List<C7284jS> q;
    @InterfaceC11300zs1
    public c r;
    public int s;

    /* renamed from: o.Kz$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final Comparator<a> c = new Comparator() { // from class: o.Jz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((C3503Kz.a) obj2).b, ((C3503Kz.a) obj).b);
                return compare;
            }
        };
        public final C7284jS a;
        public final int b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C7284jS.c z2 = new C7284jS.c().A(charSequence).B(alignment).t(f, i).u(i2).w(f2).x(i3).z(f3);
            if (z) {
                z2.E(i4);
            }
            this.a = z2.a();
            this.b = i5;
        }
    }

    /* renamed from: o.Kz$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final int A = 15;
        public static final int B = 0;
        public static final int C = 1;
        public static final int D = 2;
        public static final int E = 3;
        public static final int F = 0;
        public static final int G = 1;
        public static final int H = 2;
        public static final int I = 3;
        public static final int J = 0;
        public static final int K = 3;
        public static final int L = h(2, 2, 2, 0);
        public static final int M;
        public static final int N;
        public static final int O = 1;
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public static final int T = 4;
        public static final int U = 1;
        public static final int[] V;
        public static final int[] W;
        public static final int[] X;
        public static final boolean[] Y;
        public static final int[] Z;
        public static final int[] a0;
        public static final int[] b0;
        public static final int[] c0;
        public static final int w = 99;
        public static final int x = 74;
        public static final int y = 209;
        public static final int z = 4;
        public final List<SpannableString> a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f525o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int h = h(0, 0, 0, 0);
            M = h;
            int h2 = h(0, 0, 0, 3);
            N = h2;
            V = new int[]{0, 0, 0, 0, 0, 2, 0};
            W = new int[]{0, 0, 0, 0, 0, 0, 2};
            X = new int[]{3, 3, 3, 3, 3, 3, 1};
            Y = new boolean[]{false, false, false, true, true, true, false};
            Z = new int[]{h, h2, h, h, h2, h, h};
            a0 = new int[]{0, 1, 2, 3, 4, 3, 4};
            b0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            c0 = new int[]{h, h, h, h, h, h2, h2};
        }

        public b() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int h(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            C9542sf.c(i, 0, 4);
            C9542sf.c(i2, 0, 4);
            C9542sf.c(i3, 0, 4);
            C9542sf.c(i4, 0, 4);
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        i5 = 0;
                    }
                } else {
                    i5 = 127;
                }
                if (i <= 1) {
                    i6 = 255;
                } else {
                    i6 = 0;
                }
                if (i2 <= 1) {
                    i7 = 255;
                } else {
                    i7 = 0;
                }
                if (i3 > 1) {
                    i8 = 255;
                }
                return Color.argb(i5, i6, i7, i8);
            }
            i5 = 255;
            if (i <= 1) {
            }
            if (i2 <= 1) {
            }
            if (i3 > 1) {
            }
            return Color.argb(i5, i6, i7, i8);
        }

        public void a(char c) {
            if (c == '\n') {
                this.a.add(d());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((this.k && this.a.size() >= this.j) || this.a.size() >= 15) {
                        this.a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.b.append(c);
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
        @InterfaceC11300zs1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            int i;
            int i2;
            float f3;
            int i3;
            boolean z2;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.a.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.a.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i5 = this.l;
            int i6 = 2;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.l);
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                if (!this.f) {
                    f = this.h / 99.0f;
                    f2 = this.g / 99.0f;
                } else {
                    f = this.h / 209.0f;
                    f2 = this.g / 74.0f;
                }
                float f4 = (f * 0.9f) + 0.05f;
                float f5 = (f2 * 0.9f) + 0.05f;
                i = this.i;
                if (i / 3 != 0) {
                    i2 = i;
                    f3 = f4;
                    i3 = 0;
                } else if (i / 3 == 1) {
                    i2 = i;
                    f3 = f4;
                    i3 = 1;
                } else {
                    i2 = i;
                    f3 = f4;
                    i3 = 2;
                }
                if (i2 % 3 != 0) {
                    i6 = 0;
                } else if (i2 % 3 == 1) {
                    i6 = 1;
                }
                if (this.f525o == M) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new a(spannableStringBuilder, alignment, f5, 0, i3, f3, i6, -3.4028235E38f, z2, this.f525o, this.e);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            if (!this.f) {
            }
            float f42 = (f * 0.9f) + 0.05f;
            float f52 = (f2 * 0.9f) + 0.05f;
            i = this.i;
            if (i / 3 != 0) {
            }
            if (i2 % 3 != 0) {
            }
            if (this.f525o == M) {
            }
            return new a(spannableStringBuilder, alignment, f52, 0, i3, f3, i6, -3.4028235E38f, z2, this.f525o, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    }
                    this.a.remove(0);
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                q(Z[i10], N, Y[i10], 0, W[i10], X[i10], V[i10]);
            }
            if (i8 != 0 && this.n != i8) {
                this.n = i8;
                int i11 = i8 - 1;
                m(0, 1, 1, false, false, b0[i11], a0[i11]);
                n(L, c0[i11], M);
            }
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            if (i()) {
                if (!this.a.isEmpty() || this.b.length() != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = M;
            this.f525o = i;
            this.s = L;
            this.u = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q != -1) {
                if (!z3) {
                    this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                    this.q = -1;
                }
            } else if (z3) {
                this.q = this.b.length();
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.r != -1 && this.s != i) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i != L) {
                this.r = this.b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i2 != M) {
                this.t = this.b.length();
                this.u = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.f525o = i;
            this.l = i6;
        }
    }

    /* renamed from: o.Kz$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public C3503Kz(int i, @InterfaceC11300zs1 List<byte[]> list) {
        boolean z2 = true;
        this.m = i == -1 ? 1 : i;
        this.l = (list == null || !JE.i(list)) ? false : z2;
        this.n = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.n[i2] = new b();
        }
        this.f524o = this.n[0];
    }

    private void F() {
        for (int i = 0; i < 8; i++) {
            this.n[i].l();
        }
    }

    private List<C7284jS> q() {
        a c2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.n[i].j() && this.n[i].k() && (c2 = this.n[i].c()) != null) {
                arrayList.add(c2);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A() {
        this.f524o.m(this.j.h(4), this.j.h(2), this.j.h(2), this.j.g(), this.j.g(), this.j.h(3), this.j.h(3));
    }

    public final void B() {
        int h = b.h(this.j.h(2), this.j.h(2), this.j.h(2), this.j.h(2));
        int h2 = b.h(this.j.h(2), this.j.h(2), this.j.h(2), this.j.h(2));
        this.j.s(2);
        this.f524o.n(h, h2, b.g(this.j.h(2), this.j.h(2), this.j.h(2)));
    }

    public final void C() {
        this.j.s(4);
        int h = this.j.h(4);
        this.j.s(2);
        this.f524o.o(h, this.j.h(6));
    }

    public final void D() {
        int h = b.h(this.j.h(2), this.j.h(2), this.j.h(2), this.j.h(2));
        int h2 = this.j.h(2);
        int g = b.g(this.j.h(2), this.j.h(2), this.j.h(2));
        if (this.j.g()) {
            h2 |= 4;
        }
        boolean g2 = this.j.g();
        int h3 = this.j.h(2);
        int h4 = this.j.h(2);
        int h5 = this.j.h(2);
        this.j.s(8);
        this.f524o.q(h, g, g2, h2, h3, h4, h5);
    }

    @HS1({"currentDtvCcPacket"})
    public final void E() {
        c cVar = this.r;
        if (cVar.d != (cVar.b * 2) - 1) {
            I31.b(t, "DtvCcPacket ended prematurely; size is " + ((this.r.b * 2) - 1) + ", but current index is " + this.r.d + " (sequence number " + this.r.a + ");");
        }
        C2903Ey1 c2903Ey1 = this.j;
        c cVar2 = this.r;
        c2903Ey1.p(cVar2.c, cVar2.d);
        boolean z2 = false;
        while (true) {
            if (this.j.b() <= 0) {
                break;
            }
            int h = this.j.h(3);
            int h2 = this.j.h(5);
            if (h == 7) {
                this.j.s(2);
                h = this.j.h(6);
                if (h < 7) {
                    I31.n(t, "Invalid extended service number: " + h);
                }
            }
            if (h2 == 0) {
                if (h != 0) {
                    I31.n(t, "serviceNumber is non-zero (" + h + ") when blockSize is 0");
                }
            } else if (h != this.m) {
                this.j.t(h2);
            } else {
                int e = this.j.e() + (h2 * 8);
                while (this.j.e() < e) {
                    int h3 = this.j.h(8);
                    if (h3 != 16) {
                        if (h3 <= 31) {
                            r(h3);
                        } else {
                            if (h3 <= 127) {
                                w(h3);
                            } else if (h3 <= 159) {
                                s(h3);
                            } else if (h3 <= 255) {
                                x(h3);
                            } else {
                                I31.n(t, "Invalid base command: " + h3);
                            }
                            z2 = true;
                        }
                    } else {
                        int h4 = this.j.h(8);
                        if (h4 <= 31) {
                            t(h4);
                        } else {
                            if (h4 <= 127) {
                                y(h4);
                            } else if (h4 <= 159) {
                                u(h4);
                            } else if (h4 <= 255) {
                                z(h4);
                            } else {
                                I31.n(t, "Invalid extended command: " + h4);
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            this.p = q();
        }
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

    @Override // o.AbstractC3698Mz
    public void f(C4508Vg2 c4508Vg2) {
        boolean z2;
        ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c4508Vg2.Y0);
        this.i.W(byteBuffer.array(), byteBuffer.limit());
        while (this.i.a() >= 3) {
            int L2 = this.i.L();
            int i = L2 & 3;
            boolean z3 = false;
            if ((L2 & 4) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            byte L3 = (byte) this.i.L();
            byte L4 = (byte) this.i.L();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        p();
                        int i2 = (L3 & C2638Cg0.o7) >> 6;
                        int i3 = this.k;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            F();
                            I31.n(t, "Sequence number discontinuity. previous=" + this.k + " current=" + i2);
                        }
                        this.k = i2;
                        int i4 = L3 & ED2.a;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.r = cVar;
                        byte[] bArr = cVar.c;
                        int i5 = cVar.d;
                        cVar.d = i5 + 1;
                        bArr[i5] = L4;
                    } else {
                        if (i == 2) {
                            z3 = true;
                        }
                        C9542sf.a(z3);
                        c cVar2 = this.r;
                        if (cVar2 == null) {
                            I31.d(t, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i6 = cVar2.d;
                            int i7 = i6 + 1;
                            cVar2.d = i7;
                            bArr2[i6] = L3;
                            cVar2.d = i6 + 2;
                            bArr2[i7] = L4;
                        }
                    }
                    c cVar3 = this.r;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        p();
                    }
                }
            }
        }
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public void flush() {
        super.flush();
        this.p = null;
        this.q = null;
        this.s = 0;
        this.f524o = this.n[0];
        F();
        this.r = null;
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // o.AbstractC3698Mz, o.InterfaceC8288nW
    public String getName() {
        return t;
    }

    @Override // o.AbstractC3698Mz
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ C4508Vg2 h() throws C4217Sg2 {
        return super.d();
    }

    @Override // o.AbstractC3698Mz
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ AbstractC4605Wg2 i() throws C4217Sg2 {
        return super.b();
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

    public final void p() {
        if (this.r == null) {
            return;
        }
        E();
        this.r = null;
    }

    public final void r(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 8) {
                    switch (i) {
                        case 12:
                            F();
                            return;
                        case 13:
                            this.f524o.a('\n');
                            return;
                        case 14:
                            return;
                        default:
                            if (i >= 17 && i <= 23) {
                                I31.n(t, "Currently unsupported COMMAND_EXT1 Command: " + i);
                                this.j.s(8);
                                return;
                            } else if (i >= 24 && i <= 31) {
                                I31.n(t, "Currently unsupported COMMAND_P16 Command: " + i);
                                this.j.s(16);
                                return;
                            } else {
                                I31.n(t, "Invalid C0 command: " + i);
                                return;
                            }
                    }
                }
                this.f524o.b();
                return;
            }
            this.p = q();
        }
    }

    public final void s(int i) {
        b bVar;
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case V /* 132 */:
            case W /* 133 */:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.s != i3) {
                    this.s = i3;
                    this.f524o = this.n[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.j.g()) {
                        this.n[8 - i2].e();
                    }
                    i2++;
                }
                return;
            case a0 /* 137 */:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.j.g()) {
                        this.n[8 - i4].p(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.j.g()) {
                        this.n[8 - i2].p(false);
                    }
                    i2++;
                }
                return;
            case c0 /* 139 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.j.g()) {
                        this.n[8 - i5].p(!bVar.k());
                    }
                }
                return;
            case d0 /* 140 */:
                while (i2 <= 8) {
                    if (this.j.g()) {
                        this.n[8 - i2].l();
                    }
                    i2++;
                }
                return;
            case e0 /* 141 */:
                this.j.s(8);
                return;
            case f0 /* 142 */:
                return;
            case g0 /* 143 */:
                F();
                return;
            case h0 /* 144 */:
                if (!this.f524o.i()) {
                    this.j.s(16);
                    return;
                } else {
                    A();
                    return;
                }
            case i0 /* 145 */:
                if (!this.f524o.i()) {
                    this.j.s(24);
                    return;
                } else {
                    B();
                    return;
                }
            case j0 /* 146 */:
                if (!this.f524o.i()) {
                    this.j.s(16);
                    return;
                } else {
                    C();
                    return;
                }
            case 147:
            case DE.g /* 148 */:
            case 149:
            case 150:
            default:
                I31.n(t, "Invalid C1 command: " + i);
                return;
            case k0 /* 151 */:
                if (!this.f524o.i()) {
                    this.j.s(32);
                    return;
                } else {
                    D();
                    return;
                }
            case l0 /* 152 */:
            case m0 /* 153 */:
            case n0 /* 154 */:
            case 155:
            case p0 /* 156 */:
            case q0 /* 157 */:
            case r0 /* 158 */:
            case 159:
                int i6 = i - 152;
                v(i6);
                if (this.s != i6) {
                    this.s = i6;
                    this.f524o = this.n[i6];
                    return;
                }
                return;
        }
    }

    public final void t(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.j.s(8);
            } else if (i <= 23) {
                this.j.s(16);
            } else if (i <= 31) {
                this.j.s(24);
            }
        }
    }

    public final void u(int i) {
        if (i <= 135) {
            this.j.s(32);
        } else if (i <= 143) {
            this.j.s(40);
        } else if (i <= 159) {
            this.j.s(2);
            this.j.s(this.j.h(6) * 8);
        }
    }

    public final void v(int i) {
        b bVar = this.n[i];
        this.j.s(2);
        boolean g = this.j.g();
        boolean g2 = this.j.g();
        boolean g3 = this.j.g();
        int h = this.j.h(3);
        boolean g4 = this.j.g();
        int h2 = this.j.h(7);
        int h3 = this.j.h(8);
        int h4 = this.j.h(4);
        int h5 = this.j.h(4);
        this.j.s(2);
        int h6 = this.j.h(6);
        this.j.s(2);
        bVar.f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.j.h(3), this.j.h(3));
    }

    public final void w(int i) {
        if (i == 127) {
            this.f524o.a((char) 9835);
        } else {
            this.f524o.a((char) (i & 255));
        }
    }

    public final void x(int i) {
        this.f524o.a((char) (i & 255));
    }

    public final void y(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 37) {
                    if (i != 42) {
                        if (i != 44) {
                            if (i != 63) {
                                if (i != 57) {
                                    if (i != 58) {
                                        if (i != 60) {
                                            if (i != 61) {
                                                switch (i) {
                                                    case 48:
                                                        this.f524o.a((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.f524o.a(Hw2.w);
                                                        return;
                                                    case 50:
                                                        this.f524o.a(Hw2.x);
                                                        return;
                                                    case 51:
                                                        this.f524o.a(Hw2.z);
                                                        return;
                                                    case 52:
                                                        this.f524o.a(Hw2.A);
                                                        return;
                                                    case 53:
                                                        this.f524o.a(Hw2.E);
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 118:
                                                                this.f524o.a((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.f524o.a((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.f524o.a((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.f524o.a((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.f524o.a((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.f524o.a((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.f524o.a((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.f524o.a((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.f524o.a((char) 9496);
                                                                return;
                                                            case 127:
                                                                this.f524o.a((char) 9484);
                                                                return;
                                                            default:
                                                                I31.n(t, "Invalid G2 character: " + i);
                                                                return;
                                                        }
                                                }
                                            }
                                            this.f524o.a((char) 8480);
                                            return;
                                        }
                                        this.f524o.a((char) 339);
                                        return;
                                    }
                                    this.f524o.a((char) 353);
                                    return;
                                }
                                this.f524o.a(Hw2.J);
                                return;
                            }
                            this.f524o.a((char) 376);
                            return;
                        }
                        this.f524o.a((char) 338);
                        return;
                    }
                    this.f524o.a((char) 352);
                    return;
                }
                this.f524o.a(Hw2.F);
                return;
            }
            this.f524o.a(Hw2.g);
            return;
        }
        this.f524o.a(' ');
    }

    public final void z(int i) {
        if (i == 160) {
            this.f524o.a((char) 13252);
            return;
        }
        I31.n(t, "Invalid G3 character: " + i);
        this.f524o.a('_');
    }
}
