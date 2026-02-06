package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.vv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10339vv0 {
    public static final float a(AbstractC9115qv0 abstractC9115qv0, AbstractC9115qv0 abstractC9115qv02, float f) {
        float m;
        C6562gT0.p(abstractC9115qv0, "xValues");
        C6562gT0.p(abstractC9115qv02, "yValues");
        if (0.0f <= f && f <= 1.0f) {
            Iterator<Integer> it = C5075aO1.W1(0, abstractC9115qv0.b).iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC8515oR0) it).nextInt();
                int i = nextInt + 1;
                if (b(f, abstractC9115qv0.s(nextInt), abstractC9115qv0.s(i % abstractC9115qv0.w()))) {
                    int w = i % abstractC9115qv0.w();
                    float m2 = C5764dE2.m(abstractC9115qv0.s(w) - abstractC9115qv0.s(nextInt), 1.0f);
                    float m3 = C5764dE2.m(abstractC9115qv02.s(w) - abstractC9115qv02.s(nextInt), 1.0f);
                    if (m2 < 0.001f) {
                        m = 0.5f;
                    } else {
                        m = C5764dE2.m(f - abstractC9115qv0.s(nextInt), 1.0f) / m2;
                    }
                    return C5764dE2.m(abstractC9115qv02.s(nextInt) + (m3 * m), 1.0f);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new IllegalArgumentException(("Invalid progress: " + f).toString());
    }

    public static final boolean b(float f, float f2, float f3) {
        if (f3 >= f2) {
            if (f2 <= f && f <= f3) {
                return true;
            }
            return false;
        } else if (f >= f2 || f <= f3) {
            return true;
        } else {
            return false;
        }
    }

    public static final void c(AbstractC9115qv0 abstractC9115qv0) {
        int i;
        C6562gT0.p(abstractC9115qv0, "p");
        Boolean bool = Boolean.TRUE;
        float[] fArr = abstractC9115qv0.a;
        int i2 = abstractC9115qv0.b;
        boolean z = false;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (!bool.booleanValue() || 0.0f > f || f > 1.0f) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            i3++;
        }
        if (bool.booleanValue()) {
            C11197zR0 W1 = C5075aO1.W1(1, abstractC9115qv0.w());
            if ((W1 instanceof Collection) && ((Collection) W1).isEmpty()) {
                i = 0;
            } else {
                Iterator<Integer> it = W1.iterator();
                i = 0;
                while (it.hasNext()) {
                    int nextInt = ((AbstractC8515oR0) it).nextInt();
                    if (abstractC9115qv0.s(nextInt) < abstractC9115qv0.s(nextInt - 1) && (i = i + 1) < 0) {
                        C8222nF.Y();
                    }
                }
            }
            if (i <= 1) {
                z = true;
            }
            if (z) {
                return;
            }
            throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + AbstractC9115qv0.P(abstractC9115qv0, null, null, null, 0, null, 31, null)).toString());
        }
        throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + AbstractC9115qv0.P(abstractC9115qv0, null, null, null, 0, null, 31, null)).toString());
    }
}
