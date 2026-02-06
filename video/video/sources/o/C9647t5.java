package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.t5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9647t5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final RelativeLayout b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final ProgressBar e;
    @InterfaceC5670cr1
    public final RecyclerView f;

    public C9647t5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 ProgressBar progressBar, @InterfaceC5670cr1 RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = relativeLayout;
        this.c = imageView;
        this.d = linearLayout2;
        this.e = progressBar;
        this.f = recyclerView;
    }

    @InterfaceC5670cr1
    public static C9647t5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.actionBarconst;
        RelativeLayout relativeLayout = (RelativeLayout) C6018eH2.a(view, R.id.actionBarconst);
        if (relativeLayout != null) {
            i = R.id.ivBack;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ivBack);
            if (imageView != null) {
                i = R.id.no_data;
                LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.no_data);
                if (linearLayout != null) {
                    i = R.id.pb_downloads;
                    ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.pb_downloads);
                    if (progressBar != null) {
                        i = R.id.rv_progress;
                        RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.rv_progress);
                        if (recyclerView != null) {
                            return new C9647t5((LinearLayout) view, relativeLayout, imageView, linearLayout, progressBar, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C9647t5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C9647t5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_my_downloads, viewGroup, false);
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
