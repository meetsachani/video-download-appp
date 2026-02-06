package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.List;

/* renamed from: o.f92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6229f92 extends RecyclerView.AbstractC0370h<a> {
    public List<Integer> d;
    public Context e;

    /* renamed from: o.f92$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.H {
        public ImageView I;

        public a(@InterfaceC5670cr1 View view) {
            super(view);
            this.I = (ImageView) view.findViewById(R.id.imageView);
        }
    }

    public C6229f92(Context context, List<Integer> list) {
        this.e = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: J */
    public void x(@InterfaceC5670cr1 a aVar, int i) {
        aVar.I.setImageResource(this.d.get(i).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: K */
    public a z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.e).inflate(R.layout.item_slider, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.size();
    }
}
