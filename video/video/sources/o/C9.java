package o;

import java.io.IOException;
import java.util.Collections;
import o.NV0;

/* loaded from: classes.dex */
public class C9 {
    public static final NV0.a a = NV0.a.a("s", "a");
    public static final NV0.a b = NV0.a.a("s", W12.i, W12.e, "r");
    public static final NV0.a c = NV0.a.a("fc", "sc", "sw", "t", W12.e);

    public static B9 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        E9 e9 = null;
        D9 d9 = null;
        while (nv0.j()) {
            int s = nv0.s(a);
            if (s != 0) {
                if (s != 1) {
                    nv0.t();
                    nv0.u();
                } else {
                    e9 = c(nv0, c10624x51);
                }
            } else {
                d9 = b(nv0, c10624x51);
            }
        }
        nv0.i();
        return new B9(e9, d9);
    }

    public static D9 b(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        C9663t9 c9663t9 = null;
        C9663t9 c9663t92 = null;
        C9663t9 c9663t93 = null;
        EnumC4141Rm2 enumC4141Rm2 = null;
        while (nv0.j()) {
            int s = nv0.s(b);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            nv0.t();
                            nv0.u();
                        } else {
                            int m = nv0.m();
                            if (m != 1 && m != 2) {
                                c10624x51.a("Unsupported text range units: " + m);
                                enumC4141Rm2 = EnumC4141Rm2.INDEX;
                            } else if (m == 1) {
                                enumC4141Rm2 = EnumC4141Rm2.PERCENT;
                            } else {
                                enumC4141Rm2 = EnumC4141Rm2.INDEX;
                            }
                        }
                    } else {
                        c9663t93 = I9.h(nv0, c10624x51);
                    }
                } else {
                    c9663t92 = I9.h(nv0, c10624x51);
                }
            } else {
                c9663t9 = I9.h(nv0, c10624x51);
            }
        }
        nv0.i();
        if (c9663t9 == null && c9663t92 != null) {
            c9663t9 = new C9663t9(Collections.singletonList(new LX0(0)));
        }
        return new D9(c9663t9, c9663t92, c9663t93, enumC4141Rm2);
    }

    public static E9 c(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        C8928q9 c8928q9 = null;
        C8928q9 c8928q92 = null;
        C9177r9 c9177r9 = null;
        C9177r9 c9177r92 = null;
        C9663t9 c9663t9 = null;
        while (nv0.j()) {
            int s = nv0.s(c);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                nv0.t();
                                nv0.u();
                            } else {
                                c9663t9 = I9.h(nv0, c10624x51);
                            }
                        } else {
                            c9177r92 = I9.e(nv0, c10624x51);
                        }
                    } else {
                        c9177r9 = I9.e(nv0, c10624x51);
                    }
                } else {
                    c8928q92 = I9.c(nv0, c10624x51);
                }
            } else {
                c8928q9 = I9.c(nv0, c10624x51);
            }
        }
        nv0.i();
        return new E9(c8928q9, c8928q92, c9177r9, c9177r92, c9663t9);
    }
}
