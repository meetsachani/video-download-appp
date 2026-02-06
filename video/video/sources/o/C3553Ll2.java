package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: o.Ll2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3553Ll2 {
    public static void a(Collection<Integer> collection, int i) {
        C10907yF1.b(collection.contains(Integer.valueOf(i)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", b(i), c(collection)));
    }

    public static String b(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return C3455Kl2.a("|", arrayList);
    }

    public static String c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(b(num.intValue()));
        }
        return C6566gU0.f + C3455Kl2.a(C6566gU0.h, arrayList) + C6566gU0.g;
    }

    public static int d(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>= 1;
        }
        return i2;
    }

    public static boolean e(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
