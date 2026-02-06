package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.C2416z;
import com.facebook.S;
import com.facebook.Y;
import com.facebook.Z;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o.C5523cF0;
import o.C6008eF0;
import o.C6562gT0;
import o.C7330jf;
import o.C8319ne2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G {
    public static final void c(com.facebook.bolts.C c, Y y) {
        C2416z q;
        C6562gT0.p(c, "$task");
        C6562gT0.p(y, "response");
        if (y.g() != null) {
            com.facebook.C g = y.g();
            C2416z c2416z = null;
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
        try {
            JSONObject i = y.i();
            if (i == null) {
                c.c(new s("Failed to get response"));
                return;
            }
            JSONArray jSONArray = i.getJSONArray("data");
            if (jSONArray != null && jSONArray.length() >= 1) {
                C5523cF0 f = new C6008eF0().f();
                String jSONArray2 = jSONArray.toString();
                C6562gT0.o(jSONArray2, "data.toString()");
                Object l = f.l(jSONArray2, A[].class);
                C6562gT0.o(l, "gson.fromJson(dataString, Array<Tournament>::class.java)");
                c.d(C7330jf.Uy((Object[]) l));
                return;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "No tournament found", Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length()), 1}, 2));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            c.c(new s(format));
        } catch (JSONException e) {
            c.c(e);
        }
    }

    @NotNull
    public final com.facebook.bolts.C<List<A>> b() {
        final com.facebook.bolts.C<List<A>> c = new com.facebook.bolts.C<>();
        Bundle bundle = new Bundle();
        C0376a.d dVar = C0376a.g1;
        C0376a i = dVar.i();
        if (i != null && !i.C()) {
            if (i.s() != null && C6562gT0.g(com.facebook.M.P, i.s())) {
                S s = new S(dVar.i(), "me/tournaments", bundle, Z.GET, new S.b() { // from class: com.facebook.gamingservices.F
                    @Override // com.facebook.S.b
                    public final void a(Y y) {
                        G.c(com.facebook.bolts.C.this, y);
                    }
                }, null, 32, null);
                s.r0(bundle);
                s.n();
                return c;
            }
            throw new C2416z("User is not using gaming login");
        }
        throw new C2416z("Attempted to fetch tournament with an invalid access token");
    }
}
