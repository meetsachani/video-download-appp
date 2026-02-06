package o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class RN2 extends QI2 {
    public final ViewGroup Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RN2(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(viewGroup, C5445bv2.W);
        this.Y = viewGroup;
    }

    public final ViewGroup b() {
        return this.Y;
    }
}
