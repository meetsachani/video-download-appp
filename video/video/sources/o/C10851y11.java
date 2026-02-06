package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.C10089uu0;

@Deprecated
/* renamed from: o.y11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10851y11<T extends Comparable<T>> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 1;
    public Comparator<T> X;

    public C10851y11(T[] tArr) {
        List asList;
        if (tArr == null) {
            asList = Collections.EMPTY_LIST;
        } else {
            asList = Arrays.asList(tArr);
        }
        C10089uu0 c10089uu0 = new C10089uu0(asList);
        c10089uu0.f(C10089uu0.b.AFTER);
        this.X = new C6756hH(Arrays.asList(c10089uu0, new C5432bs1(false), new VG()));
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(T t, T t2) {
        return this.X.compare(t, t2);
    }
}
