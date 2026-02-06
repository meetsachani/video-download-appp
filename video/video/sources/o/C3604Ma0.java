package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Ma0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3604Ma0 implements InterfaceC5563cP0 {
    public final boolean X;

    public C3604Ma0(boolean z) {
        this.X = z;
    }

    @Override // o.InterfaceC5563cP0
    @Nullable
    public C4256Sq1 a() {
        return null;
    }

    @Override // o.InterfaceC5563cP0
    public boolean h() {
        return this.X;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (h()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
