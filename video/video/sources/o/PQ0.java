package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class PQ0 implements InterfaceC5399bk0, Serializable {
    public static /* synthetic */ Class Z0 = null;
    private static final long serialVersionUID = -7732226881069447957L;
    public final Class X;
    public final Class[] Y;
    public transient Constructor Y0;
    public final Object[] Z;

    public PQ0(Class cls) {
        this.Y0 = null;
        this.X = cls;
        this.Y = null;
        this.Z = null;
        c();
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC5399bk0 d(Class cls, Class[] clsArr, Object[] objArr) {
        if (cls != null) {
            if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
                throw new IllegalArgumentException("Parameter types must match the arguments");
            }
            if (clsArr != null && clsArr.length != 0) {
                return new PQ0(cls, (Class[]) clsArr.clone(), (Object[]) objArr.clone());
            }
            return new PQ0(cls);
        }
        throw new IllegalArgumentException("Class to instantiate must not be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Z0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InstantiateFactory");
            Z0 = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Z0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InstantiateFactory");
            Z0 = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC5399bk0
    public Object a() {
        if (this.Y0 == null) {
            c();
        }
        try {
            return this.Y0.newInstance(this.Z);
        } catch (IllegalAccessException e) {
            throw new PB0("InstantiateFactory: Constructor must be public", e);
        } catch (InstantiationException e2) {
            throw new PB0("InstantiateFactory: InstantiationException", e2);
        } catch (InvocationTargetException e3) {
            throw new PB0("InstantiateFactory: Constructor threw an exception", e3);
        }
    }

    public final void c() {
        try {
            this.Y0 = this.X.getConstructor(this.Y);
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("InstantiateFactory: The constructor must exist and be public ");
        }
    }

    public PQ0(Class cls, Class[] clsArr, Object[] objArr) {
        this.Y0 = null;
        this.X = cls;
        this.Y = clsArr;
        this.Z = objArr;
        c();
    }
}
