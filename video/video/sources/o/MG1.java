package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class MG1 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final MediaView e;
    @InterfaceC5670cr1
    public final MediaView f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final TextView h;
    @InterfaceC5670cr1
    public final TextView i;
    @InterfaceC5670cr1
    public final LinearLayout j;

    public MG1(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 MediaView mediaView, @InterfaceC5670cr1 MediaView mediaView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 TextView textView5, @InterfaceC5670cr1 LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = mediaView;
        this.f = mediaView2;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = linearLayout3;
    }

    @InterfaceC5670cr1
    public static MG1 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_choices_container;
        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.ad_choices_container);
        if (linearLayout != null) {
            i = R.id.native_ad_body;
            TextView textView = (TextView) C6018eH2.a(view, R.id.native_ad_body);
            if (textView != null) {
                i = R.id.native_ad_call_to_action;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.native_ad_call_to_action);
                if (textView2 != null) {
                    i = R.id.native_ad_icon;
                    MediaView mediaView = (MediaView) C6018eH2.a(view, R.id.native_ad_icon);
                    if (mediaView != null) {
                        i = R.id.native_ad_media;
                        MediaView mediaView2 = (MediaView) C6018eH2.a(view, R.id.native_ad_media);
                        if (mediaView2 != null) {
                            i = R.id.native_ad_social_context;
                            TextView textView3 = (TextView) C6018eH2.a(view, R.id.native_ad_social_context);
                            if (textView3 != null) {
                                i = R.id.native_ad_sponsored_label;
                                TextView textView4 = (TextView) C6018eH2.a(view, R.id.native_ad_sponsored_label);
                                if (textView4 != null) {
                                    i = R.id.native_ad_title;
                                    TextView textView5 = (TextView) C6018eH2.a(view, R.id.native_ad_title);
                                    if (textView5 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) view;
                                        return new MG1(linearLayout2, linearLayout, textView, textView2, mediaView, mediaView2, textView3, textView4, textView5, linearLayout2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static MG1 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static MG1 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.premium_adver_fb_native_full, viewGroup, false);
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
