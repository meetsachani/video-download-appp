package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class RQ0 implements InterfaceC3189Hs2, Serializable {
    public static /* synthetic */ Class Y0 = null;
    public static final InterfaceC3189Hs2 Z = new RQ0();
    private static final long serialVersionUID = 3786388740793356347L;
    public final Class[] X;
    public final Object[] Y;

    public RQ0() {
        this.X = null;
        this.Y = null;
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC3189Hs2 c(Class[] clsArr, Object[] objArr) {
        if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
            throw new IllegalArgumentException("Parameter types must match the arguments");
        }
        if (clsArr != null && clsArr.length != 0) {
            return new RQ0((Class[]) clsArr.clone(), (Object[]) objArr.clone());
        }
        return Z;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InstantiateTransformer");
            Y0 = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InstantiateTransformer");
            Y0 = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        String name;
        try {
            if (!(obj instanceof Class)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("InstantiateTransformer: Input object was not an instanceof Class, it was a ");
                if (obj == null) {
                    name = "null object";
                } else {
                    name = obj.getClass().getName();
                }
                stringBuffer.append(name);
                throw new PB0(stringBuffer.toString());
            }
            return ((Class) obj).getConstructor(this.X).newInstance(this.Y);
        } catch (IllegalAccessException e) {
            throw new PB0("InstantiateTransformer: Constructor must be public", e);
        } catch (InstantiationException e2) {
            throw new PB0("InstantiateTransformer: InstantiationException", e2);
        } catch (NoSuchMethodException unused) {
            throw new PB0("InstantiateTransformer: The constructor must exist and be public ");
        } catch (InvocationTargetException e3) {
            throw new PB0("InstantiateTransformer: Constructor threw an exception", e3);
        }
    }

    public RQ0(Class[] clsArr, Object[] objArr) {
        this.X = clsArr;
        this.Y = objArr;
    }
}
