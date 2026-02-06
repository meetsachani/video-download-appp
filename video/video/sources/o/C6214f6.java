package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.f6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6214f6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final LottieAnimationView b;
    @InterfaceC5670cr1
    public final RelativeLayout c;
    @InterfaceC5670cr1
    public final TextView d;

    public C6214f6(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 LottieAnimationView lottieAnimationView, @InterfaceC5670cr1 RelativeLayout relativeLayout2, @InterfaceC5670cr1 TextView textView) {
        this.a = relativeLayout;
        this.b = lottieAnimationView;
        this.c = relativeLayout2;
        this.d = textView;
    }

    @InterfaceC5670cr1
    public static C6214f6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.img_anim_loading;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6018eH2.a(view, R.id.img_anim_loading);
        if (lottieAnimationView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) C6018eH2.a(view, R.id.tvContainAds);
            if (textView != null) {
                return new C6214f6(relativeLayout, lottieAnimationView, relativeLayout, textView);
            }
            i = R.id.tvContainAds;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C6214f6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6214f6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
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
