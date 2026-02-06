package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.w7  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10387w7 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final NativeAdView a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final TextView e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final MediaView g;
    @InterfaceC5670cr1
    public final TextView h;
    @InterfaceC5670cr1
    public final RatingBar i;
    @InterfaceC5670cr1
    public final TextView j;
    @InterfaceC5670cr1
    public final TextView k;
    @InterfaceC5670cr1
    public final ImageView l;
    @InterfaceC5670cr1
    public final NativeAdView m;

    public C10387w7(@InterfaceC5670cr1 NativeAdView nativeAdView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 MediaView mediaView, @InterfaceC5670cr1 TextView textView5, @InterfaceC5670cr1 RatingBar ratingBar, @InterfaceC5670cr1 TextView textView6, @InterfaceC5670cr1 TextView textView7, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 NativeAdView nativeAdView2) {
        this.a = nativeAdView;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = mediaView;
        this.h = textView5;
        this.i = ratingBar;
        this.j = textView6;
        this.k = textView7;
        this.l = imageView2;
        this.m = nativeAdView2;
    }

    @InterfaceC5670cr1
    public static C10387w7 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ad_advertiser;
        TextView textView = (TextView) C6018eH2.a(view, R.id.ad_advertiser);
        if (textView != null) {
            i = R.id.ad_app_icon;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ad_app_icon);
            if (imageView != null) {
                i = R.id.ad_body;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.ad_body);
                if (textView2 != null) {
                    i = R.id.ad_call_to_action;
                    TextView textView3 = (TextView) C6018eH2.a(view, R.id.ad_call_to_action);
                    if (textView3 != null) {
                        i = R.id.ad_headline;
                        TextView textView4 = (TextView) C6018eH2.a(view, R.id.ad_headline);
                        if (textView4 != null) {
                            i = R.id.ad_media;
                            MediaView mediaView = (MediaView) C6018eH2.a(view, R.id.ad_media);
                            if (mediaView != null) {
                                i = R.id.ad_price;
                                TextView textView5 = (TextView) C6018eH2.a(view, R.id.ad_price);
                                if (textView5 != null) {
                                    i = R.id.ad_stars;
                                    RatingBar ratingBar = (RatingBar) C6018eH2.a(view, R.id.ad_stars);
                                    if (ratingBar != null) {
                                        i = R.id.ad_store;
                                        TextView textView6 = (TextView) C6018eH2.a(view, R.id.ad_store);
                                        if (textView6 != null) {
                                            i = R.id.ad_text;
                                            TextView textView7 = (TextView) C6018eH2.a(view, R.id.ad_text);
                                            if (textView7 != null) {
                                                i = R.id.custom_image;
                                                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.custom_image);
                                                if (imageView2 != null) {
                                                    NativeAdView nativeAdView = (NativeAdView) view;
                                                    return new C10387w7(nativeAdView, textView, imageView, textView2, textView3, textView4, mediaView, textView5, ratingBar, textView6, textView7, imageView2, nativeAdView);
                                                }
                                            }
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
    public static C10387w7 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C10387w7 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.admob_adver_nativebottom_banner_white, viewGroup, false);
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
