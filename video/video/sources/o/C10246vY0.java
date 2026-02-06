package o;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C9760tY0;
import o.NV0;

/* renamed from: o.vY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10246vY0 {
    public static final NV0.a a = NV0.a.a(SearchView.z2, "ind", "refId", "ty", androidx.constraintlayout.widget.e.W1, "sw", "sh", "sc", "ks", C5445bv2.n, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", C10901yE.i, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final NV0.a b = NV0.a.a("d", "a");
    public static final NV0.a c = NV0.a.a("ty", SearchView.z2);

    /* renamed from: o.vY0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C9760tY0.b.values().length];
            a = iArr;
            try {
                iArr[C9760tY0.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C9760tY0.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static C9760tY0 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        Float f;
        boolean z;
        float f2;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        C9760tY0.b bVar = C9760tY0.b.NONE;
        EnumC5110aY0 enumC5110aY0 = EnumC5110aY0.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nv0.f();
        boolean z2 = false;
        C9760tY0.b bVar2 = bVar;
        EnumC5110aY0 enumC5110aY02 = enumC5110aY0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        String str = null;
        A9 a9 = null;
        B9 b9 = null;
        C9177r9 c9177r9 = null;
        C11039yo c11039yo = null;
        C11117z70 c11117z70 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        long j2 = -1;
        float f8 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        F9 f9 = null;
        C9760tY0.a aVar = null;
        boolean z4 = false;
        while (nv0.j()) {
            switch (nv0.s(a)) {
                case 0:
                    str2 = nv0.o();
                    break;
                case 1:
                    j = nv0.m();
                    break;
                case 2:
                    str = nv0.o();
                    break;
                case 3:
                    f2 = f8;
                    int m = nv0.m();
                    aVar = C9760tY0.a.UNKNOWN;
                    if (m < aVar.ordinal()) {
                        aVar = C9760tY0.a.values()[m];
                    }
                    f8 = f2;
                    break;
                case 4:
                    j2 = nv0.m();
                    break;
                case 5:
                    i = (int) (nv0.m() * C6006eE2.e());
                    break;
                case 6:
                    i2 = (int) (nv0.m() * C6006eE2.e());
                    break;
                case 7:
                    i3 = Color.parseColor(nv0.o());
                    break;
                case 8:
                    f9 = G9.h(nv0, c10624x51);
                    break;
                case 9:
                    f2 = f8;
                    int m2 = nv0.m();
                    if (m2 >= C9760tY0.b.values().length) {
                        c10624x51.a("Unsupported matte type: " + m2);
                    } else {
                        bVar2 = C9760tY0.b.values()[m2];
                        int i4 = a.a[bVar2.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                c10624x51.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            c10624x51.a("Unsupported matte type: Luma");
                        }
                        c10624x51.x(1);
                    }
                    f8 = f2;
                    break;
                case 10:
                    f2 = f8;
                    nv0.d();
                    while (nv0.j()) {
                        arrayList.add(D81.a(nv0, c10624x51));
                    }
                    c10624x51.x(arrayList.size());
                    nv0.h();
                    f8 = f2;
                    break;
                case 11:
                    f2 = f8;
                    nv0.d();
                    while (nv0.j()) {
                        InterfaceC6776hM a2 = C7019iM.a(nv0, c10624x51);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    nv0.h();
                    f8 = f2;
                    break;
                case 12:
                    f2 = f8;
                    nv0.f();
                    while (nv0.j()) {
                        int s = nv0.s(b);
                        if (s != 0) {
                            if (s != 1) {
                                nv0.t();
                                nv0.u();
                            } else {
                                nv0.d();
                                if (nv0.j()) {
                                    b9 = C9.a(nv0, c10624x51);
                                }
                                while (nv0.j()) {
                                    nv0.u();
                                }
                                nv0.h();
                            }
                        } else {
                            a9 = I9.d(nv0, c10624x51);
                        }
                    }
                    nv0.i();
                    f8 = f2;
                    break;
                case 13:
                    f2 = f8;
                    nv0.d();
                    ArrayList arrayList3 = new ArrayList();
                    while (nv0.j()) {
                        nv0.f();
                        while (nv0.j()) {
                            int s2 = nv0.s(c);
                            if (s2 != 0) {
                                if (s2 != 1) {
                                    nv0.t();
                                    nv0.u();
                                } else {
                                    arrayList3.add(nv0.o());
                                }
                            } else {
                                int m3 = nv0.m();
                                if (m3 == 29) {
                                    c11039yo = C11282zo.b(nv0, c10624x51);
                                } else if (m3 == 25) {
                                    c11117z70 = new A70().b(nv0, c10624x51);
                                }
                            }
                        }
                        nv0.i();
                    }
                    nv0.h();
                    c10624x51.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f8 = f2;
                    break;
                case 14:
                    f8 = (float) nv0.l();
                    break;
                case 15:
                    f7 = (float) nv0.l();
                    break;
                case 16:
                    f2 = f8;
                    f5 = (float) (nv0.l() * C6006eE2.e());
                    f8 = f2;
                    break;
                case 17:
                    f2 = f8;
                    f6 = (float) (nv0.l() * C6006eE2.e());
                    f8 = f2;
                    break;
                case 18:
                    f3 = (float) nv0.l();
                    continue;
                case 19:
                    f4 = (float) nv0.l();
                    continue;
                case 20:
                    c9177r9 = I9.f(nv0, c10624x51, z2);
                    continue;
                case 21:
                    str3 = nv0.o();
                    continue;
                case 22:
                    z3 = nv0.k();
                    continue;
                case 23:
                    if (nv0.m() == 1) {
                        z4 = true;
                    } else {
                        z4 = z2;
                        continue;
                    }
                case 24:
                    int m4 = nv0.m();
                    if (m4 >= EnumC5110aY0.values().length) {
                        c10624x51.a("Unsupported Blend Mode: " + m4);
                        enumC5110aY02 = EnumC5110aY0.NORMAL;
                    } else {
                        enumC5110aY02 = EnumC5110aY0.values()[m4];
                        continue;
                    }
                default:
                    nv0.t();
                    nv0.u();
                    f2 = f8;
                    f8 = f2;
                    break;
            }
            z2 = false;
        }
        float f10 = f8;
        nv0.i();
        ArrayList arrayList4 = new ArrayList();
        if (f3 > 0.0f) {
            z = z4;
            f = valueOf;
            arrayList4.add(new LX0(c10624x51, valueOf, valueOf, null, 0.0f, Float.valueOf(f3)));
        } else {
            f = valueOf;
            z = z4;
        }
        if (f4 <= 0.0f) {
            f4 = c10624x51.f();
        }
        arrayList4.add(new LX0(c10624x51, valueOf2, valueOf2, null, f3, Float.valueOf(f4)));
        arrayList4.add(new LX0(c10624x51, f, f, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c10624x51.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (f9 == null) {
                f9 = new F9();
            }
            f9.q(z);
        }
        return new C9760tY0(arrayList2, c10624x51, str2, j, aVar, j2, str, arrayList, f9, i, i2, i3, f10, f7, f5, f6, a9, b9, arrayList4, bVar2, c9177r9, z3, c11039yo, c11117z70, enumC5110aY02);
    }

    public static C9760tY0 b(C10624x51 c10624x51) {
        Rect b2 = c10624x51.b();
        List list = Collections.EMPTY_LIST;
        return new C9760tY0(list, c10624x51, "__container", -1L, C9760tY0.a.PRE_COMP, -1L, null, list, new F9(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, list, C9760tY0.b.NONE, null, false, null, null, EnumC5110aY0.NORMAL);
    }
}
