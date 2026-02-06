package o;

import android.os.Build;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.io.File;
import java.util.Arrays;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class SQ0 {
    @NotNull
    public static final b h = new b(null);
    @NotNull
    public static final String i = "Unknown";
    @NotNull
    public static final String j = "timestamp";
    @NotNull
    public static final String k = "app_version";
    @NotNull
    public static final String l = "device_os_version";
    @NotNull
    public static final String m = "device_model";
    @NotNull
    public static final String n = "reason";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f611o = "callstack";
    @NotNull
    public static final String p = "type";
    @NotNull
    public static final String q = "feature_names";
    @NotNull
    public String a;
    @Nullable
    public c b;
    @Nullable
    public JSONArray c;
    @Nullable
    public String d;
    @Nullable
    public String e;
    @Nullable
    public String f;
    @Nullable
    public Long g;

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();

        @InterfaceC9511sW0
        @NotNull
        public static final SQ0 a(@Nullable String str, @Nullable String str2) {
            return new SQ0(str, str2, (C9516sY) null);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final SQ0 b(@Nullable Throwable th, @NotNull c cVar) {
            C6562gT0.p(cVar, "t");
            return new SQ0(th, cVar, (C9516sY) null);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final SQ0 c(@NotNull JSONArray jSONArray) {
            C6562gT0.p(jSONArray, SettingsJsonConstants.d);
            return new SQ0(jSONArray, (C9516sY) null);
        }

        @InterfaceC9511sW0
        @NotNull
        public static final SQ0 d(@NotNull File file) {
            C6562gT0.p(file, "file");
            return new SQ0(file, (C9516sY) null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public final c b(String str) {
            if (C9545sf2.J2(str, C5086aR0.d, false, 2, null)) {
                return c.CrashReport;
            }
            if (C9545sf2.J2(str, C5086aR0.e, false, 2, null)) {
                return c.CrashShield;
            }
            if (C9545sf2.J2(str, C5086aR0.f, false, 2, null)) {
                return c.ThreadCheck;
            }
            if (C9545sf2.J2(str, C5086aR0.b, false, 2, null)) {
                return c.Analysis;
            }
            if (C9545sf2.J2(str, C5086aR0.c, false, 2, null)) {
                return c.AnrReport;
            }
            return c.Unknown;
        }

        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.valuesCustom().length];
                iArr[c.Analysis.ordinal()] = 1;
                iArr[c.AnrReport.ordinal()] = 2;
                iArr[c.CrashReport.ordinal()] = 3;
                iArr[c.CrashShield.ordinal()] = 4;
                iArr[c.ThreadCheck.ordinal()] = 5;
                a = iArr;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final String g() {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "Unknown";
                            }
                            return C5086aR0.f;
                        }
                        return C5086aR0.e;
                    }
                    return C5086aR0.d;
                }
                return C5086aR0.c;
            }
            return C5086aR0.b;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "Unknown";
                            }
                            return "ThreadCheck";
                        }
                        return "CrashShield";
                    }
                    return "CrashReport";
                }
                return "AnrReport";
            }
            return "Analysis";
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            iArr[c.Analysis.ordinal()] = 1;
            iArr[c.AnrReport.ordinal()] = 2;
            iArr[c.CrashReport.ordinal()] = 3;
            iArr[c.CrashShield.ordinal()] = 4;
            iArr[c.ThreadCheck.ordinal()] = 5;
            a = iArr;
        }
    }

    public /* synthetic */ SQ0(File file, C9516sY c9516sY) {
        this(file);
    }

    public final void a() {
        C5086aR0 c5086aR0 = C5086aR0.a;
        C5086aR0.d(this.a);
    }

    public final int b(@NotNull SQ0 sq0) {
        C6562gT0.p(sq0, "data");
        Long l2 = this.g;
        if (l2 == null) {
            return -1;
        }
        long longValue = l2.longValue();
        Long l3 = sq0.g;
        if (l3 == null) {
            return 1;
        }
        return C6562gT0.u(l3.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put(q, jSONArray);
            }
            Long l2 = this.g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(l, Build.VERSION.RELEASE);
            jSONObject.put(m, Build.MODEL);
            String str = this.d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put(n, str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put(f611o, str3);
            }
            c cVar = this.b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject e() {
        int i2;
        c cVar = this.b;
        if (cVar == null) {
            i2 = -1;
        } else {
            i2 = d.a[cVar.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                return null;
            }
            return d();
        }
        return c();
    }

    public final boolean f() {
        int i2;
        c cVar = this.b;
        if (cVar == null) {
            i2 = -1;
        } else {
            i2 = d.a[cVar.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if ((i2 != 3 && i2 != 4 && i2 != 5) || this.f == null || this.g == null) {
                    return false;
                }
                return true;
            } else if (this.f == null || this.e == null || this.g == null) {
                return false;
            } else {
                return true;
            }
        } else if (this.c == null || this.g == null) {
            return false;
        } else {
            return true;
        }
    }

    public final void g() {
        if (!f()) {
            return;
        }
        C5086aR0 c5086aR0 = C5086aR0.a;
        C5086aR0.t(this.a, toString());
    }

    @NotNull
    public String toString() {
        JSONObject e = e();
        if (e == null) {
            String jSONObject = new JSONObject().toString();
            C6562gT0.o(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = e.toString();
        C6562gT0.o(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public /* synthetic */ SQ0(String str, String str2, C9516sY c9516sY) {
        this(str, str2);
    }

    public /* synthetic */ SQ0(Throwable th, c cVar, C9516sY c9516sY) {
        this(th, cVar);
    }

    public /* synthetic */ SQ0(JSONArray jSONArray, C9516sY c9516sY) {
        this(jSONArray);
    }

    public SQ0(JSONArray jSONArray) {
        this.b = c.Analysis;
        this.g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C5086aR0.b);
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6562gT0.o(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public SQ0(Throwable th, c cVar) {
        this.b = cVar;
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        this.d = com.facebook.internal.l0.w();
        C5086aR0 c5086aR0 = C5086aR0.a;
        this.e = C5086aR0.e(th);
        this.f = C5086aR0.h(th);
        this.g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.g());
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6562gT0.o(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.a = stringBuffer2;
    }

    public SQ0(String str, String str2) {
        this.b = c.AnrReport;
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        this.d = com.facebook.internal.l0.w();
        this.e = str;
        this.f = str2;
        this.g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C5086aR0.c);
        stringBuffer.append(String.valueOf(this.g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C6562gT0.o(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.a = stringBuffer2;
    }

    public SQ0(File file) {
        String name = file.getName();
        C6562gT0.o(name, "file.name");
        this.a = name;
        this.b = h.b(name);
        C5086aR0 c5086aR0 = C5086aR0.a;
        JSONObject r = C5086aR0.r(this.a, true);
        if (r != null) {
            this.g = Long.valueOf(r.optLong("timestamp", 0L));
            this.d = r.optString("app_version", null);
            this.e = r.optString(n, null);
            this.f = r.optString(f611o, null);
            this.c = r.optJSONArray(q);
        }
    }
}
