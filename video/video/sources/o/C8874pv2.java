package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o.C8998qQ1;

/* renamed from: o.pv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8874pv2<T> extends AbstractC8387nv2<T> {
    public final C5523cF0 a;
    public final AbstractC8387nv2<T> b;
    public final Type c;

    public C8874pv2(C5523cF0 c5523cF0, AbstractC8387nv2<T> abstractC8387nv2, Type type) {
        this.a = c5523cF0;
        this.b = abstractC8387nv2;
        this.c = type;
    }

    public static Type j(Type type, Object obj) {
        if (obj != null) {
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    public static boolean k(AbstractC8387nv2<?> abstractC8387nv2) {
        AbstractC8387nv2<T> j;
        while ((abstractC8387nv2 instanceof AbstractC9877u12) && (j = ((AbstractC9877u12) abstractC8387nv2).j()) != abstractC8387nv2) {
            abstractC8387nv2 = j;
        }
        return abstractC8387nv2 instanceof C8998qQ1.c;
    }

    @Override // o.AbstractC8387nv2
    public T e(OV0 ov0) throws IOException {
        return this.b.e(ov0);
    }

    @Override // o.AbstractC8387nv2
    public void i(C5589cW0 c5589cW0, T t) throws IOException {
        AbstractC8387nv2<T> abstractC8387nv2 = this.b;
        Type j = j(this.c, t);
        if (j != this.c) {
            abstractC8387nv2 = this.a.u(Rv2.c(j));
            if ((abstractC8387nv2 instanceof C8998qQ1.c) && !k(this.b)) {
                abstractC8387nv2 = this.b;
            }
        }
        abstractC8387nv2.i(c5589cW0, t);
    }
}
