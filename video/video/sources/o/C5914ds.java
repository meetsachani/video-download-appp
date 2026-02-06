package o;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;

/* renamed from: o.ds  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5914ds implements Serializable {
    public static final char c1 = 65279;
    private static final long serialVersionUID = 1;
    public final String X;
    public final int[] Y;
    public static final C5914ds Z = new C5914ds(StandardCharsets.UTF_8.name(), 239, C10997yd1.l2, 191);
    public static final C5914ds Y0 = new C5914ds(StandardCharsets.UTF_16BE.name(), C9680tD0.l, 255);
    public static final C5914ds Z0 = new C5914ds(StandardCharsets.UTF_16LE.name(), 255, C9680tD0.l);
    public static final C5914ds a1 = new C5914ds(ZN2.c1, 0, 0, C9680tD0.l, 255);
    public static final C5914ds b1 = new C5914ds(ZN2.d1, 255, C9680tD0.l, 0, 0);

    public C5914ds(String str, int... iArr) {
        Objects.requireNonNull(str, "charsetName");
        Objects.requireNonNull(iArr, "bytes");
        if (!str.isEmpty()) {
            if (iArr.length != 0) {
                this.X = str;
                this.Y = (int[]) iArr.clone();
                return;
            }
            throw new IllegalArgumentException("No bytes specified");
        }
        throw new IllegalArgumentException("No charsetName specified");
    }

    public int a(int i) {
        return this.Y[i];
    }

    public byte[] b() {
        byte[] l = C7743lL0.l(this.Y.length);
        int i = 0;
        while (true) {
            int[] iArr = this.Y;
            if (i < iArr.length) {
                l[i] = (byte) iArr[i];
                i++;
            } else {
                return l;
            }
        }
    }

    public String c() {
        return this.X;
    }

    public int[] d() {
        return this.Y;
    }

    public int e() {
        return this.Y.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5914ds)) {
            return false;
        }
        C5914ds c5914ds = (C5914ds) obj;
        if (this.Y.length != c5914ds.e()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.Y;
            if (i < iArr.length) {
                if (iArr[i] != c5914ds.a(i)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public boolean f(int[] iArr) {
        int length;
        int[] iArr2 = this.Y;
        if (iArr2 == iArr) {
            return true;
        }
        if (iArr == null || iArr.length < (length = iArr2.length)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.Y[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode();
        for (int i : this.Y) {
            hashCode += i;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.X);
        sb.append(": ");
        for (int i = 0; i < this.Y.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.Y[i] & 255).toUpperCase(Locale.ROOT));
        }
        sb.append(']');
        return sb.toString();
    }
}
