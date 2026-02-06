package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.C2326p;
import com.facebook.internal.C2375u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.AsyncTaskC6644gp0;
import o.C9072qk1;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.X})
/* renamed from: o.qk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9072qk1 {
    @NotNull
    public static final String c = "com.facebook.internal.MODEL_STORE";
    @NotNull
    public static final String d = "models";
    @NotNull
    public static final String e = "MTML";
    @NotNull
    public static final String f = "use_case";
    @NotNull
    public static final String g = "version_id";
    @NotNull
    public static final String h = "asset_uri";
    @NotNull
    public static final String i = "rules_uri";
    @NotNull
    public static final String j = "thresholds";
    @NotNull
    public static final String k = "model_request_timestamp";
    public static final int l = 259200000;
    @NotNull
    public static final C9072qk1 a = new C9072qk1();
    @NotNull
    public static final Map<String, b> b = new ConcurrentHashMap();
    @NotNull
    public static final List<String> m = C8222nF.O("other", C2326p.f, C2326p.l, C2326p.p, C2326p.n);
    @NotNull
    public static final List<String> n = C8222nF.O("none", "address", RR0.d);

    /* renamed from: o.qk1$a */
    /* loaded from: classes2.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: o.qk1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0329a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                a = iArr;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final String g() {
            int i = C0329a.a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "app_event_pred";
                }
                throw new C3865Oq1();
            }
            return "integrity_detect";
        }

        @NotNull
        public final String h() {
            int i = C0329a.a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new C3865Oq1();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* renamed from: o.qk1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NotNull
        public static final a i = new a(null);
        @NotNull
        public String a;
        @NotNull
        public String b;
        @Nullable
        public String c;
        public int d;
        @Nullable
        public float[] e;
        @Nullable
        public File f;
        @Nullable
        public C6868hk1 g;
        @Nullable
        public Runnable h;

        /* renamed from: o.qk1$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public static final void h(List list, File file) {
                C6562gT0.p(list, "$slaves");
                C6562gT0.p(file, "file");
                final C6868hk1 a = C6868hk1.m.a(file);
                if (a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new AsyncTaskC6644gp0.a() { // from class: o.rk1
                            @Override // o.AsyncTaskC6644gp0.a
                            public final void a(File file2) {
                                C9072qk1.b.a.i(C9072qk1.b.this, a, file2);
                            }
                        });
                    }
                }
            }

            public static final void i(b bVar, C6868hk1 c6868hk1, File file) {
                C6562gT0.p(bVar, "$slave");
                C6562gT0.p(file, "file");
                bVar.j(c6868hk1);
                bVar.l(file);
                Runnable runnable = bVar.h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            @Nullable
            public final b c(@Nullable JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString(C9072qk1.f);
                    String string2 = jSONObject.getString(C9072qk1.h);
                    String optString = jSONObject.optString(C9072qk1.i, null);
                    int i = jSONObject.getInt(C9072qk1.g);
                    float[] d = C9072qk1.d(C9072qk1.a, jSONObject.getJSONArray(C9072qk1.j));
                    C6562gT0.o(string, "useCase");
                    C6562gT0.o(string2, "assetUri");
                    return new b(string, string2, optString, i, d);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void d(String str, int i) {
                File[] listFiles;
                C6249fE2 c6249fE2 = C6249fE2.a;
                File a = C6249fE2.a();
                if (a == null || (listFiles = a.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i;
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    i2++;
                    String name = file.getName();
                    C6562gT0.o(name, "name");
                    if (C9545sf2.J2(name, str, false, 2, null) && !C9545sf2.J2(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            public final void e(String str, String str2, AsyncTaskC6644gp0.a aVar) {
                C6249fE2 c6249fE2 = C6249fE2.a;
                File file = new File(C6249fE2.a(), str2);
                if (str != null && !file.exists()) {
                    new AsyncTaskC6644gp0(str, file, aVar).execute(new String[0]);
                } else {
                    aVar.a(file);
                }
            }

            public final void f(@NotNull b bVar) {
                C6562gT0.p(bVar, "handler");
                g(bVar, C7979mF.k(bVar));
            }

            public final void g(@NotNull b bVar, @NotNull final List<b> list) {
                C6562gT0.p(bVar, "master");
                C6562gT0.p(list, "slaves");
                d(bVar.g(), bVar.h());
                e(bVar.b(), bVar.g() + '_' + bVar.h(), new AsyncTaskC6644gp0.a() { // from class: o.sk1
                    @Override // o.AsyncTaskC6644gp0.a
                    public final void a(File file) {
                        C9072qk1.b.a.h(list, file);
                    }
                });
            }

            public a() {
            }
        }

        public b(@NotNull String str, @NotNull String str2, @Nullable String str3, int i2, @Nullable float[] fArr) {
            C6562gT0.p(str, "useCase");
            C6562gT0.p(str2, "assetUri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i2;
            this.e = fArr;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @Nullable
        public final C6868hk1 c() {
            return this.g;
        }

        @Nullable
        public final File d() {
            return this.f;
        }

        @Nullable
        public final String e() {
            return this.c;
        }

        @Nullable
        public final float[] f() {
            return this.e;
        }

        @NotNull
        public final String g() {
            return this.a;
        }

        public final int h() {
            return this.d;
        }

        public final void i(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.b = str;
        }

        public final void j(@Nullable C6868hk1 c6868hk1) {
            this.g = c6868hk1;
        }

        @NotNull
        public final b k(@Nullable Runnable runnable) {
            this.h = runnable;
            return this;
        }

        public final void l(@Nullable File file) {
            this.f = file;
        }

        public final void m(@Nullable String str) {
            this.c = str;
        }

        public final void n(@Nullable float[] fArr) {
            this.e = fArr;
        }

        public final void o(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.a = str;
        }

        public final void p(int i2) {
            this.d = i2;
        }
    }

    /* renamed from: o.qk1$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final /* synthetic */ float[] d(C9072qk1 c9072qk1, JSONArray jSONArray) {
        if (SQ.e(C9072qk1.class)) {
            return null;
        }
        try {
            return c9072qk1.o(jSONArray);
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void f() {
        if (SQ.e(C9072qk1.class)) {
            return;
        }
        try {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.G0(new Runnable() { // from class: o.pk1
                @Override // java.lang.Runnable
                public final void run() {
                    C9072qk1.g();
                }
            });
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x002f, Exception -> 0x0080, TryCatch #2 {Exception -> 0x0080, all -> 0x002f, blocks: (B:5:0x000e, B:7:0x0022, B:10:0x0029, B:14:0x0036, B:16:0x0046, B:18:0x004c, B:24:0x0074, B:20:0x0054, B:23:0x005d, B:13:0x0031), top: B:29:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g() {
        JSONObject jSONObject;
        if (!SQ.e(C9072qk1.class)) {
            try {
                com.facebook.M m2 = com.facebook.M.a;
                SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(c, 0);
                String string = sharedPreferences.getString(d, null);
                if (string != null && string.length() != 0) {
                    jSONObject = new JSONObject(string);
                    long j2 = sharedPreferences.getLong(k, 0L);
                    C2375u c2375u = C2375u.a;
                    if (C2375u.g(C2375u.b.ModelRequest) || jSONObject.length() == 0 || !a.n(j2)) {
                        jSONObject = a.k();
                        if (jSONObject == null) {
                            sharedPreferences.edit().putString(d, jSONObject.toString()).putLong(k, System.currentTimeMillis()).apply();
                        } else {
                            return;
                        }
                    }
                    C9072qk1 c9072qk1 = a;
                    c9072qk1.e(jSONObject);
                    c9072qk1.h();
                    return;
                }
                jSONObject = new JSONObject();
                long j22 = sharedPreferences.getLong(k, 0L);
                C2375u c2375u2 = C2375u.a;
                if (C2375u.g(C2375u.b.ModelRequest)) {
                }
                jSONObject = a.k();
                if (jSONObject == null) {
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                SQ.c(th, C9072qk1.class);
            }
        }
    }

    public static final void i() {
        if (SQ.e(C9072qk1.class)) {
            return;
        }
        try {
            C6857hh2 c6857hh2 = C6857hh2.a;
            C6857hh2.b();
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
        }
    }

    public static final void j() {
        if (SQ.e(C9072qk1.class)) {
            return;
        }
        try {
            RR0 rr0 = RR0.a;
            RR0.a();
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File l(@NotNull a aVar) {
        if (SQ.e(C9072qk1.class)) {
            return null;
        }
        try {
            C6562gT0.p(aVar, "task");
            b bVar = b.get(aVar.h());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String[] q(@NotNull a aVar, @NotNull float[][] fArr, @NotNull String[] strArr) {
        C6868hk1 c2;
        if (SQ.e(C9072qk1.class)) {
            return null;
        }
        try {
            C6562gT0.p(aVar, "task");
            C6562gT0.p(fArr, "denses");
            C6562gT0.p(strArr, "texts");
            b bVar = b.get(aVar.h());
            if (bVar == null) {
                c2 = null;
            } else {
                c2 = bVar.c();
            }
            if (c2 == null) {
                return null;
            }
            float[] f2 = bVar.f();
            int length = strArr.length;
            int length2 = fArr[0].length;
            C6718h71 c6718h71 = new C6718h71(new int[]{length, length2});
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    System.arraycopy(fArr[i2], 0, c6718h71.a(), i2 * length2, length2);
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            C6718h71 b2 = c2.b(c6718h71, strArr, aVar.g());
            if (b2 != null && f2 != null && b2.a().length != 0 && f2.length != 0) {
                int i4 = c.a[aVar.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return a.r(b2, f2);
                    }
                    throw new C3865Oq1();
                }
                return a.s(b2, f2);
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, C9072qk1.class);
            return null;
        }
    }

    public final void e(JSONObject jSONObject) {
        if (!SQ.e(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        b c2 = b.i.c(jSONObject.getJSONObject(keys.next()));
                        if (c2 != null) {
                            b.put(c2.g(), c2);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void h() {
        if (!SQ.e(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i2 = 0;
                for (Map.Entry<String, b> entry : b.entrySet()) {
                    String key = entry.getKey();
                    b value = entry.getValue();
                    if (C6562gT0.g(key, a.MTML_APP_EVENT_PREDICTION.h())) {
                        String b2 = value.b();
                        int max = Math.max(i2, value.h());
                        C2375u c2375u = C2375u.a;
                        if (C2375u.g(C2375u.b.SuggestedEvents) && m()) {
                            arrayList.add(value.k(new Runnable() { // from class: o.nk1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9072qk1.i();
                                }
                            }));
                        }
                        str = b2;
                        i2 = max;
                    }
                    if (C6562gT0.g(key, a.MTML_INTEGRITY_DETECT.h())) {
                        str = value.b();
                        i2 = Math.max(i2, value.h());
                        C2375u c2375u2 = C2375u.a;
                        if (C2375u.g(C2375u.b.IntelligentIntegrity)) {
                            arrayList.add(value.k(new Runnable() { // from class: o.ok1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9072qk1.j();
                                }
                            }));
                        }
                    }
                }
                if (str != null && i2 > 0 && !arrayList.isEmpty()) {
                    b.i.g(new b(e, str, null, i2, null), arrayList);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final JSONObject k() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            String[] strArr = {f, g, h, i, j};
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", strArr));
            com.facebook.S H = com.facebook.S.n.H(null, "app/model_asset", null);
            H.r0(bundle);
            JSONObject i2 = H.l().i();
            if (i2 == null) {
                return null;
            }
            return p(i2);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean m() {
        if (SQ.e(this)) {
            return false;
        }
        try {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Locale O = com.facebook.internal.l0.O();
            if (O != null) {
                String language = O.getLanguage();
                C6562gT0.o(language, "locale.language");
                if (!C10763xf2.n3(language, "en", false, 2, null)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean n(long j2) {
        if (SQ.e(this) || j2 == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j2 >= 259200000) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final float[] o(JSONArray jSONArray) {
        if (SQ.e(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    try {
                        String string = jSONArray.getString(i2);
                        C6562gT0.o(string, "jsonArray.getString(i)");
                        fArr[i2] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fArr;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final JSONObject p(JSONObject jSONObject) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(g, jSONObject3.getString(g));
                        jSONObject4.put(f, jSONObject3.getString(f));
                        jSONObject4.put(j, jSONObject3.getJSONArray(j));
                        jSONObject4.put(h, jSONObject3.getString(h));
                        if (jSONObject3.has(i)) {
                            jSONObject4.put(i, jSONObject3.getString(i));
                        }
                        jSONObject2.put(jSONObject3.getString(f), jSONObject4);
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final String[] r(C6718h71 c6718h71, float[] fArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            int b2 = c6718h71.b(0);
            int b3 = c6718h71.b(1);
            float[] a2 = c6718h71.a();
            if (b3 != fArr.length) {
                return null;
            }
            C11197zR0 W1 = C5075aO1.W1(0, b2);
            ArrayList arrayList = new ArrayList(C8466oF.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC8515oR0) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (a2[(nextInt * b3) + i3] >= fArr[i2]) {
                        str = n.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final String[] s(C6718h71 c6718h71, float[] fArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            int b2 = c6718h71.b(0);
            int b3 = c6718h71.b(1);
            float[] a2 = c6718h71.a();
            if (b3 != fArr.length) {
                return null;
            }
            C11197zR0 W1 = C5075aO1.W1(0, b2);
            ArrayList arrayList = new ArrayList(C8466oF.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC8515oR0) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (a2[(nextInt * b3) + i3] >= fArr[i2]) {
                        str = m.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
