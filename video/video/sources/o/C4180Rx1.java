package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Rx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4180Rx1<A, B> implements Serializable {
    public final A X;
    public final B Y;

    public C4180Rx1(A a, B b) {
        this.X = a;
        this.Y = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4180Rx1 d(C4180Rx1 c4180Rx1, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c4180Rx1.X;
        }
        if ((i & 2) != 0) {
            obj2 = c4180Rx1.Y;
        }
        return c4180Rx1.c(obj, obj2);
    }

    public final A a() {
        return this.X;
    }

    public final B b() {
        return this.Y;
    }

    @NotNull
    public final C4180Rx1<A, B> c(A a, B b) {
        return new C4180Rx1<>(a, b);
    }

    public final A e() {
        return this.X;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4180Rx1)) {
            return false;
        }
        C4180Rx1 c4180Rx1 = (C4180Rx1) obj;
        if (C6562gT0.g(this.X, c4180Rx1.X) && C6562gT0.g(this.Y, c4180Rx1.Y)) {
            return true;
        }
        return false;
    }

    public final B f() {
        return this.Y;
    }

    public int hashCode() {
        int hashCode;
        A a = this.X;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.Y;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return '(' + this.X + C6566gU0.h + this.Y + ')';
    }
}
