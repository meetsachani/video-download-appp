package o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class DT0<I, O> implements InterfaceC3287Is2<I, O> {
    public final String X;
    public final Class<?>[] Y;
    public final Object[] Z;

    public DT0(String str) {
        this.X = str;
        this.Y = null;
        this.Z = null;
    }

    public static <I, O> InterfaceC3287Is2<I, O> b(String str) {
        if (str != null) {
            return new DT0(str);
        }
        throw new NullPointerException("The method to invoke must not be null");
    }

    public static <I, O> InterfaceC3287Is2<I, O> c(String str, Class<?>[] clsArr, Object[] objArr) {
        if (str != null) {
            if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
                throw new IllegalArgumentException("The parameter types must match the arguments");
            }
            if (clsArr != null && clsArr.length != 0) {
                return new DT0(str, clsArr, objArr);
            }
            return new DT0(str);
        }
        throw new NullPointerException("The method to invoke must not be null");
    }

    @Override // o.InterfaceC3287Is2
    public O a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (O) obj.getClass().getMethod(this.X, this.Y).invoke(obj, this.Z);
        } catch (IllegalAccessException unused) {
            throw new OB0("InvokerTransformer: The method '" + this.X + "' on '" + obj.getClass() + "' cannot be accessed");
        } catch (NoSuchMethodException unused2) {
            throw new OB0("InvokerTransformer: The method '" + this.X + "' on '" + obj.getClass() + "' does not exist");
        } catch (InvocationTargetException e) {
            throw new OB0("InvokerTransformer: The method '" + this.X + "' on '" + obj.getClass() + "' threw an exception", e);
        }
    }

    public DT0(String str, Class<?>[] clsArr, Object[] objArr) {
        this.X = str;
        this.Y = clsArr != null ? (Class[]) clsArr.clone() : null;
        this.Z = objArr != null ? (Object[]) objArr.clone() : null;
    }
}
