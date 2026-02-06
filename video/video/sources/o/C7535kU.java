package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.OU;

@Deprecated
/* renamed from: o.kU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7535kU {
    @Deprecated
    public static OU a(ZR1 zr1, String str, XN1 xn1, int i) {
        return b(zr1, str, xn1, i, AbstractC6044eO0.u());
    }

    public static OU b(ZR1 zr1, String str, XN1 xn1, int i, Map<String, String> map) {
        return new OU.b().j(xn1.b(str)).i(xn1.a).h(xn1.b).g(o(zr1, xn1)).c(i).f(map).a();
    }

    @Deprecated
    public static OU c(ZR1 zr1, XN1 xn1, int i) {
        return b(zr1, zr1.d.get(0).a, xn1, i, AbstractC6044eO0.u());
    }

    @InterfaceC11300zs1
    public static ZR1 d(CC1 cc1, int i) {
        int a = cc1.a(i);
        if (a == -1) {
            return null;
        }
        List<ZR1> list = cc1.c.get(a).c;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @InterfaceC11300zs1
    public static C6979iC e(FU fu, int i, ZR1 zr1) throws IOException {
        return f(fu, i, zr1, 0);
    }

    @InterfaceC11300zs1
    public static C6979iC f(FU fu, int i, ZR1 zr1, int i2) throws IOException {
        if (zr1.n() == null) {
            return null;
        }
        InterfaceC6493gC n = n(i, zr1.c);
        try {
            h(n, fu, zr1, i2, true);
            n.g();
            return n.d();
        } catch (Throwable th) {
            n.g();
            throw th;
        }
    }

    @InterfaceC11300zs1
    public static C10833xx0 g(FU fu, CC1 cc1) throws IOException {
        int i = 2;
        ZR1 d = d(cc1, 2);
        if (d == null) {
            i = 1;
            d = d(cc1, 1);
            if (d == null) {
                return null;
            }
        }
        C10833xx0 c10833xx0 = d.c;
        C10833xx0 l = l(fu, i, d);
        if (l == null) {
            return c10833xx0;
        }
        return l.l(c10833xx0);
    }

    public static void h(InterfaceC6493gC interfaceC6493gC, FU fu, ZR1 zr1, int i, boolean z) throws IOException {
        XN1 xn1 = (XN1) C9542sf.g(zr1.n());
        if (z) {
            XN1 m = zr1.m();
            if (m == null) {
                return;
            }
            XN1 a = xn1.a(m, zr1.d.get(i).a);
            if (a == null) {
                j(fu, zr1, i, interfaceC6493gC, xn1);
                xn1 = m;
            } else {
                xn1 = a;
            }
        }
        j(fu, zr1, i, interfaceC6493gC, xn1);
    }

    public static void i(InterfaceC6493gC interfaceC6493gC, FU fu, ZR1 zr1, boolean z) throws IOException {
        h(interfaceC6493gC, fu, zr1, 0, z);
    }

    public static void j(FU fu, ZR1 zr1, int i, InterfaceC6493gC interfaceC6493gC, XN1 xn1) throws IOException {
        new EP0(fu, b(zr1, zr1.d.get(i).a, xn1, 0, AbstractC6044eO0.u()), zr1.c, 0, null, interfaceC6493gC).a();
    }

    public static C6067eU k(FU fu, Uri uri) throws IOException {
        return (C6067eU) C4086Qy1.g(fu, new C6310fU(), uri, 4);
    }

    @InterfaceC11300zs1
    public static C10833xx0 l(FU fu, int i, ZR1 zr1) throws IOException {
        return m(fu, i, zr1, 0);
    }

    @InterfaceC11300zs1
    public static C10833xx0 m(FU fu, int i, ZR1 zr1, int i2) throws IOException {
        if (zr1.n() == null) {
            return null;
        }
        InterfaceC6493gC n = n(i, zr1.c);
        try {
            h(n, fu, zr1, i2, false);
            n.g();
            return ((C10833xx0[]) C9542sf.k(n.e()))[0];
        } catch (Throwable th) {
            n.g();
            throw th;
        }
    }

    public static InterfaceC6493gC n(int i, C10833xx0 c10833xx0) {
        InterfaceC4324Tj0 c3894Oz0;
        String str = c10833xx0.f1;
        if (str != null && (str.startsWith("video/webm") || str.startsWith(C4128Rj1.H))) {
            c3894Oz0 = new C10997yd1();
        } else {
            c3894Oz0 = new C3894Oz0();
        }
        return new C9347rr(c3894Oz0, i, c10833xx0);
    }

    public static String o(ZR1 zr1, XN1 xn1) {
        String a = zr1.a();
        if (a != null) {
            return a;
        }
        return xn1.b(zr1.d.get(0).a).toString();
    }
}
