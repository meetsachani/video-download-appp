package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.k6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7439k6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final LinearLayout c;
    @InterfaceC5670cr1
    public final RecyclerView d;
    @InterfaceC5670cr1
    public final TextView e;

    public C7439k6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = linearLayout2;
        this.d = recyclerView;
        this.e = textView;
    }

    @InterfaceC5670cr1
    public static C7439k6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.back);
        if (imageView != null) {
            i = R.id.liner_no_data;
            LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.liner_no_data);
            if (linearLayout != null) {
                i = R.id.rvVideoList;
                RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.rvVideoList);
                if (recyclerView != null) {
                    i = R.id.tvResp;
                    TextView textView = (TextView) C6018eH2.a(view, R.id.tvResp);
                    if (textView != null) {
                        return new C7439k6((LinearLayout) view, imageView, linearLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7439k6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7439k6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_folder, viewGroup, false);
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
