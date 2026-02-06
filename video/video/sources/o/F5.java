package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class F5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final LottieAnimationView c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final TextView e;

    public F5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 LottieAnimationView lottieAnimationView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = lottieAnimationView;
        this.d = linearLayout2;
        this.e = textView2;
    }

    @InterfaceC5670cr1
    public static F5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.continueBtn;
        TextView textView = (TextView) C6018eH2.a(view, R.id.continueBtn);
        if (textView != null) {
            i = R.id.img_anim_loading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6018eH2.a(view, R.id.img_anim_loading);
            if (lottieAnimationView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.tvExitApp;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.tvExitApp);
                if (textView2 != null) {
                    return new F5(linearLayout, textView, lottieAnimationView, linearLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static F5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static F5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_remains_features, viewGroup, false);
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
