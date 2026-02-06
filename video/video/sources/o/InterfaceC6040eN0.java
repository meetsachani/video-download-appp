package o;

import android.util.Pair;
import android.util.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.HJ;

/* renamed from: o.eN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6040eN0 extends CO1 {
    public static final int j = -1;
    public static final int k = -1;
    public static final HJ.a<Integer> l = HJ.a.a("camerax.core.imageOutput.targetAspectRatio", C8320nf.class);
    public static final HJ.a<Integer> m;
    public static final HJ.a<Integer> n;

    /* renamed from: o  reason: collision with root package name */
    public static final HJ.a<Integer> f723o;
    public static final HJ.a<Size> p;
    public static final HJ.a<Size> q;
    public static final HJ.a<Size> r;
    public static final HJ.a<List<Pair<Integer, Size[]>>> s;
    public static final HJ.a<US1> t;
    public static final HJ.a<List<Size>> u;

    /* renamed from: o.eN0$a */
    /* loaded from: classes.dex */
    public interface a<B> {
        B f(US1 us1);

        B g(int i);

        B l(Size size);

        B m(List<Size> list);

        B o(Size size);

        B r(Size size);

        B s(int i);

        B u(int i);

        B w(List<Pair<Integer, Size[]>> list);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.eN0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.eN0$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.eN0$d */
    /* loaded from: classes.dex */
    public @interface d {
    }

    static {
        Class cls = Integer.TYPE;
        m = HJ.a.a("camerax.core.imageOutput.targetRotation", cls);
        n = HJ.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f723o = HJ.a.a("camerax.core.imageOutput.mirrorMode", cls);
        p = HJ.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        q = HJ.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        r = HJ.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        s = HJ.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        t = HJ.a.a("camerax.core.imageOutput.resolutionSelector", US1.class);
        u = HJ.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void n0(InterfaceC6040eN0 interfaceC6040eN0) {
        boolean z;
        boolean G = interfaceC6040eN0.G();
        if (interfaceC6040eN0.d0(null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (G && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC6040eN0.T(null) != null) {
            if (G || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int A() {
        return ((Integer) j(m)).intValue();
    }

    default Size B() {
        return (Size) j(p);
    }

    default boolean G() {
        return g(l);
    }

    default int I() {
        return ((Integer) j(l)).intValue();
    }

    default Size L() {
        return (Size) j(r);
    }

    default int N(int i) {
        return ((Integer) h(m, Integer.valueOf(i))).intValue();
    }

    default List<Size> R(List<Size> list) {
        List list2 = (List) h(u, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default US1 T(US1 us1) {
        return (US1) h(t, us1);
    }

    default Size W(Size size) {
        return (Size) h(q, size);
    }

    default List<Pair<Integer, Size[]>> c() {
        return (List) j(s);
    }

    default List<Size> c0() {
        List list = (List) j(u);
        Objects.requireNonNull(list);
        return new ArrayList(list);
    }

    default Size d0(Size size) {
        return (Size) h(p, size);
    }

    default Size n(Size size) {
        return (Size) h(r, size);
    }

    default List<Pair<Integer, Size[]>> p(List<Pair<Integer, Size[]>> list) {
        return (List) h(s, list);
    }

    default int q0(int i) {
        return ((Integer) h(f723o, Integer.valueOf(i))).intValue();
    }

    default US1 r() {
        return (US1) j(t);
    }

    default int u(int i) {
        return ((Integer) h(n, Integer.valueOf(i))).intValue();
    }

    default Size w() {
        return (Size) j(q);
    }
}
