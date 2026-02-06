package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class MT {
    @NotNull
    public final String a;

    public MT(@NotNull String str) {
        C6562gT0.p(str, "url");
        this.a = str;
    }

    public static /* synthetic */ MT c(MT mt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mt.a;
        }
        return mt.b(str);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final MT b(@NotNull String str) {
        C6562gT0.p(str, "url");
        return new MT(str);
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MT) && C6562gT0.g(this.a, ((MT) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMediaInfo(url=" + this.a + ')';
    }
}
