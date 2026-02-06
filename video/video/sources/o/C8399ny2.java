package o;

import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.ny2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8399ny2 {

    @InterfaceC5299bJ2
    /* renamed from: o.ny2$a */
    /* loaded from: classes3.dex */
    public static final class a implements Thread.UncaughtExceptionHandler {
        public static final Logger b = Logger.getLogger(a.class.getName());
        public final Runtime a;

        public a(Runtime runtime) {
            this.a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                b.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
