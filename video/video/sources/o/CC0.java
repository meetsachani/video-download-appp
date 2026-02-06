package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class CC0 {
    @NotNull
    public final String a;
    public final boolean b;

    public CC0(@NotNull String str, boolean z) {
        C6562gT0.p(str, "name");
        this.a = str;
        this.b = z;
    }

    public static /* synthetic */ CC0 d(CC0 cc0, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cc0.a;
        }
        if ((i & 2) != 0) {
            z = cc0.b;
        }
        return cc0.c(str, z);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @NotNull
    public final CC0 c(@NotNull String str, boolean z) {
        C6562gT0.p(str, "name");
        return new CC0(str, z);
    }

    @NotNull
    public final String e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CC0)) {
            return false;
        }
        CC0 cc0 = (CC0) obj;
        if (C6562gT0.g(this.a, cc0.a) && this.b == cc0.b) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "GateKeeper(name=" + this.a + ", value=" + this.b + ')';
    }
}
