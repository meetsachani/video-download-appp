package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.r6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9165r6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final AppCompatImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final LinearLayout e;
    @InterfaceC5670cr1
    public final LinearLayout f;
    @InterfaceC5670cr1
    public final LinearLayout g;
    @InterfaceC5670cr1
    public final ImageView h;
    @InterfaceC5670cr1
    public final LinearLayout i;
    @InterfaceC5670cr1
    public final TextView j;
    @InterfaceC5670cr1
    public final TextView k;
    @InterfaceC5670cr1
    public final TextView l;
    @InterfaceC5670cr1
    public final AppCompatTextView m;
    @InterfaceC5670cr1
    public final ImageView n;
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f845o;
    @InterfaceC5670cr1
    public final ViewPager p;

    public C9165r6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 AppCompatImageView appCompatImageView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 LinearLayout linearLayout4, @InterfaceC5670cr1 LinearLayout linearLayout5, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 LinearLayout linearLayout6, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 AppCompatTextView appCompatTextView, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 LinearLayout linearLayout7, @InterfaceC5670cr1 ViewPager viewPager) {
        this.a = linearLayout;
        this.b = appCompatImageView;
        this.c = imageView;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = linearLayout4;
        this.g = linearLayout5;
        this.h = imageView2;
        this.i = linearLayout6;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = appCompatTextView;
        this.n = imageView3;
        this.f845o = linearLayout7;
        this.p = viewPager;
    }

    @InterfaceC5670cr1
    public static C9165r6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6018eH2.a(view, R.id.ic_back);
        if (appCompatImageView != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.image);
            if (imageView != null) {
                i = R.id.image_view;
                LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.image_view);
                if (linearLayout != null) {
                    i = R.id.linerImage;
                    LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.linerImage);
                    if (linearLayout2 != null) {
                        i = R.id.linerSaved;
                        LinearLayout linearLayout3 = (LinearLayout) C6018eH2.a(view, R.id.linerSaved);
                        if (linearLayout3 != null) {
                            i = R.id.linerVideo;
                            LinearLayout linearLayout4 = (LinearLayout) C6018eH2.a(view, R.id.linerVideo);
                            if (linearLayout4 != null) {
                                i = R.id.saved;
                                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.saved);
                                if (imageView2 != null) {
                                    i = R.id.saved_view;
                                    LinearLayout linearLayout5 = (LinearLayout) C6018eH2.a(view, R.id.saved_view);
                                    if (linearLayout5 != null) {
                                        i = R.id.text_image;
                                        TextView textView = (TextView) C6018eH2.a(view, R.id.text_image);
                                        if (textView != null) {
                                            i = R.id.text_saved;
                                            TextView textView2 = (TextView) C6018eH2.a(view, R.id.text_saved);
                                            if (textView2 != null) {
                                                i = R.id.text_video;
                                                TextView textView3 = (TextView) C6018eH2.a(view, R.id.text_video);
                                                if (textView3 != null) {
                                                    i = R.id.title;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6018eH2.a(view, R.id.title);
                                                    if (appCompatTextView != null) {
                                                        i = R.id.video;
                                                        ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.video);
                                                        if (imageView3 != null) {
                                                            i = R.id.video_view;
                                                            LinearLayout linearLayout6 = (LinearLayout) C6018eH2.a(view, R.id.video_view);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.vpHome;
                                                                ViewPager viewPager = (ViewPager) C6018eH2.a(view, R.id.vpHome);
                                                                if (viewPager != null) {
                                                                    return new C9165r6((LinearLayout) view, appCompatImageView, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, imageView2, linearLayout5, textView, textView2, textView3, appCompatTextView, imageView3, linearLayout6, viewPager);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C9165r6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C9165r6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_whats_app_status, viewGroup, false);
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
