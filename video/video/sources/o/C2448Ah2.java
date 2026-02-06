package o;

import java.util.regex.Pattern;

/* renamed from: o.Ah2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2448Ah2 {
    public static final Pattern j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    public final String b;
    public String d;
    public Object[] e;
    public boolean a = false;
    public String[] c = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;

    public C2448Ah2(String str) {
        this.b = str;
    }

    public static void a(StringBuilder sb, String str, String str2) {
        if (!i(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public static void b(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(C6566gU0.h);
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    public static C2448Ah2 c(String str) {
        return new C2448Ah2(str);
    }

    public static boolean i(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public C2448Ah2 d(String[] strArr) {
        this.c = strArr;
        return this;
    }

    public InterfaceC11257zh2 e() {
        if (i(this.f) && !i(this.g)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.a) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length != 0) {
            b(sb, strArr);
        } else {
            sb.append(" * ");
        }
        sb.append(" FROM ");
        sb.append(this.b);
        a(sb, " WHERE ", this.d);
        a(sb, " GROUP BY ", this.f);
        a(sb, " HAVING ", this.g);
        a(sb, " ORDER BY ", this.h);
        a(sb, " LIMIT ", this.i);
        return new Z72(sb.toString(), this.e);
    }

    public C2448Ah2 f() {
        this.a = true;
        return this;
    }

    public C2448Ah2 g(String str) {
        this.f = str;
        return this;
    }

    public C2448Ah2 h(String str) {
        this.g = str;
        return this;
    }

    public C2448Ah2 j(String str) {
        if (!i(str) && !j.matcher(str).matches()) {
            throw new IllegalArgumentException("invalid LIMIT clauses:" + str);
        }
        this.i = str;
        return this;
    }

    public C2448Ah2 k(String str) {
        this.h = str;
        return this;
    }

    public C2448Ah2 l(String str, Object[] objArr) {
        this.d = str;
        this.e = objArr;
        return this;
    }
}
