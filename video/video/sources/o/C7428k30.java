package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.k30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7428k30<T> implements Iterable<AbstractC6944i30<?>> {
    public static final String Z0 = "";
    public static final String a1 = "differs from";
    public final List<AbstractC6944i30<?>> X;
    public final T Y;
    public final AbstractC4253Sp2 Y0;
    public final T Z;

    public C7428k30(T t, T t2, List<AbstractC6944i30<?>> list, AbstractC4253Sp2 abstractC4253Sp2) {
        C11147zE2.V(t, "lhs", new Object[0]);
        C11147zE2.V(t2, "rhs", new Object[0]);
        C11147zE2.V(list, "diffList", new Object[0]);
        this.X = list;
        this.Y = t;
        this.Z = t2;
        if (abstractC4253Sp2 == null) {
            this.Y0 = AbstractC4253Sp2.p1;
        } else {
            this.Y0 = abstractC4253Sp2;
        }
    }

    public List<AbstractC6944i30<?>> d() {
        return Collections.unmodifiableList(this.X);
    }

    public T e() {
        return this.Y;
    }

    public int f() {
        return this.X.size();
    }

    public T h() {
        return this.Z;
    }

    public AbstractC4253Sp2 i() {
        return this.Y0;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC6944i30<?>> iterator() {
        return this.X.iterator();
    }

    public String j(AbstractC4253Sp2 abstractC4253Sp2) {
        if (this.X.isEmpty()) {
            return "";
        }
        C4056Qp2 c4056Qp2 = new C4056Qp2(this.Y, abstractC4253Sp2);
        C4056Qp2 c4056Qp22 = new C4056Qp2(this.Z, abstractC4253Sp2);
        for (AbstractC6944i30<?> abstractC6944i30 : this.X) {
            c4056Qp2.n(abstractC6944i30.n(), abstractC6944i30.h());
            c4056Qp22.n(abstractC6944i30.n(), abstractC6944i30.i());
        }
        return String.format("%s %s %s", c4056Qp2.build(), a1, c4056Qp22.build());
    }

    public String toString() {
        return j(this.Y0);
    }
}
