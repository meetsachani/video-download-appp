package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.oT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8522oT implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;

    public C8522oT(@InterfaceC5670cr1 LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @InterfaceC5670cr1
    public static C8522oT a(@InterfaceC5670cr1 View view) {
        if (view != null) {
            return new C8522oT((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @InterfaceC5670cr1
    public static C8522oT c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8522oT d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_progressbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.a;
    }
}
