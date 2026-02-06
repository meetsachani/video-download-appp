package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.Zy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4971Zy0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final CardView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final ConstraintLayout e;
    @InterfaceC5670cr1
    public final LinearLayout f;
    @InterfaceC5670cr1
    public final TextView g;
    @InterfaceC5670cr1
    public final RecyclerView h;
    @InterfaceC5670cr1
    public final ImageView i;
    @InterfaceC5670cr1
    public final ProgressBar j;
    @InterfaceC5670cr1
    public final TextView k;
    @InterfaceC5670cr1
    public final TextView l;
    @InterfaceC5670cr1
    public final TextView m;
    @InterfaceC5670cr1
    public final TextView n;
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public final TextView f689o;

    public C4971Zy0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 CardView cardView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ConstraintLayout constraintLayout, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ProgressBar progressBar, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 TextView textView4, @InterfaceC5670cr1 TextView textView5, @InterfaceC5670cr1 TextView textView6, @InterfaceC5670cr1 TextView textView7) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = cardView;
        this.d = textView;
        this.e = constraintLayout;
        this.f = linearLayout3;
        this.g = textView2;
        this.h = recyclerView;
        this.i = imageView;
        this.j = progressBar;
        this.k = textView3;
        this.l = textView4;
        this.m = textView5;
        this.n = textView6;
        this.f689o = textView7;
    }

    @InterfaceC5670cr1
    public static C4971Zy0 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.cardviewThumbnail;
        CardView cardView = (CardView) C6018eH2.a(view, R.id.cardviewThumbnail);
        if (cardView != null) {
            i = R.id.closeBotomSheet;
            TextView textView = (TextView) C6018eH2.a(view, R.id.closeBotomSheet);
            if (textView != null) {
                i = R.id.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6018eH2.a(view, R.id.constraintLayout);
                if (constraintLayout != null) {
                    i = R.id.content_constrainlayout;
                    LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.content_constrainlayout);
                    if (linearLayout2 != null) {
                        i = R.id.downloadBtn;
                        TextView textView2 = (TextView) C6018eH2.a(view, R.id.downloadBtn);
                        if (textView2 != null) {
                            i = R.id.downloadable_recylerview;
                            RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.downloadable_recylerview);
                            if (recyclerView != null) {
                                i = R.id.imgthumbnailBottom;
                                ImageView imageView = (ImageView) C6018eH2.a(view, R.id.imgthumbnailBottom);
                                if (imageView != null) {
                                    i = R.id.pb_bottomsheet;
                                    ProgressBar progressBar = (ProgressBar) C6018eH2.a(view, R.id.pb_bottomsheet);
                                    if (progressBar != null) {
                                        i = R.id.pb_text;
                                        TextView textView3 = (TextView) C6018eH2.a(view, R.id.pb_text);
                                        if (textView3 != null) {
                                            i = R.id.textView;
                                            TextView textView4 = (TextView) C6018eH2.a(view, R.id.textView);
                                            if (textView4 != null) {
                                                i = R.id.textView2;
                                                TextView textView5 = (TextView) C6018eH2.a(view, R.id.textView2);
                                                if (textView5 != null) {
                                                    i = R.id.tvVideoResol;
                                                    TextView textView6 = (TextView) C6018eH2.a(view, R.id.tvVideoResol);
                                                    if (textView6 != null) {
                                                        i = R.id.tvduration;
                                                        TextView textView7 = (TextView) C6018eH2.a(view, R.id.tvduration);
                                                        if (textView7 != null) {
                                                            return new C4971Zy0(linearLayout, linearLayout, cardView, textView, constraintLayout, linearLayout2, textView2, recyclerView, imageView, progressBar, textView3, textView4, textView5, textView6, textView7);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C4971Zy0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C4971Zy0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bottom_sheet, viewGroup, false);
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
