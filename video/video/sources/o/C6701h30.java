package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.h30  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6701h30 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;

    public C6701h30(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @InterfaceC5670cr1
    public static C6701h30 a(@InterfaceC5670cr1 View view) {
        int i = R.id.txt_cancel;
        TextView textView = (TextView) C6018eH2.a(view, R.id.txt_cancel);
        if (textView != null) {
            i = R.id.txt_msg;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.txt_msg);
            if (textView2 != null) {
                i = R.id.txt_ok;
                TextView textView3 = (TextView) C6018eH2.a(view, R.id.txt_ok);
                if (textView3 != null) {
                    return new C6701h30((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C6701h30 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6701h30 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_maintance, viewGroup, false);
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
