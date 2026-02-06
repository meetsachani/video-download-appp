package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.cL1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5548cL1 {
    public static final C5548cL1 a;
    public static final C5548cL1 b;
    public static final C5548cL1 c;
    public static final C5548cL1 d;
    public static final C5548cL1 e;
    public static final C5548cL1 f;
    public static final C5548cL1 g;
    public static final Set<C5548cL1> h;
    public static final List<C5548cL1> i;

    /* renamed from: o.cL1$b */
    /* loaded from: classes.dex */
    public static abstract class b extends C5548cL1 {
        public b() {
            super();
        }

        public static b e(int i, String str) {
            return new C7346jj(i, str);
        }

        public abstract String c();

        public abstract int d();
    }

    static {
        b e2 = b.e(4, "SD");
        a = e2;
        b e3 = b.e(5, "HD");
        b = e3;
        b e4 = b.e(6, "FHD");
        c = e4;
        b e5 = b.e(8, "UHD");
        d = e5;
        b e6 = b.e(0, "LOWEST");
        e = e6;
        b e7 = b.e(1, "HIGHEST");
        f = e7;
        g = b.e(-1, XH0.M);
        h = new HashSet(Arrays.asList(e6, e7, e2, e3, e4, e5));
        i = Arrays.asList(e5, e4, e3, e2);
    }

    public static boolean a(C5548cL1 c5548cL1) {
        return h.contains(c5548cL1);
    }

    public static List<C5548cL1> b() {
        return new ArrayList(i);
    }

    public C5548cL1() {
    }
}
