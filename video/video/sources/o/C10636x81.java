package o;

/* renamed from: o.x81  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10636x81 {
    public static final String d = "\r";
    public final String a;
    public final float b;
    public final float c;

    public C10636x81(String str, float f, float f2) {
        this.a = str;
        this.c = f2;
        this.b = f;
    }

    public float a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public boolean d(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith("\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
