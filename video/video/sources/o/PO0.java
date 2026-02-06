package o;

import android.content.Context;
import o.HT1;
import o.RO0;
import org.jetbrains.annotations.NotNull;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class PO0 {
    @NotNull
    public static final PO0 a = new PO0();
    @NotNull
    public static final String b = "com.android.billingclient.api.Purchase";

    @InterfaceC9511sW0
    public static final void d(@NotNull Context context) {
        RO0.b bVar;
        RO0 c;
        if (!SQ.e(PO0.class)) {
            try {
                C6562gT0.p(context, "context");
                XO0 xo0 = XO0.a;
                if (XO0.a("com.android.billingclient.api.Purchase") != null && (c = (bVar = RO0.s).c(context)) != null && bVar.f().get()) {
                    UO0 uo0 = UO0.a;
                    if (UO0.d()) {
                        c.q("inapp", new Runnable() { // from class: o.NO0
                            @Override // java.lang.Runnable
                            public final void run() {
                                PO0.e();
                            }
                        });
                    } else {
                        c.p("inapp", new Runnable() { // from class: o.OO0
                            @Override // java.lang.Runnable
                            public final void run() {
                                PO0.f();
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, PO0.class);
            }
        }
    }

    public static final void e() {
        if (SQ.e(PO0.class)) {
            return;
        }
        try {
            a.c();
        } catch (Throwable th) {
            SQ.c(th, PO0.class);
        }
    }

    public static final void f() {
        if (SQ.e(PO0.class)) {
            return;
        }
        try {
            a.c();
        } catch (Throwable th) {
            SQ.c(th, PO0.class);
        }
    }

    public final void c() {
        if (SQ.e(this)) {
            return;
        }
        try {
            UO0 uo0 = UO0.a;
            RO0.b bVar = RO0.s;
            UO0.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
