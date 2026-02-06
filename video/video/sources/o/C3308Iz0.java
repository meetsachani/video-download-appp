package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.Iz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3308Iz0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final FrameLayout a;
    @InterfaceC5670cr1
    public final ProgressBar b;
    @InterfaceC5670cr1
    public final RecyclerView c;

    public C3308Iz0(@InterfaceC5670cr1 FrameLayout frameLayout, @InterfaceC5670cr1 ProgressBar progressBar, @InterfaceC5670cr1 RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = progressBar;
        this.c = recyclerView;
    }

    @InterfaceC5670cr1
    public static C3308Iz0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.progressBar);
        if (progressBar != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.recyclerView);
            if (recyclerView != null) {
                return new C3308Iz0((FrameLayout) view, progressBar, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C3308Iz0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C3308Iz0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_videos, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.a;
    }
}
