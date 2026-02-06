package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: o.aG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5044aG2 extends RecyclerView.AbstractC0370h<b> {
    public Context d;
    public LT0 e;
    public final ArrayList<ZF2> f;
    public InterfaceC9365rv1 g;

    /* renamed from: o.aG2$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int X;

        public a(int i) {
            this.X = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5044aG2 c5044aG2 = C5044aG2.this;
            c5044aG2.g.a(((ZF2) c5044aG2.f.get(this.X)).f(), ((ZF2) C5044aG2.this.f.get(this.X)).d());
        }
    }

    /* renamed from: o.aG2$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.H {
        public b(LT0 lt0) {
            super(lt0.getRoot());
            K(false);
        }
    }

    public C5044aG2(Context context, ArrayList<ZF2> arrayList, InterfaceC9365rv1 interfaceC9365rv1) {
        this.d = context;
        this.f = arrayList;
        this.g = interfaceC9365rv1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: K */
    public void x(@InterfaceC5670cr1 b bVar, int i) {
        this.e.d.setText(this.f.get(i).d());
        AppCompatTextView appCompatTextView = this.e.e;
        appCompatTextView.setText(C9811tl1.c + this.f.get(i).e() + C9811tl1.d);
        this.e.b.setOnClickListener(new a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: L */
    public b z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        this.e = LT0.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new b(this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int i(int i) {
        return i;
    }
}
