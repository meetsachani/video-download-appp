package o;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

/* renamed from: o.Wn0 */
/* loaded from: classes3.dex */
public class C4631Wn0<T> {
    public final Field a;
    public final J4<Object, T> b = g();
    public final InterfaceC11246zf<Object, T> c = h();

    public C4631Wn0(Field field) {
        this.a = field;
    }

    public static /* synthetic */ Object a(Method method, Object obj) {
        return ((Optional) method.invoke(obj, null)).orElse(null);
    }

    public static /* synthetic */ Object b(C4631Wn0 c4631Wn0, Object obj) {
        return C2474Ao0.p(c4631Wn0.a, obj, true);
    }

    public static /* synthetic */ Object c(Method method, Object obj) {
        return method.invoke(obj, null);
    }

    public static /* synthetic */ void d(Method method, Object obj, Object obj2) {
        method.invoke(obj, Optional.ofNullable(obj2));
    }

    public static /* synthetic */ void e(Method method, Object obj, Object obj2) {
        method.invoke(obj, obj2);
    }

    public static /* synthetic */ void f(C4631Wn0 c4631Wn0, Object obj, Object obj2) {
        C2474Ao0.D(c4631Wn0.a, obj, obj2, true);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4631Wn0)) {
            return false;
        }
        return this.a.equals(((C4631Wn0) obj).a);
    }

    public final J4<Object, T> g() {
        try {
            final Method method = this.a.getDeclaringClass().getMethod("get" + Character.toUpperCase(this.a.getName().charAt(0)) + this.a.getName().substring(1), null);
            if (method.getReturnType().equals(Optional.class)) {
                return new J4() { // from class: o.Tn0
                    @Override // o.J4
                    public final Object invoke(Object obj) {
                        return C4631Wn0.a(method, obj);
                    }
                };
            }
            return new J4() { // from class: o.Un0
                @Override // o.J4
                public final Object invoke(Object obj) {
                    return C4631Wn0.c(method, obj);
                }
            };
        } catch (NoSuchMethodException unused) {
            return new J4() { // from class: o.Vn0
                @Override // o.J4
                public final Object invoke(Object obj) {
                    return C4631Wn0.b(C4631Wn0.this, obj);
                }
            };
        }
    }

    public final InterfaceC11246zf<Object, T> h() {
        String str = C10829xw0.c + Character.toUpperCase(this.a.getName().charAt(0)) + this.a.getName().substring(1);
        try {
            try {
                final Method method = this.a.getDeclaringClass().getMethod(str, this.a.getType());
                method.getClass();
                return new InterfaceC11246zf() { // from class: o.Qn0
                    @Override // o.InterfaceC11246zf
                    public final void i(Object obj, Object obj2) {
                        C4631Wn0.e(method, obj, obj2);
                    }
                };
            } catch (NoSuchMethodException unused) {
                return new InterfaceC11246zf() { // from class: o.Sn0
                    @Override // o.InterfaceC11246zf
                    public final void i(Object obj, Object obj2) {
                        C4631Wn0.f(C4631Wn0.this, obj, obj2);
                    }
                };
            }
        } catch (NoSuchMethodException unused2) {
            final Method method2 = this.a.getDeclaringClass().getMethod(str, Optional.class);
            return new InterfaceC11246zf() { // from class: o.Rn0
                @Override // o.InterfaceC11246zf
                public final void i(Object obj, Object obj2) {
                    C4631Wn0.d(method2, obj, obj2);
                }
            };
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public T i(Object obj) throws IllegalAccessException, InvocationTargetException {
        return this.b.invoke(obj);
    }

    public void j(Object obj, T t) throws IllegalAccessException, InvocationTargetException {
        this.c.i(obj, t);
    }

    public String toString() {
        return this.a.toString();
    }
}
