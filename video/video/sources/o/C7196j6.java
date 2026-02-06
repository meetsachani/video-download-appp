package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.j6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7196j6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final CardView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final PlayerView f;
    @InterfaceC5670cr1
    public final PreviewView g;
    @InterfaceC5670cr1
    public final TextView h;

    public C7196j6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 CardView cardView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 PlayerView playerView, @InterfaceC5670cr1 PreviewView previewView, @InterfaceC5670cr1 TextView textView) {
        this.a = linearLayout;
        this.b = cardView;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = playerView;
        this.g = previewView;
        this.h = textView;
    }

    @InterfaceC5670cr1
    public static C7196j6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.cameras;
        CardView cardView = (CardView) C6018eH2.a(view, R.id.cameras);
        if (cardView != null) {
            i = R.id.endCall;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.endCall);
            if (imageView != null) {
                i = R.id.flip_camera;
                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.flip_camera);
                if (imageView2 != null) {
                    i = R.id.micBtn;
                    ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.micBtn);
                    if (imageView3 != null) {
                        i = R.id.playerView;
                        PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.playerView);
                        if (playerView != null) {
                            i = R.id.previewView;
                            PreviewView previewView = (PreviewView) C6018eH2.a(view, R.id.previewView);
                            if (previewView != null) {
                                i = R.id.tv_connecting;
                                TextView textView = (TextView) C6018eH2.a(view, R.id.tv_connecting);
                                if (textView != null) {
                                    return new C7196j6((LinearLayout) view, cardView, imageView, imageView2, imageView3, playerView, previewView, textView);
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
    public static C7196j6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7196j6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_datal, viewGroup, false);
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
