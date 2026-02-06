package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class KT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final ConstraintLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final ConstraintLayout d;

    public KT0(@InterfaceC5670cr1 ConstraintLayout constraintLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = constraintLayout2;
    }

    @InterfaceC5670cr1
    public static KT0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.imgRadio;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.imgRadio);
        if (imageView != null) {
            i = R.id.qualityType;
            TextView textView = (TextView) C6018eH2.a(view, R.id.qualityType);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new KT0(constraintLayout, imageView, textView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static KT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static KT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_downloadable, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
