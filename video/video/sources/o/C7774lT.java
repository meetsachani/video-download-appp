package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.lT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7774lT implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;

    public C7774lT(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = textView2;
    }

    @InterfaceC5670cr1
    public static C7774lT a(@InterfaceC5670cr1 View view) {
        int i = R.id.cancel;
        TextView textView = (TextView) C6018eH2.a(view, R.id.cancel);
        if (textView != null) {
            i = R.id.txt_done;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.txt_done);
            if (textView2 != null) {
                return new C7774lT((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7774lT c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7774lT d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_exit_dialog, viewGroup, false);
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
