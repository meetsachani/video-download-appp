package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC8148mw2;

/* renamed from: o.w12  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10366w12 {

    /* renamed from: o.w12$a */
    /* loaded from: classes4.dex */
    public static class a extends ObjectInputStream {
        public static final Map<String, Class<?>> Y;
        public final ClassLoader X;

        static {
            HashMap hashMap = new HashMap();
            Y = hashMap;
            hashMap.put(com.facebook.a0.u, Byte.TYPE);
            hashMap.put(com.facebook.a0.w, Short.TYPE);
            hashMap.put(com.facebook.a0.y, Integer.TYPE);
            hashMap.put(com.facebook.a0.A, Long.TYPE);
            hashMap.put("float", Float.TYPE);
            hashMap.put(com.facebook.a0.E, Double.TYPE);
            hashMap.put(InterfaceC8148mw2.b.f, Boolean.TYPE);
            hashMap.put(com.facebook.a0.G, Character.TYPE);
            hashMap.put("void", Void.TYPE);
        }

        public a(InputStream inputStream, ClassLoader classLoader) throws IOException {
            super(inputStream);
            this.X = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            String name = objectStreamClass.getName();
            try {
                try {
                    return Class.forName(name, false, this.X);
                } catch (ClassNotFoundException unused) {
                    return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
                }
            } catch (ClassNotFoundException e) {
                Class<?> cls = Y.get(name);
                if (cls != null) {
                    return cls;
                }
                throw e;
            }
        }
    }

    public static <T extends Serializable> T a(T t) {
        if (t == null) {
            return null;
        }
        try {
            a aVar = new a(new ByteArrayInputStream(f(t)), t.getClass().getClassLoader());
            try {
                T t2 = (T) aVar.readObject();
                aVar.close();
                return t2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw new C10120v12("IOException while reading or closing cloned object data", e);
        } catch (ClassNotFoundException e2) {
            throw new C10120v12("ClassNotFoundException while reading cloned object data", e2);
        }
    }

    public static <T> T b(InputStream inputStream) {
        C11147zE2.V(inputStream, "inputStream", new Object[0]);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            T t = (T) objectInputStream.readObject();
            objectInputStream.close();
            return t;
        } catch (IOException | ClassNotFoundException e) {
            throw new C10120v12(e);
        }
    }

    public static <T> T c(byte[] bArr) {
        C11147zE2.V(bArr, "objectData", new Object[0]);
        return (T) b(new ByteArrayInputStream(bArr));
    }

    public static <T extends Serializable> T d(T t) {
        return (T) c(f(t));
    }

    public static void e(Serializable serializable, OutputStream outputStream) {
        C11147zE2.V(outputStream, "outputStream", new Object[0]);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new C10120v12(e);
        }
    }

    public static byte[] f(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        e(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
