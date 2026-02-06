package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.kG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7482kG2 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final CardView a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final TextView d;

    public C7482kG2(@InterfaceC5670cr1 CardView cardView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 TextView textView) {
        this.a = cardView;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
    }

    @InterfaceC5670cr1
    public static C7482kG2 a(@InterfaceC5670cr1 View view) {
        int i = R.id.play_button;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.play_button);
        if (imageView != null) {
            i = R.id.thumbnail;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.thumbnail);
            if (imageView2 != null) {
                i = R.id.title;
                TextView textView = (TextView) C6018eH2.a(view, R.id.title);
                if (textView != null) {
                    return new C7482kG2((CardView) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7482kG2 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7482kG2 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.video_item, viewGroup, false);
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
