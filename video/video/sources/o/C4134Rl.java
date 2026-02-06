package o;

@Deprecated
/* renamed from: o.Rl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4134Rl {
    public static final int e = 1;
    public static final int f = 1;
    public static final int g = Integer.MIN_VALUE;
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public C4134Rl(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4134Rl)) {
            return false;
        }
        C4134Rl c4134Rl = (C4134Rl) obj;
        if (this.c == c4134Rl.c && this.d == c4134Rl.d && C2593Bt1.a(this.a, c4134Rl.a) && C2593Bt1.a(this.b, c4134Rl.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2593Bt1.b(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public C4134Rl(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}
