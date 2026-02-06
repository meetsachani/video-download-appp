package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.C4175Rw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Tw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4372Tw {
    @NotNull
    public static final C4372Tw a = new C4372Tw();
    @NotNull
    public static final HashMap<Class<?>, d> b = C8926q81.M(C6670gv2.a(String.class, new a()), C6670gv2.a(String[].class, new b()), C6670gv2.a(JSONArray.class, new c()));

    /* renamed from: o.Tw$a */
    /* loaded from: classes2.dex */
    public static final class a implements d {
        @Override // o.C4372Tw.d
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            jSONObject.put(str, obj);
        }

        @Override // o.C4372Tw.d
        public void b(@NotNull C4175Rw.a aVar, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(aVar, "builder");
            C6562gT0.p(str, "key");
            if (obj != null) {
                aVar.d(str, (String) obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: o.Tw$b */
    /* loaded from: classes2.dex */
    public static final class b implements d {
        @Override // o.C4372Tw.d
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            JSONArray jSONArray = new JSONArray();
            if (obj != null) {
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    i++;
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
        }

        @Override // o.C4372Tw.d
        public void b(@NotNull C4175Rw.a aVar, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(aVar, "builder");
            C6562gT0.p(str, "key");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: o.Tw$c */
    /* loaded from: classes2.dex */
    public static final class c implements d {
        @Override // o.C4372Tw.d
        public void a(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(jSONObject, com.facebook.S.B);
            C6562gT0.p(str, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        @Override // o.C4372Tw.d
        public void b(@NotNull C4175Rw.a aVar, @NotNull String str, @Nullable Object obj) throws JSONException {
            C6562gT0.p(aVar, "builder");
            C6562gT0.p(str, "key");
            if (obj != null) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
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
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    aVar.e(str, (String[]) array);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
    }

    /* renamed from: o.Tw$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException;

        void b(@NotNull C4175Rw.a aVar, @NotNull String str, @Nullable Object obj) throws JSONException;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C4175Rw a(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        C4175Rw.a aVar = new C4175Rw.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                d dVar = b.get(obj.getClass());
                if (dVar != null) {
                    C6562gT0.o(next, "key");
                    dVar.b(aVar, next, obj);
                } else {
                    throw new IllegalArgumentException(C6562gT0.C("Unsupported type: ", obj.getClass()));
                }
            }
        }
        return aVar.build();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject b(@Nullable C4175Rw c4175Rw) throws JSONException {
        if (c4175Rw == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : c4175Rw.e()) {
            Object b2 = c4175Rw.b(str);
            if (b2 != null) {
                d dVar = b.get(b2.getClass());
                if (dVar != null) {
                    dVar.a(jSONObject, str, b2);
                } else {
                    throw new IllegalArgumentException(C6562gT0.C("Unsupported type: ", b2.getClass()));
                }
            }
        }
        return jSONObject;
    }
}
