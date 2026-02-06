package o;

import androidx.fragment.app.Fragment;

/* renamed from: o.r22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9152r22 extends AbstractC3161Hl2 {
    public final Fragment Y;
    public final int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9152r22(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(fragment2, "targetFragment");
        this.Y = fragment2;
        this.Z = i;
    }

    public final int b() {
        return this.Z;
    }

    public final Fragment c() {
        return this.Y;
    }
}
