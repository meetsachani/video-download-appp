package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.wz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10598wz0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final RecyclerView c;
    @InterfaceC5670cr1
    public final SwipeRefreshLayout d;

    public C10598wz0(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 SwipeRefreshLayout swipeRefreshLayout) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = recyclerView;
        this.d = swipeRefreshLayout;
    }

    @InterfaceC5670cr1
    public static C10598wz0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.no_data;
        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.no_data);
        if (linearLayout != null) {
            i = R.id.rv_fileList;
            RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.rv_fileList);
            if (recyclerView != null) {
                i = R.id.swiperefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6018eH2.a(view, R.id.swiperefresh);
                if (swipeRefreshLayout != null) {
                    return new C10598wz0((RelativeLayout) view, linearLayout, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C10598wz0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C10598wz0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_status_saved, viewGroup, false);
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
