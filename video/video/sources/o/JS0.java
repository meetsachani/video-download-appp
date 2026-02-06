package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class JS0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;

    public JS0(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 LinearLayout linearLayout) {
        this.a = relativeLayout;
        this.b = linearLayout;
    }

    @InterfaceC5670cr1
    public static JS0 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.ln_try_again);
        if (linearLayout != null) {
            return new JS0((RelativeLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ln_try_again)));
    }

    @InterfaceC5670cr1
    public static JS0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static JS0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.internet_dialogue, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
