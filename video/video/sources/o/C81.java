package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class C81 {
    public final List<AbstractC7840ll<R22, Path>> a;
    public final List<AbstractC7840ll<Integer, Integer>> b;
    public final List<C11122z81> c;

    public C81(List<C11122z81> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<AbstractC7840ll<R22, Path>> a() {
        return this.a;
    }

    public List<C11122z81> b() {
        return this.c;
    }

    public List<AbstractC7840ll<Integer, Integer>> c() {
        return this.b;
    }
}
