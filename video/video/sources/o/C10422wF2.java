package o;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AbstractC9451sG2;
import o.InterfaceC2426Ac0;

/* renamed from: o.wF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10422wF2 {
    public static final String a = "VideoConfigUtil";
    public static final Map<String, Map<Integer, MF2>> b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        MF2 mf2 = MF2.d;
        hashMap2.put(1, mf2);
        MF2 mf22 = MF2.f;
        hashMap2.put(2, mf22);
        MF2 mf23 = MF2.g;
        hashMap2.put(4096, mf23);
        hashMap2.put(8192, mf23);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, mf2);
        hashMap3.put(2, mf22);
        hashMap3.put(4096, mf23);
        hashMap3.put(8192, mf23);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, mf2);
        hashMap4.put(4, mf22);
        hashMap4.put(4096, mf23);
        hashMap4.put(16384, mf23);
        hashMap4.put(2, mf2);
        hashMap4.put(8, mf22);
        hashMap4.put(8192, mf23);
        hashMap4.put(32768, mf23);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, mf22);
        hashMap5.put(512, MF2.e);
        hashMap.put(C4128Rj1.k, hashMap2);
        hashMap.put(C4128Rj1.n, hashMap3);
        hashMap.put(C4128Rj1.m, hashMap4);
        hashMap.put(C4128Rj1.w, hashMap5);
    }

    public static String a(N80 n80) {
        int b2 = n80.b();
        if (b2 != 1) {
            if (b2 != 3 && b2 != 4 && b2 != 5) {
                if (b2 == 6) {
                    return C4128Rj1.w;
                }
                throw new UnsupportedOperationException("Unsupported dynamic range: " + n80 + "\nNo supported default mime type available.");
            }
            return C4128Rj1.k;
        }
        return "video/avc";
    }

    public static MF2 b(String str, int i) {
        MF2 mf2;
        Map<Integer, MF2> map = b.get(str);
        if (map != null && (mf2 = map.get(Integer.valueOf(i))) != null) {
            return mf2;
        }
        C7433k41.p(a, String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return MF2.d;
    }

    public static IF2 c(AbstractC9451sG2 abstractC9451sG2, EnumC5905dp2 enumC5905dp2, QG2 qg2, Size size, N80 n80, Range<Integer> range) {
        InterfaceC8575oh2 jf2;
        InterfaceC2426Ac0.c d = abstractC9451sG2.d();
        if (d != null) {
            jf2 = new KF2(abstractC9451sG2.a(), enumC5905dp2, qg2, size, d, n80, range);
        } else {
            jf2 = new JF2(abstractC9451sG2.a(), enumC5905dp2, qg2, size, n80, range);
        }
        return (IF2) jf2.get();
    }

    public static AbstractC9451sG2 d(AbstractC3242Ih1 abstractC3242Ih1, N80 n80, VG2 vg2) {
        InterfaceC2426Ac0.c cVar;
        boolean e = n80.e();
        C10907yF1.o(e, "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + n80 + C6566gU0.g);
        String h = AbstractC3242Ih1.h(abstractC3242Ih1.c());
        if (vg2 != null) {
            Set<Integer> c = S80.c(n80);
            Set<Integer> b2 = S80.b(n80);
            Iterator<InterfaceC2426Ac0.c> it = vg2.b().iterator();
            while (it.hasNext()) {
                cVar = it.next();
                if (c.contains(Integer.valueOf(cVar.g())) && b2.contains(Integer.valueOf(cVar.b()))) {
                    String i = cVar.i();
                    if (Objects.equals(h, i)) {
                        C7433k41.a(a, "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + h + C6566gU0.g);
                    } else if (abstractC3242Ih1.c() == -1) {
                        C7433k41.a(a, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + h + ", dynamic range: " + n80 + C6566gU0.g);
                    }
                    h = i;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (abstractC3242Ih1.c() == -1) {
                h = a(n80);
            }
            if (vg2 == null) {
                C7433k41.a(a, "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h + ", dynamic range: " + n80 + C6566gU0.g);
            } else {
                C7433k41.a(a, "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h + ", dynamic range: " + n80 + C6566gU0.g);
            }
        }
        AbstractC9451sG2.a c2 = AbstractC9451sG2.c(h);
        if (cVar != null) {
            c2.e(cVar);
        }
        return c2.a();
    }

    public static int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range<Integer> range) {
        String str;
        Integer clamp;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue() * new Rational(i8, i9).doubleValue());
        if (C7433k41.h(a)) {
            str = String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(doubleValue));
        } else {
            str = "";
        }
        if (!QG2.b.equals(range)) {
            int intValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C7433k41.h(a)) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, clamp);
            }
            doubleValue = intValue;
        }
        C7433k41.a(a, str);
        return doubleValue;
    }
}
