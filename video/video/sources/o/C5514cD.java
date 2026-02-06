package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Proxy;

/* renamed from: o.cD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5514cD extends ObjectInputStream {
    public final ClassLoader X;

    public C5514cD(ClassLoader classLoader, InputStream inputStream) throws IOException, StreamCorruptedException {
        super(inputStream);
        this.X = classLoader;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        try {
            return Class.forName(objectStreamClass.getName(), false, this.X);
        } catch (ClassNotFoundException unused) {
            return super.resolveClass(objectStreamClass);
        }
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveProxyClass(String[] strArr) throws IOException, ClassNotFoundException {
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = Class.forName(strArr[i], false, this.X);
        }
        try {
            return Proxy.getProxyClass(this.X, clsArr);
        } catch (IllegalArgumentException unused) {
            return super.resolveProxyClass(strArr);
        }
    }
}
