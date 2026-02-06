package o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import o.C7284jS;

@Deprecated
/* loaded from: classes2.dex */
public final class QC1 extends AbstractC5012a82 {
    public static final int s = 20;
    public static final int t = 21;
    public static final int u = 22;
    public static final int v = 128;
    public static final byte w = 120;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f587o;
    public final C3012Fy1 p;
    public final a q;
    @InterfaceC11300zs1
    public Inflater r;

    /* loaded from: classes2.dex */
    public static final class a {
        public final C3012Fy1 a = new C3012Fy1();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        @InterfaceC11300zs1
        public C7284jS d() {
            int i;
            int L;
            int i2;
            if (this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0 && this.a.g() != 0 && this.a.f() == this.a.g() && this.c) {
                this.a.Y(0);
                int i3 = this.h * this.i;
                int[] iArr = new int[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int L2 = this.a.L();
                    if (L2 != 0) {
                        i = i4 + 1;
                        iArr[i4] = this.b[L2];
                    } else {
                        int L3 = this.a.L();
                        if (L3 != 0) {
                            if ((L3 & 64) == 0) {
                                L = L3 & 63;
                            } else {
                                L = ((L3 & 63) << 8) | this.a.L();
                            }
                            if ((L3 & 128) == 0) {
                                i2 = 0;
                            } else {
                                i2 = this.b[this.a.L()];
                            }
                            i = L + i4;
                            Arrays.fill(iArr, i4, i, i2);
                        }
                    }
                    i4 = i;
                }
                return new C7284jS.c().r(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).w(this.f / this.d).x(0).t(this.g / this.e, 0).u(0).z(this.h / this.d).s(this.i / this.e).a();
            }
            return null;
        }

        public final void e(C3012Fy1 c3012Fy1, int i) {
            boolean z;
            int O;
            if (i >= 4) {
                c3012Fy1.Z(3);
                if ((c3012Fy1.L() & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 4;
                if (z) {
                    if (i2 >= 7 && (O = c3012Fy1.O()) >= 4) {
                        this.h = c3012Fy1.R();
                        this.i = c3012Fy1.R();
                        this.a.U(O - 4);
                        i2 = i - 11;
                    } else {
                        return;
                    }
                }
                int f = this.a.f();
                int g = this.a.g();
                if (f < g && i2 > 0) {
                    int min = Math.min(i2, g - f);
                    c3012Fy1.n(this.a.e(), f, min);
                    this.a.Y(f + min);
                }
            }
        }

        public final void f(C3012Fy1 c3012Fy1, int i) {
            if (i < 19) {
                return;
            }
            this.d = c3012Fy1.R();
            this.e = c3012Fy1.R();
            c3012Fy1.Z(11);
            this.f = c3012Fy1.R();
            this.g = c3012Fy1.R();
        }

        public final void g(C3012Fy1 c3012Fy1, int i) {
            if (i % 5 != 2) {
                return;
            }
            c3012Fy1.Z(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int L = c3012Fy1.L();
                int L2 = c3012Fy1.L();
                int L3 = c3012Fy1.L();
                int L4 = c3012Fy1.L();
                double d = L2;
                double d2 = L3 - 128;
                double d3 = L4 - 128;
                this.b[L] = (TD2.w((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (c3012Fy1.L() << 24) | (TD2.w((int) ((1.402d * d2) + d), 0, 255) << 16) | TD2.w((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.U(0);
            this.c = false;
        }
    }

    public QC1() {
        super("PgsDecoder");
        this.f587o = new C3012Fy1();
        this.p = new C3012Fy1();
        this.q = new a();
    }

    @InterfaceC11300zs1
    public static C7284jS D(C3012Fy1 c3012Fy1, a aVar) {
        int g = c3012Fy1.g();
        int L = c3012Fy1.L();
        int R = c3012Fy1.R();
        int f = c3012Fy1.f() + R;
        C7284jS c7284jS = null;
        if (f > g) {
            c3012Fy1.Y(g);
            return null;
        }
        if (L != 128) {
            switch (L) {
                case 20:
                    aVar.g(c3012Fy1, R);
                    break;
                case 21:
                    aVar.e(c3012Fy1, R);
                    break;
                case 22:
                    aVar.f(c3012Fy1, R);
                    break;
            }
        } else {
            c7284jS = aVar.d();
            aVar.h();
        }
        c3012Fy1.Y(f);
        return c7284jS;
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) throws C4217Sg2 {
        this.f587o.W(bArr, i);
        C(this.f587o);
        this.q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f587o.a() >= 3) {
            C7284jS D = D(this.f587o, this.q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new RC1(Collections.unmodifiableList(arrayList));
    }

    public final void C(C3012Fy1 c3012Fy1) {
        if (c3012Fy1.a() > 0 && c3012Fy1.k() == 120) {
            if (this.r == null) {
                this.r = new Inflater();
            }
            if (TD2.Q0(c3012Fy1, this.p, this.r)) {
                c3012Fy1.W(this.p.e(), this.p.g());
            }
        }
    }
}
