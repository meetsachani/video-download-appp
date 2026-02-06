package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class BL1 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final LinearLayout e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final TextView g;

    public BL1(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = linearLayout2;
        this.f = textView3;
        this.g = textView4;
    }

    @InterfaceC5670cr1
    public static BL1 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_call_to_action;
        TextView textView = (TextView) C6018eH2.a(view, R.id.ad_call_to_action);
        if (textView != null) {
            i = R.id.ad_text;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.ad_text);
            if (textView2 != null) {
                i = R.id.iv_banner_icon;
                ImageView imageView = (ImageView) C6018eH2.a(view, R.id.iv_banner_icon);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tv_banner_des;
                    TextView textView3 = (TextView) C6018eH2.a(view, R.id.tv_banner_des);
                    if (textView3 != null) {
                        i = R.id.tv_banner_title;
                        TextView textView4 = (TextView) C6018eH2.a(view, R.id.tv_banner_title);
                        if (textView4 != null) {
                            return new BL1(linearLayout, textView, textView2, imageView, linearLayout, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static BL1 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static BL1 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.qureka_cust_banner_white, viewGroup, false);
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
