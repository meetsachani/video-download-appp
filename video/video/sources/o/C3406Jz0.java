package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.Jz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3406Jz0 extends RecyclerView.H {
    public C3406Jz0(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public static C3406Jz0 R(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C6516gH2.F());
        frameLayout.setSaveEnabled(false);
        return new C3406Jz0(frameLayout);
    }

    public FrameLayout S() {
        return (FrameLayout) this.a;
    }
}
