package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class Z4 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final ImageView b;

    public Z4(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 ImageView imageView) {
        this.a = relativeLayout;
        this.b = imageView;
    }

    @InterfaceC5670cr1
    public static Z4 a(@InterfaceC5670cr1 View view) {
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.cancelbtn);
        if (imageView != null) {
            return new Z4((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.cancelbtn)));
    }

    @InterfaceC5670cr1
    public static Z4 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static Z4 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_coming_soon_screen, viewGroup, false);
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
