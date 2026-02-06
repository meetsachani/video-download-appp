package o;

import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import o.AbstractC4796Yg;
import o.InterfaceC2426Ac0;

/* renamed from: o.Cg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2637Cg {
    public static final String a = "AudioConfigUtil";
    public static final int b = 44100;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 5;

    public static /* synthetic */ int a(int i, Integer num, Integer num2) {
        float signum;
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        if (abs == 0) {
            signum = Math.signum(num.intValue() - num2.intValue());
        } else {
            signum = Math.signum(abs);
        }
        return (int) signum;
    }

    public static AbstractC2735Dg b(AbstractC4796Yg abstractC4796Yg, EnumC5905dp2 enumC5905dp2, AbstractC8328nh abstractC8328nh, AbstractC3044Gh abstractC3044Gh) {
        InterfaceC8575oh2 c2942Fg;
        InterfaceC2426Ac0.a d2 = abstractC4796Yg.d();
        if (d2 != null) {
            c2942Fg = new C2833Eg(abstractC4796Yg.a(), abstractC4796Yg.b(), enumC5905dp2, abstractC3044Gh, abstractC8328nh, d2);
        } else {
            c2942Fg = new C2942Fg(abstractC4796Yg.a(), abstractC4796Yg.b(), enumC5905dp2, abstractC3044Gh, abstractC8328nh);
        }
        return (AbstractC2735Dg) c2942Fg.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC4796Yg c(AbstractC3242Ih1 abstractC3242Ih1, VG2 vg2) {
        InterfaceC2426Ac0.a aVar;
        String e2 = AbstractC3242Ih1.e(abstractC3242Ih1.c());
        int f = AbstractC3242Ih1.f(abstractC3242Ih1.c());
        if (vg2 != null && vg2.j() != null) {
            aVar = vg2.j();
            String e3 = aVar.e();
            int f2 = aVar.f();
            if (Objects.equals(e3, InterfaceC2426Ac0.a.a)) {
                C7433k41.a(a, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + e2 + "(profile: " + f + ")]");
            } else {
                if (abstractC3242Ih1.c() == -1) {
                    C7433k41.a(a, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + e3 + "(profile: " + f2 + ")]");
                    e2 = e3;
                    f = f2;
                } else if (Objects.equals(e2, e3) && f == f2) {
                    C7433k41.a(a, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + e3 + "(profile: " + f + ")]");
                    e2 = e3;
                } else {
                    C7433k41.a(a, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + e3 + "(profile: " + f2 + "), chosen mime type: " + e2 + "(profile: " + f + ")]");
                }
                AbstractC4796Yg.a c2 = AbstractC4796Yg.c(e2).c(f);
                if (aVar != null) {
                    c2.e(aVar);
                }
                return c2.a();
            }
        }
        aVar = null;
        AbstractC4796Yg.a c22 = AbstractC4796Yg.c(e2).c(f);
        if (aVar != null) {
        }
        return c22.a();
    }

    public static AbstractC8328nh d(AbstractC4796Yg abstractC4796Yg, AbstractC3044Gh abstractC3044Gh) {
        InterfaceC8575oh2 c8815ph;
        InterfaceC2426Ac0.a d2 = abstractC4796Yg.d();
        if (d2 != null) {
            c8815ph = new C8572oh(abstractC3044Gh, d2);
        } else {
            c8815ph = new C8815ph(abstractC3044Gh);
        }
        return (AbstractC8328nh) c8815ph.get();
    }

    public static int e(AbstractC3044Gh abstractC3044Gh) {
        int e2 = abstractC3044Gh.e();
        if (e2 == -1) {
            C7433k41.a(a, "Using default AUDIO source: 5");
            return 5;
        }
        C7433k41.a(a, "Using provided AUDIO source: " + e2);
        return e2;
    }

    public static int f(AbstractC3044Gh abstractC3044Gh) {
        int f = abstractC3044Gh.f();
        if (f == -1) {
            C7433k41.a(a, "Using default AUDIO source format: 2");
            return 2;
        }
        C7433k41.a(a, "Using provided AUDIO source format: " + f);
        return f;
    }

    public static int g(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        String str;
        Integer clamp;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        if (C7433k41.h(a)) {
            str = String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue));
        } else {
            str = "";
        }
        if (!AbstractC3044Gh.i.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C7433k41.h(a)) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, clamp);
            }
        }
        C7433k41.a(a, str);
        return doubleValue;
    }

    public static int h(Range<Integer> range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (range.contains((Range<Integer>) Integer.valueOf(i5))) {
                if (C2837Eh.p(i5, i, i2)) {
                    return i5;
                }
                C7433k41.a(a, "Sample rate " + i5 + "Hz is not supported by audio source with channel count " + i + " and source format " + i2);
            } else {
                C7433k41.a(a, "Sample rate " + i5 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                C7433k41.a(a, "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(AbstractC8328nh.a);
                Collections.sort(arrayList, new Comparator() { // from class: o.Bg
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C2637Cg.a(i3, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i4 < arrayList.size()) {
                i5 = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                C7433k41.a(a, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
        }
    }
}
