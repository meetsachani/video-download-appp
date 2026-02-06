package o;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class X22 extends AbstractC7840ll<R22, Path> {
    public final R22 i;
    public final Path j;
    public Path k;
    public Path l;
    public List<Z22> m;

    public X22(List<LX0<R22>> list) {
        super(list);
        this.i = new R22();
        this.j = new Path();
    }

    @Override // o.AbstractC7840ll
    public boolean p() {
        List<Z22> list = this.m;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC7840ll
    /* renamed from: r */
    public Path i(LX0<R22> lx0, float f) {
        R22 r22;
        Path path;
        R22 r222 = lx0.b;
        R22 r223 = lx0.c;
        R22 r224 = this.i;
        if (r223 == null) {
            r22 = r222;
        } else {
            r22 = r223;
        }
        r224.c(r222, r22, f);
        R22 r225 = this.i;
        List<Z22> list = this.m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                r225 = this.m.get(size).f(r225);
            }
        }
        C4713Xj1.i(r225, this.j);
        if (this.e != null) {
            if (this.k == null) {
                this.k = new Path();
                this.l = new Path();
            }
            C4713Xj1.i(r222, this.k);
            if (r223 != null) {
                C4713Xj1.i(r223, this.l);
            }
            O61<A> o61 = this.e;
            float f2 = lx0.g;
            float floatValue = lx0.h.floatValue();
            Path path2 = this.k;
            if (r223 == null) {
                path = path2;
            } else {
                path = this.l;
            }
            return (Path) o61.b(f2, floatValue, path2, path, f, e(), f());
        }
        return this.j;
    }

    public void s(List<Z22> list) {
        this.m = list;
    }
}
