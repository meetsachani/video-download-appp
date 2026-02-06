package o;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.1")
/* renamed from: o.Ix1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3303Ix1 implements WC {
    @NotNull
    public final Class<?> X;
    @NotNull
    public final String Y;

    public C3303Ix1(@NotNull Class<?> cls, @NotNull String str) {
        C6562gT0.p(cls, "jClass");
        C6562gT0.p(str, "moduleName");
        this.X = cls;
        this.Y = str;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C3303Ix1) && C6562gT0.g(r(), ((C3303Ix1) obj).r())) {
            return true;
        }
        return false;
    }

    @Override // o.EW0
    @NotNull
    public Collection<InterfaceC11215zW0<?>> f() {
        throw new VX0();
    }

    public int hashCode() {
        return r().hashCode();
    }

    @Override // o.WC
    @NotNull
    public Class<?> r() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return r() + C6551gQ1.b;
    }
}
