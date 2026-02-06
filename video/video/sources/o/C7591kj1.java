package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.kj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7591kj1 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final Set<C7591kj1> e = new CopyOnWriteArraySet();
    @NotNull
    public static final String f = "k";
    @NotNull
    public static final String g = "v";
    @NotNull
    public static final String h = ",";
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final List<String> c;

    /* renamed from: o.kj1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C6562gT0.o(optString, "k");
                    if (optString.length() != 0) {
                        Set a = C7591kj1.a();
                        C6562gT0.o(next, "key");
                        List o5 = C10763xf2.o5(optString, new String[]{","}, false, 0, 6, null);
                        C6562gT0.o(optString2, "v");
                        a.add(new C7591kj1(next, o5, optString2, null));
                    }
                }
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            for (C7591kj1 c7591kj1 : C7591kj1.a()) {
                hashSet.add(c7591kj1.d());
            }
            return hashSet;
        }

        @InterfaceC9511sW0
        @NotNull
        public final Set<C7591kj1> c() {
            return new HashSet(C7591kj1.a());
        }

        @InterfaceC9511sW0
        public final void d(@NotNull String str) {
            C6562gT0.p(str, "rulesFromServer");
            try {
                C7591kj1.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        public a() {
        }
    }

    public /* synthetic */ C7591kj1(String str, List list, String str2, C9516sY c9516sY) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (SQ.e(C7591kj1.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            SQ.c(th, C7591kj1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Set<String> b() {
        if (SQ.e(C7591kj1.class)) {
            return null;
        }
        try {
            return d.b();
        } catch (Throwable th) {
            SQ.c(th, C7591kj1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Set<C7591kj1> e() {
        if (SQ.e(C7591kj1.class)) {
            return null;
        }
        try {
            return d.c();
        } catch (Throwable th) {
            SQ.c(th, C7591kj1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void g(@NotNull String str) {
        if (SQ.e(C7591kj1.class)) {
            return;
        }
        try {
            d.d(str);
        } catch (Throwable th) {
            SQ.c(th, C7591kj1.class);
        }
    }

    @NotNull
    public final List<String> c() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final String d() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final String f() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public C7591kj1(String str, List<String> list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
