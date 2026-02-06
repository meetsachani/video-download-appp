package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.i5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6951i5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final TextView e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final LinearLayout g;
    @InterfaceC5670cr1
    public final PlayerView h;
    @InterfaceC5670cr1
    public final LinearLayout i;

    public C6951i5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 TextView textView5, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 PlayerView playerView, @InterfaceC5670cr1 LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = linearLayout2;
        this.h = playerView;
        this.i = linearLayout3;
    }

    @InterfaceC5670cr1
    public static C6951i5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btn1;
        TextView textView = (TextView) C6018eH2.a(view, R.id.btn1);
        if (textView != null) {
            i = R.id.btn2;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.btn2);
            if (textView2 != null) {
                i = R.id.btn3;
                TextView textView3 = (TextView) C6018eH2.a(view, R.id.btn3);
                if (textView3 != null) {
                    i = R.id.btn4;
                    TextView textView4 = (TextView) C6018eH2.a(view, R.id.btn4);
                    if (textView4 != null) {
                        i = R.id.btn5;
                        TextView textView5 = (TextView) C6018eH2.a(view, R.id.btn5);
                        if (textView5 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = R.id.playerView;
                            PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.playerView);
                            if (playerView != null) {
                                i = R.id.transbg;
                                LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.transbg);
                                if (linearLayout2 != null) {
                                    return new C6951i5(linearLayout, textView, textView2, textView3, textView4, textView5, linearLayout, playerView, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C6951i5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6951i5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
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
