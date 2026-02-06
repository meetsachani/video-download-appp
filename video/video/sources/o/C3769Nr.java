package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: o.Nr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3769Nr {
    public static final b a = b();

    /* renamed from: o.Nr$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a(ByteBuffer byteBuffer) throws ReflectiveOperationException;
    }

    /* renamed from: o.Nr$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {
        public final Method a;
        public final Method b;

        @Override // o.C3769Nr.b
        public void a(ByteBuffer byteBuffer) throws ReflectiveOperationException {
            Object invoke = this.a.invoke(byteBuffer, null);
            if (invoke != null) {
                this.b.invoke(invoke, null);
            }
        }

        public c() throws ReflectiveOperationException, SecurityException {
            this.b = Class.forName("sun.misc.Cleaner").getMethod("clean", null);
            this.a = Class.forName("sun.nio.ch.DirectBuffer").getMethod("cleaner", null);
        }
    }

    /* renamed from: o.Nr$d */
    /* loaded from: classes4.dex */
    public static final class d implements b {
        public final Object a;
        public final Method b;

        @Override // o.C3769Nr.b
        public void a(ByteBuffer byteBuffer) throws ReflectiveOperationException {
            this.b.invoke(this.a, byteBuffer);
        }

        public d() throws ReflectiveOperationException, SecurityException {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            this.a = declaredField.get(null);
            this.b = cls.getMethod("invokeCleaner", ByteBuffer.class);
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        try {
            a.a(byteBuffer);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to clean direct buffer.", e);
        }
    }

    public static b b() {
        try {
            return new c();
        } catch (Exception e) {
            try {
                return new d();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to initialize a Cleaner.", e);
            }
        }
    }

    public static boolean c() {
        if (a != null) {
            return true;
        }
        return false;
    }
}
