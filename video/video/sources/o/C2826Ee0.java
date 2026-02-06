package o;

import com.facebook.appevents.C2315e;
import com.facebook.internal.C2379y;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.Ee0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826Ee0 {
    public static boolean b;
    @NotNull
    public static final C2826Ee0 a = new C2826Ee0();
    @NotNull
    public static final List<a> c = new ArrayList();
    @NotNull
    public static final Set<String> d = new HashSet();

    /* renamed from: o.Ee0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public String a;
        @NotNull
        public List<String> b;

        public a(@NotNull String str, @NotNull List<String> list) {
            C6562gT0.p(str, "eventName");
            C6562gT0.p(list, "deprecateParams");
            this.a = str;
            this.b = list;
        }

        @NotNull
        public final List<String> a() {
            return this.b;
        }

        @NotNull
        public final String b() {
            return this.a;
        }

        public final void c(@NotNull List<String> list) {
            C6562gT0.p(list, "<set-?>");
            this.b = list;
        }

        public final void d(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.a = str;
        }
    }

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(C2826Ee0.class)) {
            return;
        }
        try {
            b = true;
            a.b();
        } catch (Throwable th) {
            SQ.c(th, C2826Ee0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull Map<String, String> map, @NotNull String str) {
        if (!SQ.e(C2826Ee0.class)) {
            try {
                C6562gT0.p(map, BreadcrumbAnalyticsEventReceiver.c);
                C6562gT0.p(str, "eventName");
                if (b) {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    for (a aVar : new ArrayList(c)) {
                        if (C6562gT0.g(aVar.b(), str)) {
                            for (String str2 : arrayList) {
                                if (aVar.a().contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C2826Ee0.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull List<C2315e> list) {
        if (!SQ.e(C2826Ee0.class)) {
            try {
                C6562gT0.p(list, "events");
                if (b) {
                    Iterator<C2315e> it = list.iterator();
                    while (it.hasNext()) {
                        if (d.contains(it.next().g())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C2826Ee0.class);
            }
        }
    }

    public final synchronized void b() {
        C2379y q;
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.internal.C c2 = com.facebook.internal.C.a;
            com.facebook.M m = com.facebook.M.a;
            q = com.facebook.internal.C.q(com.facebook.M.o(), false);
        } catch (Exception unused) {
        }
        if (q == null) {
            return;
        }
        String q2 = q.q();
        if (q2 != null && q2.length() > 0) {
            JSONObject jSONObject = new JSONObject(q2);
            c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set<String> set = d;
                        C6562gT0.o(next, "key");
                        set.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        C6562gT0.o(next, "key");
                        a aVar = new a(next, new ArrayList());
                        if (optJSONArray != null) {
                            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                            aVar.c(com.facebook.internal.l0.n(optJSONArray));
                        }
                        c.add(aVar);
                    }
                }
            }
        }
    }
}
