package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class Y4 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final ProgressBar c;
    @InterfaceC5670cr1
    public final RecyclerView d;

    public Y4(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 ProgressBar progressBar, @InterfaceC5670cr1 RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = progressBar;
        this.d = recyclerView;
    }

    @InterfaceC5670cr1
    public static Y4 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.progress);
        if (progressBar != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.recyclerView);
            if (recyclerView != null) {
                return new Y4(linearLayout, linearLayout, progressBar, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static Y4 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static Y4 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_category_list, viewGroup, false);
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
