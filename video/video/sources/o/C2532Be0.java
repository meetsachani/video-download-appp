package o;

import com.facebook.internal.C2359d;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Be0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2532Be0 {
    @NotNull
    public static final b j = new b(null);
    @NotNull
    public final String a;
    @NotNull
    public final c b;
    @NotNull
    public final a c;
    @NotNull
    public final String d;
    @NotNull
    public final List<C5459bz1> e;
    @NotNull
    public final List<C4969Zx1> f;
    @NotNull
    public final String g;
    @NotNull
    public final String h;
    @NotNull
    public final String i;

    /* renamed from: o.Be0$a */
    /* loaded from: classes2.dex */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: o.Be0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final C2532Be0 a(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            C6562gT0.p(jSONObject, "mapping");
            String string = jSONObject.getString(C2359d.e);
            String string2 = jSONObject.getString("method");
            C6562gT0.o(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C6562gT0.o(locale, C9698tH2.B);
            String upperCase = string2.toUpperCase(locale);
            C6562gT0.o(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C6562gT0.o(string3, "mapping.getString(\"event_type\")");
            C6562gT0.o(locale, C9698tH2.B);
            String upperCase2 = string3.toUpperCase(locale);
            C6562gT0.o(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            a valueOf2 = a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C6562gT0.o(jSONObject2, "jsonPath");
                    arrayList.add(new C5459bz1(jSONObject2));
                    if (i2 >= length2) {
                        break;
                    }
                    i = i2;
                }
            }
            String optString = jSONObject.optString(EK.d, EK.f);
            JSONArray optJSONArray = jSONObject.optJSONArray(BreadcrumbAnalyticsEventReceiver.c);
            int i3 = 0;
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                    C6562gT0.o(jSONObject3, "jsonParameter");
                    arrayList2.add(new C4969Zx1(jSONObject3));
                    if (i4 >= length) {
                        break;
                    }
                    i3 = i4;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            C6562gT0.o(string, "eventName");
            C6562gT0.o(string4, "appVersion");
            C6562gT0.o(optString2, "componentId");
            C6562gT0.o(optString, "pathType");
            C6562gT0.o(optString3, "activityName");
            return new C2532Be0(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<C2532Be0> b(@Nullable JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            C6562gT0.o(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        public b() {
        }
    }

    /* renamed from: o.Be0$c */
    /* loaded from: classes2.dex */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public C2532Be0(@NotNull String str, @NotNull c cVar, @NotNull a aVar, @NotNull String str2, @NotNull List<C5459bz1> list, @NotNull List<C4969Zx1> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        C6562gT0.p(str, "eventName");
        C6562gT0.p(cVar, "method");
        C6562gT0.p(aVar, "type");
        C6562gT0.p(str2, "appVersion");
        C6562gT0.p(list, "path");
        C6562gT0.p(list2, BreadcrumbAnalyticsEventReceiver.c);
        C6562gT0.p(str3, "componentId");
        C6562gT0.p(str4, "pathType");
        C6562gT0.p(str5, "activityName");
        this.a = str;
        this.b = cVar;
        this.c = aVar;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C2532Be0 e(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return j.a(jSONObject);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<C2532Be0> k(@Nullable JSONArray jSONArray) {
        return j.b(jSONArray);
    }

    @NotNull
    public final String a() {
        return this.i;
    }

    @NotNull
    public final String b() {
        return this.d;
    }

    @NotNull
    public final String c() {
        return this.g;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final c f() {
        return this.b;
    }

    @NotNull
    public final String g() {
        return this.h;
    }

    @NotNull
    public final a h() {
        return this.c;
    }

    @NotNull
    public final List<C4969Zx1> i() {
        List<C4969Zx1> unmodifiableList = Collections.unmodifiableList(this.f);
        C6562gT0.o(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    @NotNull
    public final List<C5459bz1> j() {
        List<C5459bz1> unmodifiableList = Collections.unmodifiableList(this.e);
        C6562gT0.o(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
