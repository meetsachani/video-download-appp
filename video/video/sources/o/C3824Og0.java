package o;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.Og0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3824Og0 extends AD1 {
    public static final int W1 = 0;
    public static final int X1 = 1;
    public static final int Y1 = 2;
    public static final int Z1 = 3;
    public static final InterfaceC8368nr.a<C3824Og0> a2 = new InterfaceC8368nr.a() { // from class: o.Ng0
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C3824Og0.h(bundle);
        }
    };
    public static final String b2 = TD2.R0(1001);
    public static final String c2 = TD2.R0(1002);
    public static final String d2 = TD2.R0(1003);
    public static final String e2 = TD2.R0(1004);
    public static final String f2 = TD2.R0(1005);
    public static final String g2 = TD2.R0(1006);
    public final int P1;
    @InterfaceC11300zs1
    public final String Q1;
    public final int R1;
    @InterfaceC11300zs1
    public final C10833xx0 S1;
    public final int T1;
    @InterfaceC11300zs1
    public final C4604Wg1 U1;
    public final boolean V1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Og0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C3824Og0(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static /* synthetic */ C3824Og0 h(Bundle bundle) {
        return new C3824Og0(bundle);
    }

    public static C3824Og0 j(String str) {
        return new C3824Og0(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static C3824Og0 k(Throwable th, String str, int i, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i2, boolean z, int i3) {
        if (c10833xx0 == null) {
            i2 = 4;
        }
        return new C3824Og0(1, th, null, i3, str, i, c10833xx0, i2, z);
    }

    public static C3824Og0 l(IOException iOException, int i) {
        return new C3824Og0(0, iOException, i);
    }

    @Deprecated
    public static C3824Og0 m(RuntimeException runtimeException) {
        return n(runtimeException, 1000);
    }

    public static C3824Og0 n(RuntimeException runtimeException, int i) {
        return new C3824Og0(2, runtimeException, i);
    }

    public static String o(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i3) {
        String str3;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    str3 = "Unexpected runtime error";
                } else {
                    str3 = "Remote error";
                }
            } else {
                str3 = str2 + " error, index=" + i2 + ", format=" + c10833xx0 + ", format_supported=" + TD2.n0(i3);
            }
        } else {
            str3 = "Source error";
        }
        if (!TextUtils.isEmpty(str)) {
            return str3 + ": " + str;
        }
        return str3;
    }

    @Override // o.AD1
    public boolean c(@InterfaceC11300zs1 AD1 ad1) {
        if (!super.c(ad1)) {
            return false;
        }
        C3824Og0 c3824Og0 = (C3824Og0) TD2.o(ad1);
        if (this.P1 != c3824Og0.P1 || !TD2.g(this.Q1, c3824Og0.Q1) || this.R1 != c3824Og0.R1 || !TD2.g(this.S1, c3824Og0.S1) || this.T1 != c3824Og0.T1 || !TD2.g(this.U1, c3824Og0.U1) || this.V1 != c3824Og0.V1) {
            return false;
        }
        return true;
    }

    @Override // o.AD1, o.InterfaceC8368nr
    public Bundle e() {
        Bundle e = super.e();
        e.putInt(b2, this.P1);
        e.putString(c2, this.Q1);
        e.putInt(d2, this.R1);
        C10833xx0 c10833xx0 = this.S1;
        if (c10833xx0 != null) {
            e.putBundle(e2, c10833xx0.e());
        }
        e.putInt(f2, this.T1);
        e.putBoolean(g2, this.V1);
        return e;
    }

    @OB
    public C3824Og0 i(@InterfaceC11300zs1 C4604Wg1 c4604Wg1) {
        return new C3824Og0((String) TD2.o(getMessage()), getCause(), this.X, this.P1, this.Q1, this.R1, this.S1, this.T1, c4604Wg1, this.Y, this.V1);
    }

    public Exception p() {
        boolean z = true;
        if (this.P1 != 1) {
            z = false;
        }
        C9542sf.i(z);
        return (Exception) C9542sf.g(getCause());
    }

    public IOException q() {
        boolean z;
        if (this.P1 == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return (IOException) C9542sf.g(getCause());
    }

    public RuntimeException r() {
        boolean z;
        if (this.P1 == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return (RuntimeException) C9542sf.g(getCause());
    }

    public C3824Og0(int i, @InterfaceC11300zs1 Throwable th, @InterfaceC11300zs1 String str, int i2, @InterfaceC11300zs1 String str2, int i3, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i4, boolean z) {
        this(o(i, str, str2, i3, c10833xx0, i4), th, i2, i, str2, i3, c10833xx0, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public C3824Og0(Bundle bundle) {
        super(bundle);
        this.P1 = bundle.getInt(b2, 2);
        this.Q1 = bundle.getString(c2);
        this.R1 = bundle.getInt(d2, -1);
        Bundle bundle2 = bundle.getBundle(e2);
        this.S1 = bundle2 == null ? null : C10833xx0.m2.a(bundle2);
        this.T1 = bundle.getInt(f2, 4);
        this.V1 = bundle.getBoolean(g2, false);
        this.U1 = null;
    }

    public C3824Og0(String str, @InterfaceC11300zs1 Throwable th, int i, int i2, @InterfaceC11300zs1 String str2, int i3, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i4, @InterfaceC11300zs1 C4604Wg1 c4604Wg1, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        C9542sf.a(!z || i2 == 1);
        C9542sf.a((th != null || i2 == 3) ? true : z2);
        this.P1 = i2;
        this.Q1 = str2;
        this.R1 = i3;
        this.S1 = c10833xx0;
        this.T1 = i4;
        this.U1 = c4604Wg1;
        this.V1 = z;
    }
}
