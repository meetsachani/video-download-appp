package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.dK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5787dK1 {
    public static /* synthetic */ Class a;
    public static /* synthetic */ Class b;

    /* renamed from: o.dK1$a */
    /* loaded from: classes4.dex */
    public static class a implements InterfaceC5399bk0, Serializable {
        private static final long serialVersionUID = 5604271422565175555L;
        public final Object X;
        public transient Method Y;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            Class cls = C5787dK1.a;
            if (cls == null) {
                cls = C5787dK1.a("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory");
                C5787dK1.a = cls;
            }
            SB0.a(cls);
            objectInputStream.defaultReadObject();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            Class cls = C5787dK1.a;
            if (cls == null) {
                cls = C5787dK1.a("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory");
                C5787dK1.a = cls;
            }
            SB0.a(cls);
            objectOutputStream.defaultWriteObject();
        }

        @Override // o.InterfaceC5399bk0
        public Object a() {
            if (this.Y == null) {
                b();
            }
            try {
                return this.Y.invoke(this.X, null);
            } catch (IllegalAccessException e) {
                throw new PB0("PrototypeCloneFactory: Clone method must be public", e);
            } catch (InvocationTargetException e2) {
                throw new PB0("PrototypeCloneFactory: Clone method threw an exception", e2);
            }
        }

        public final void b() {
            try {
                this.Y = this.X.getClass().getMethod("clone", null);
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
            }
        }

        public a(Object obj, Method method) {
            this.X = obj;
            this.Y = method;
        }
    }

    /* renamed from: o.dK1$b */
    /* loaded from: classes4.dex */
    public static class b implements InterfaceC5399bk0, Serializable {
        private static final long serialVersionUID = -8704966966139178833L;
        public final Serializable X;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            Class cls = C5787dK1.b;
            if (cls == null) {
                cls = C5787dK1.a("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory");
                C5787dK1.b = cls;
            }
            SB0.a(cls);
            objectInputStream.defaultReadObject();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            Class cls = C5787dK1.b;
            if (cls == null) {
                cls = C5787dK1.a("org.apache.commons.collections.functors.PrototypeFactory$PrototypeSerializationFactory");
                C5787dK1.b = cls;
            }
            SB0.a(cls);
            objectOutputStream.defaultWriteObject();
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // o.InterfaceC5399bk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a() {
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
                    Object readObject = new ObjectInputStream(byteArrayInputStream).readObject();
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return readObject;
                } catch (IOException e5) {
                    e2 = e5;
                    throw new PB0(e2);
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new PB0(e);
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

        public b(Serializable serializable) {
            this.X = serializable;
        }
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC5399bk0 b(Object obj) {
        if (obj == null) {
            return C8729pK.Y;
        }
        try {
            try {
                return new a(obj, obj.getClass().getMethod("clone", null));
            } catch (NoSuchMethodException unused) {
                obj.getClass().getConstructor(obj.getClass());
                return new PQ0(obj.getClass(), new Class[]{obj.getClass()}, new Object[]{obj});
            }
        } catch (NoSuchMethodException unused2) {
            if (obj instanceof Serializable) {
                return new b((Serializable) obj);
            }
            throw new IllegalArgumentException("The prototype must be cloneable via a public clone method");
        }
    }
}
