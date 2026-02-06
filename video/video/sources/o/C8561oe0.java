package o;

import java.io.File;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.oe0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8561oe0 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final String e = "error_message";
    @NotNull
    public static final String f = "timestamp";
    @NotNull
    public String a;
    @Nullable
    public String b;
    @Nullable
    public Long c;

    /* renamed from: o.oe0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C8561oe0(@Nullable String str) {
        this.c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C5086aR0.g);
        Long l = this.c;
        if (l != null) {
            stringBuffer.append(l.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            C6562gT0.o(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final void a() {
        C5086aR0 c5086aR0 = C5086aR0.a;
        C5086aR0.d(this.a);
    }

    public final int b(@NotNull C8561oe0 c8561oe0) {
        C6562gT0.p(c8561oe0, "data");
        Long l = this.c;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = c8561oe0.c;
        if (l2 == null) {
            return 1;
        }
        return C6562gT0.u(l2.longValue(), longValue);
    }

    @Nullable
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.b != null && this.c != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (d()) {
            C5086aR0 c5086aR0 = C5086aR0.a;
            C5086aR0.t(this.a, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject c = c();
        if (c == null) {
            return super.toString();
        }
        String jSONObject = c.toString();
        C6562gT0.o(jSONObject, "params.toString()");
        return jSONObject;
    }

    public C8561oe0(@NotNull File file) {
        C6562gT0.p(file, "file");
        String name = file.getName();
        C6562gT0.o(name, "file.name");
        this.a = name;
        C5086aR0 c5086aR0 = C5086aR0.a;
        JSONObject r = C5086aR0.r(name, true);
        if (r != null) {
            this.c = Long.valueOf(r.optLong("timestamp", 0L));
            this.b = r.optString("error_message", null);
        }
    }
}
