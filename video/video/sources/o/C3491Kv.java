package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.Kv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3491Kv {

    /* renamed from: o.Kv$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3393Jv {
        public final List<AbstractC3393Jv> a = new ArrayList();

        public a(List<AbstractC3393Jv> list) {
            for (AbstractC3393Jv abstractC3393Jv : list) {
                if (!(abstractC3393Jv instanceof b)) {
                    this.a.add(abstractC3393Jv);
                }
            }
        }

        @Override // o.AbstractC3393Jv
        public void a() {
            for (AbstractC3393Jv abstractC3393Jv : this.a) {
                abstractC3393Jv.a();
            }
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            for (AbstractC3393Jv abstractC3393Jv : this.a) {
                abstractC3393Jv.b(interfaceC3784Nv);
            }
        }

        @Override // o.AbstractC3393Jv
        public void c(C3588Lv c3588Lv) {
            for (AbstractC3393Jv abstractC3393Jv : this.a) {
                abstractC3393Jv.c(c3588Lv);
            }
        }

        public List<AbstractC3393Jv> d() {
            return this.a;
        }
    }

    public static AbstractC3393Jv a(List<AbstractC3393Jv> list) {
        if (list.isEmpty()) {
            return c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static AbstractC3393Jv b(AbstractC3393Jv... abstractC3393JvArr) {
        return a(Arrays.asList(abstractC3393JvArr));
    }

    public static AbstractC3393Jv c() {
        return new b();
    }

    /* renamed from: o.Kv$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3393Jv {
        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
        }

        @Override // o.AbstractC3393Jv
        public void c(C3588Lv c3588Lv) {
        }
    }
}
