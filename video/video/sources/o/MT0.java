package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class MT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final PlayerView b;
    @InterfaceC5670cr1
    public final ProgressBar c;

    public MT0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 PlayerView playerView, @InterfaceC5670cr1 ProgressBar progressBar) {
        this.a = linearLayout;
        this.b = playerView;
        this.c = progressBar;
    }

    @InterfaceC5670cr1
    public static MT0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.playerView;
        PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.playerView);
        if (playerView != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.progressBar);
            if (progressBar != null) {
                return new MT0((LinearLayout) view, playerView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static MT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static MT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_reels_view, viewGroup, false);
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
