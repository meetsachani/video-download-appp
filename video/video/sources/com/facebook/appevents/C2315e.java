package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.C2416z;
import com.facebook.b0;
import com.facebook.internal.V;
import com.facebook.internal.l0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o.C10219vQ1;
import o.C11091z02;
import o.C2826Ee0;
import o.C5370bd;
import o.C6562gT0;
import o.C7458kA2;
import o.C8319ne2;
import o.C9516sY;
import o.FK;
import o.HP1;
import o.HT1;
import o.NT1;
import o.PJ1;
import o.RR0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: com.facebook.appevents.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2315e implements Serializable {
    @NotNull
    public static final a a1 = new a(null);
    @NotNull
    public static final HashSet<String> b1 = new HashSet<>();
    public static final int c1 = 40;
    private static final long serialVersionUID = 1;
    @NotNull
    public final JSONObject X;
    public final boolean Y;
    @NotNull
    public final String Y0;
    public final boolean Z;
    @Nullable
    public final String Z0;

    /* renamed from: com.facebook.appevents.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                C6562gT0.o(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    C6562gT0.o(digest, "digest.digest()");
                    C5370bd c5370bd = C5370bd.a;
                    return C5370bd.c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException e) {
                l0 l0Var = l0.a;
                l0.l0("Failed to generate checksum: ", e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                l0 l0Var2 = l0.a;
                l0.l0("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        public final void d(String str) {
            boolean contains;
            if (str != null && str.length() != 0 && str.length() <= 40) {
                synchronized (C2315e.b1) {
                    contains = C2315e.b1.contains(str);
                    C7458kA2 c7458kA2 = C7458kA2.a;
                }
                if (!contains) {
                    if (new C10219vQ1("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m(str)) {
                        synchronized (C2315e.b1) {
                            C2315e.b1.add(str);
                        }
                        return;
                    }
                    C8319ne2 c8319ne2 = C8319ne2.a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    C6562gT0.o(format, "java.lang.String.format(format, *args)");
                    throw new C2416z(format);
                }
                return;
            }
            if (str == null) {
                str = "<None Provided>";
            }
            C8319ne2 c8319ne22 = C8319ne2.a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C6562gT0.o(format2, "java.lang.String.format(locale, format, *args)");
            throw new C2416z(format2);
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.appevents.e$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        @NotNull
        public static final a Z0 = new a(null);
        private static final long serialVersionUID = 20160803001L;
        @NotNull
        public final String X;
        public final boolean Y;
        @Nullable
        public final String Y0;
        public final boolean Z;

        /* renamed from: com.facebook.appevents.e$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public b(@NotNull String str, boolean z, boolean z2, @Nullable String str2) {
            C6562gT0.p(str, "jsonString");
            this.X = str;
            this.Y = z;
            this.Z = z2;
            this.Y0 = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new C2315e(this.X, this.Y, this.Z, this.Y0, null);
        }
    }

    public /* synthetic */ C2315e(String str, boolean z, boolean z2, String str2, C9516sY c9516sY) {
        this(str, z, z2, str2);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.X.toString();
        C6562gT0.o(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.Y, this.Z, this.Z0);
    }

    public final String b() {
        a aVar = a1;
        String jSONObject = this.X.toString();
        C6562gT0.o(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    public final boolean c() {
        return this.Y;
    }

    @NotNull
    public final JSONObject d() {
        return this.X;
    }

    public final JSONObject e(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        a aVar = a1;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        NT1 nt1 = NT1.a;
        String e = NT1.e(str2);
        if (C6562gT0.g(e, str2)) {
            HP1 hp1 = HP1.a;
            e = HP1.e(str2);
        }
        jSONObject.put(FK.c, e);
        jSONObject.put(FK.d, aVar.c(e));
        jSONObject.put(FK.b, System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> j = j(bundle);
            for (String str3 : j.keySet()) {
                jSONObject.put(str3, j.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put(C2326p.g0, d.doubleValue());
        }
        if (this.Z) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.Y) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        V.a aVar2 = V.e;
        b0 b0Var = b0.APP_EVENTS;
        String jSONObject2 = jSONObject.toString();
        C6562gT0.o(jSONObject2, "eventObject.toString()");
        aVar2.e(b0Var, "AppEvents", "Created app event '%s'", jSONObject2);
        return jSONObject;
    }

    @NotNull
    public final JSONObject f() {
        return this.X;
    }

    @NotNull
    public final String g() {
        return this.Y0;
    }

    public final boolean h() {
        if (this.Z0 == null) {
            return true;
        }
        return C6562gT0.g(b(), this.Z0);
    }

    public final boolean i() {
        return this.Y;
    }

    public final Map<String, String> j(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = a1;
            C6562gT0.o(str, "key");
            aVar.d(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                throw new C2416z(format);
            }
            hashMap.put(str, obj.toString());
        }
        if (!PJ1.a.g(bundle)) {
            C11091z02 c11091z02 = C11091z02.a;
            C11091z02.d(hashMap, this.Y0);
        }
        RR0 rr0 = RR0.a;
        RR0.c(hashMap);
        NT1 nt1 = NT1.a;
        NT1.f(hashMap, this.Y0);
        C2826Ee0 c2826Ee0 = C2826Ee0.a;
        C2826Ee0.c(hashMap, this.Y0);
        return hashMap;
    }

    @NotNull
    public String toString() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.X.optString(FK.c), Boolean.valueOf(this.Y), this.X.toString()}, 3));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public C2315e(@NotNull String str, @NotNull String str2, @Nullable Double d, @Nullable Bundle bundle, boolean z, boolean z2, @Nullable UUID uuid) throws JSONException, C2416z {
        C6562gT0.p(str, "contextName");
        C6562gT0.p(str2, "eventName");
        this.Y = z;
        this.Z = z2;
        this.Y0 = str2;
        this.X = e(str, str2, d, bundle, uuid);
        this.Z0 = b();
    }

    public C2315e(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.X = jSONObject;
        this.Y = z;
        String optString = jSONObject.optString(FK.c);
        C6562gT0.o(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.Y0 = optString;
        this.Z0 = str2;
        this.Z = z2;
    }
}
