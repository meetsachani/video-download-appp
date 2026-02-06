package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class JT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final TextView a;

    public JT0(@InterfaceC5670cr1 TextView textView) {
        this.a = textView;
    }

    @InterfaceC5670cr1
    public static JT0 a(@InterfaceC5670cr1 View view) {
        if (view != null) {
            return new JT0((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @InterfaceC5670cr1
    public static JT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static JT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_country, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public TextView getRoot() {
        return this.a;
    }
}
