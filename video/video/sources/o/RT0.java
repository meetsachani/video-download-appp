package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class RT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final ShapeableImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final TextView e;
    @InterfaceC5670cr1
    public final AppCompatTextView f;
    @InterfaceC5670cr1
    public final AppCompatTextView g;

    public RT0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 ShapeableImageView shapeableImageView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 AppCompatTextView appCompatTextView, @InterfaceC5670cr1 AppCompatTextView appCompatTextView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = shapeableImageView;
        this.d = imageView;
        this.e = textView;
        this.f = appCompatTextView;
        this.g = appCompatTextView2;
    }

    @InterfaceC5670cr1
    public static RT0 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.ivImages;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C6018eH2.a(view, R.id.ivImages);
        if (shapeableImageView != null) {
            i = R.id.ivMore;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ivMore);
            if (imageView != null) {
                i = R.id.tv_file_duration;
                TextView textView = (TextView) C6018eH2.a(view, R.id.tv_file_duration);
                if (textView != null) {
                    i = R.id.tvFolderName;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6018eH2.a(view, R.id.tvFolderName);
                    if (appCompatTextView != null) {
                        i = R.id.tvTotal;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6018eH2.a(view, R.id.tvTotal);
                        if (appCompatTextView2 != null) {
                            return new RT0(linearLayout, linearLayout, shapeableImageView, imageView, textView, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static RT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static RT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_video_list, viewGroup, false);
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
