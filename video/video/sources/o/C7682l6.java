package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.l6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7682l6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final RecyclerView d;
    @InterfaceC5670cr1
    public final ProgressBar e;

    public C7682l6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 ProgressBar progressBar) {
        this.a = linearLayout;
        this.b = textView;
        this.c = linearLayout2;
        this.d = recyclerView;
        this.e = progressBar;
    }

    @InterfaceC5670cr1
    public static C7682l6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btnCall;
        TextView textView = (TextView) C6018eH2.a(view, R.id.btnCall);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.matchlistGirl;
            RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.matchlistGirl);
            if (recyclerView != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.progress);
                if (progressBar != null) {
                    return new C7682l6(linearLayout, textView, linearLayout, recyclerView, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7682l6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7682l6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_home, viewGroup, false);
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
