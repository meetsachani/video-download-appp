package o;

import android.os.Bundle;
import com.facebook.appevents.C2315e;
import com.facebook.internal.C2379y;
import java.util.List;
import o.C7768lR1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* renamed from: o.kR1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7525kR1 {
    @NotNull
    public static final C7525kR1 a = new C7525kR1();
    public static final String b = C7768lR1.class.getSimpleName();

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle a(@NotNull C7768lR1.a aVar, @NotNull String str, @NotNull List<C2315e> list) {
        if (SQ.e(C7525kR1.class)) {
            return null;
        }
        try {
            C6562gT0.p(aVar, "eventType");
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (C7768lR1.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b2 = a.b(list, str);
                if (b2.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b2.toString());
                return bundle;
            }
            return bundle;
        } catch (Throwable th) {
            SQ.c(th, C7525kR1.class);
            return null;
        }
    }

    public final JSONArray b(List<C2315e> list, String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C2315e> b6 = C10662xF.b6(list);
            C2826Ee0 c2826Ee0 = C2826Ee0.a;
            C2826Ee0.d(b6);
            boolean c = c(str);
            for (C2315e c2315e : b6) {
                if (c2315e.h()) {
                    if (c2315e.i()) {
                        if (c2315e.i() && c) {
                        }
                    }
                    jSONArray.put(c2315e.f());
                } else {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.m0(b, C6562gT0.C("Event with invalid checksum: ", c2315e));
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean c(String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            com.facebook.internal.C c = com.facebook.internal.C.a;
            C2379y q = com.facebook.internal.C.q(str, false);
            if (q == null) {
                return false;
            }
            return q.z();
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
