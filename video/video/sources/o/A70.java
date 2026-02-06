package o;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import o.NV0;

/* loaded from: classes.dex */
public class A70 {
    public static final NV0.a f = NV0.a.a("ef");
    public static final NV0.a g = NV0.a.a(SearchView.z2, "v");
    public C8928q9 a;
    public C9177r9 b;
    public C9177r9 c;
    public C9177r9 d;
    public C9177r9 e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        nv0.f();
        String str = "";
        while (nv0.j()) {
            int s = nv0.s(g);
            if (s != 0) {
                char c = 1;
                if (s != 1) {
                    nv0.t();
                    nv0.u();
                } else {
                    str.getClass();
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 397447147:
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.d = I9.e(nv0, c10624x51);
                            continue;
                        case 1:
                            this.b = I9.f(nv0, c10624x51, false);
                            continue;
                        case 2:
                            this.c = I9.f(nv0, c10624x51, false);
                            continue;
                        case 3:
                            this.a = I9.c(nv0, c10624x51);
                            continue;
                        case 4:
                            this.e = I9.e(nv0, c10624x51);
                            continue;
                        default:
                            nv0.u();
                            continue;
                    }
                }
            } else {
                str = nv0.o();
            }
        }
        nv0.i();
    }

    public C11117z70 b(NV0 nv0, C10624x51 c10624x51) throws IOException {
        C9177r9 c9177r9;
        C9177r9 c9177r92;
        C9177r9 c9177r93;
        C9177r9 c9177r94;
        while (nv0.j()) {
            if (nv0.s(f) != 0) {
                nv0.t();
                nv0.u();
            } else {
                nv0.d();
                while (nv0.j()) {
                    a(nv0, c10624x51);
                }
                nv0.h();
            }
        }
        C8928q9 c8928q9 = this.a;
        if (c8928q9 != null && (c9177r9 = this.b) != null && (c9177r92 = this.c) != null && (c9177r93 = this.d) != null && (c9177r94 = this.e) != null) {
            return new C11117z70(c8928q9, c9177r9, c9177r92, c9177r93, c9177r94);
        }
        return null;
    }
}
