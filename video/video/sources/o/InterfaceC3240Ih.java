package o;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: o.Ih  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3240Ih {

    /* renamed from: o.Ih$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b() {
        }

        public b(String str) {
            super(str);
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        public b(Throwable th) {
            super(th);
        }
    }

    /* renamed from: o.Ih$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public static c c(int i, long j) {
            return new C8576oi(i, j);
        }

        public abstract int a();

        public abstract long b();
    }

    void a(a aVar, Executor executor);

    void g();

    c read(ByteBuffer byteBuffer);

    void start() throws b, IllegalStateException;

    void stop() throws IllegalStateException;

    /* renamed from: o.Ih$a */
    /* loaded from: classes.dex */
    public interface a {
        default void a(boolean z) {
        }
    }
}
