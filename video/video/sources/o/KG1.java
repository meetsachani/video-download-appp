package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class KG1 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final RelativeLayout b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final TextView e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final MediaView g;

    public KG1(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 MediaView mediaView) {
        this.a = linearLayout;
        this.b = relativeLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = mediaView;
    }

    @InterfaceC5670cr1
    public static KG1 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_choices_container;
        RelativeLayout relativeLayout = (RelativeLayout) C6018eH2.a(view, R.id.ad_choices_container);
        if (relativeLayout != null) {
            i = R.id.native_ad_call_to_action;
            TextView textView = (TextView) C6018eH2.a(view, R.id.native_ad_call_to_action);
            if (textView != null) {
                i = R.id.native_ad_social_context;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.native_ad_social_context);
                if (textView2 != null) {
                    i = R.id.native_ad_sponsored_label;
                    TextView textView3 = (TextView) C6018eH2.a(view, R.id.native_ad_sponsored_label);
                    if (textView3 != null) {
                        i = R.id.native_ad_title;
                        TextView textView4 = (TextView) C6018eH2.a(view, R.id.native_ad_title);
                        if (textView4 != null) {
                            i = R.id.native_icon_view;
                            MediaView mediaView = (MediaView) C6018eH2.a(view, R.id.native_icon_view);
                            if (mediaView != null) {
                                return new KG1((LinearLayout) view, relativeLayout, textView, textView2, textView3, textView4, mediaView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static KG1 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static KG1 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.premium_adver_fb_native_banner_bottom, viewGroup, false);
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
