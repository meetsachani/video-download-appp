package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LT {
    @Nullable
    public final MT a;
    @Nullable
    public final MT b;

    public LT() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ LT d(LT lt, MT mt, MT mt2, int i, Object obj) {
        if ((i & 1) != 0) {
            mt = lt.a;
        }
        if ((i & 2) != 0) {
            mt2 = lt.b;
        }
        return lt.c(mt, mt2);
    }

    @Nullable
    public final MT a() {
        return this.a;
    }

    @Nullable
    public final MT b() {
        return this.b;
    }

    @NotNull
    public final LT c(@Nullable MT mt, @Nullable MT mt2) {
        return new LT(mt, mt2);
    }

    @Nullable
    public final MT e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LT)) {
            return false;
        }
        LT lt = (LT) obj;
        if (C6562gT0.g(this.a, lt.a) && C6562gT0.g(this.b, lt.b)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final MT f() {
        return this.b;
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        MT mt = this.a;
        if (mt != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", mt.d());
            jSONObject.put(JT.e, jSONObject2);
        }
        MT mt2 = this.b;
        if (mt2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("url", mt2.d());
        jSONObject.put("video", jSONObject3);
        return jSONObject;
    }

    public int hashCode() {
        int hashCode;
        MT mt = this.a;
        int i = 0;
        if (mt == null) {
            hashCode = 0;
        } else {
            hashCode = mt.hashCode();
        }
        int i2 = hashCode * 31;
        MT mt2 = this.b;
        if (mt2 != null) {
            i = mt2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMedia(gif=" + this.a + ", video=" + this.b + ')';
    }

    public LT(@Nullable MT mt, @Nullable MT mt2) {
        this.a = mt;
        this.b = mt2;
    }

    public /* synthetic */ LT(MT mt, MT mt2, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? null : mt, (i & 2) != 0 ? null : mt2);
    }
}
