package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class AY0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final LinearLayout d;

    public AY0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = linearLayout2;
        this.d = linearLayout3;
    }

    @InterfaceC5670cr1
    public static AY0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_call_to_action;
        TextView textView = (TextView) C6018eH2.a(view, R.id.ad_call_to_action);
        if (textView != null) {
            i = R.id.llline;
            LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.llline);
            if (linearLayout != null) {
                i = R.id.llnative;
                LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.llnative);
                if (linearLayout2 != null) {
                    return new AY0((LinearLayout) view, textView, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static AY0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static AY0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_native_ads_cutom_banner, viewGroup, false);
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
