package o;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: o.bH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5289bH0<T> extends AbstractC5470c2<String, String, VH<String, String, T>, T> {
    public C7853lo0<T> h;
    public Comparator<String> i;
    public final boolean j;

    public AbstractC5289bH0() {
        this.h = null;
        this.i = null;
        this.j = false;
    }

    public static /* synthetic */ boolean N(Map.Entry entry) {
        if (Serializable.class.isAssignableFrom((Class) entry.getKey()) && "serialVersionUID".equals(((Field) entry.getValue()).getName())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void O(AbstractC5289bH0 abstractC5289bH0, Map.Entry entry) {
        abstractC5289bH0.getClass();
        abstractC5289bH0.h.j(((Field) entry.getValue()).getName().toUpperCase(), new C9327rm((Class) entry.getKey(), (Field) entry.getValue(), false, abstractC5289bH0.e, abstractC5289bH0.s((Field) entry.getValue(), ((Field) entry.getValue()).getType(), null, null, null), null, null));
    }

    public static /* synthetic */ boolean P(Map.Entry entry) {
        return !((Field) entry.getValue()).isAnnotationPresent(VR.class);
    }

    @Override // o.AbstractC5470c2
    public void C() {
        C7853lo0<T> c7853lo0 = new C7853lo0<>(this.e);
        this.h = c7853lo0;
        c7853lo0.D(this.i);
    }

    @Override // o.AbstractC5470c2
    public void I(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
        interfaceC7664l11.r().stream().filter(new Predicate() { // from class: o.YG0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC5289bH0.N((Map.Entry) obj);
            }
        }).filter(new Predicate() { // from class: o.ZG0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC5289bH0.P((Map.Entry) obj);
            }
        }).forEach(new Consumer() { // from class: o.aH0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC5289bH0.O(AbstractC5289bH0.this, (Map.Entry) obj);
            }
        });
    }

    @Override // o.AbstractC5470c2
    public void M(int i) throws XR {
        if (!this.b.h() && i != this.b.f() && !this.j) {
            throw new XR(this.a, ResourceBundle.getBundle(UI0.k, this.e).getString("header.data.mismatch"));
        }
    }

    @Override // o.AbstractC5470c2
    /* renamed from: Q */
    public String p(int i) {
        String[] e = this.b.e();
        if (i >= e.length) {
            return null;
        }
        return e[i];
    }

    public void R(Comparator<String> comparator) {
        this.i = comparator;
        C7853lo0<T> c7853lo0 = this.h;
        if (c7853lo0 != null) {
            c7853lo0.D(comparator);
        }
    }

    @Override // o.InterfaceC7449k81
    public void c(C3968Ps c3968Ps) throws IOException, XR {
        if (this.a != null) {
            String[] G2 = C4206Se.G2(c3968Ps.Q());
            for (int i = 0; i < G2.length; i++) {
                if (G2[i] == null) {
                    G2[i] = "";
                }
            }
            this.b.g(G2);
            List<C8114mo0<T>> w = this.h.w(G2);
            if (!w.isEmpty()) {
                String[] strArr = new String[w.size()];
                ArrayList arrayList = new ArrayList(w.size());
                for (int i2 = 0; i2 < w.size(); i2++) {
                    C8114mo0<T> c8114mo0 = w.get(i2);
                    if (c8114mo0.c()) {
                        strArr[i2] = String.format(ResourceBundle.getBundle(UI0.k, this.e).getString("matching"), c8114mo0.b());
                    } else {
                        strArr[i2] = c8114mo0.b();
                    }
                    arrayList.add(c8114mo0.a().i());
                }
                XR xr = new XR(this.a, arrayList, String.format(ResourceBundle.getBundle(UI0.k, this.e).getString("header.required.field.absent"), M80.a(C6566gU0.h, strArr), M80.a(",", G2)));
                xr.c(G2);
                throw xr;
            }
            return;
        }
        throw new IllegalStateException(ResourceBundle.getBundle(UI0.k, this.e).getString("type.unset"));
    }

    @Override // o.AbstractC5470c2
    public InterfaceC8348nm<T, String> u(int i) throws C8027mR {
        String x = x(i);
        if (x == null) {
            return null;
        }
        String trim = x.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return this.h.h(trim.toUpperCase());
    }

    @Override // o.AbstractC5470c2
    public String v(int i) {
        return this.b.d(i);
    }

    @Override // o.AbstractC5470c2
    public InterfaceC6142eo0<String, String, ? extends VH<String, String, T>, T> y() {
        return this.h;
    }

    public AbstractC5289bH0(boolean z) {
        this.h = null;
        this.i = null;
        this.j = z;
    }
}
