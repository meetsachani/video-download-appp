package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.uz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10109uz0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final TextView d;

    public C10109uz0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
    }

    @InterfaceC5670cr1
    public static C10109uz0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.decelerate;
        TextView textView = (TextView) C6018eH2.a(view, R.id.decelerate);
        if (textView != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.image);
            if (imageView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.title);
                if (textView2 != null) {
                    return new C10109uz0((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C10109uz0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C10109uz0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setupthree, viewGroup, false);
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
