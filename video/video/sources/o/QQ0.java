package o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class QQ0<T> implements InterfaceC3287Is2<Class<? extends T>, T> {
    public static final InterfaceC3287Is2 Z = new QQ0();
    public final Class<?>[] X;
    public final Object[] Y;

    public QQ0() {
        this.X = null;
        this.Y = null;
    }

    public static <T> InterfaceC3287Is2<Class<? extends T>, T> b() {
        return Z;
    }

    public static <T> InterfaceC3287Is2<Class<? extends T>, T> c(Class<?>[] clsArr, Object[] objArr) {
        if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
            throw new IllegalArgumentException("Parameter types must match the arguments");
        }
        if (clsArr != null && clsArr.length != 0) {
            return new QQ0(clsArr, objArr);
        }
        return new QQ0();
    }

    @Override // o.InterfaceC3287Is2
    /* renamed from: d */
    public T a(Class<? extends T> cls) {
        try {
            if (cls != null) {
                return cls.getConstructor(this.X).newInstance(this.Y);
            }
            throw new OB0("InstantiateTransformer: Input object was not an instanceof Class, it was a null object");
        } catch (IllegalAccessException e) {
            throw new OB0("InstantiateTransformer: Constructor must be public", e);
        } catch (InstantiationException e2) {
            throw new OB0("InstantiateTransformer: InstantiationException", e2);
        } catch (NoSuchMethodException unused) {
            throw new OB0("InstantiateTransformer: The constructor must exist and be public ");
        } catch (InvocationTargetException e3) {
            throw new OB0("InstantiateTransformer: Constructor threw an exception", e3);
        }
    }

    public QQ0(Class<?>[] clsArr, Object[] objArr) {
        this.X = clsArr != null ? (Class[]) clsArr.clone() : null;
        this.Y = objArr != null ? (Object[]) objArr.clone() : null;
    }
}
