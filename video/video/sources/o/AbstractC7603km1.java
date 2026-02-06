package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.km1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7603km1<C> {
    public Set<C> a = new HashSet();

    public void a(List<C> list) {
        this.a.addAll(list);
    }

    @Override // 
    /* renamed from: b */
    public abstract AbstractC7603km1<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }
}
