package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class TT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final AppCompatImageView b;
    @InterfaceC5670cr1
    public final AppCompatImageView c;
    @InterfaceC5670cr1
    public final ShapeableImageView d;
    @InterfaceC5670cr1
    public final AppCompatImageView e;
    @InterfaceC5670cr1
    public final AppCompatImageView f;
    @InterfaceC5670cr1
    public final ImageView g;

    public TT0(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 AppCompatImageView appCompatImageView, @InterfaceC5670cr1 AppCompatImageView appCompatImageView2, @InterfaceC5670cr1 ShapeableImageView shapeableImageView, @InterfaceC5670cr1 AppCompatImageView appCompatImageView3, @InterfaceC5670cr1 AppCompatImageView appCompatImageView4, @InterfaceC5670cr1 ImageView imageView) {
        this.a = relativeLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = shapeableImageView;
        this.e = appCompatImageView3;
        this.f = appCompatImageView4;
        this.g = imageView;
    }

    @InterfaceC5670cr1
    public static TT0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ivDetele;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6018eH2.a(view, R.id.ivDetele);
        if (appCompatImageView != null) {
            i = R.id.ivDownload;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6018eH2.a(view, R.id.ivDownload);
            if (appCompatImageView2 != null) {
                i = R.id.ivImage;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C6018eH2.a(view, R.id.ivImage);
                if (shapeableImageView != null) {
                    i = R.id.ivRepost;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6018eH2.a(view, R.id.ivRepost);
                    if (appCompatImageView3 != null) {
                        i = R.id.ivShare;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) C6018eH2.a(view, R.id.ivShare);
                        if (appCompatImageView4 != null) {
                            i = R.id.ivStatusType;
                            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ivStatusType);
                            if (imageView != null) {
                                return new TT0((RelativeLayout) view, appCompatImageView, appCompatImageView2, shapeableImageView, appCompatImageView3, appCompatImageView4, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static TT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static TT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.items_whatsapp_view, viewGroup, false);
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
