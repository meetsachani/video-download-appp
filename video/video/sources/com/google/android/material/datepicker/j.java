package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import java.util.Calendar;
import java.util.Locale;
import o.C10330vt;
import o.C10816xt;
import o.C11143zD2;
import o.C3548Lk1;
import o.C3858Oo2;
import o.C7025iN1;
import o.C9507sV;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class j extends RecyclerView.AbstractC0370h<b> {
    public final f<?> d;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int X;

        public a(int i) {
            this.X = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.d.f3(j.this.d.V2().f(C3548Lk1.g(this.X, j.this.d.X2().Y)));
            j.this.d.g3(f.l.DAY);
            j.this.d.e3();
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.H {
        public final TextView I;

        public b(TextView textView) {
            super(textView);
            this.I = textView;
        }
    }

    public j(f<?> fVar) {
        this.d = fVar;
    }

    @InterfaceC5670cr1
    public final View.OnClickListener K(int i) {
        return new a(i);
    }

    public int L(int i) {
        return i - this.d.V2().s().Z;
    }

    public int M(int i) {
        return this.d.V2().s().Z + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: N */
    public void x(@InterfaceC5670cr1 b bVar, int i) {
        C10330vt c10330vt;
        int M = M(i);
        bVar.I.setText(String.format(Locale.getDefault(), C3858Oo2.d1, Integer.valueOf(M)));
        TextView textView = bVar.I;
        textView.setContentDescription(C9507sV.k(textView.getContext(), M));
        C10816xt W2 = this.d.W2();
        Calendar v = C11143zD2.v();
        boolean z = true;
        if (v.get(1) == M) {
            c10330vt = W2.f;
        } else {
            c10330vt = W2.d;
        }
        for (Long l : this.d.I2().r0()) {
            v.setTimeInMillis(l.longValue());
            if (v.get(1) == M) {
                c10330vt = W2.e;
            }
        }
        c10330vt.f(bVar.I);
        TextView textView2 = bVar.I;
        if (c10330vt != W2.e) {
            z = false;
        }
        textView2.setSelected(z);
        bVar.I.setOnClickListener(K(M));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: O */
    public b z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7025iN1.k.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.V2().u();
    }
}
