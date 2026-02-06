package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.g5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6465g5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final ImageView f;
    @InterfaceC5670cr1
    public final ImageView g;
    @InterfaceC5670cr1
    public final ShapeableImageView h;
    @InterfaceC5670cr1
    public final ShapeableImageView i;
    @InterfaceC5670cr1
    public final ShapeableImageView j;
    @InterfaceC5670cr1
    public final VideoView k;

    public C6465g5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 LinearLayout linearLayout4, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 ShapeableImageView shapeableImageView, @InterfaceC5670cr1 ShapeableImageView shapeableImageView2, @InterfaceC5670cr1 ShapeableImageView shapeableImageView3, @InterfaceC5670cr1 VideoView videoView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = linearLayout4;
        this.e = imageView;
        this.f = imageView2;
        this.g = imageView3;
        this.h = shapeableImageView;
        this.i = shapeableImageView2;
        this.j = shapeableImageView3;
        this.k = videoView;
    }

    @InterfaceC5670cr1
    public static C6465g5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.clDetele;
        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.clDetele);
        if (linearLayout != null) {
            i = R.id.clSave;
            LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.clSave);
            if (linearLayout2 != null) {
                i = R.id.clShare;
                LinearLayout linearLayout3 = (LinearLayout) C6018eH2.a(view, R.id.clShare);
                if (linearLayout3 != null) {
                    i = R.id.ic_play;
                    ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_play);
                    if (imageView != null) {
                        i = R.id.image;
                        ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.image);
                        if (imageView2 != null) {
                            i = R.id.iv_back;
                            ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.iv_back);
                            if (imageView3 != null) {
                                i = R.id.ivDetele;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) C6018eH2.a(view, R.id.ivDetele);
                                if (shapeableImageView != null) {
                                    i = R.id.ivSave;
                                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) C6018eH2.a(view, R.id.ivSave);
                                    if (shapeableImageView2 != null) {
                                        i = R.id.ivShare;
                                        ShapeableImageView shapeableImageView3 = (ShapeableImageView) C6018eH2.a(view, R.id.ivShare);
                                        if (shapeableImageView3 != null) {
                                            i = R.id.videoView;
                                            VideoView videoView = (VideoView) C6018eH2.a(view, R.id.videoView);
                                            if (videoView != null) {
                                                return new C6465g5((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, imageView, imageView2, imageView3, shapeableImageView, shapeableImageView2, shapeableImageView3, videoView);
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
    public static C6465g5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6465g5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_full_image_screen, viewGroup, false);
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
