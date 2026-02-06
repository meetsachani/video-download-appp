package o;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.HD1;
import o.InterfaceC3921Pg0;

/* loaded from: classes3.dex */
public class QP1 extends RecyclerView.AbstractC0370h<a> {
    public Activity d;
    public ArrayList<String> e;
    public RecyclerView f;
    public a g = null;

    /* loaded from: classes3.dex */
    public class a extends RecyclerView.H {
        public PlayerView I;
        public ProgressBar J;
        public InterfaceC3921Pg0 K;
        public String L;
        public LinearLayout M;
        public LinearLayout N;

        /* renamed from: o.QP1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0223a implements HD1.g {
            public C0223a() {
            }

            @Override // o.HD1.g
            public void Z() {
                a.this.J.setVisibility(8);
            }
        }

        public a(View view) {
            super(view);
            this.I = (PlayerView) view.findViewById(R.id.playerView);
            this.J = (ProgressBar) view.findViewById(R.id.progressBar);
            this.M = (LinearLayout) view.findViewById(R.id.llline_full);
            this.N = (LinearLayout) view.findViewById(R.id.llnative_full);
        }

        public void R(String str) {
            this.L = str;
        }

        public void S() {
            InterfaceC3921Pg0 interfaceC3921Pg0 = this.K;
            if (interfaceC3921Pg0 != null) {
                interfaceC3921Pg0.g();
                this.K = null;
            }
        }

        public void T() {
            this.J.setVisibility(0);
            InterfaceC3921Pg0 w = new InterfaceC3921Pg0.c(QP1.this.d).w();
            this.K = w;
            this.I.setPlayer(w);
            String replace = this.L.replace(C4500Ve2.b, "%20");
            this.L = replace;
            try {
                this.L = replace.replace(C9811tl1.c, "%28").replace(C9811tl1.d, "%29");
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.K.g0(C8322nf1.f(this.L));
            this.K.m0();
            this.K.t0();
            this.K.l1(new C0223a());
            this.K.u0(1);
        }
    }

    public QP1(Activity activity, ArrayList<String> arrayList, RecyclerView recyclerView) {
        this.d = activity;
        this.e = arrayList;
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: J */
    public void x(@InterfaceC5670cr1 a aVar, int i) {
        aVar.R(this.e.get(i));
        C11284zo1.c(this.d, aVar.N, aVar.M, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: K */
    public a z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.d).inflate(R.layout.item_reels_view, viewGroup, false));
    }

    public void L(int i) {
        RecyclerView.H k0 = this.f.k0(i);
        if (k0 instanceof a) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.S();
            }
            a aVar2 = (a) k0;
            this.g = aVar2;
            aVar2.T();
        }
    }

    public void M() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.S();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.e.size();
    }
}
