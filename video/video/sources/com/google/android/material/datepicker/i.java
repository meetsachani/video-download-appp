package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import o.AbstractC10236vV;
import o.C3548Lk1;
import o.C6516gH2;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9015qV;

/* loaded from: classes3.dex */
public class i extends RecyclerView.AbstractC0370h<b> {
    @InterfaceC5670cr1
    public final com.google.android.material.datepicker.a d;
    public final InterfaceC9015qV<?> e;
    @InterfaceC11300zs1
    public final AbstractC10236vV f;
    public final f.m g;
    public final int h;

    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView X;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.X = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.X.getAdapter2().r(i)) {
                i.this.g.a(this.X.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.H {
        public final TextView I;
        public final MaterialCalendarGridView J;

        public b(@InterfaceC5670cr1 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C7025iN1.h.month_title);
            this.I = textView;
            C6516gH2.J1(textView, true);
            this.J = (MaterialCalendarGridView) linearLayout.findViewById(C7025iN1.h.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public i(@InterfaceC5670cr1 Context context, InterfaceC9015qV<?> interfaceC9015qV, @InterfaceC5670cr1 com.google.android.material.datepicker.a aVar, @InterfaceC11300zs1 AbstractC10236vV abstractC10236vV, f.m mVar) {
        int i;
        C3548Lk1 s = aVar.s();
        C3548Lk1 h = aVar.h();
        C3548Lk1 o2 = aVar.o();
        if (s.compareTo(o2) <= 0) {
            if (o2.compareTo(h) <= 0) {
                int Y2 = h.b1 * f.Y2(context);
                if (g.A3(context)) {
                    i = f.Y2(context);
                } else {
                    i = 0;
                }
                this.h = Y2 + i;
                this.d = aVar;
                this.e = interfaceC9015qV;
                this.f = abstractC10236vV;
                this.g = mVar;
                G(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @InterfaceC5670cr1
    public C3548Lk1 K(int i) {
        return this.d.s().u(i);
    }

    @InterfaceC5670cr1
    public CharSequence L(int i) {
        return K(i).s();
    }

    public int M(@InterfaceC5670cr1 C3548Lk1 c3548Lk1) {
        return this.d.s().v(c3548Lk1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: N */
    public void x(@InterfaceC5670cr1 b bVar, int i) {
        C3548Lk1 u = this.d.s().u(i);
        bVar.I.setText(u.s());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.J.findViewById(C7025iN1.h.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && u.equals(materialCalendarGridView.getAdapter2().X)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().q(materialCalendarGridView);
        } else {
            h hVar = new h(u, this.e, this.d, this.f);
            materialCalendarGridView.setNumColumns(u.Y0);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: O */
    public b z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C7025iN1.k.mtrl_calendar_month_labeled, viewGroup, false);
        if (g.A3(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.h));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public long h(int i) {
        return this.d.s().u(i).t();
    }
}
