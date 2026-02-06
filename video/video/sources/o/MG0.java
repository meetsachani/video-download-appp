package o;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MG0 {
    public final String a;
    public final String b;

    public MG0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MG0.class == obj.getClass()) {
            MG0 mg0 = (MG0) obj;
            if (TextUtils.equals(this.a, mg0.a) && TextUtils.equals(this.b, mg0.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + C6566gU0.g;
    }
}
