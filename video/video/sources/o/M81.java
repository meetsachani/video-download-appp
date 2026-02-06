package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class M81 {
    @NotNull
    public final String a;
    @NotNull
    public final C11197zR0 b;

    public M81(@NotNull String str, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(str, "value");
        C6562gT0.p(c11197zR0, V12.q);
        this.a = str;
        this.b = c11197zR0;
    }

    public static /* synthetic */ M81 d(M81 m81, String str, C11197zR0 c11197zR0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = m81.a;
        }
        if ((i & 2) != 0) {
            c11197zR0 = m81.b;
        }
        return m81.c(str, c11197zR0);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final C11197zR0 b() {
        return this.b;
    }

    @NotNull
    public final M81 c(@NotNull String str, @NotNull C11197zR0 c11197zR0) {
        C6562gT0.p(str, "value");
        C6562gT0.p(c11197zR0, V12.q);
        return new M81(str, c11197zR0);
    }

    @NotNull
    public final C11197zR0 e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M81)) {
            return false;
        }
        M81 m81 = (M81) obj;
        if (C6562gT0.g(this.a, m81.a) && C6562gT0.g(this.b, m81.b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
