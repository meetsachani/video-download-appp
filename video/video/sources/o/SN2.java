package o;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class SN2 extends QI2 {
    public final Fragment Y;
    public final int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN2(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i + " without using parent's childFragmentManager");
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(fragment2, "expectedParentFragment");
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
