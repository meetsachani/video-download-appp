package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class ZE1 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final NativeAdView a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final MediaView e;
    @InterfaceC5670cr1
    public final RelativeLayout f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final NativeAdView h;
    @InterfaceC5670cr1
    public final Barrier i;
    @InterfaceC5670cr1
    public final ImageView j;
    @InterfaceC5670cr1
    public final ConstraintLayout k;

    public ZE1(@InterfaceC5670cr1 NativeAdView nativeAdView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 MediaView mediaView, @InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 NativeAdView nativeAdView2, @InterfaceC5670cr1 Barrier barrier, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ConstraintLayout constraintLayout) {
        this.a = nativeAdView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = mediaView;
        this.f = relativeLayout;
        this.g = textView4;
        this.h = nativeAdView2;
        this.i = barrier;
        this.j = imageView;
        this.k = constraintLayout;
    }

    @InterfaceC5670cr1
    public static ZE1 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_body_small_ntv;
        TextView textView = (TextView) C6018eH2.a(view, R.id.ad_body_small_ntv);
        if (textView != null) {
            i = R.id.ad_call_to_action_smallntv;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.ad_call_to_action_smallntv);
            if (textView2 != null) {
                i = R.id.ad_headline_small_ntv;
                TextView textView3 = (TextView) C6018eH2.a(view, R.id.ad_headline_small_ntv);
                if (textView3 != null) {
                    i = R.id.ad_media;
                    MediaView mediaView = (MediaView) C6018eH2.a(view, R.id.ad_media);
                    if (mediaView != null) {
                        i = R.id.ad_reletive;
                        RelativeLayout relativeLayout = (RelativeLayout) C6018eH2.a(view, R.id.ad_reletive);
                        if (relativeLayout != null) {
                            i = R.id.ad_text;
                            TextView textView4 = (TextView) C6018eH2.a(view, R.id.ad_text);
                            if (textView4 != null) {
                                NativeAdView nativeAdView = (NativeAdView) view;
                                i = R.id.barrierData;
                                Barrier barrier = (Barrier) C6018eH2.a(view, R.id.barrierData);
                                if (barrier != null) {
                                    i = R.id.custom_image;
                                    ImageView imageView = (ImageView) C6018eH2.a(view, R.id.custom_image);
                                    if (imageView != null) {
                                        i = R.id.smallNativeMainBg;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) C6018eH2.a(view, R.id.smallNativeMainBg);
                                        if (constraintLayout != null) {
                                            return new ZE1(nativeAdView, textView, textView2, textView3, mediaView, relativeLayout, textView4, nativeAdView, barrier, imageView, constraintLayout);
                                        }
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
    public static ZE1 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static ZE1 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pre_small_native_custom_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public NativeAdView getRoot() {
        return this.a;
    }
}
