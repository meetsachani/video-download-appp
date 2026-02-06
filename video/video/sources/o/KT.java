package o;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class KT {
    @NotNull
    public final String a;
    @Nullable
    public final HashMap<String, String> b;

    public KT(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        C6562gT0.p(str, JT.d);
        this.a = str;
        this.b = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KT d(KT kt, String str, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kt.a;
        }
        if ((i & 2) != 0) {
            hashMap = kt.b;
        }
        return kt.c(str, hashMap);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final HashMap<String, String> b() {
        return this.b;
    }

    @NotNull
    public final KT c(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        C6562gT0.p(str, JT.d);
        return new KT(str, hashMap);
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KT)) {
            return false;
        }
        KT kt = (KT) obj;
        if (C6562gT0.g(this.a, kt.a) && C6562gT0.g(this.b, kt.b)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final HashMap<String, String> f() {
        return this.b;
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JT.d, this.a);
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put(JT.g, jSONObject2);
        return jSONObject;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.a + ", localizations=" + this.b + ')';
    }

    public /* synthetic */ KT(String str, HashMap hashMap, int i, C9516sY c9516sY) {
        this(str, (i & 2) != 0 ? null : hashMap);
    }
}
