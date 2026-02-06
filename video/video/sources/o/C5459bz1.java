package o;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: o.bz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5459bz1 {
    @NotNull
    public static final a i = new a(null);
    @NotNull
    public static final String j = "class_name";
    @NotNull
    public static final String k = "index";
    @NotNull
    public static final String l = "id";
    @NotNull
    public static final String m = "text";
    @NotNull
    public static final String n = "tag";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f702o = "description";
    @NotNull
    public static final String p = "hint";
    @NotNull
    public static final String q = "match_bitmask";
    @NotNull
    public final String a;
    public final int b;
    public final int c;
    @NotNull
    public final String d;
    @NotNull
    public final String e;
    @NotNull
    public final String f;
    @NotNull
    public final String g;
    public final int h;

    /* renamed from: o.bz1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.bz1$b */
    /* loaded from: classes2.dex */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        public final int X;

        b(int i) {
            this.X = i;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int g() {
            return this.X;
        }
    }

    public C5459bz1(@NotNull JSONObject jSONObject) {
        C6562gT0.p(jSONObject, "component");
        String string = jSONObject.getString(j);
        C6562gT0.o(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        C6562gT0.o(optString, "component.optString(PATH_TEXT_KEY)");
        this.d = optString;
        String optString2 = jSONObject.optString("tag");
        C6562gT0.o(optString2, "component.optString(PATH_TAG_KEY)");
        this.e = optString2;
        String optString3 = jSONObject.optString("description");
        C6562gT0.o(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = optString3;
        String optString4 = jSONObject.optString("hint");
        C6562gT0.o(optString4, "component.optString(PATH_HINT_KEY)");
        this.g = optString4;
        this.h = jSONObject.optInt(q);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.f;
    }

    @NotNull
    public final String c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.h;
    }

    @NotNull
    public final String g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.d;
    }
}
