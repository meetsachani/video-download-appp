package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.Lz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3601Lz0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final RelativeLayout a;
    @InterfaceC5670cr1
    public final AppCompatButton b;
    @InterfaceC5670cr1
    public final ConstraintLayout c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final RecyclerView e;
    @InterfaceC5670cr1
    public final SwipeRefreshLayout f;
    @InterfaceC5670cr1
    public final AppCompatTextView g;

    public C3601Lz0(@InterfaceC5670cr1 RelativeLayout relativeLayout, @InterfaceC5670cr1 AppCompatButton appCompatButton, @InterfaceC5670cr1 ConstraintLayout constraintLayout, @InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 RecyclerView recyclerView, @InterfaceC5670cr1 SwipeRefreshLayout swipeRefreshLayout, @InterfaceC5670cr1 AppCompatTextView appCompatTextView) {
        this.a = relativeLayout;
        this.b = appCompatButton;
        this.c = constraintLayout;
        this.d = linearLayout;
        this.e = recyclerView;
        this.f = swipeRefreshLayout;
        this.g = appCompatTextView;
    }

    @InterfaceC5670cr1
    public static C3601Lz0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btnAllowAccess;
        AppCompatButton appCompatButton = (AppCompatButton) C6018eH2.a(view, R.id.btnAllowAccess);
        if (appCompatButton != null) {
            i = R.id.clPermission;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6018eH2.a(view, R.id.clPermission);
            if (constraintLayout != null) {
                i = R.id.no_data;
                LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.no_data);
                if (linearLayout != null) {
                    i = R.id.rv_fileList;
                    RecyclerView recyclerView = (RecyclerView) C6018eH2.a(view, R.id.rv_fileList);
                    if (recyclerView != null) {
                        i = R.id.swiperefresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6018eH2.a(view, R.id.swiperefresh);
                        if (swipeRefreshLayout != null) {
                            i = R.id.tvDesc;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6018eH2.a(view, R.id.tvDesc);
                            if (appCompatTextView != null) {
                                return new C3601Lz0((RelativeLayout) view, appCompatButton, constraintLayout, linearLayout, recyclerView, swipeRefreshLayout, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C3601Lz0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C3601Lz0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_whatsappimagefragment, viewGroup, false);
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
