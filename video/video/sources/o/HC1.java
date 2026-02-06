package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import o.C7509kN1;
import o.HT1;

/* loaded from: classes4.dex */
public final class HC1 {
    public final FC1 a;
    public final String[] b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public FC1 a() {
        return this.a;
    }

    @InterfaceC5670cr1
    public String b() {
        return this.f;
    }

    @InterfaceC5670cr1
    public String[] c() {
        return (String[]) this.b.clone();
    }

    @InterfaceC5670cr1
    public String d() {
        return this.e;
    }

    @InterfaceC5670cr1
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HC1.class == obj.getClass()) {
            HC1 hc1 = (HC1) obj;
            if (Arrays.equals(this.b, hc1.b) && this.c == hc1.c) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.c;
    }

    @InterfaceC4698Xf2
    public int g() {
        return this.g;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + this.c;
    }

    public String toString() {
        return "PermissionRequest{mHelper=" + this.a + ", mPerms=" + Arrays.toString(this.b) + ", mRequestCode=" + this.c + ", mRationale='" + this.d + "', mPositiveButtonText='" + this.e + "', mNegativeButtonText='" + this.f + "', mTheme=" + this.g + '}';
    }

    public HC1(FC1 fc1, String[] strArr, int i, String str, String str2, String str3, int i2) {
        this.a = fc1;
        this.b = (String[]) strArr.clone();
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i2;
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public final FC1 a;
        public final int b;
        public final String[] c;
        public String d;
        public String e;
        public String f;
        public int g = -1;

        public b(@InterfaceC5670cr1 Activity activity, int i, @M82(min = 1) @InterfaceC5670cr1 String... strArr) {
            this.a = FC1.d(activity);
            this.b = i;
            this.c = strArr;
        }

        @InterfaceC5670cr1
        public HC1 a() {
            if (this.d == null) {
                this.d = this.a.b().getString(C7509kN1.k.rationale_ask);
            }
            if (this.e == null) {
                this.e = this.a.b().getString(17039370);
            }
            if (this.f == null) {
                this.f = this.a.b().getString(17039360);
            }
            return new HC1(this.a, this.c, this.b, this.d, this.e, this.f, this.g);
        }

        @InterfaceC5670cr1
        public b b(@InterfaceC3329Je2 int i) {
            this.f = this.a.b().getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b c(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @InterfaceC5670cr1
        public b d(@InterfaceC3329Je2 int i) {
            this.e = this.a.b().getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b e(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @InterfaceC5670cr1
        public b f(@InterfaceC3329Je2 int i) {
            this.d = this.a.b().getString(i);
            return this;
        }

        @InterfaceC5670cr1
        public b g(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }

        @InterfaceC5670cr1
        public b h(@InterfaceC4698Xf2 int i) {
            this.g = i;
            return this;
        }

        public b(@InterfaceC5670cr1 Fragment fragment, int i, @M82(min = 1) @InterfaceC5670cr1 String... strArr) {
            this.a = FC1.e(fragment);
            this.b = i;
            this.c = strArr;
        }
    }
}
