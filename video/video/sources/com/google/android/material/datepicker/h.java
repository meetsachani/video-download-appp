package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC10236vV;
import o.C10330vt;
import o.C10816xt;
import o.C11143zD2;
import o.C3548Lk1;
import o.C3858Oo2;
import o.C4377Tx1;
import o.C7025iN1;
import o.C9507sV;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC9015qV;

/* loaded from: classes3.dex */
public class h extends BaseAdapter {
    public static final int b1 = C11143zD2.x().getMaximum(4);
    public static final int c1 = (C11143zD2.x().getMaximum(5) + C11143zD2.x().getMaximum(7)) - 1;
    public static final int d1 = -1;
    public final C3548Lk1 X;
    public final InterfaceC9015qV<?> Y;
    public C10816xt Y0;
    public Collection<Long> Z;
    public final a Z0;
    @InterfaceC11300zs1
    public final AbstractC10236vV a1;

    public h(C3548Lk1 c3548Lk1, InterfaceC9015qV<?> interfaceC9015qV, a aVar, @InterfaceC11300zs1 AbstractC10236vV abstractC10236vV) {
        this.X = c3548Lk1;
        this.Y = interfaceC9015qV;
        this.Z0 = aVar;
        this.a1 = abstractC10236vV;
        this.Z = interfaceC9015qV.r0();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.X.n(this.Z0.m());
    }

    public final String c(Context context, long j) {
        return C9507sV.e(context, j, l(j), k(j), g(j));
    }

    @Override // android.widget.Adapter
    @InterfaceC11300zs1
    /* renamed from: d */
    public Long getItem(int i) {
        if (i >= b() && i <= m()) {
            return Long.valueOf(this.X.o(n(i)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // android.widget.Adapter
    @InterfaceC5670cr1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, @InterfaceC11300zs1 View view, @InterfaceC5670cr1 ViewGroup viewGroup) {
        int i2;
        Long item;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7025iN1.k.mtrl_calendar_day, viewGroup, false);
        }
        int b = i - b();
        if (b >= 0) {
            C3548Lk1 c3548Lk1 = this.X;
            if (b < c3548Lk1.Z0) {
                i2 = b + 1;
                textView.setTag(c3548Lk1);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, C3858Oo2.d1, Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                o(textView, item.longValue(), i2);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i2 = -1;
        item = getItem(i);
        if (item != null) {
        }
    }

    public final void f(Context context) {
        if (this.Y0 == null) {
            this.Y0 = new C10816xt(context);
        }
    }

    @InterfaceC5056aJ2
    public boolean g(long j) {
        for (C4377Tx1<Long, Long> c4377Tx1 : this.Y.V()) {
            Long l = c4377Tx1.b;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return c1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.X.Y0;
    }

    public boolean h(int i) {
        if (i % this.X.Y0 == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i) {
        if ((i + 1) % this.X.Y0 == 0) {
            return true;
        }
        return false;
    }

    public final boolean j(long j) {
        Iterator<Long> it = this.Y.r0().iterator();
        while (it.hasNext()) {
            if (C11143zD2.a(j) == C11143zD2.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC5056aJ2
    public boolean k(long j) {
        for (C4377Tx1<Long, Long> c4377Tx1 : this.Y.V()) {
            Long l = c4377Tx1.a;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(long j) {
        if (C11143zD2.v().getTimeInMillis() == j) {
            return true;
        }
        return false;
    }

    public int m() {
        return (b() + this.X.Z0) - 1;
    }

    public int n(int i) {
        return (i - b()) + 1;
    }

    public final void o(@InterfaceC11300zs1 TextView textView, long j, int i) {
        boolean z;
        C10330vt c10330vt;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String c = c(context, j);
        textView.setContentDescription(c);
        boolean M = this.Z0.g().M(j);
        if (M) {
            textView.setEnabled(true);
            z = j(j);
            textView.setSelected(z);
            if (z) {
                c10330vt = this.Y0.b;
            } else if (l(j)) {
                c10330vt = this.Y0.c;
            } else {
                c10330vt = this.Y0.a;
            }
        } else {
            z = false;
            textView.setEnabled(false);
            c10330vt = this.Y0.g;
        }
        boolean z2 = z;
        AbstractC10236vV abstractC10236vV = this.a1;
        if (abstractC10236vV != null && i != -1) {
            C3548Lk1 c3548Lk1 = this.X;
            int i2 = c3548Lk1.Z;
            int i3 = c3548Lk1.Y;
            c10330vt.g(textView, abstractC10236vV.a(context, i2, i3, i, M, z2), this.a1.g(context, i2, i3, i, M, z2));
            textView.setCompoundDrawables(this.a1.c(context, i2, i3, i, M, z2), this.a1.e(context, i2, i3, i, M, z2), this.a1.d(context, i2, i3, i, M, z2), this.a1.b(context, i2, i3, i, M, z2));
            textView.setContentDescription(this.a1.f(context, i2, i3, i, M, z2, c));
            return;
        }
        c10330vt.f(textView);
    }

    public final void p(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C3548Lk1.h(j).equals(this.X)) {
            int q = this.X.q(j);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(q) - materialCalendarGridView.getFirstVisiblePosition()), j, q);
        }
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.Z) {
            p(materialCalendarGridView, l.longValue());
        }
        InterfaceC9015qV<?> interfaceC9015qV = this.Y;
        if (interfaceC9015qV != null) {
            for (Long l2 : interfaceC9015qV.r0()) {
                p(materialCalendarGridView, l2.longValue());
            }
            this.Z = this.Y.r0();
        }
    }

    public boolean r(int i) {
        if (i >= b() && i <= m()) {
            return true;
        }
        return false;
    }
}
