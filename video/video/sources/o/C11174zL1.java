package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.zL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11174zL1 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final LinearLayout e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final TextView h;

    public C11174zL1(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = linearLayout2;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
    }

    @InterfaceC5670cr1
    public static C11174zL1 a(@InterfaceC5670cr1 View view) {
        int i = R.id.iv_native_logo_des;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.iv_native_logo_des);
        if (imageView != null) {
            i = R.id.iv_nats_round;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.iv_nats_round);
            if (imageView2 != null) {
                i = R.id.ln_playnow;
                TextView textView = (TextView) C6018eH2.a(view, R.id.ln_playnow);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tv_text_ad_desc;
                    TextView textView2 = (TextView) C6018eH2.a(view, R.id.tv_text_ad_desc);
                    if (textView2 != null) {
                        i = R.id.tv_text_ad_name;
                        TextView textView3 = (TextView) C6018eH2.a(view, R.id.tv_text_ad_name);
                        if (textView3 != null) {
                            i = R.id.txt_top_ads;
                            TextView textView4 = (TextView) C6018eH2.a(view, R.id.txt_top_ads);
                            if (textView4 != null) {
                                return new C11174zL1(linearLayout, imageView, imageView2, textView, linearLayout, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C11174zL1 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C11174zL1 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.quiz_ad_native, viewGroup, false);
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
