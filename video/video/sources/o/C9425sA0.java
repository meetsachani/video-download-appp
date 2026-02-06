package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.sA0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9425sA0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;

    public C9425sA0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    @InterfaceC5670cr1
    public static C9425sA0 a(@InterfaceC5670cr1 View view) {
        TextView textView = (TextView) C6018eH2.a(view, R.id.text);
        if (textView != null) {
            return new C9425sA0((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text)));
    }

    @InterfaceC5670cr1
    public static C9425sA0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C9425sA0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.full_ad_loader_progressbar, viewGroup, false);
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
