package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.m6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7925m6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ConstraintLayout d;
    @InterfaceC5670cr1
    public final RecyclerView e;
    @InterfaceC5670cr1
    public final TextView f;

    public C7925m6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ConstraintLayout constraintLayout, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = constraintLayout;
        this.e = recyclerView;
        this.f = textView;
    }

    @InterfaceC5670cr1
    public static C7925m6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.animation_view;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.animation_view);
        if (imageView != null) {
            i = R.id.back;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.back);
            if (imageView2 != null) {
                i = R.id.noData;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6018eH2.a(view, R.id.noData);
                if (constraintLayout != null) {
                    i = R.id.rvVideoList;
                    RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.rvVideoList);
                    if (recyclerView != null) {
                        i = R.id.tvTitle;
                        TextView textView = (TextView) C6018eH2.a(view, R.id.tvTitle);
                        if (textView != null) {
                            return new C7925m6((LinearLayout) view, imageView, imageView2, constraintLayout, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7925m6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7925m6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_list, viewGroup, false);
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
