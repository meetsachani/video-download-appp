package o;

import java.io.Serializable;

@NN0
@Z90
@InterfaceC10420wF0
/* renamed from: o.mI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7992mI0 implements Serializable {
    public static final int Y0 = -1;
    private static final long serialVersionUID = 0;
    public final String X;
    public final int Y;
    public final boolean Z;

    public C7992mI0(String str, int i, boolean z) {
        this.X = str;
        this.Y = i;
        this.Z = z;
    }

    public static C7992mI0 a(String str) {
        C7992mI0 c = c(str);
        C10664xF1.u(!c.h(), "Host has a port: %s", str);
        return c;
    }

    public static C7992mI0 b(String str, int i) {
        C10664xF1.k(i(i), "Port out of range: %s", i);
        C7992mI0 c = c(str);
        C10664xF1.u(!c.h(), "Host has a port: %s", str);
        return new C7992mI0(c.X, i, c.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @InterfaceC6181ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7992mI0 c(String str) {
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String substring;
        String str4;
        C10664xF1.E(str);
        int i = -1;
        boolean z3 = true;
        if (str.startsWith(C6566gU0.f)) {
            String[] e = e(str);
            substring = e[0];
            str2 = e[1];
        } else {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    substring = str.substring(0, indexOf);
                    str2 = str.substring(i2);
                }
            }
            if (indexOf >= 0) {
                z = true;
            } else {
                z = false;
            }
            z2 = z;
            str2 = null;
            str3 = str;
            if (!C6108ef2.d(str2)) {
                if (str2.startsWith(C2555Bk.p1) || !SA.f().C(str2)) {
                    z3 = false;
                }
                C10664xF1.u(z3, "Unparseable port number: %s", str);
                try {
                    i = Integer.parseInt(str2);
                    C10664xF1.u(i(i), "Port number out of range: %s", str);
                } catch (NumberFormatException unused) {
                    if (str.length() != 0) {
                        str4 = "Unparseable port number: ".concat(str);
                    } else {
                        str4 = new String("Unparseable port number: ");
                    }
                    throw new IllegalArgumentException(str4);
                }
            }
            return new C7992mI0(str3, i, z2);
        }
        str3 = substring;
        z2 = false;
        if (!C6108ef2.d(str2)) {
        }
        return new C7992mI0(str3, i, z2);
    }

    public static String[] e(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.charAt(0) == '[') {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "Bracketed host-port string must start with a bracket: %s", str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        if (indexOf > -1 && lastIndexOf > indexOf) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.u(z2, "Invalid bracketed host/port: %s", str);
        String substring = str.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{substring, ""};
        }
        if (str.charAt(i) == ':') {
            z3 = true;
        }
        C10664xF1.u(z3, "Only a colon may follow a close bracket: %s", str);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            C10664xF1.u(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new String[]{substring, str.substring(i2)};
    }

    public static boolean i(int i) {
        if (i >= 0 && i <= 65535) {
            return true;
        }
        return false;
    }

    public String d() {
        return this.X;
    }

    public boolean equals(@MB Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7992mI0) {
            C7992mI0 c7992mI0 = (C7992mI0) obj;
            if (C2593Bt1.a(this.X, c7992mI0.X) && this.Y == c7992mI0.Y) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        C10664xF1.g0(h());
        return this.Y;
    }

    public int g(int i) {
        if (h()) {
            return this.Y;
        }
        return i;
    }

    public boolean h() {
        if (this.Y >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2593Bt1.b(this.X, Integer.valueOf(this.Y));
    }

    @InterfaceC6181ey
    public C7992mI0 j() {
        C10664xF1.u(!this.Z, "Possible bracketless IPv6 literal: %s", this.X);
        return this;
    }

    public C7992mI0 k(int i) {
        C10664xF1.d(i(i));
        if (h()) {
            return this;
        }
        return new C7992mI0(this.X, i, this.Z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.X.length() + 8);
        if (this.X.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.X);
            sb.append(']');
        } else {
            sb.append(this.X);
        }
        if (h()) {
            sb.append(':');
            sb.append(this.Y);
        }
        return sb.toString();
    }
}
