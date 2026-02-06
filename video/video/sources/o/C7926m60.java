package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.List;

/* renamed from: o.m60  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7926m60 extends RecyclerView.AbstractC0370h<c> {
    public int d = 0;
    public b e;
    public final Context f;
    public final List<AS2> g;

    /* renamed from: o.m60$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int X;
        public final /* synthetic */ AS2 Y;

        public a(int i, AS2 as2) {
            this.X = i;
            this.Y = as2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7926m60 c7926m60 = C7926m60.this;
            c7926m60.d = this.X;
            c7926m60.e.a(this.Y);
            C7926m60.this.m();
        }
    }

    /* renamed from: o.m60$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(AS2 as2);
    }

    /* renamed from: o.m60$c */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.H {
        public ImageView I;
        public ConstraintLayout J;
        public TextView K;

        public c(View view) {
            super(view);
            this.K = (TextView) view.findViewById(R.id.qualityType);
            this.I = (ImageView) view.findViewById(R.id.imgRadio);
            this.J = (ConstraintLayout) view.findViewById(R.id.root_downloadable);
        }
    }

    public C7926m60(Context context, List<AS2> list, b bVar) {
        this.f = context;
        this.g = list;
        this.e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: J */
    public void x(c cVar, int i) {
        AS2 as2 = this.g.get(i);
        cVar.K.setText(as2.a());
        if (i == this.d) {
            this.e.a(as2);
            L(cVar);
        } else {
            M(cVar);
        }
        cVar.a.setOnClickListener(new a(i, as2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: K */
    public c z(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.f).inflate(R.layout.item_downloadable, viewGroup, false));
    }

    public void L(c cVar) {
        cVar.I.setImageResource(R.drawable.ic_check_n);
        cVar.J.setBackgroundResource(R.drawable.card_bg_select);
    }

    public void M(c cVar) {
        cVar.I.setImageResource(R.drawable.ic_uncheck_n);
        cVar.J.setBackgroundResource(R.drawable.card_bg);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.g.size();
    }
}
