package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Au2<A, B, C> implements Serializable {
    public final A X;
    public final B Y;
    public final C Z;

    public Au2(A a, B b, C c) {
        this.X = a;
        this.Y = b;
        this.Z = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Au2 e(Au2 au2, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = au2.X;
        }
        if ((i & 2) != 0) {
            obj2 = au2.Y;
        }
        if ((i & 4) != 0) {
            obj3 = au2.Z;
        }
        return au2.d(obj, obj2, obj3);
    }

    public final A a() {
        return this.X;
    }

    public final B b() {
        return this.Y;
    }

    public final C c() {
        return this.Z;
    }

    @NotNull
    public final Au2<A, B, C> d(A a, B b, C c) {
        return new Au2<>(a, b, c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Au2)) {
            return false;
        }
        Au2 au2 = (Au2) obj;
        if (C6562gT0.g(this.X, au2.X) && C6562gT0.g(this.Y, au2.Y) && C6562gT0.g(this.Z, au2.Z)) {
            return true;
        }
        return false;
    }

    public final A f() {
        return this.X;
    }

    public final B g() {
        return this.Y;
    }

    public final C h() {
        return this.Z;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A a = this.X;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.Y;
        if (b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C c = this.Z;
        if (c != null) {
            i = c.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public String toString() {
        return '(' + this.X + C6566gU0.h + this.Y + C6566gU0.h + this.Z + ')';
    }
}
