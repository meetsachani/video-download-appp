package o;

import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* renamed from: o.lz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7897lz0 {
    public final Collection<Fragment> a;
    public final Map<String, C7897lz0> b;
    public final Map<String, GH2> c;

    public C7897lz0(Collection<Fragment> collection, Map<String, C7897lz0> map, Map<String, GH2> map2) {
        this.a = collection;
        this.b = map;
        this.c = map2;
    }

    public Map<String, C7897lz0> a() {
        return this.b;
    }

    public Collection<Fragment> b() {
        return this.a;
    }

    public Map<String, GH2> c() {
        return this.c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
