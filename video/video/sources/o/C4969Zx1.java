package o;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.Zx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4969Zx1 {
    @NotNull
    public static final a e = new a(null);
    @NotNull
    public static final String f = "name";
    @NotNull
    public static final String g = "path";
    @NotNull
    public static final String h = "value";
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    @NotNull
    public final List<C5459bz1> c;
    @NotNull
    public final String d;

    /* renamed from: o.Zx1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C4969Zx1(@NotNull JSONObject jSONObject) {
        int length;
        C6562gT0.p(jSONObject, "component");
        String string = jSONObject.getString("name");
        C6562gT0.o(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String optString = jSONObject.optString("value");
        C6562gT0.o(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        String optString2 = jSONObject.optString(EK.d, EK.f);
        C6562gT0.o(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C6562gT0.o(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new C5459bz1(jSONObject2));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        this.c = arrayList;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final List<C5459bz1> b() {
        return this.c;
    }

    @NotNull
    public final String c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.b;
    }
}
