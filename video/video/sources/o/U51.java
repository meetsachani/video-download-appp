package o;

import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C9760tY0;
import o.NV0;

/* loaded from: classes.dex */
public class U51 {
    public static final NV0.a a = NV0.a.a("w", C10901yE.i, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static NV0.a b = NV0.a.a("id", "layers", "w", C10901yE.i, "p", "u");
    public static final NV0.a c = NV0.a.a("list");
    public static final NV0.a d = NV0.a.a("cm", "tm", "dr");

    public static C10624x51 a(NV0 nv0) throws IOException {
        float f;
        NV0 nv02 = nv0;
        float e = C6006eE2.e();
        C5484c51<C9760tY0> c5484c51 = new C5484c51<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        C10986ya2<C4276Sw0> c10986ya2 = new C10986ya2<>();
        C10624x51 c10624x51 = new C10624x51();
        nv02.f();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (nv02.j()) {
            switch (nv02.s(a)) {
                case 0:
                    f = e;
                    i2 = (int) nv0.l();
                    nv02 = nv0;
                    e = f;
                case 1:
                    f = e;
                    i = (int) nv0.l();
                    nv02 = nv0;
                    e = f;
                case 2:
                    f = e;
                    f2 = (float) nv0.l();
                    nv02 = nv0;
                    e = f;
                case 3:
                    f = e;
                    f3 = ((float) nv0.l()) - 0.01f;
                    nv02 = nv0;
                    e = f;
                case 4:
                    f = e;
                    f4 = (float) nv0.l();
                    nv02 = nv0;
                    e = f;
                case 5:
                    String[] split = nv02.o().split("\\.");
                    if (!C6006eE2.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c10624x51.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    nv02 = nv0;
                case 6:
                    e(nv02, c10624x51, arrayList, c5484c51);
                    nv02 = nv0;
                case 7:
                    b(nv02, c10624x51, hashMap, hashMap2);
                    nv02 = nv0;
                case 8:
                    d(nv02, hashMap3);
                    nv02 = nv0;
                case 9:
                    c(nv02, c10624x51, c10986ya2);
                    nv02 = nv0;
                case 10:
                    f(nv02, arrayList2);
                    nv02 = nv0;
                default:
                    nv02.t();
                    nv02.u();
                    nv02 = nv0;
            }
        }
        float f5 = e;
        c10624x51.y(new Rect(0, 0, (int) (i2 * f5), (int) (i * f5)), f2, f3, f4, arrayList, c5484c51, hashMap, hashMap2, C6006eE2.e(), c10986ya2, hashMap3, arrayList2, i2, i);
        return c10624x51;
    }

    public static void b(NV0 nv0, C10624x51 c10624x51, Map<String, List<C9760tY0>> map, Map<String, C9653t61> map2) throws IOException {
        nv0.d();
        while (nv0.j()) {
            ArrayList arrayList = new ArrayList();
            C5484c51 c5484c51 = new C5484c51();
            nv0.f();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (nv0.j()) {
                int s = nv0.s(b);
                if (s != 0) {
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                if (s != 4) {
                                    if (s != 5) {
                                        nv0.t();
                                        nv0.u();
                                    } else {
                                        str3 = nv0.o();
                                    }
                                } else {
                                    str2 = nv0.o();
                                }
                            } else {
                                i2 = nv0.m();
                            }
                        } else {
                            i = nv0.m();
                        }
                    } else {
                        nv0.d();
                        while (nv0.j()) {
                            C9760tY0 a2 = C10246vY0.a(nv0, c10624x51);
                            c5484c51.n(a2.e(), a2);
                            arrayList.add(a2);
                        }
                        nv0.h();
                    }
                } else {
                    str = nv0.o();
                }
            }
            nv0.i();
            if (str2 != null) {
                C9653t61 c9653t61 = new C9653t61(i, i2, str, str2, str3);
                map2.put(c9653t61.f(), c9653t61);
            } else {
                map.put(str, arrayList);
            }
        }
        nv0.h();
    }

    public static void c(NV0 nv0, C10624x51 c10624x51, C10986ya2<C4276Sw0> c10986ya2) throws IOException {
        nv0.d();
        while (nv0.j()) {
            C4276Sw0 a2 = C4373Tw0.a(nv0, c10624x51);
            c10986ya2.o(a2.hashCode(), a2);
        }
        nv0.h();
    }

    public static void d(NV0 nv0, Map<String, C3982Pw0> map) throws IOException {
        nv0.f();
        while (nv0.j()) {
            if (nv0.s(c) != 0) {
                nv0.t();
                nv0.u();
            } else {
                nv0.d();
                while (nv0.j()) {
                    C3982Pw0 a2 = C4470Uw0.a(nv0);
                    map.put(a2.c(), a2);
                }
                nv0.h();
            }
        }
        nv0.i();
    }

    public static void e(NV0 nv0, C10624x51 c10624x51, List<C9760tY0> list, C5484c51<C9760tY0> c5484c51) throws IOException {
        nv0.d();
        int i = 0;
        while (nv0.j()) {
            C9760tY0 a2 = C10246vY0.a(nv0, c10624x51);
            if (a2.g() == C9760tY0.a.IMAGE) {
                i++;
            }
            list.add(a2);
            c5484c51.n(a2.e(), a2);
            if (i > 4) {
                C7190j41.e("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        nv0.h();
    }

    public static void f(NV0 nv0, List<C10636x81> list) throws IOException {
        nv0.d();
        while (nv0.j()) {
            nv0.f();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (nv0.j()) {
                int s = nv0.s(d);
                if (s != 0) {
                    if (s != 1) {
                        if (s != 2) {
                            nv0.t();
                            nv0.u();
                        } else {
                            f2 = (float) nv0.l();
                        }
                    } else {
                        f = (float) nv0.l();
                    }
                } else {
                    str = nv0.o();
                }
            }
            nv0.i();
            list.add(new C10636x81(str, f, f2));
        }
        nv0.h();
    }
}
