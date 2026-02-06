package o;

import java.io.PrintStream;
import java.util.Arrays;
import o.InterfaceC8148mw2;

/* renamed from: o.zX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11218zX0 {

    /* renamed from: o.zX0$a */
    /* loaded from: classes.dex */
    public interface a {
        int get(int i);
    }

    /* renamed from: o.zX0$b */
    /* loaded from: classes.dex */
    public interface b {
        int m(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static C5933dw2 b(String str, b bVar, a aVar) {
        C5933dw2 c5933dw2 = new C5933dw2();
        try {
            C3088Gs d = C3186Hs.d(str);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                C2881Es c2881Es = (C2881Es) d.Y(i);
                String f = c2881Es.f();
                C2783Ds O0 = c2881Es.O0();
                int m = bVar.m(f);
                if (m == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + f);
                } else {
                    int i2 = aVar.get(m);
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 == 8) {
                                    c5933dw2.c(m, O0.f());
                                    PrintStream printStream2 = System.out;
                                    printStream2.println("parse " + f + " STRING_MASK > " + O0.f());
                                }
                            } else {
                                c5933dw2.a(m, O0.k());
                                PrintStream printStream3 = System.out;
                                printStream3.println("parse " + f + " FLOAT_MASK > " + O0.k());
                            }
                        } else {
                            c5933dw2.b(m, O0.l());
                            PrintStream printStream4 = System.out;
                            printStream4.println("parse " + f + " INT_MASK > " + O0.l());
                        }
                    } else {
                        c5933dw2.d(m, d.getBoolean(i));
                    }
                }
            }
            return c5933dw2;
        } catch (C3284Is e) {
            PrintStream printStream5 = System.err;
            printStream5.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(C6566gU0.f, "   at ").replace(",", "\n   at").replace(C6566gU0.g, ""));
            return c5933dw2;
        }
    }

    public static C5933dw2 c(String str) {
        return b(str, new b() { // from class: o.xX0
            @Override // o.C11218zX0.b
            public final int m(String str2) {
                return InterfaceC8148mw2.a.a(str2);
            }
        }, new a() { // from class: o.yX0
            @Override // o.C11218zX0.a
            public final int get(int i) {
                return InterfaceC8148mw2.a.getType(i);
            }
        });
    }
}
