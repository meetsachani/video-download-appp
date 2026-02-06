package o;

import android.content.LocusId;
import android.os.Build;

/* loaded from: classes.dex */
public final class H31 {
    public final String a;
    public final LocusId b;

    /* loaded from: classes.dex */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public H31(String str) {
        this.a = (String) C10907yF1.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    public static H31 d(LocusId locusId) {
        C10907yF1.m(locusId, "locusId cannot be null");
        return new H31((String) C10907yF1.q(a.b(locusId), "id cannot be empty"));
    }

    public String a() {
        return this.a;
    }

    public final String b() {
        int length = this.a.length();
        return length + "_chars";
    }

    public LocusId c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H31.class != obj.getClass()) {
            return false;
        }
        H31 h31 = (H31) obj;
        String str = this.a;
        if (str == null) {
            if (h31.a == null) {
                return true;
            }
            return false;
        }
        return str.equals(h31.a);
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        return "LocusIdCompat[" + b() + C6566gU0.g;
    }
}
