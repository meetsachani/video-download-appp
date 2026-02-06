package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.eK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6029eK1 {

    /* renamed from: o.eK1$b */
    /* loaded from: classes4.dex */
    public static class b<T> implements InterfaceC5641ck0<T> {
        public final T X;
        public transient Method Y;

        @Override // o.InterfaceC5641ck0
        public T a() {
            if (this.Y == null) {
                b();
            }
            try {
                return (T) this.Y.invoke(this.X, null);
            } catch (IllegalAccessException e) {
                throw new OB0("PrototypeCloneFactory: Clone method must be public", e);
            } catch (InvocationTargetException e2) {
                throw new OB0("PrototypeCloneFactory: Clone method threw an exception", e2);
            }
        }

        public final void b() {
            try {
                this.Y = this.X.getClass().getMethod("clone", null);
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
            }
        }

        public b(T t, Method method) {
            this.X = t;
            this.Y = method;
        }
    }

    /* renamed from: o.eK1$c */
    /* loaded from: classes4.dex */
    public static class c<T extends Serializable> implements InterfaceC5641ck0<T> {
        public final T X;

        /* JADX WARN: Removed duplicated region for block: B:36:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // o.InterfaceC5641ck0
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T a() {
            Throwable th;
            ClassNotFoundException e;
            IOException e2;
            ByteArrayInputStream byteArrayInputStream;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            ByteArrayInputStream byteArrayInputStream2 = null;
            try {
                try {
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(this.X);
                    byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (IOException e3) {
                    e2 = e3;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
                try {
                    T t = (T) new ObjectInputStream(byteArrayInputStream).readObject();
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return t;
                } catch (IOException e5) {
                    e2 = e5;
                    throw new OB0(e2);
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new OB0(e);
                }
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        }

        public c(T t) {
            this.X = t;
        }
    }

    public static <T> InterfaceC5641ck0<T> a(T t) {
        if (t == null) {
            return C8486oK.b(null);
        }
        try {
            try {
                return new b(t, t.getClass().getMethod("clone", null));
            } catch (NoSuchMethodException unused) {
                if (t instanceof Serializable) {
                    return new c((Serializable) t);
                }
                throw new IllegalArgumentException("The prototype must be cloneable via a public clone method");
            }
        } catch (NoSuchMethodException unused2) {
            t.getClass().getConstructor(t.getClass());
            return new OQ0(t.getClass(), new Class[]{t.getClass()}, new Object[]{t});
        }
    }
}
