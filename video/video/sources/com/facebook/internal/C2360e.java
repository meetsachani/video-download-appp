package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C6562gT0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2360e {
    @NotNull
    public static final C2360e a = new C2360e();
    @NotNull
    public static final Map<Class<?>, h> b;

    /* renamed from: com.facebook.internal.e$a */
    /* loaded from: classes2.dex */
    public static final class a implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.e$b */
    /* loaded from: classes2.dex */
    public static final class b implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.facebook.internal.e$c */
    /* loaded from: classes2.dex */
    public static final class c implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.e$d */
    /* loaded from: classes2.dex */
    public static final class d implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0083e implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            jSONObject.put(str, obj);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: com.facebook.internal.e$f */
    /* loaded from: classes2.dex */
    public static final class f implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            JSONArray jSONArray = new JSONArray();
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }

        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.e$g */
    /* loaded from: classes2.dex */
    public static final class g implements h {
        @Override // com.facebook.internal.C2360e.h
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.C2360e.h
        public void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
            C6562gT0.p(bundle, "bundle");
            C6562gT0.p(str, "key");
            C6562gT0.p(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(C6562gT0.C("Unexpected type in an array: ", obj2.getClass()));
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.e$h */
    /* loaded from: classes2.dex */
    public interface h {
        void a(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException;

        void b(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new C0083e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle a(@NotNull JSONObject jSONObject) throws JSONException {
        C6562gT0.p(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = b.get(obj.getClass());
                    if (hVar != null) {
                        C6562gT0.o(next, "key");
                        C6562gT0.o(obj, "value");
                        hVar.b(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(C6562gT0.C("Unsupported type: ", obj.getClass()));
                    }
                }
            }
        }
        return bundle;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONObject b(@NotNull Bundle bundle) throws JSONException {
        C6562gT0.p(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : (List) obj) {
                        jSONArray.put(str2);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, b((Bundle) obj));
                } else {
                    h hVar = b.get(obj.getClass());
                    if (hVar != null) {
                        C6562gT0.o(str, "key");
                        hVar.a(jSONObject, str, obj);
                    } else {
                        throw new IllegalArgumentException(C6562gT0.C("Unsupported type: ", obj.getClass()));
                    }
                }
            }
        }
        return jSONObject;
    }
}
