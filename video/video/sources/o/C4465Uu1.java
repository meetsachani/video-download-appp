package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.C2315e;
import com.facebook.appevents.C2326p;
import java.util.Set;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* renamed from: o.Uu1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4465Uu1 {
    @NotNull
    public static final C4465Uu1 a = new C4465Uu1();
    @NotNull
    public static final Set<String> b = B22.u(C2326p.p, C2326p.y, C2326p.A);

    @InterfaceC9511sW0
    public static final boolean d() {
        if (SQ.e(C4465Uu1.class)) {
            return false;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            if (!com.facebook.M.E(com.facebook.M.n())) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (!com.facebook.internal.l0.c0()) {
                    C7768lR1 c7768lR1 = C7768lR1.a;
                    if (C7768lR1.b()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, C4465Uu1.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull final String str, @NotNull final C2315e c2315e) {
        if (!SQ.e(C4465Uu1.class)) {
            try {
                C6562gT0.p(str, "applicationId");
                C6562gT0.p(c2315e, "event");
                if (a.c(c2315e)) {
                    com.facebook.M m = com.facebook.M.a;
                    com.facebook.M.y().execute(new Runnable() { // from class: o.Tu1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4465Uu1.f(str, c2315e);
                        }
                    });
                }
            } catch (Throwable th) {
                SQ.c(th, C4465Uu1.class);
            }
        }
    }

    public static final void f(String str, C2315e c2315e) {
        if (SQ.e(C4465Uu1.class)) {
            return;
        }
        try {
            C6562gT0.p(str, "$applicationId");
            C6562gT0.p(c2315e, "$event");
            C7768lR1 c7768lR1 = C7768lR1.a;
            C7768lR1.c(str, C7979mF.k(c2315e));
        } catch (Throwable th) {
            SQ.c(th, C4465Uu1.class);
        }
    }

    @InterfaceC9511sW0
    public static final void g(@Nullable final String str, @Nullable final String str2) {
        if (!SQ.e(C4465Uu1.class)) {
            try {
                com.facebook.M m = com.facebook.M.a;
                final Context n = com.facebook.M.n();
                if (n != null && str != null && str2 != null) {
                    com.facebook.M.y().execute(new Runnable() { // from class: o.Su1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4465Uu1.h(n, str2, str);
                        }
                    });
                }
            } catch (Throwable th) {
                SQ.c(th, C4465Uu1.class);
            }
        }
    }

    public static final void h(Context context, String str, String str2) {
        if (!SQ.e(C4465Uu1.class)) {
            try {
                C6562gT0.p(context, "$context");
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                String C = C6562gT0.C(str2, "pingForOnDevice");
                if (sharedPreferences.getLong(C, 0L) == 0) {
                    C7768lR1 c7768lR1 = C7768lR1.a;
                    C7768lR1.e(str2);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(C, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                SQ.c(th, C4465Uu1.class);
            }
        }
    }

    public final boolean c(C2315e c2315e) {
        boolean z;
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (c2315e.i() && b.contains(c2315e.g())) {
                z = true;
            } else {
                z = false;
            }
            if (c2315e.i() && !z) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
