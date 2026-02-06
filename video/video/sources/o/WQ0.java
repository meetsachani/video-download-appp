package o;

import com.facebook.internal.C2375u;
import o.HT1;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class WQ0 {
    @NotNull
    public static final WQ0 a = new WQ0();

    @InterfaceC9511sW0
    public static final void d() {
        com.facebook.M m = com.facebook.M.a;
        if (!com.facebook.M.s()) {
            return;
        }
        C2375u c2375u = C2375u.a;
        C2375u.a(C2375u.b.CrashReport, new C2375u.a() { // from class: o.TQ0
            @Override // com.facebook.internal.C2375u.a
            public final void a(boolean z) {
                WQ0.e(z);
            }
        });
        C2375u.a(C2375u.b.ErrorReport, new C2375u.a() { // from class: o.UQ0
            @Override // com.facebook.internal.C2375u.a
            public final void a(boolean z) {
                WQ0.f(z);
            }
        });
        C2375u.a(C2375u.b.AnrReport, new C2375u.a() { // from class: o.VQ0
            @Override // com.facebook.internal.C2375u.a
            public final void a(boolean z) {
                WQ0.g(z);
            }
        });
    }

    public static final void e(boolean z) {
        if (z) {
            RQ.b.c();
            C2375u c2375u = C2375u.a;
            if (C2375u.g(C2375u.b.CrashShield)) {
                C6349ff0 c6349ff0 = C6349ff0.a;
                C6349ff0.b();
                SQ sq = SQ.a;
                SQ.b();
            }
            if (C2375u.g(C2375u.b.ThreadCheck)) {
                C8842pn2 c8842pn2 = C8842pn2.a;
                C8842pn2.a();
            }
        }
    }

    public static final void f(boolean z) {
        if (z) {
            C9539se0 c9539se0 = C9539se0.a;
            C9539se0.d();
        }
    }

    public static final void g(boolean z) {
        if (z) {
            E e = E.a;
            E.c();
        }
    }
}
