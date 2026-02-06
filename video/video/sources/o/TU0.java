package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
/* loaded from: classes3.dex */
public class TU0 extends C6812hV0 implements MH {
    public final boolean Z;

    public TU0(@Nullable RU0 ru0) {
        super(true);
        b1(ru0);
        this.Z = O1();
    }

    @Override // o.C6812hV0
    public boolean N0() {
        return this.Z;
    }

    public final boolean O1() {
        C5025aC c5025aC;
        C6812hV0 D;
        C5025aC c5025aC2;
        ZB T0 = T0();
        if (T0 instanceof C5025aC) {
            c5025aC = (C5025aC) T0;
        } else {
            c5025aC = null;
        }
        if (c5025aC != null && (D = c5025aC.D()) != null) {
            while (!D.N0()) {
                ZB T02 = D.T0();
                if (T02 instanceof C5025aC) {
                    c5025aC2 = (C5025aC) T02;
                } else {
                    c5025aC2 = null;
                }
                if (c5025aC2 != null) {
                    D = c5025aC2.D();
                    if (D == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C6812hV0
    public boolean Q0() {
        return true;
    }

    @Override // o.MH
    public boolean k(@NotNull Throwable th) {
        return k1(new QH(th, false, 2, null));
    }

    @Override // o.MH
    public boolean n() {
        return k1(C7458kA2.a);
    }
}
