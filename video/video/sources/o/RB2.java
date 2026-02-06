package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class RB2 {
    public static final RB2 a = c();

    /* loaded from: classes3.dex */
    public class a extends RB2 {
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public a(Method method, Object obj) {
            this.b = method;
            this.c = obj;
        }

        @Override // o.RB2
        public <T> T d(Class<T> cls) throws Exception {
            RB2.b(cls);
            return (T) this.b.invoke(this.c, cls);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends RB2 {
        public final /* synthetic */ Method b;
        public final /* synthetic */ int c;

        public b(Method method, int i) {
            this.b = method;
            this.c = i;
        }

        @Override // o.RB2
        public <T> T d(Class<T> cls) throws Exception {
            RB2.b(cls);
            return (T) this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
    }

    /* loaded from: classes3.dex */
    public class c extends RB2 {
        public final /* synthetic */ Method b;

        public c(Method method) {
            this.b = method;
        }

        @Override // o.RB2
        public <T> T d(Class<T> cls) throws Exception {
            RB2.b(cls);
            return (T) this.b.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends RB2 {
        @Override // o.RB2
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class<?> cls) {
        String v = C9954uL.v(cls);
        if (v == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + v);
    }

    public static RB2 c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract <T> T d(Class<T> cls) throws Exception;
}
