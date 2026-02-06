package o;

import o.AbstractC10125v3;

/* renamed from: o.Fe2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2937Fe2 {
    public static final AbstractC10125v3.c a = new AbstractC10125v3.c(',');
    public static final AbstractC10125v3.c b = new AbstractC10125v3.c('\"');
    public static final C2937Fe2 c = new C2937Fe2();
    public static final AbstractC10125v3.e d = new AbstractC10125v3.e();
    public static final AbstractC10125v3.d e = new AbstractC10125v3.d("'\"".toCharArray());
    public static final AbstractC10125v3.c f = new AbstractC10125v3.c('\'');
    public static final AbstractC10125v3.c g = new AbstractC10125v3.c(' ');
    public static final AbstractC10125v3.d h = new AbstractC10125v3.d(" \t\n\r\f".toCharArray());
    public static final AbstractC10125v3.c i = new AbstractC10125v3.c('\t');
    public static final AbstractC10125v3.f j = new AbstractC10125v3.f();

    public InterfaceC2828Ee2 a(InterfaceC2828Ee2... interfaceC2828Ee2Arr) {
        int h0 = C4206Se.h0(interfaceC2828Ee2Arr);
        if (h0 == 0) {
            return d;
        }
        if (h0 == 1) {
            return interfaceC2828Ee2Arr[0];
        }
        return new AbstractC10125v3.a(interfaceC2828Ee2Arr);
    }

    public InterfaceC2828Ee2 b(char c2) {
        return new AbstractC10125v3.c(c2);
    }

    public InterfaceC2828Ee2 c(String str) {
        int F1 = C4500Ve2.F1(str);
        if (F1 == 0) {
            return d;
        }
        if (F1 == 1) {
            return new AbstractC10125v3.c(str.charAt(0));
        }
        return new AbstractC10125v3.d(str.toCharArray());
    }

    public InterfaceC2828Ee2 d(char... cArr) {
        int h0 = C4206Se.h0(cArr);
        if (h0 == 0) {
            return d;
        }
        if (h0 == 1) {
            return new AbstractC10125v3.c(cArr[0]);
        }
        return new AbstractC10125v3.d(cArr);
    }

    public InterfaceC2828Ee2 e() {
        return a;
    }

    public InterfaceC2828Ee2 f() {
        return b;
    }

    public InterfaceC2828Ee2 g() {
        return d;
    }

    public InterfaceC2828Ee2 h() {
        return e;
    }

    public InterfaceC2828Ee2 i() {
        return f;
    }

    public InterfaceC2828Ee2 j() {
        return g;
    }

    public InterfaceC2828Ee2 k() {
        return h;
    }

    public InterfaceC2828Ee2 l(String str) {
        if (C4500Ve2.I0(str)) {
            return d;
        }
        return m(str.toCharArray());
    }

    public InterfaceC2828Ee2 m(char... cArr) {
        int h0 = C4206Se.h0(cArr);
        if (h0 == 0) {
            return d;
        }
        if (h0 == 1) {
            return new AbstractC10125v3.c(cArr[0]);
        }
        return new AbstractC10125v3.b(cArr);
    }

    public InterfaceC2828Ee2 n() {
        return i;
    }

    public InterfaceC2828Ee2 o() {
        return j;
    }
}
