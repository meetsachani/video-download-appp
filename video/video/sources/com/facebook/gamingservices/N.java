package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.S;
import com.facebook.Y;
import com.facebook.Z;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N {
    public static final void d(com.facebook.bolts.C c, Y y) {
        C2416z q;
        C6562gT0.p(c, "$task");
        C6562gT0.p(y, "response");
        String str = null;
        C2416z c2416z = null;
        if (y.g() != null) {
            com.facebook.C g = y.g();
            if (g == null) {
                q = null;
            } else {
                q = g.q();
            }
            if (q != null) {
                com.facebook.C g2 = y.g();
                if (g2 != null) {
                    c2416z = g2.q();
                }
                c.c(c2416z);
                return;
            }
            c.c(new s("Graph API Error"));
            return;
        }
        JSONObject i = y.i();
        if (i != null) {
            str = i.optString("success");
        }
        if (str != null && str.length() != 0) {
            c.d(Boolean.valueOf(str.equals("true")));
        } else {
            c.c(new s("Graph API Error"));
        }
    }

    @Nullable
    public final com.facebook.bolts.C<Boolean> b(@NotNull A a, @NotNull Number number) {
        C6562gT0.p(a, "tournament");
        C6562gT0.p(number, "score");
        return c(a.X, number);
    }

    @Nullable
    public final com.facebook.bolts.C<Boolean> c(@NotNull String str, @NotNull Number number) {
        C6562gT0.p(str, "identifier");
        C6562gT0.p(number, "score");
        C0376a i = C0376a.g1.i();
        if (i != null && !i.C()) {
            if (i.s() != null && C6562gT0.g(com.facebook.M.P, i.s())) {
                final com.facebook.bolts.C<Boolean> c = new com.facebook.bolts.C<>();
                String C = C6562gT0.C(str, "/update_score");
                Bundle bundle = new Bundle();
                bundle.putInt("score", number.intValue());
                new S(i, C, bundle, Z.POST, new S.b() { // from class: com.facebook.gamingservices.M
                    @Override // com.facebook.S.b
                    public final void a(Y y) {
                        N.d(com.facebook.bolts.C.this, y);
                    }
                }, null, 32, null).n();
                return c;
            }
            throw new C2416z("User is not using gaming login");
        }
        throw new C2416z("Attempted to fetch tournament with an invalid access token");
    }
}
