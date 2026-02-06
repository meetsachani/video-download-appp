package o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: o.Cz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2709Cz0 extends QI2 {
    public final ViewGroup Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2709Cz0(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C6562gT0.p(fragment, "fragment");
        this.Y = viewGroup;
    }

    public final ViewGroup b() {
        return this.Y;
    }
}
