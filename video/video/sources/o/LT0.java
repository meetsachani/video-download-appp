package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class LT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final AppCompatTextView d;
    @InterfaceC5670cr1
    public final AppCompatTextView e;

    public LT0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 AppCompatTextView appCompatTextView, @InterfaceC5670cr1 AppCompatTextView appCompatTextView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = imageView;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
    }

    @InterfaceC5670cr1
    public static LT0 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.ivImages;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ivImages);
        if (imageView != null) {
            i = R.id.tvFolderName;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6018eH2.a(view, R.id.tvFolderName);
            if (appCompatTextView != null) {
                i = R.id.tvTotal;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6018eH2.a(view, R.id.tvTotal);
                if (appCompatTextView2 != null) {
                    return new LT0(linearLayout, linearLayout, imageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static LT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static LT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_list_video_folder, viewGroup, false);
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
