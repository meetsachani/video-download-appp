package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.nT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8278nT implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final LinearLayout e;
    @InterfaceC5670cr1
    public final ImageView f;

    public C8278nT(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 ImageView imageView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = linearLayout2;
        this.f = imageView2;
    }

    @InterfaceC5670cr1
    public static C8278nT a(@InterfaceC5670cr1 View view) {
        int i = R.id.app_name;
        TextView textView = (TextView) C6018eH2.a(view, R.id.app_name);
        if (textView != null) {
            i = R.id.banner;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.banner);
            if (imageView != null) {
                i = R.id.description;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.description);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.icon;
                    ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.icon);
                    if (imageView2 != null) {
                        return new C8278nT(linearLayout, textView, imageView, textView2, linearLayout, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C8278nT c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8278nT d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_notification, viewGroup, false);
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
