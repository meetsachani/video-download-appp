package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class OQ0<T> implements InterfaceC5641ck0<T> {
    public final Class<T> X;
    public final Class<?>[] Y;
    public transient Constructor<T> Y0;
    public final Object[] Z;

    public OQ0(Class<T> cls) {
        this.Y0 = null;
        this.X = cls;
        this.Y = null;
        this.Z = null;
        b();
    }

    public static <T> InterfaceC5641ck0<T> c(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (cls != null) {
            if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
                throw new IllegalArgumentException("Parameter types must match the arguments");
            }
            if (clsArr != null && clsArr.length != 0) {
                return new OQ0(cls, clsArr, objArr);
            }
            return new OQ0(cls);
        }
        throw new NullPointerException("Class to instantiate must not be null");
    }

    @Override // o.InterfaceC5641ck0
    public T a() {
        if (this.Y0 == null) {
            b();
        }
        try {
            return this.Y0.newInstance(this.Z);
        } catch (IllegalAccessException e) {
            throw new OB0("InstantiateFactory: Constructor must be public", e);
        } catch (InstantiationException e2) {
            throw new OB0("InstantiateFactory: InstantiationException", e2);
        } catch (InvocationTargetException e3) {
            throw new OB0("InstantiateFactory: Constructor threw an exception", e3);
        }
    }

    public final void b() {
        try {
            this.Y0 = this.X.getConstructor(this.Y);
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("InstantiateFactory: The constructor must exist and be public ");
        }
    }

    public OQ0(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        this.Y0 = null;
        this.X = cls;
        this.Y = (Class[]) clsArr.clone();
        this.Z = (Object[]) objArr.clone();
        b();
    }
}
