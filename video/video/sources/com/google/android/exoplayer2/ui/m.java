package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import com.google.android.exoplayer2.ui.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.AbstractC6044eO0;
import o.C10833xx0;
import o.C2782Dr2;
import o.C2989Fr2;
import o.C3773Nr2;
import o.C9593sr2;
import o.HD1;
import o.InterfaceC10322vr2;
import o.InterfaceC11300zs1;
import o.InterfaceC4698Xf2;

@Deprecated
/* loaded from: classes2.dex */
public final class m {
    public final Context a;
    public final CharSequence b;
    public final List<C3773Nr2.a> c;
    public final a d;
    @InterfaceC4698Xf2
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    @InterfaceC11300zs1
    public InterfaceC10322vr2 i;
    public boolean j;
    public AbstractC6044eO0<C9593sr2, C2782Dr2> k;
    @InterfaceC11300zs1
    public Comparator<C10833xx0> l;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z, Map<C9593sr2, C2782Dr2> map);
    }

    public m(Context context, CharSequence charSequence, List<C3773Nr2.a> list, a aVar) {
        this.a = context;
        this.b = charSequence;
        this.c = AbstractC5317bO0.F(list);
        this.d = aVar;
        this.k = AbstractC6044eO0.u();
    }

    public static /* synthetic */ void a(HD1 hd1, int i, boolean z, Map map) {
        if (!hd1.T0(29)) {
            return;
        }
        C2989Fr2.a B = hd1.i1().B();
        B.m0(i, z);
        B.E(i);
        for (C2782Dr2 c2782Dr2 : map.values()) {
            B.A(c2782Dr2);
        }
        hd1.N(B.B());
    }

    public Dialog c() {
        Dialog d = d();
        if (d == null) {
            return e();
        }
        return d;
    }

    @InterfaceC11300zs1
    public final Dialog d() {
        try {
            Class cls = Integer.TYPE;
            Object newInstance = a.C0006a.class.getConstructor(Context.class, cls).newInstance(this.a, Integer.valueOf(this.e));
            View inflate = LayoutInflater.from((Context) a.C0006a.class.getMethod("getContext", null).invoke(newInstance, null)).inflate(g.i.l, (ViewGroup) null);
            DialogInterface.OnClickListener o2 = o(inflate);
            a.C0006a.class.getMethod("setTitle", CharSequence.class).invoke(newInstance, this.b);
            a.C0006a.class.getMethod("setView", View.class).invoke(newInstance, inflate);
            a.C0006a.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, 17039370, o2);
            a.C0006a.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, 17039360, null);
            return (Dialog) a.C0006a.class.getMethod("create", null).invoke(newInstance, null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public final Dialog e() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, this.e);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(g.i.l, (ViewGroup) null);
        return builder.setTitle(this.b).setView(inflate).setPositiveButton(17039370, o(inflate)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }

    public m f(boolean z) {
        this.f = z;
        return this;
    }

    public m g(boolean z) {
        this.g = z;
        return this;
    }

    public m h(boolean z) {
        this.j = z;
        return this;
    }

    public m i(@InterfaceC11300zs1 C2782Dr2 c2782Dr2) {
        Map<C9593sr2, C2782Dr2> v;
        if (c2782Dr2 == null) {
            v = Collections.EMPTY_MAP;
        } else {
            v = AbstractC6044eO0.v(c2782Dr2.X, c2782Dr2);
        }
        return j(v);
    }

    public m j(Map<C9593sr2, C2782Dr2> map) {
        this.k = AbstractC6044eO0.g(map);
        return this;
    }

    public m k(boolean z) {
        this.h = z;
        return this;
    }

    public m l(@InterfaceC4698Xf2 int i) {
        this.e = i;
        return this;
    }

    public void m(@InterfaceC11300zs1 Comparator<C10833xx0> comparator) {
        this.l = comparator;
    }

    public m n(@InterfaceC11300zs1 InterfaceC10322vr2 interfaceC10322vr2) {
        this.i = interfaceC10322vr2;
        return this;
    }

    public final DialogInterface.OnClickListener o(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(g.C0102g.R0);
        trackSelectionView.setAllowMultipleOverrides(this.g);
        trackSelectionView.setAllowAdaptiveSelections(this.f);
        trackSelectionView.setShowDisableOption(this.h);
        InterfaceC10322vr2 interfaceC10322vr2 = this.i;
        if (interfaceC10322vr2 != null) {
            trackSelectionView.setTrackNameProvider(interfaceC10322vr2);
        }
        trackSelectionView.d(this.c, this.j, this.k, this.l, null);
        return new DialogInterface.OnClickListener() { // from class: o.Br2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                com.google.android.exoplayer2.ui.m.this.d.a(r1.getIsDisabled(), trackSelectionView.getOverrides());
            }
        };
    }

    public m(Context context, CharSequence charSequence, final HD1 hd1, final int i) {
        this.a = context;
        this.b = charSequence;
        AbstractC5317bO0<C3773Nr2.a> c = (hd1.T0(30) ? hd1.L0() : C3773Nr2.Y).c();
        this.c = new ArrayList();
        for (int i2 = 0; i2 < c.size(); i2++) {
            C3773Nr2.a aVar = c.get(i2);
            if (aVar.g() == i) {
                this.c.add(aVar);
            }
        }
        this.k = hd1.i1().t1;
        this.d = new a() { // from class: o.Ar2
            @Override // com.google.android.exoplayer2.ui.m.a
            public final void a(boolean z, Map map) {
                com.google.android.exoplayer2.ui.m.a(HD1.this, i, z, map);
            }
        };
    }
}
