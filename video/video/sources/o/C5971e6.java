package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.e6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5971e6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final AppBarLayout b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final ShapeableImageView f;
    @InterfaceC5670cr1
    public final ShapeableImageView g;
    @InterfaceC5670cr1
    public final ShapeableImageView h;
    @InterfaceC5670cr1
    public final MaterialToolbar i;
    @InterfaceC5670cr1
    public final LinearLayout j;
    @InterfaceC5670cr1
    public final LinearLayout k;
    @InterfaceC5670cr1
    public final PlayerView l;

    public C5971e6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ShapeableImageView shapeableImageView, @InterfaceC5670cr1 ShapeableImageView shapeableImageView2, @InterfaceC5670cr1 ShapeableImageView shapeableImageView3, @InterfaceC5670cr1 MaterialToolbar materialToolbar, @InterfaceC5670cr1 LinearLayout linearLayout4, @InterfaceC5670cr1 LinearLayout linearLayout5, @InterfaceC5670cr1 PlayerView playerView) {
        this.a = linearLayout;
        this.b = appBarLayout;
        this.c = linearLayout2;
        this.d = linearLayout3;
        this.e = imageView;
        this.f = shapeableImageView;
        this.g = shapeableImageView2;
        this.h = shapeableImageView3;
        this.i = materialToolbar;
        this.j = linearLayout4;
        this.k = linearLayout5;
        this.l = playerView;
    }

    @InterfaceC5670cr1
    public static C5971e6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C6018eH2.a(view, R.id.appbar);
        if (appBarLayout != null) {
            i = R.id.delt_btn;
            LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.delt_btn);
            if (linearLayout != null) {
                i = R.id.functional_layout;
                LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.functional_layout);
                if (linearLayout2 != null) {
                    i = R.id.image_show;
                    ImageView imageView = (ImageView) C6018eH2.a(view, R.id.image_show);
                    if (imageView != null) {
                        i = R.id.ivDetele;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) C6018eH2.a(view, R.id.ivDetele);
                        if (shapeableImageView != null) {
                            i = R.id.ivSave;
                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) C6018eH2.a(view, R.id.ivSave);
                            if (shapeableImageView2 != null) {
                                i = R.id.ivShare;
                                ShapeableImageView shapeableImageView3 = (ShapeableImageView) C6018eH2.a(view, R.id.ivShare);
                                if (shapeableImageView3 != null) {
                                    i = R.id.preview_bar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) C6018eH2.a(view, R.id.preview_bar);
                                    if (materialToolbar != null) {
                                        i = R.id.save_btn;
                                        LinearLayout linearLayout3 = (LinearLayout) C6018eH2.a(view, R.id.save_btn);
                                        if (linearLayout3 != null) {
                                            i = R.id.share_btn;
                                            LinearLayout linearLayout4 = (LinearLayout) C6018eH2.a(view, R.id.share_btn);
                                            if (linearLayout4 != null) {
                                                i = R.id.videoView;
                                                PlayerView playerView = (PlayerView) C6018eH2.a(view, R.id.videoView);
                                                if (playerView != null) {
                                                    return new C5971e6((LinearLayout) view, appBarLayout, linearLayout, linearLayout2, imageView, shapeableImageView, shapeableImageView2, shapeableImageView3, materialToolbar, linearLayout3, linearLayout4, playerView);
                                                }
                                            }
                                        }
                                    }
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
    public static C5971e6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C5971e6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_show_item, viewGroup, false);
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
