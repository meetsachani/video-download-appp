package o;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import o.C10856y22;

@Deprecated
/* renamed from: o.xm2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10791xm2 {
    public static final int d = -1;
    public static final int e = -2;
    public static final Pattern f = Pattern.compile("\\s+");
    public static final AbstractC9481sO0<String> g = AbstractC9481sO0.U("auto", "none");
    public static final AbstractC9481sO0<String> h = AbstractC9481sO0.V(C5445bv2.x0, C5445bv2.y0, C5445bv2.z0);
    public static final AbstractC9481sO0<String> i = AbstractC9481sO0.U(C5445bv2.A0, "open");
    public static final AbstractC9481sO0<String> j = AbstractC9481sO0.V(C5445bv2.d0, C5445bv2.c0, C5445bv2.e0);
    public final int a;
    public final int b;
    public final int c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xm2$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C10791xm2(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    @InterfaceC11300zs1
    public static C10791xm2 a(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        String g2 = C8077mf.g(str.trim());
        if (g2.isEmpty()) {
            return null;
        }
        return b(AbstractC9481sO0.J(TextUtils.split(g2, f)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        if (r9.equals(o.C5445bv2.x0) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10791xm2 b(AbstractC9481sO0<String> abstractC9481sO0) {
        boolean z;
        int i2;
        int i3;
        int hashCode;
        String str = (String) C5098aU0.v(C10856y22.n(j, abstractC9481sO0), C5445bv2.e0);
        int hashCode2 = str.hashCode();
        int i4 = 2;
        boolean z2 = false;
        int i5 = -1;
        if (hashCode2 != -1392885889) {
            if (hashCode2 != -1106037339) {
                if (hashCode2 == 92734940 && str.equals(C5445bv2.d0)) {
                    z = false;
                }
                z = true;
            } else {
                if (str.equals(C5445bv2.e0)) {
                    z = true;
                }
                z = true;
            }
        } else {
            if (str.equals(C5445bv2.c0)) {
                z = true;
            }
            z = true;
        }
        if (z) {
            if (!z) {
                i2 = 1;
            } else {
                i2 = -2;
            }
        } else {
            i2 = 2;
        }
        C10856y22.m n = C10856y22.n(g, abstractC9481sO0);
        if (!n.isEmpty()) {
            String str2 = (String) n.iterator().next();
            int hashCode3 = str2.hashCode();
            if (hashCode3 != 3005871) {
                if (hashCode3 == 3387192 && str2.equals("none")) {
                    i5 = 0;
                }
            } else {
                str2.equals("auto");
            }
            return new C10791xm2(i5, 0, i2);
        }
        C10856y22.m n2 = C10856y22.n(i, abstractC9481sO0);
        C10856y22.m n3 = C10856y22.n(h, abstractC9481sO0);
        if (n2.isEmpty() && n3.isEmpty()) {
            return new C10791xm2(-1, 0, i2);
        }
        String str3 = (String) C5098aU0.v(n2, C5445bv2.A0);
        int hashCode4 = str3.hashCode();
        if (hashCode4 != -1274499742) {
            if (hashCode4 == 3417674 && str3.equals("open")) {
                i3 = 2;
                String str4 = (String) C5098aU0.v(n3, C5445bv2.z0);
                hashCode = str4.hashCode();
                if (hashCode == -1360216880) {
                    if (hashCode != -905816648) {
                        if (hashCode == 99657) {
                        }
                        z2 = true;
                    } else {
                        if (str4.equals(C5445bv2.y0)) {
                            z2 = true;
                        }
                        z2 = true;
                    }
                } else {
                    if (str4.equals(C5445bv2.z0)) {
                        z2 = true;
                    }
                    z2 = true;
                }
                if (z2) {
                    if (!z2) {
                        i4 = 1;
                    } else {
                        i4 = 3;
                    }
                }
                return new C10791xm2(i4, i3, i2);
            }
        } else {
            str3.equals(C5445bv2.A0);
        }
        i3 = 1;
        String str42 = (String) C5098aU0.v(n3, C5445bv2.z0);
        hashCode = str42.hashCode();
        if (hashCode == -1360216880) {
        }
        if (z2) {
        }
        return new C10791xm2(i4, i3, i2);
    }
}
