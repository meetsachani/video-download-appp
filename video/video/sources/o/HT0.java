package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class HT0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final CardView a;
    @InterfaceC5670cr1
    public final ShapeableImageView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final CardView d;
    @InterfaceC5670cr1
    public final View e;

    public HT0(@InterfaceC5670cr1 CardView cardView, @InterfaceC5670cr1 ShapeableImageView shapeableImageView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 CardView cardView2, @InterfaceC5670cr1 View view) {
        this.a = cardView;
        this.b = shapeableImageView;
        this.c = textView;
        this.d = cardView2;
        this.e = view;
    }

    @InterfaceC5670cr1
    public static HT0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.categoryImg;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C6018eH2.a(view, R.id.categoryImg);
        if (shapeableImageView != null) {
            i = R.id.categoryname;
            TextView textView = (TextView) C6018eH2.a(view, R.id.categoryname);
            if (textView != null) {
                CardView cardView = (CardView) view;
                i = R.id.overlay;
                View a = C6018eH2.a(view, R.id.overlay);
                if (a != null) {
                    return new HT0(cardView, shapeableImageView, textView, cardView, a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static HT0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static HT0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_category_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public CardView getRoot() {
        return this.a;
    }
}
