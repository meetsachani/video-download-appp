package o;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.hp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC6886hp {
    OPEN(false),
    CLOSED(true);
    
    public final boolean X;

    EnumC6886hp(boolean z) {
        this.X = z;
    }

    public static EnumC6886hp g(boolean z) {
        if (z) {
            return CLOSED;
        }
        return OPEN;
    }
}
