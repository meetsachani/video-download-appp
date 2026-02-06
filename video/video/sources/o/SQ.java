package o;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class SQ {
    @NotNull
    public static final SQ a = new SQ();
    public static final Set<Object> b = Collections.newSetFromMap(new WeakHashMap());
    public static boolean c;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ Throwable X;

        public a(Throwable th) {
            this.X = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this)) {
                        throw new RuntimeException(this.X);
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void a() {
        c = false;
    }

    @InterfaceC9511sW0
    public static final void b() {
        c = true;
    }

    @InterfaceC9511sW0
    public static final void c(@Nullable Throwable th, @NotNull Object obj) {
        C6562gT0.p(obj, W12.e);
        if (!c) {
            return;
        }
        b.add(obj);
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            C6349ff0 c6349ff0 = C6349ff0.a;
            C6349ff0.c(th);
            SQ0.a aVar = SQ0.a.a;
            SQ0.a.b(th, SQ0.c.CrashShield).g();
        }
        i(th);
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final boolean d() {
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean e(@NotNull Object obj) {
        C6562gT0.p(obj, W12.e);
        return b.contains(obj);
    }

    @InterfaceC9511sW0
    public static final void g() {
        h();
    }

    @InterfaceC9511sW0
    public static final void h() {
        b.clear();
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void i(@Nullable Throwable th) {
        if (d()) {
            new Handler(Looper.getMainLooper()).post(new a(th));
        }
    }

    @InterfaceC9511sW0
    public static final void f(@Nullable Object obj) {
    }
}
