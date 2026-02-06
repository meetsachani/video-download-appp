package o;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* loaded from: classes4.dex */
public enum MI0 {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{C2730De2.j, "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});
    
    public static MI0[] b1 = {DATE, NUMBER};
    public final Class<?>[] X;
    public final String[] Y;

    MI0(Class[] clsArr, String[] strArr) {
        this.X = clsArr;
        this.Y = strArr;
    }

    public static <E> Set<E> e(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static MI0 g(MI0 mi0, MI0 mi02) {
        MI0 mi03 = UNUSED;
        if (mi0 != mi03) {
            if (mi02 != mi03) {
                MI0 mi04 = GENERAL;
                if (mi0 != mi04) {
                    if (mi02 != mi04) {
                        Set e = e(mi0.X);
                        e.retainAll(e(mi02.X));
                        MI0[] mi0Arr = {DATE, NUMBER};
                        for (int i = 0; i < 2; i++) {
                            MI0 mi05 = mi0Arr[i];
                            if (e(mi05.X).equals(e)) {
                                return mi05;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return mi0;
        }
        return mi02;
    }

    public static boolean i(MI0 mi0, MI0 mi02) {
        if (g(mi0, mi02) == mi0) {
            return true;
        }
        return false;
    }

    public static MI0 j(String str) {
        MI0[] mi0Arr;
        String lowerCase = str.toLowerCase();
        for (MI0 mi0 : b1) {
            for (String str2 : mi0.Y) {
                if (str2.equals(lowerCase)) {
                    return mi0;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + lowerCase);
    }

    public static MI0 l(MI0 mi0, MI0 mi02) {
        MI0 mi03 = UNUSED;
        if (mi0 != mi03 && mi02 != mi03 && mi0 != (mi03 = GENERAL) && mi02 != mi03 && mi0 != (mi03 = DATE) && mi02 != mi03) {
            return NUMBER;
        }
        return mi03;
    }

    public boolean h(Class<?> cls) {
        Class<?>[] clsArr = this.X;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.X == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(C6566gU0.h, " conversion category (one of: ", C9811tl1.d);
            for (Class<?> cls : this.X) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
