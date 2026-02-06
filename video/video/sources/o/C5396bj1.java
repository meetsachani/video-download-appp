package o;

import android.app.Activity;
import com.facebook.internal.C2358c;
import com.facebook.internal.C2379y;
import o.HT1;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* renamed from: o.bj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5396bj1 {
    @NotNull
    public static final C5396bj1 a = new C5396bj1();
    public static final String b = C5396bj1.class.getCanonicalName();
    public static boolean c;

    @InterfaceC9511sW0
    public static final void b() {
        if (!SQ.e(C5396bj1.class)) {
            try {
                try {
                    com.facebook.M m = com.facebook.M.a;
                    com.facebook.M.y().execute(new Runnable() { // from class: o.aj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5396bj1.c();
                        }
                    });
                } catch (Exception e) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e);
                }
            } catch (Throwable th) {
                SQ.c(th, C5396bj1.class);
            }
        }
    }

    public static final void c() {
        if (!SQ.e(C5396bj1.class)) {
            try {
                com.facebook.M m = com.facebook.M.a;
                if (!C2358c.f.j(com.facebook.M.n())) {
                    a.e();
                    c = true;
                }
            } catch (Throwable th) {
                SQ.c(th, C5396bj1.class);
            }
        }
    }

    @InterfaceC6184ey2
    @InterfaceC9511sW0
    public static final void d(@NotNull Activity activity) {
        if (!SQ.e(C5396bj1.class)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                try {
                    if (c && !C7591kj1.d.c().isEmpty()) {
                        ViewTreeObserver$OnGlobalFocusChangeListenerC8338nj1.Z0.e(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, C5396bj1.class);
            }
        }
    }

    public final void e() {
        String o2;
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q == null || (o2 = q.o()) == null) {
                    return;
                }
                C7591kj1.d.d(o2);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
