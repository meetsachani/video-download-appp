package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class E5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final Button b;
    @InterfaceC5670cr1
    public final LottieAnimationView c;
    @InterfaceC5670cr1
    public final RecyclerView d;
    @InterfaceC5670cr1
    public final LinearLayout e;

    public E5(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 Button button, @InterfaceC5670cr1 LottieAnimationView lottieAnimationView, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 LinearLayout linearLayout) {
        this.a = relativeLayout;
        this.b = button;
        this.c = lottieAnimationView;
        this.d = recyclerView;
        this.e = linearLayout;
    }

    @InterfaceC5670cr1
    public static E5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btnContinue;
        Button button = (Button) C6018eH2.a(view, R.id.btnContinue);
        if (button != null) {
            i = R.id.img_anim_loading;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6018eH2.a(view, R.id.img_anim_loading);
            if (lottieAnimationView != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.suggestion;
                    LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.suggestion);
                    if (linearLayout != null) {
                        return new E5((RelativeLayout) view, button, lottieAnimationView, recyclerView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static E5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static E5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_reel_main, viewGroup, false);
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
