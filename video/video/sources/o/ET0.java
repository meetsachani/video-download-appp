package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class ET0 implements InterfaceC3189Hs2, Serializable {
    public static /* synthetic */ Class Y0 = null;
    private static final long serialVersionUID = -8653385846894047688L;
    public final String X;
    public final Class[] Y;
    public final Object[] Z;

    public ET0(String str) {
        this.X = str;
        this.Y = null;
        this.Z = null;
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC3189Hs2 c(String str) {
        if (str != null) {
            return new ET0(str);
        }
        throw new IllegalArgumentException("The method to invoke must not be null");
    }

    public static InterfaceC3189Hs2 d(String str, Class[] clsArr, Object[] objArr) {
        if (str != null) {
            if ((clsArr == null && objArr != null) || ((clsArr != null && objArr == null) || (clsArr != null && objArr != null && clsArr.length != objArr.length))) {
                throw new IllegalArgumentException("The parameter types must match the arguments");
            }
            if (clsArr != null && clsArr.length != 0) {
                return new ET0(str, (Class[]) clsArr.clone(), (Object[]) objArr.clone());
            }
            return new ET0(str);
        }
        throw new IllegalArgumentException("The method to invoke must not be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InvokerTransformer");
            Y0 = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.InvokerTransformer");
            Y0 = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getMethod(this.X, this.Y).invoke(obj, this.Z);
        } catch (IllegalAccessException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("InvokerTransformer: The method '");
            stringBuffer.append(this.X);
            stringBuffer.append("' on '");
            stringBuffer.append(obj.getClass());
            stringBuffer.append("' cannot be accessed");
            throw new PB0(stringBuffer.toString());
        } catch (NoSuchMethodException unused2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("InvokerTransformer: The method '");
            stringBuffer2.append(this.X);
            stringBuffer2.append("' on '");
            stringBuffer2.append(obj.getClass());
            stringBuffer2.append("' does not exist");
            throw new PB0(stringBuffer2.toString());
        } catch (InvocationTargetException e) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("InvokerTransformer: The method '");
            stringBuffer3.append(this.X);
            stringBuffer3.append("' on '");
            stringBuffer3.append(obj.getClass());
            stringBuffer3.append("' threw an exception");
            throw new PB0(stringBuffer3.toString(), e);
        }
    }

    public ET0(String str, Class[] clsArr, Object[] objArr) {
        this.X = str;
        this.Y = clsArr;
        this.Z = objArr;
    }
}
