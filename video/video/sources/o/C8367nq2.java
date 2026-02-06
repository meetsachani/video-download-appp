package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.nq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8367nq2 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final TextView c;

    public C8367nq2(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = textView;
    }

    @InterfaceC5670cr1
    public static C8367nq2 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btn_back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.btn_back);
        if (imageView != null) {
            i = R.id.headertxt;
            TextView textView = (TextView) C6018eH2.a(view, R.id.headertxt);
            if (textView != null) {
                return new C8367nq2((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C8367nq2 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8367nq2 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar2, viewGroup, false);
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
