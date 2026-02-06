package o;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class QI2 extends RuntimeException {
    public final Fragment X;

    public /* synthetic */ QI2(Fragment fragment, String str, int i, C9516sY c9516sY) {
        this(fragment, (i & 2) != 0 ? null : str);
    }

    public final Fragment a() {
        return this.X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QI2(Fragment fragment, String str) {
        super(str);
        C6562gT0.p(fragment, "fragment");
        this.X = fragment;
    }
}
