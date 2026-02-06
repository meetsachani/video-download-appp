package o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: o.Qe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4009Qe<E> extends AbstractC8387nv2<Object> {
    public static final InterfaceC8631ov2 c = new a();
    public final Class<E> a;
    public final AbstractC8387nv2<E> b;

    /* renamed from: o.Qe$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            Type g = rv2.g();
            if (!(g instanceof GenericArrayType) && (!(g instanceof Class) || !((Class) g).isArray())) {
                return null;
            }
            Type g2 = C7233jF0.g(g);
            return new C4009Qe(c5523cF0, c5523cF0.u(Rv2.c(g2)), C7233jF0.k(g2));
        }
    }

    public C4009Qe(C5523cF0 c5523cF0, AbstractC8387nv2<E> abstractC8387nv2, Class<E> cls) {
        this.b = new C8874pv2(c5523cF0, abstractC8387nv2, cls);
        this.a = cls;
    }

    @Override // o.AbstractC8387nv2
    public Object e(OV0 ov0) throws IOException {
        if (ov0.I() == XV0.NULL) {
            ov0.E();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ov0.d();
        while (ov0.r()) {
            arrayList.add(this.b.e(ov0));
        }
        ov0.k();
        int size = arrayList.size();
        if (this.a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.a, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.a, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8387nv2
    public void i(C5589cW0 c5589cW0, Object obj) throws IOException {
        if (obj == null) {
            c5589cW0.u();
            return;
        }
        c5589cW0.h();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.i(c5589cW0, Array.get(obj, i));
        }
        c5589cW0.k();
    }
}
