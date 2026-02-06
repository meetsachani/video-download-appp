package o;

import java.util.Objects;
import o.TD0;

/* renamed from: o.Mx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3693Mx0 {
    public static final C3693Mx0 d = new C3693Mx0("", "", false);
    public static final C3693Mx0 e = new C3693Mx0("\n", TD0.a.Y0, true);
    public final String a;
    public final String b;
    public final boolean c;

    public C3693Mx0(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public C3693Mx0 d(String str) {
        return new C3693Mx0(this.a, str, this.c);
    }

    public C3693Mx0 e(String str) {
        return new C3693Mx0(str, this.b, this.c);
    }

    public C3693Mx0 f(boolean z) {
        return new C3693Mx0(this.a, this.b, z);
    }
}
