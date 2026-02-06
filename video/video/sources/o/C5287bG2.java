package o;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import java.util.List;
import o.C8284nU1;

/* renamed from: o.bG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5287bG2 extends Fragment {
    public static final String p2 = "https://api.dailymotion.com/";
    public static final String q2 = "channel";
    public RecyclerView h2;
    public C6751hF2 i2;
    public String k2;
    public ProgressBar o2;
    public final List<C6253fF2> j2 = new ArrayList();
    public int l2 = 1;
    public boolean m2 = false;
    public boolean n2 = false;

    /* renamed from: o.bG2$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.u {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(@InterfaceC5670cr1 RecyclerView recyclerView, int i, int i2) {
            super.b(recyclerView, i, i2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null && !C5287bG2.this.m2 && !C5287bG2.this.n2) {
                int V = linearLayoutManager.V();
                int f = linearLayoutManager.f();
                int B2 = linearLayoutManager.B2();
                if (V + B2 >= f && B2 >= 0) {
                    C5287bG2 c5287bG2 = C5287bG2.this;
                    c5287bG2.R2(c5287bG2.k2);
                }
            }
        }
    }

    /* renamed from: o.bG2$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3386Jt<C5340bU> {
        public b() {
        }

        @Override // o.InterfaceC3386Jt
        public void a(InterfaceC11302zt<C5340bU> interfaceC11302zt, Throwable th) {
            C5287bG2.this.m2 = false;
            C5287bG2.this.o2.setVisibility(8);
            Log.e("VideoFragment", "API call failed", th);
        }

        @Override // o.InterfaceC3386Jt
        public void b(InterfaceC11302zt<C5340bU> interfaceC11302zt, FT1<C5340bU> ft1) {
            C5287bG2.this.m2 = false;
            C5287bG2.this.o2.setVisibility(8);
            if (ft1.g() && ft1.a() != null) {
                List<C6253fF2> a = ft1.a().a();
                if (a.isEmpty()) {
                    C5287bG2.this.n2 = true;
                    return;
                }
                C5287bG2.this.j2.addAll(a);
                C5287bG2.this.i2.m();
                C5287bG2.this.l2++;
                return;
            }
            Log.e("VideoFragment", "Response empty or failed: " + ft1.h());
        }
    }

    public static C5287bG2 S2(String str) {
        C5287bG2 c5287bG2 = new C5287bG2();
        Bundle bundle = new Bundle();
        bundle.putString(q2, str);
        c5287bG2.f2(bundle);
        return c5287bG2;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC11300zs1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_videos, viewGroup, false);
    }

    public final void R2(String str) {
        if (!this.m2 && !this.n2) {
            this.m2 = true;
            if (this.l2 == 1) {
                this.o2.setVisibility(0);
            }
            ((InterfaceC5097aU) new C8284nU1.b().c(p2).b(C6251fF0.f()).f().g(InterfaceC5097aU.class)).a(str, 10, "id,title,thumbnail_720_url,url,duration", this.l2).g3(new b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 Bundle bundle) {
        this.h2 = (RecyclerView) view.findViewById(R.id.recyclerView);
        this.o2 = (ProgressBar) view.findViewById(R.id.progressBar);
        this.h2.setLayoutManager(new LinearLayoutManager(v()));
        C6751hF2 c6751hF2 = new C6751hF2(o(), this.j2);
        this.i2 = c6751hF2;
        this.h2.setAdapter(c6751hF2);
        this.h2.r(new a());
        if (s() != null) {
            String string = s().getString(q2);
            this.k2 = string;
            R2(string);
        }
    }
}
