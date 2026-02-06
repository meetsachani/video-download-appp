package o;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: o.y21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10855y21 {
    public static C9637t21 a(C9637t21 c9637t21, C9637t21 c9637t212) {
        Locale d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < c9637t21.l() + c9637t212.l(); i++) {
            if (i < c9637t21.l()) {
                d = c9637t21.d(i);
            } else {
                d = c9637t212.d(i - c9637t21.l());
            }
            if (d != null) {
                linkedHashSet.add(d);
            }
        }
        return C9637t21.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static C9637t21 b(LocaleList localeList, LocaleList localeList2) {
        if (localeList != null && !localeList.isEmpty()) {
            return a(C9637t21.o(localeList), C9637t21.o(localeList2));
        }
        return C9637t21.g();
    }

    public static C9637t21 c(C9637t21 c9637t21, C9637t21 c9637t212) {
        if (c9637t21 != null && !c9637t21.j()) {
            return a(c9637t21, c9637t212);
        }
        return C9637t21.g();
    }
}
