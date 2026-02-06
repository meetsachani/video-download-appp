package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.C2416z;
import com.facebook.EnumC2354h;
import com.facebook.internal.Z;
import com.facebook.internal.c0;
import com.facebook.internal.l0;
import com.facebook.login.C2387d;
import com.facebook.login.I;
import com.facebook.login.w;
import java.util.List;
import o.C10662xF;
import o.C6562gT0;
import o.C7458kA2;
import o.InterfaceC5056aJ2;
import o.X5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC5056aJ2(otherwise = 3)
/* loaded from: classes2.dex */
public abstract class N extends I {
    @NotNull
    public final EnumC2354h b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.b1 = EnumC2354h.FACEBOOK_APPLICATION_WEB;
    }

    public static final void O(N n, w.e eVar, Bundle bundle) {
        C6562gT0.p(n, "this$0");
        C6562gT0.p(eVar, "$request");
        C6562gT0.p(bundle, "$extras");
        try {
            n.K(eVar, n.u(eVar, bundle));
        } catch (com.facebook.P e) {
            com.facebook.C c = e.c();
            n.J(eVar, c.m(), c.h(), String.valueOf(c.g()));
        } catch (C2416z e2) {
            n.J(eVar, null, e2.getMessage(), null);
        }
    }

    public final void B(w.f fVar) {
        if (fVar != null) {
            h().h(fVar);
        } else {
            h().c0();
        }
    }

    @Nullable
    public String C(@Nullable Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("error");
        }
        if (string == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString("error_type");
        }
        return string;
    }

    @Nullable
    public String D(@Nullable Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("error_message");
        }
        if (string == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString(Z.Q0);
        }
        return string;
    }

    @NotNull
    public EnumC2354h E() {
        return this.b1;
    }

    public void I(@Nullable w.e eVar, @NotNull Intent intent) {
        Object obj;
        C6562gT0.p(intent, "data");
        Bundle extras = intent.getExtras();
        String C = C(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        c0 c0Var = c0.a;
        if (C6562gT0.g(c0.c(), str)) {
            B(w.f.d1.d(eVar, C, D(extras), str));
        } else {
            B(w.f.d1.a(eVar, C));
        }
    }

    public void J(@Nullable w.e eVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && C6562gT0.g(str, "logged_out")) {
            C2387d.b bVar = C2387d.k1;
            C2387d.p1 = true;
            B(null);
            return;
        }
        c0 c0Var = c0.a;
        if (C10662xF.Y1(c0.d(), str)) {
            B(null);
        } else if (C10662xF.Y1(c0.e(), str)) {
            B(w.f.d1.a(eVar, null));
        } else {
            B(w.f.d1.d(eVar, str, str2, str3));
        }
    }

    public void K(@NotNull w.e eVar, @NotNull Bundle bundle) {
        C6562gT0.p(eVar, "request");
        C6562gT0.p(bundle, "extras");
        try {
            I.a aVar = I.Z;
            B(w.f.d1.b(eVar, aVar.b(eVar.s(), bundle, E(), eVar.a()), aVar.d(bundle, eVar.q())));
        } catch (C2416z e) {
            B(w.f.c.e(w.f.d1, eVar, null, e.getMessage(), null, 8, null));
        }
    }

    public final boolean L(Intent intent) {
        com.facebook.M m = com.facebook.M.a;
        List<ResolveInfo> queryIntentActivities = com.facebook.M.n().getPackageManager().queryIntentActivities(intent, 65536);
        C6562gT0.o(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }

    public final void N(final w.e eVar, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            l0 l0Var = l0.a;
            if (!l0.f0(bundle.getString("code"))) {
                com.facebook.M m = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.login.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        N.O(N.this, eVar, bundle);
                    }
                });
                return;
            }
        }
        K(eVar, bundle);
    }

    public boolean P(@Nullable Intent intent, int i) {
        A a;
        X5<Intent> L2;
        if (intent == null || !L(intent)) {
            return false;
        }
        Fragment u = h().u();
        C7458kA2 c7458kA2 = null;
        if (u instanceof A) {
            a = (A) u;
        } else {
            a = null;
        }
        if (a != null && (L2 = a.L2()) != null) {
            L2.b(intent);
            c7458kA2 = C7458kA2.a;
        }
        if (c7458kA2 == null) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.login.I
    public boolean t(int i, int i2, @Nullable Intent intent) {
        String obj;
        w.e C = h().C();
        if (intent == null) {
            B(w.f.d1.a(C, "Operation canceled"));
        } else if (i2 == 0) {
            I(C, intent);
        } else if (i2 != -1) {
            B(w.f.c.e(w.f.d1, C, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                B(w.f.c.e(w.f.d1, C, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String C2 = C(extras);
            Object obj2 = extras.get("error_code");
            if (obj2 == null) {
                obj = null;
            } else {
                obj = obj2.toString();
            }
            String D = D(extras);
            String string = extras.getString("e2e");
            l0 l0Var = l0.a;
            if (!l0.f0(string)) {
                q(string);
            }
            if (C2 == null && obj == null && D == null && C != null) {
                N(C, extras);
            } else {
                J(C, C2, D, obj);
            }
        }
        return true;
    }

    @Override // com.facebook.login.I
    public abstract int z(@NotNull w.e eVar);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "source");
        this.b1 = EnumC2354h.FACEBOOK_APPLICATION_WEB;
    }
}
