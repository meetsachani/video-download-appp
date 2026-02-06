package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.C3051Gi2;

/* renamed from: o.Ed2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2824Ed2 {
    public static final int a = 0;
    public static final int b = -1;
    public static final AbstractC2824Ed2 c = d(0, a.INACTIVE);
    public static final Set<Integer> d = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final InterfaceC2789Dt1<AbstractC2824Ed2> e = C9464sK.f(d(0, a.ACTIVE));

    /* renamed from: o.Ed2$a */
    /* loaded from: classes.dex */
    public enum a {
        ACTIVE,
        INACTIVE
    }

    public static AbstractC2824Ed2 d(int i, a aVar) {
        return new C9558sj(i, aVar, null);
    }

    public static AbstractC2824Ed2 e(int i, a aVar, C3051Gi2.h hVar) {
        return new C9558sj(i, aVar, hVar);
    }

    public abstract int a();

    public abstract C3051Gi2.h b();

    public abstract a c();
}
