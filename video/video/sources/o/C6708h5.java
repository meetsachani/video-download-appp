package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.h5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6708h5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final RelativeLayout b;
    @InterfaceC5670cr1
    public final PlayerView c;

    public C6708h5(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 RelativeLayout relativeLayout2, @InterfaceC5670cr1 PlayerView playerView) {
        this.a = relativeLayout;
        this.b = relativeLayout2;
        this.c = playerView;
    }

    @InterfaceC5670cr1
    public static C6708h5 a(@InterfaceC5670cr1 View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.playerView);
        if (playerView != null) {
            return new C6708h5(relativeLayout, relativeLayout, playerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.playerView)));
    }

    @InterfaceC5670cr1
    public static C6708h5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6708h5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_helper_full_screen, viewGroup, false);
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
