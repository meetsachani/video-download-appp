package o;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.qt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC9107qt0 implements Runnable {
    public static final Logger Y0 = Logger.getLogger(RunnableC9107qt0.class.getName());
    public static final String Z0 = "com.google.common.base.FinalizableReference";
    @MB
    public static final Constructor<Thread> a1;
    @MB
    public static final Field b1;
    public final WeakReference<Class<?>> X;
    public final PhantomReference<Object> Y;
    public final ReferenceQueue<Object> Z;

    static {
        Field field;
        Constructor<Thread> b = b();
        a1 = b;
        if (b == null) {
            field = d();
        } else {
            field = null;
        }
        b1 = field;
    }

    public RunnableC9107qt0(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.Z = referenceQueue;
        this.X = new WeakReference<>(cls);
        this.Y = phantomReference;
    }

    @MB
    public static Constructor<Thread> b() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @MB
    public static Field d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            Y0.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        o.RunnableC9107qt0.Y0.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:15:0x0045, B:17:0x0049), top: B:25:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        Field field;
        if (cls.getName().equals("o.mt0")) {
            RunnableC9107qt0 runnableC9107qt0 = new RunnableC9107qt0(cls, referenceQueue, phantomReference);
            String name = RunnableC9107qt0.class.getName();
            Constructor<Thread> constructor = a1;
            if (constructor != null) {
                try {
                    thread = constructor.newInstance(null, runnableC9107qt0, name, 0L, Boolean.FALSE);
                } catch (Throwable th) {
                    Y0.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
                }
                if (thread == null) {
                    thread = new Thread(null, runnableC9107qt0, name);
                }
                thread.setDaemon(true);
                field = b1;
                if (field != null) {
                    field.set(thread, null);
                }
                thread.start();
                return;
            }
            thread = null;
            if (thread == null) {
            }
            thread.setDaemon(true);
            field = b1;
            if (field != null) {
            }
            thread.start();
            return;
        }
        throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
    }

    public final boolean a(Reference<?> reference) {
        Method c = c();
        if (c == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.Y) {
                return false;
            }
            try {
                c.invoke(reference, null);
            } catch (Throwable th) {
                Y0.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.Z.poll();
        } while (reference != null);
        return true;
    }

    @MB
    public final Method c() {
        Class<?> cls = this.X.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.Z.remove())) {
        }
    }
}
