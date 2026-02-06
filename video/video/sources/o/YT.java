package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class YT {
    public static final int a = 1073741824;

    public static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        if (list.size() == new HashSet(list).size()) {
            return false;
        }
        return true;
    }

    public static <T> HashSet<T> c(int i) {
        return new HashSet<>(a(i));
    }

    public static <K, V> LinkedHashMap<K, V> d(int i) {
        return new LinkedHashMap<>(a(i));
    }

    public static <T> List<T> e(int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        return new ArrayList(i);
    }
}
