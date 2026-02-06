package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class FF2 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final CardView f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final TextView h;

    public FF2(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 CardView cardView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = cardView;
        this.g = textView2;
        this.h = textView3;
    }

    @InterfaceC5670cr1
    public static FF2 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_file_title;
        TextView textView = (TextView) C6018eH2.a(view, R.id.ic_file_title);
        if (textView != null) {
            i = R.id.ic_play;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_play);
            if (imageView != null) {
                i = R.id.ic_vert_menu;
                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.ic_vert_menu);
                if (imageView2 != null) {
                    i = R.id.imgThumbnail;
                    ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.imgThumbnail);
                    if (imageView3 != null) {
                        i = R.id.thumbnail_card;
                        CardView cardView = (CardView) C6018eH2.a(view, R.id.thumbnail_card);
                        if (cardView != null) {
                            i = R.id.tv_file_duration;
                            TextView textView2 = (TextView) C6018eH2.a(view, R.id.tv_file_duration);
                            if (textView2 != null) {
                                i = R.id.tv_file_size;
                                TextView textView3 = (TextView) C6018eH2.a(view, R.id.tv_file_size);
                                if (textView3 != null) {
                                    return new FF2((LinearLayout) view, textView, imageView, imageView2, imageView3, cardView, textView2, textView3);
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
    public static FF2 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static FF2 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.video_downloader_adapter, viewGroup, false);
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
