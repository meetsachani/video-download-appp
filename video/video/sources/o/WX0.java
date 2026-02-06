package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.1")
/* loaded from: classes3.dex */
public final class WX0 implements Comparable<WX0> {
    public static final int a1 = 255;
    public final int X;
    public final int Y;
    public final int Y0;
    public final int Z;
    @NotNull
    public static final a Z0 = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final WX0 b1 = XX0.a();

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public WX0(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = m(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(@NotNull WX0 wx0) {
        C6562gT0.p(wx0, "other");
        return this.Y0 - wx0.Y0;
    }

    public boolean equals(@Nullable Object obj) {
        WX0 wx0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WX0) {
            wx0 = (WX0) obj;
        } else {
            wx0 = null;
        }
        if (wx0 != null && this.Y0 == wx0.Y0) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.X;
    }

    public final int h() {
        return this.Y;
    }

    public int hashCode() {
        return this.Y0;
    }

    public final int i() {
        return this.Z;
    }

    public final boolean j(int i, int i2) {
        int i3 = this.X;
        if (i3 <= i) {
            if (i3 != i || this.Y < i2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean l(int i, int i2, int i3) {
        int i4 = this.X;
        if (i4 <= i) {
            if (i4 == i) {
                int i5 = this.Y;
                if (i5 <= i2) {
                    if (i5 != i2 || this.Z < i3) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int m(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.X);
        sb.append('.');
        sb.append(this.Y);
        sb.append('.');
        sb.append(this.Z);
        return sb.toString();
    }

    public WX0(int i, int i2) {
        this(i, i2, 0);
    }
}
