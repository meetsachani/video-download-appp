package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import com.hdhub.xdownload.anyvideo.bestdownloader.Utils.NonSwipeableViewPager;

/* renamed from: o.r5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9161r5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final RelativeLayout d;
    @InterfaceC5670cr1
    public final NonSwipeableViewPager e;

    public C9161r5(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 RelativeLayout relativeLayout2, @InterfaceC5670cr1 NonSwipeableViewPager nonSwipeableViewPager) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = relativeLayout2;
        this.e = nonSwipeableViewPager;
    }

    @InterfaceC5670cr1
    public static C9161r5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_home;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_home);
        if (imageView != null) {
            i = R.id.ic_player;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.ic_player);
            if (imageView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.viewPager;
                NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) C6018eH2.a(view, R.id.viewPager);
                if (nonSwipeableViewPager != null) {
                    return new C9161r5(relativeLayout, imageView, imageView2, relativeLayout, nonSwipeableViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C9161r5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C9161r5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
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
