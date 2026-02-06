package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.gV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6569gV0 extends C8906q31 implements B40, InterfaceC5563cP0 {
    public C6812hV0 Y0;

    @NotNull
    public final C6812hV0 D() {
        C6812hV0 c6812hV0 = this.Y0;
        if (c6812hV0 != null) {
            return c6812hV0;
        }
        C6562gT0.S("job");
        return null;
    }

    public abstract boolean E();

    public abstract void F(@Nullable Throwable th);

    public final void G(@NotNull C6812hV0 c6812hV0) {
        this.Y0 = c6812hV0;
    }

    @Override // o.InterfaceC5563cP0
    @Nullable
    public C4256Sq1 a() {
        return null;
    }

    @Override // o.B40
    public void e() {
        D().z1(this);
    }

    @Override // o.InterfaceC5563cP0
    public boolean h() {
        return true;
    }

    @Override // o.C8906q31
    @NotNull
    public String toString() {
        return NV.a(this) + C11304zt1.a + NV.b(this) + "[job@" + NV.b(D()) + ']';
    }
}
