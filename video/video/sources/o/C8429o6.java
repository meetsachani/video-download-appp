package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.o6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8429o6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final RelativeLayout d;
    @InterfaceC5670cr1
    public final PlayerView e;
    @InterfaceC5670cr1
    public final RecyclerView f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final FrameLayout h;

    public C8429o6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 PlayerView playerView, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = relativeLayout;
        this.e = playerView;
        this.f = recyclerView;
        this.g = textView2;
        this.h = frameLayout;
    }

    @InterfaceC5670cr1
    public static C8429o6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.back);
        if (imageView != null) {
            i = R.id.fullscreenBtn;
            TextView textView = (TextView) C6018eH2.a(view, R.id.fullscreenBtn);
            if (textView != null) {
                i = R.id.header;
                RelativeLayout relativeLayout = (RelativeLayout) C6018eH2.a(view, R.id.header);
                if (relativeLayout != null) {
                    i = R.id.playerView;
                    PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.playerView);
                    if (playerView != null) {
                        i = R.id.recyHdVideoList;
                        RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.recyHdVideoList);
                        if (recyclerView != null) {
                            i = R.id.topTV;
                            TextView textView2 = (TextView) C6018eH2.a(view, R.id.topTV);
                            if (textView2 != null) {
                                i = R.id.videoContainer;
                                FrameLayout frameLayout = (FrameLayout) C6018eH2.a(view, R.id.videoContainer);
                                if (frameLayout != null) {
                                    return new C8429o6((LinearLayout) view, imageView, textView, relativeLayout, playerView, recyclerView, textView2, frameLayout);
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
    public static C8429o6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8429o6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_view, viewGroup, false);
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
