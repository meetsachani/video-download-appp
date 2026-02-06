package o;

import com.facebook.S;
import com.facebook.internal.C2375u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import o.HT1;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.ff0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6349ff0 {
    @NotNull
    public static final C6349ff0 a = new C6349ff0();
    public static boolean b;

    @InterfaceC9511sW0
    public static final void b() {
        b = true;
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            a.e();
        }
    }

    @InterfaceC9511sW0
    public static final void c(@Nullable Throwable th) {
        if (b && !d() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            C6562gT0.o(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                C2375u c2375u = C2375u.a;
                String className = stackTraceElement.getClassName();
                C6562gT0.o(className, "it.className");
                C2375u.b d = C2375u.d(className);
                if (d != C2375u.b.Unknown) {
                    C2375u.c(d);
                    hashSet.add(d.toString());
                }
            }
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.s() && !hashSet.isEmpty()) {
                SQ0.a aVar = SQ0.a.a;
                SQ0.a.c(new JSONArray((Collection) hashSet)).g();
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2(otherwise = 2)
    public static final boolean d() {
        return false;
    }

    public static final void f(SQ0 sq0, com.facebook.Y y) {
        Boolean valueOf;
        C6562gT0.p(sq0, "$instrumentData");
        C6562gT0.p(y, "response");
        try {
            if (y.g() == null) {
                JSONObject k = y.k();
                if (k == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(k.getBoolean("success"));
                }
                if (C6562gT0.g(valueOf, Boolean.TRUE)) {
                    sq0.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    public final void e() {
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (!com.facebook.internal.l0.c0()) {
            C5086aR0 c5086aR0 = C5086aR0.a;
            File[] n = C5086aR0.n();
            ArrayList arrayList = new ArrayList();
            int length = n.length;
            int i = 0;
            while (i < length) {
                File file = n[i];
                i++;
                SQ0.a aVar = SQ0.a.a;
                final SQ0 d = SQ0.a.d(file);
                if (d.f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", d.toString());
                        S.c cVar = com.facebook.S.n;
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        com.facebook.M m = com.facebook.M.a;
                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.M.o()}, 1));
                        C6562gT0.o(format, "java.lang.String.format(format, *args)");
                        arrayList.add(cVar.N(null, format, jSONObject, new S.b() { // from class: o.ef0
                            @Override // com.facebook.S.b
                            public final void a(com.facebook.Y y) {
                                C6349ff0.f(SQ0.this, y);
                            }
                        }));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            new com.facebook.X(arrayList).k();
        }
    }
}
