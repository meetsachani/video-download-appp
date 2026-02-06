package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AX0 {
    public static final AX0 c = new AX0("COMPOSITION");
    public final List<String> a;
    public BX0 b;

    public AX0(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public AX0 a(String str) {
        AX0 ax0 = new AX0(this);
        ax0.a.add(str);
        return ax0;
    }

    public final boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.a.size()) {
            return false;
        }
        if (i == this.a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((!z && (i != this.a.size() - 2 || !b())) || !z2) {
                return false;
            }
            return true;
        } else if (!z && this.a.get(i + 1).equals(str)) {
            if (i != this.a.size() - 2 && (i != this.a.size() - 3 || !b())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.a.size() - 1) {
                return false;
            }
            return this.a.get(i2).equals(str);
        }
    }

    public BX0 d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (!this.a.get(i).equals("**")) {
            return 1;
        }
        if (i == this.a.size() - 1 || !this.a.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AX0 ax0 = (AX0) obj;
            if (!this.a.equals(ax0.a)) {
                return false;
            }
            BX0 bx0 = this.b;
            BX0 bx02 = ax0.b;
            if (bx0 != null) {
                return bx0.equals(bx02);
            }
            if (bx02 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public String g() {
        return this.a.toString();
    }

    public boolean h(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        if (this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        BX0 bx0 = this.b;
        if (bx0 != null) {
            i = bx0.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean i(String str, int i) {
        if ("__container".equals(str) || i < this.a.size() - 1 || this.a.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public AX0 j(BX0 bx0) {
        AX0 ax0 = new AX0(this);
        ax0.b = bx0;
        return ax0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public AX0(AX0 ax0) {
        this.a = new ArrayList(ax0.a);
        this.b = ax0.b;
    }
}
