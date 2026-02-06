package o;

import androidx.fragment.app.Fragment;

/* renamed from: o.u22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9881u22 extends QI2 {
    public final boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9881u22(Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        C6562gT0.p(fragment, "fragment");
        this.Y = z;
    }

    public final boolean b() {
        return this.Y;
    }
}
