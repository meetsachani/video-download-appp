package o;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.hB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6732hB implements Serializable {
    public static final C6732hB Y;
    public static final C6732hB Y0;
    public static final C6732hB Z;
    public static final C6732hB Z0;
    public static final C6732hB a1;
    public static final Map<String, C6732hB> b1;
    private static final long serialVersionUID = 5947847346149275958L;
    public final Set<WA> X = Collections.synchronizedSet(new HashSet());

    static {
        C6732hB c6732hB = new C6732hB(null);
        Y = c6732hB;
        C6732hB c6732hB2 = new C6732hB("a-zA-Z");
        Z = c6732hB2;
        C6732hB c6732hB3 = new C6732hB("a-z");
        Y0 = c6732hB3;
        C6732hB c6732hB4 = new C6732hB("A-Z");
        Z0 = c6732hB4;
        C6732hB c6732hB5 = new C6732hB("0-9");
        a1 = c6732hB5;
        Map<String, C6732hB> synchronizedMap = Collections.synchronizedMap(new HashMap());
        b1 = synchronizedMap;
        synchronizedMap.put(null, c6732hB);
        synchronizedMap.put("", c6732hB);
        synchronizedMap.put("a-zA-Z", c6732hB2);
        synchronizedMap.put("A-Za-z", c6732hB2);
        synchronizedMap.put("a-z", c6732hB3);
        synchronizedMap.put("A-Z", c6732hB4);
        synchronizedMap.put("0-9", c6732hB5);
    }

    public C6732hB(String... strArr) {
        for (String str : strArr) {
            a(str);
        }
    }

    public static C6732hB d(String... strArr) {
        C6732hB c6732hB;
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 1 && (c6732hB = b1.get(strArr[0])) != null) {
            return c6732hB;
        }
        return new C6732hB(strArr);
    }

    public void a(String str) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 >= 4 && str.charAt(i) == '^' && str.charAt(i + 2) == '-') {
                    this.X.add(WA.B(str.charAt(i + 1), str.charAt(i + 3)));
                    i += 4;
                } else if (i2 >= 3 && str.charAt(i + 1) == '-') {
                    this.X.add(WA.p(str.charAt(i), str.charAt(i + 2)));
                    i += 3;
                } else if (i2 >= 2 && str.charAt(i) == '^') {
                    this.X.add(WA.w(str.charAt(i + 1)));
                    i += 2;
                } else {
                    this.X.add(WA.l(str.charAt(i)));
                    i++;
                }
            }
        }
    }

    public boolean b(char c) {
        synchronized (this.X) {
            try {
                for (WA wa : this.X) {
                    if (wa.h(c)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WA[] c() {
        return (WA[]) this.X.toArray(WA.Z0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6732hB)) {
            return false;
        }
        return this.X.equals(((C6732hB) obj).X);
    }

    public int hashCode() {
        return this.X.hashCode() + 89;
    }

    public String toString() {
        return this.X.toString();
    }
}
