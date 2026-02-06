package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.g6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6469g6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final ImageView f;

    public C6469g6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = imageView;
        this.e = imageView2;
        this.f = imageView3;
    }

    @InterfaceC5670cr1
    public static C6469g6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_start_now;
        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.ic_start_now);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i = R.id.privacy_policy;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.privacy_policy);
            if (imageView != null) {
                i = R.id.rate_us;
                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.rate_us);
                if (imageView2 != null) {
                    i = R.id.share_app;
                    ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.share_app);
                    if (imageView3 != null) {
                        return new C6469g6(linearLayout2, linearLayout, linearLayout2, imageView, imageView2, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C6469g6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6469g6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_start, viewGroup, false);
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
