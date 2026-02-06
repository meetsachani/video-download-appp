package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.d6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5729d6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final LinearLayout e;

    public C5729d6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = linearLayout2;
    }

    @InterfaceC5670cr1
    public static C5729d6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_privacy_policy;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_privacy_policy);
        if (imageView != null) {
            i = R.id.ic_rate_us;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.ic_rate_us);
            if (imageView2 != null) {
                i = R.id.ic_share_app;
                ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.ic_share_app);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new C5729d6(linearLayout, imageView, imageView2, imageView3, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C5729d6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C5729d6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
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
