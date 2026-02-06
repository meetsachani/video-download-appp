package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.i6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6955i6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final LinearLayout c;

    public C6955i6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = linearLayout2;
    }

    @InterfaceC5670cr1
    public static C6955i6 a(@InterfaceC5670cr1 View view) {
        TextView textView = (TextView) C6018eH2.a(view, R.id.iv_next);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C6955i6(linearLayout, textView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_next)));
    }

    @InterfaceC5670cr1
    public static C6955i6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6955i6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_two, viewGroup, false);
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
