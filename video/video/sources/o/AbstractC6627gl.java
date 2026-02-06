package o;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.InterfaceC7595kk1;

/* renamed from: o.gl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6627gl<Model> implements InterfaceC7595kk1<Model, InputStream> {
    public final InterfaceC7595kk1<C5519cE0, InputStream> a;
    public final C7352jk1<Model, C5519cE0> b;

    public AbstractC6627gl(InterfaceC7595kk1<C5519cE0, InputStream> interfaceC7595kk1) {
        this(interfaceC7595kk1, null);
    }

    public static List<InterfaceC6575gX0> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            arrayList.add(new C5519cE0(str));
        }
        return arrayList;
    }

    @Override // o.InterfaceC7595kk1
    public InterfaceC7595kk1.a<InputStream> b(Model model, int i, int i2, C5448bw1 c5448bw1) {
        C5519cE0 c5519cE0;
        C7352jk1<Model, C5519cE0> c7352jk1 = this.b;
        if (c7352jk1 != null) {
            c5519cE0 = c7352jk1.b(model, i, i2);
        } else {
            c5519cE0 = null;
        }
        if (c5519cE0 == null) {
            String f = f(model, i, i2, c5448bw1);
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            C5519cE0 c5519cE02 = new C5519cE0(f, e(model, i, i2, c5448bw1));
            C7352jk1<Model, C5519cE0> c7352jk12 = this.b;
            if (c7352jk12 != null) {
                c7352jk12.c(model, i, i2, c5519cE02);
            }
            c5519cE0 = c5519cE02;
        }
        List<String> d = d(model, i, i2, c5448bw1);
        InterfaceC7595kk1.a<InputStream> b = this.a.b(c5519cE0, i, i2, c5448bw1);
        if (b != null && !d.isEmpty()) {
            return new InterfaceC7595kk1.a<>(b.a, c(d), b.c);
        }
        return b;
    }

    public List<String> d(Model model, int i, int i2, C5448bw1 c5448bw1) {
        return Collections.EMPTY_LIST;
    }

    public InterfaceC5774dH0 e(Model model, int i, int i2, C5448bw1 c5448bw1) {
        return InterfaceC5774dH0.b;
    }

    public abstract String f(Model model, int i, int i2, C5448bw1 c5448bw1);

    public AbstractC6627gl(InterfaceC7595kk1<C5519cE0, InputStream> interfaceC7595kk1, C7352jk1<Model, C5519cE0> c7352jk1) {
        this.a = interfaceC7595kk1;
        this.b = c7352jk1;
    }
}
