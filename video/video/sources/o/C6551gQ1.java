package o;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: o.gQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6551gQ1 {
    public static final C8025mQ1 a;
    public static final String b = " (Kotlin reflection is not available)";
    public static final AW0[] c;

    static {
        C8025mQ1 c8025mQ1 = null;
        try {
            c8025mQ1 = (C8025mQ1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c8025mQ1 == null) {
            c8025mQ1 = new C8025mQ1();
        }
        a = c8025mQ1;
        c = new AW0[0];
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 A(Class cls) {
        return a.s(d(cls), Collections.EMPTY_LIST, false);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 B(Class cls, C5107aX0 c5107aX0) {
        return a.s(d(cls), Collections.singletonList(c5107aX0), false);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 C(Class cls, C5107aX0 c5107aX0, C5107aX0 c5107aX02) {
        return a.s(d(cls), Arrays.asList(c5107aX0, c5107aX02), false);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 D(Class cls, C5107aX0... c5107aX0Arr) {
        return a.s(d(cls), C7330jf.Uy(c5107aX0Arr), false);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 E(DW0 dw0) {
        return a.s(dw0, Collections.EMPTY_LIST, false);
    }

    @InterfaceC6480g82(version = "1.4")
    public static ZW0 F(Object obj, String str, EnumC5350bX0 enumC5350bX0, boolean z) {
        return a.t(obj, str, enumC5350bX0, z);
    }

    public static AW0 a(Class cls) {
        return a.a(cls);
    }

    public static AW0 b(Class cls, String str) {
        return a.b(cls, str);
    }

    public static FW0 c(C7703lB0 c7703lB0) {
        return a.c(c7703lB0);
    }

    public static AW0 d(Class cls) {
        return a.d(cls);
    }

    public static AW0 e(Class cls, String str) {
        return a.e(cls, str);
    }

    public static AW0[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return c;
        }
        AW0[] aw0Arr = new AW0[length];
        for (int i = 0; i < length; i++) {
            aw0Arr[i] = d(clsArr[i]);
        }
        return aw0Arr;
    }

    @InterfaceC6480g82(version = "1.4")
    public static EW0 g(Class cls) {
        return a.f(cls, "");
    }

    public static EW0 h(Class cls, String str) {
        return a.f(cls, str);
    }

    @InterfaceC6480g82(version = "1.6")
    public static XW0 i(XW0 xw0) {
        return a.g(xw0);
    }

    public static OW0 j(AbstractC3070Gn1 abstractC3070Gn1) {
        return a.h(abstractC3070Gn1);
    }

    public static PW0 k(AbstractC3266In1 abstractC3266In1) {
        return a.i(abstractC3266In1);
    }

    public static QW0 l(AbstractC3462Kn1 abstractC3462Kn1) {
        return a.j(abstractC3462Kn1);
    }

    @InterfaceC6480g82(version = "1.6")
    public static XW0 m(XW0 xw0) {
        return a.k(xw0);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 n(Class cls) {
        return a.s(d(cls), Collections.EMPTY_LIST, true);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 o(Class cls, C5107aX0 c5107aX0) {
        return a.s(d(cls), Collections.singletonList(c5107aX0), true);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 p(Class cls, C5107aX0 c5107aX0, C5107aX0 c5107aX02) {
        return a.s(d(cls), Arrays.asList(c5107aX0, c5107aX02), true);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 q(Class cls, C5107aX0... c5107aX0Arr) {
        return a.s(d(cls), C7330jf.Uy(c5107aX0Arr), true);
    }

    @InterfaceC6480g82(version = "1.4")
    public static XW0 r(DW0 dw0) {
        return a.s(dw0, Collections.EMPTY_LIST, true);
    }

    @InterfaceC6480g82(version = "1.6")
    public static XW0 s(XW0 xw0, XW0 xw02) {
        return a.l(xw0, xw02);
    }

    public static UW0 t(EJ1 ej1) {
        return a.m(ej1);
    }

    public static VW0 u(GJ1 gj1) {
        return a.n(gj1);
    }

    public static WW0 v(IJ1 ij1) {
        return a.o(ij1);
    }

    @InterfaceC6480g82(version = "1.3")
    public static String w(InterfaceC6976iB0 interfaceC6976iB0) {
        return a.p(interfaceC6976iB0);
    }

    @InterfaceC6480g82(version = "1.1")
    public static String x(AbstractC8052mY0 abstractC8052mY0) {
        return a.q(abstractC8052mY0);
    }

    @InterfaceC6480g82(version = "1.4")
    public static void y(ZW0 zw0, XW0 xw0) {
        a.r(zw0, Collections.singletonList(xw0));
    }

    @InterfaceC6480g82(version = "1.4")
    public static void z(ZW0 zw0, XW0... xw0Arr) {
        a.r(zw0, C7330jf.Uy(xw0Arr));
    }
}
