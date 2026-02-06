package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a0 {
    @NotNull
    public static final String A = "long";
    @NotNull
    public static final String B = "long[]";
    @NotNull
    public static final String C = "float";
    @NotNull
    public static final String D = "float[]";
    @NotNull
    public static final String E = "double";
    @NotNull
    public static final String F = "double[]";
    @NotNull
    public static final String G = "char";
    @NotNull
    public static final String H = "char[]";
    @NotNull
    public static final String I = "string";
    @NotNull
    public static final String J = "stringList";
    @NotNull
    public static final String K = "enum";
    @NotNull
    public static final String d = "com.facebook.TokenCachingStrategy.Token";
    @NotNull
    public static final String e = "com.facebook.TokenCachingStrategy.ExpirationDate";
    @NotNull
    public static final String f = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    @NotNull
    public static final String g = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    @NotNull
    public static final String h = "com.facebook.TokenCachingStrategy.Permissions";
    @NotNull
    public static final String i = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    @NotNull
    public static final String j = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    @NotNull
    public static final String k = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final long l = Long.MIN_VALUE;
    @NotNull
    public static final String m = "com.facebook.TokenCachingStrategy.IsSSO";
    @NotNull
    public static final String n = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    @NotNull
    public static final String p = "valueType";
    @NotNull
    public static final String q = "value";
    @NotNull
    public static final String r = "enumType";
    @NotNull
    public static final String s = "bool";
    @NotNull
    public static final String t = "bool[]";
    @NotNull
    public static final String u = "byte";
    @NotNull
    public static final String v = "byte[]";
    @NotNull
    public static final String w = "short";
    @NotNull
    public static final String x = "short[]";
    @NotNull
    public static final String y = "int";
    @NotNull
    public static final String z = "int[]";
    @NotNull
    public final String a;
    @NotNull
    public final SharedPreferences b;
    @NotNull
    public static final a c = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final String f73o = a0.class.getSimpleName();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final String a(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return bundle.getString(a0.k);
        }

        public final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        @InterfaceC9511sW0
        @Nullable
        public final Date c(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return b(bundle, a0.e);
        }

        @InterfaceC9511sW0
        public final long d(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return bundle.getLong(a0.e);
        }

        @InterfaceC9511sW0
        @Nullable
        public final Date e(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return b(bundle, a0.f);
        }

        @InterfaceC9511sW0
        public final long f(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return bundle.getLong(a0.f);
        }

        @InterfaceC9511sW0
        @Nullable
        public final Set<String> g(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(a0.h);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @InterfaceC9511sW0
        @Nullable
        public final EnumC2354h h(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            if (bundle.containsKey(a0.g)) {
                return (EnumC2354h) bundle.getSerializable(a0.g);
            }
            if (bundle.getBoolean(a0.m)) {
                return EnumC2354h.FACEBOOK_APPLICATION_WEB;
            }
            return EnumC2354h.WEB_VIEW;
        }

        @InterfaceC9511sW0
        @Nullable
        public final String i(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "bundle");
            return bundle.getString(a0.d);
        }

        @InterfaceC9511sW0
        public final boolean j(@Nullable Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString(a0.d)) == null || string.length() == 0 || bundle.getLong(a0.e, 0L) == 0) {
                return false;
            }
            return true;
        }

        @InterfaceC9511sW0
        public final void k(@NotNull Bundle bundle, @Nullable String str) {
            C6562gT0.p(bundle, "bundle");
            bundle.putString(a0.k, str);
        }

        public final void l(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }

        @InterfaceC9511sW0
        public final void m(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(collection, "value");
            bundle.putStringArrayList(a0.i, new ArrayList<>(collection));
        }

        @InterfaceC9511sW0
        public final void n(@NotNull Bundle bundle, @NotNull Date date) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(date, "value");
            l(bundle, a0.e, date);
        }

        @InterfaceC9511sW0
        public final void o(@NotNull Bundle bundle, long j) {
            C6562gT0.p(bundle, "bundle");
            bundle.putLong(a0.e, j);
        }

        @InterfaceC9511sW0
        public final void p(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(collection, "value");
            bundle.putStringArrayList(a0.j, new ArrayList<>(collection));
        }

        @InterfaceC9511sW0
        public final void q(@NotNull Bundle bundle, @NotNull Date date) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(date, "value");
            l(bundle, a0.f, date);
        }

        @InterfaceC9511sW0
        public final void r(@NotNull Bundle bundle, long j) {
            C6562gT0.p(bundle, "bundle");
            bundle.putLong(a0.f, j);
        }

        @InterfaceC9511sW0
        public final void s(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(collection, "value");
            bundle.putStringArrayList(a0.h, new ArrayList<>(collection));
        }

        @InterfaceC9511sW0
        public final void t(@NotNull Bundle bundle, @NotNull EnumC2354h enumC2354h) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(enumC2354h, "value");
            bundle.putSerializable(a0.g, enumC2354h);
        }

        @InterfaceC9511sW0
        public final void u(@NotNull Bundle bundle, @NotNull String str) {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "value");
            bundle.putString(a0.d, str);
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8289nW0
    public a0(@NotNull Context context) {
        this(context, null, 2, null);
        C6562gT0.p(context, "context");
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String c(@NotNull Bundle bundle) {
        return c.a(bundle);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Date d(@NotNull Bundle bundle) {
        return c.c(bundle);
    }

    @InterfaceC9511sW0
    public static final long e(@NotNull Bundle bundle) {
        return c.d(bundle);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Date f(@NotNull Bundle bundle) {
        return c.e(bundle);
    }

    @InterfaceC9511sW0
    public static final long g(@NotNull Bundle bundle) {
        return c.f(bundle);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Set<String> h(@NotNull Bundle bundle) {
        return c.g(bundle);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final EnumC2354h i(@NotNull Bundle bundle) {
        return c.h(bundle);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String j(@NotNull Bundle bundle) {
        return c.i(bundle);
    }

    @InterfaceC9511sW0
    public static final boolean k(@Nullable Bundle bundle) {
        return c.j(bundle);
    }

    @InterfaceC9511sW0
    public static final void m(@NotNull Bundle bundle, @Nullable String str) {
        c.k(bundle, str);
    }

    @InterfaceC9511sW0
    public static final void n(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        c.m(bundle, collection);
    }

    @InterfaceC9511sW0
    public static final void o(@NotNull Bundle bundle, @NotNull Date date) {
        c.n(bundle, date);
    }

    @InterfaceC9511sW0
    public static final void p(@NotNull Bundle bundle, long j2) {
        c.o(bundle, j2);
    }

    @InterfaceC9511sW0
    public static final void q(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        c.p(bundle, collection);
    }

    @InterfaceC9511sW0
    public static final void r(@NotNull Bundle bundle, @NotNull Date date) {
        c.q(bundle, date);
    }

    @InterfaceC9511sW0
    public static final void s(@NotNull Bundle bundle, long j2) {
        c.r(bundle, j2);
    }

    @InterfaceC9511sW0
    public static final void t(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        c.s(bundle, collection);
    }

    @InterfaceC9511sW0
    public static final void u(@NotNull Bundle bundle, @NotNull EnumC2354h enumC2354h) {
        c.t(bundle, enumC2354h);
    }

    @InterfaceC9511sW0
    public static final void v(@NotNull Bundle bundle, @NotNull String str) {
        c.u(bundle, str);
    }

    public final void a() {
        this.b.edit().clear().apply();
    }

    public final void b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.b.getString(str, "{}");
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString(p);
            if (string3 != null) {
                int i2 = 0;
                switch (string3.hashCode()) {
                    case -1573317553:
                        if (string3.equals(J)) {
                            JSONArray jSONArray = jSONObject.getJSONArray("value");
                            int length = jSONArray.length();
                            ArrayList<String> arrayList = new ArrayList<>(length);
                            if (length > 0) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    Object obj = jSONArray.get(i2);
                                    if (obj == JSONObject.NULL) {
                                        str2 = null;
                                    } else if (obj != null) {
                                        str2 = (String) obj;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    arrayList.add(i2, str2);
                                    if (i3 < length) {
                                        i2 = i3;
                                    }
                                }
                            }
                            bundle.putStringArrayList(str, arrayList);
                            return;
                        }
                        return;
                    case -1383386164:
                        if (string3.equals(t)) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            int length2 = jSONArray2.length();
                            boolean[] zArr = new boolean[length2];
                            int i4 = length2 - 1;
                            if (i4 >= 0) {
                                while (true) {
                                    int i5 = i2 + 1;
                                    zArr[i2] = jSONArray2.getBoolean(i2);
                                    if (i5 <= i4) {
                                        i2 = i5;
                                    }
                                }
                            }
                            bundle.putBooleanArray(str, zArr);
                            return;
                        }
                        return;
                    case -1374008726:
                        if (string3.equals(v)) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                            int length3 = jSONArray3.length();
                            byte[] bArr = new byte[length3];
                            int i6 = length3 - 1;
                            if (i6 >= 0) {
                                while (true) {
                                    int i7 = i2 + 1;
                                    bArr[i2] = (byte) jSONArray3.getInt(i2);
                                    if (i7 <= i6) {
                                        i2 = i7;
                                    }
                                }
                            }
                            bundle.putByteArray(str, bArr);
                            return;
                        }
                        return;
                    case -1361632968:
                        if (string3.equals(H)) {
                            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                            int length4 = jSONArray4.length();
                            char[] cArr = new char[length4];
                            int i8 = length4 - 1;
                            if (i8 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    int i10 = i9 + 1;
                                    String string4 = jSONArray4.getString(i9);
                                    if (string4 != null && string4.length() == 1) {
                                        cArr[i9] = string4.charAt(0);
                                    }
                                    if (i10 <= i8) {
                                        i9 = i10;
                                    }
                                }
                            }
                            bundle.putCharArray(str, cArr);
                            return;
                        }
                        return;
                    case -1325958191:
                        if (string3.equals(E)) {
                            bundle.putDouble(str, jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case -1097129250:
                        if (string3.equals(B)) {
                            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                            int length5 = jSONArray5.length();
                            long[] jArr = new long[length5];
                            int i11 = length5 - 1;
                            if (i11 >= 0) {
                                while (true) {
                                    int i12 = i2 + 1;
                                    jArr[i2] = jSONArray5.getLong(i2);
                                    if (i12 <= i11) {
                                        i2 = i12;
                                    }
                                }
                            }
                            bundle.putLongArray(str, jArr);
                            return;
                        }
                        return;
                    case -891985903:
                        if (string3.equals("string")) {
                            bundle.putString(str, jSONObject.getString("value"));
                            return;
                        }
                        return;
                    case -766441794:
                        if (string3.equals(D)) {
                            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                            int length6 = jSONArray6.length();
                            float[] fArr = new float[length6];
                            int i13 = length6 - 1;
                            if (i13 >= 0) {
                                while (true) {
                                    int i14 = i2 + 1;
                                    fArr[i2] = (float) jSONArray6.getDouble(i2);
                                    if (i14 <= i13) {
                                        i2 = i14;
                                    }
                                }
                            }
                            bundle.putFloatArray(str, fArr);
                            return;
                        }
                        return;
                    case 104431:
                        if (string3.equals(y)) {
                            bundle.putInt(str, jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3029738:
                        if (string3.equals(s)) {
                            bundle.putBoolean(str, jSONObject.getBoolean("value"));
                            return;
                        }
                        return;
                    case 3039496:
                        if (string3.equals(u)) {
                            bundle.putByte(str, (byte) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3052374:
                        if (string3.equals(G) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                            bundle.putChar(str, string.charAt(0));
                            return;
                        }
                        return;
                    case 3118337:
                        if (string3.equals(K)) {
                            try {
                                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString(r)), jSONObject.getString("value")));
                                return;
                            } catch (ClassNotFoundException | IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    case 3327612:
                        if (string3.equals(A)) {
                            bundle.putLong(str, jSONObject.getLong("value"));
                            return;
                        }
                        return;
                    case 97526364:
                        if (string3.equals("float")) {
                            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case 100361105:
                        if (string3.equals(z)) {
                            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                            int length7 = jSONArray7.length();
                            int[] iArr = new int[length7];
                            int i15 = length7 - 1;
                            if (i15 >= 0) {
                                while (true) {
                                    int i16 = i2 + 1;
                                    iArr[i2] = jSONArray7.getInt(i2);
                                    if (i16 <= i15) {
                                        i2 = i16;
                                    }
                                }
                            }
                            bundle.putIntArray(str, iArr);
                            return;
                        }
                        return;
                    case 109413500:
                        if (string3.equals(w)) {
                            bundle.putShort(str, (short) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 1359468275:
                        if (string3.equals(F)) {
                            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                            int length8 = jSONArray8.length();
                            double[] dArr = new double[length8];
                            int i17 = length8 - 1;
                            if (i17 >= 0) {
                                while (true) {
                                    int i18 = i2 + 1;
                                    dArr[i2] = jSONArray8.getDouble(i2);
                                    if (i18 <= i17) {
                                        i2 = i18;
                                    }
                                }
                            }
                            bundle.putDoubleArray(str, dArr);
                            return;
                        }
                        return;
                    case 2067161310:
                        if (string3.equals(x)) {
                            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                            int length9 = jSONArray9.length();
                            short[] sArr = new short[length9];
                            int i19 = length9 - 1;
                            if (i19 >= 0) {
                                while (true) {
                                    int i20 = i2 + 1;
                                    sArr[i2] = (short) jSONArray9.getInt(i2);
                                    if (i20 <= i19) {
                                        i2 = i20;
                                    }
                                }
                            }
                            bundle.putShortArray(str, sArr);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Nullable
    public final Bundle l() {
        Bundle bundle = new Bundle();
        for (String str : this.b.getAll().keySet()) {
            try {
                C6562gT0.o(str, "key");
                b(str, bundle);
            } catch (JSONException e2) {
                V.a aVar = com.facebook.internal.V.e;
                b0 b0Var = b0.CACHE;
                String str2 = f73o;
                C6562gT0.o(str2, "TAG");
                aVar.b(b0Var, 5, str2, "Error reading cached value for key: '" + ((Object) str) + "' -- " + e2);
                return null;
            }
        }
        return bundle;
    }

    public final void w(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "bundle");
        SharedPreferences.Editor edit = this.b.edit();
        for (String str : bundle.keySet()) {
            try {
                C6562gT0.o(str, "key");
                C6562gT0.o(edit, "editor");
                x(str, bundle, edit);
            } catch (JSONException e2) {
                V.a aVar = com.facebook.internal.V.e;
                b0 b0Var = b0.CACHE;
                String str2 = f73o;
                C6562gT0.o(str2, "TAG");
                aVar.b(b0Var, 5, str2, "Error processing value for key: '" + ((Object) str) + "' -- " + e2);
                return;
            }
        }
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(String str, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        JSONArray jSONArray;
        String str2;
        Object obj = bundle.get(str);
        if (obj != null) {
            JSONObject jSONObject = new JSONObject();
            String str3 = null;
            if (obj instanceof Byte) {
                jSONObject.put("value", (int) ((Number) obj).byteValue());
                str2 = u;
            } else if (obj instanceof Short) {
                jSONObject.put("value", (int) ((Number) obj).shortValue());
                str2 = w;
            } else if (obj instanceof Integer) {
                jSONObject.put("value", ((Number) obj).intValue());
                str2 = y;
            } else if (obj instanceof Long) {
                jSONObject.put("value", ((Number) obj).longValue());
                str2 = A;
            } else if (obj instanceof Float) {
                jSONObject.put("value", ((Number) obj).floatValue());
                str2 = "float";
            } else if (obj instanceof Double) {
                jSONObject.put("value", ((Number) obj).doubleValue());
                str2 = E;
            } else if (obj instanceof Boolean) {
                jSONObject.put("value", ((Boolean) obj).booleanValue());
                str2 = s;
            } else if (obj instanceof Character) {
                jSONObject.put("value", obj.toString());
                str2 = G;
            } else if (obj instanceof String) {
                jSONObject.put("value", obj);
                str2 = "string";
            } else if (obj instanceof Enum) {
                jSONObject.put("value", obj.toString());
                jSONObject.put(r, obj.getClass().getName());
                str2 = K;
            } else {
                jSONArray = new JSONArray();
                int i2 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    while (i2 < length) {
                        byte b = bArr[i2];
                        i2++;
                        jSONArray.put((int) b);
                    }
                    str3 = v;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length;
                    while (i2 < length2) {
                        short s2 = sArr[i2];
                        i2++;
                        jSONArray.put((int) s2);
                    }
                    str3 = x;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length;
                    while (i2 < length3) {
                        int i3 = iArr[i2];
                        i2++;
                        jSONArray.put(i3);
                    }
                    str3 = z;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length4 = jArr.length;
                    while (i2 < length4) {
                        long j2 = jArr[i2];
                        i2++;
                        jSONArray.put(j2);
                    }
                    str3 = B;
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    int length5 = fArr.length;
                    while (i2 < length5) {
                        float f2 = fArr[i2];
                        i2++;
                        jSONArray.put(f2);
                    }
                    str3 = D;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length6 = dArr.length;
                    while (i2 < length6) {
                        double d2 = dArr[i2];
                        i2++;
                        jSONArray.put(d2);
                    }
                    str3 = F;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length7 = zArr.length;
                    while (i2 < length7) {
                        boolean z2 = zArr[i2];
                        i2++;
                        jSONArray.put(z2);
                    }
                    str3 = t;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    int length8 = cArr.length;
                    while (i2 < length8) {
                        char c2 = cArr[i2];
                        i2++;
                        jSONArray.put(String.valueOf(c2));
                    }
                    str3 = H;
                } else if (obj instanceof List) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 == null) {
                            obj2 = JSONObject.NULL;
                        }
                        jSONArray.put(obj2);
                    }
                    str3 = J;
                } else {
                    jSONArray = null;
                }
                if (str3 == null) {
                    jSONObject.put(p, str3);
                    if (jSONArray != null) {
                        jSONObject.putOpt("value", jSONArray);
                    }
                    String jSONObject2 = jSONObject.toString();
                    C6562gT0.o(jSONObject2, "json.toString()");
                    editor.putString(str, jSONObject2);
                    return;
                }
                return;
            }
            jSONArray = null;
            str3 = str2;
            if (str3 == null) {
            }
        }
    }

    @InterfaceC8289nW0
    public a0(@NotNull Context context, @Nullable String str) {
        C6562gT0.p(context, "context");
        str = (str == null || str.length() == 0) ? n : str;
        this.a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        C6562gT0.o(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    public /* synthetic */ a0(Context context, String str, int i2, C9516sY c9516sY) {
        this(context, (i2 & 2) != 0 ? null : str);
    }
}
