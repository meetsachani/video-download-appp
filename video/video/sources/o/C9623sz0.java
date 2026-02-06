package o;

import androidx.fragment.app.Fragment;

/* renamed from: o.sz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9623sz0 extends QI2 {
    public final String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9623sz0(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C6562gT0.p(fragment, "fragment");
        C6562gT0.p(str, "previousFragmentId");
        this.Y = str;
    }

    public final String b() {
        return this.Y;
    }
}
