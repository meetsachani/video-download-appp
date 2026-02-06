package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.exoplayer2.ui.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.C10833xx0;
import o.C2782Dr2;
import o.C3773Nr2;
import o.C9542sf;
import o.C9593sr2;
import o.InterfaceC10322vr2;
import o.InterfaceC11300zs1;
import o.InterfaceC8568og;

@Deprecated
/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {
    public final int Y0;
    public final LayoutInflater Z0;
    public final CheckedTextView a1;
    public final CheckedTextView b1;
    public final b c1;
    public final List<C3773Nr2.a> d1;
    public final Map<C9593sr2, C2782Dr2> e1;
    public boolean f1;
    public boolean g1;
    public InterfaceC10322vr2 h1;
    public CheckedTextView[][] i1;
    public boolean j1;
    @InterfaceC11300zs1
    public Comparator<c> k1;
    @InterfaceC11300zs1
    public d l1;

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
            TrackSelectionView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.e(view);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final C3773Nr2.a a;
        public final int b;

        public c(C3773Nr2.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        public C10833xx0 a() {
            return this.a.d(this.b);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(boolean z, Map<C9593sr2, C2782Dr2> map);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int a(Comparator comparator, c cVar, c cVar2) {
        return comparator.compare(cVar.a(), cVar2.a());
    }

    public static Map<C9593sr2, C2782Dr2> c(Map<C9593sr2, C2782Dr2> map, List<C3773Nr2.a> list, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C2782Dr2 c2782Dr2 = map.get(list.get(i).c());
            if (c2782Dr2 != null && (z || hashMap.isEmpty())) {
                hashMap.put(c2782Dr2.X, c2782Dr2);
            }
        }
        return hashMap;
    }

    public void d(List<C3773Nr2.a> list, boolean z, Map<C9593sr2, C2782Dr2> map, @InterfaceC11300zs1 final Comparator<C10833xx0> comparator, @InterfaceC11300zs1 d dVar) {
        Comparator<c> comparator2;
        this.j1 = z;
        if (comparator == null) {
            comparator2 = null;
        } else {
            comparator2 = new Comparator() { // from class: o.Hr2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return TrackSelectionView.a(comparator, (TrackSelectionView.c) obj, (TrackSelectionView.c) obj2);
                }
            };
        }
        this.k1 = comparator2;
        this.l1 = dVar;
        this.d1.clear();
        this.d1.addAll(list);
        this.e1.clear();
        this.e1.putAll(c(map, list, this.g1));
        l();
    }

    public final void e(View view) {
        if (view == this.a1) {
            g();
        } else if (view == this.b1) {
            f();
        } else {
            h(view);
        }
        k();
        d dVar = this.l1;
        if (dVar != null) {
            dVar.a(getIsDisabled(), getOverrides());
        }
    }

    public final void f() {
        this.j1 = false;
        this.e1.clear();
    }

    public final void g() {
        this.j1 = true;
        this.e1.clear();
    }

    public boolean getIsDisabled() {
        return this.j1;
    }

    public Map<C9593sr2, C2782Dr2> getOverrides() {
        return this.e1;
    }

    public final void h(View view) {
        boolean z = false;
        this.j1 = false;
        c cVar = (c) C9542sf.g(view.getTag());
        C9593sr2 c2 = cVar.a.c();
        int i = cVar.b;
        C2782Dr2 c2782Dr2 = this.e1.get(c2);
        if (c2782Dr2 == null) {
            if (!this.g1 && this.e1.size() > 0) {
                this.e1.clear();
            }
            this.e1.put(c2, new C2782Dr2(c2, AbstractC5317bO0.M(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(c2782Dr2.Y);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean i2 = i(cVar.a);
        z = (i2 || j()) ? true : true;
        if (isChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.e1.remove(c2);
            } else {
                this.e1.put(c2, new C2782Dr2(c2, arrayList));
            }
        } else if (!isChecked) {
            if (i2) {
                arrayList.add(Integer.valueOf(i));
                this.e1.put(c2, new C2782Dr2(c2, arrayList));
                return;
            }
            this.e1.put(c2, new C2782Dr2(c2, AbstractC5317bO0.M(Integer.valueOf(i))));
        }
    }

    public final boolean i(C3773Nr2.a aVar) {
        if (this.f1 && aVar.h()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.g1 && this.d1.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k() {
        boolean z;
        this.a1.setChecked(this.j1);
        CheckedTextView checkedTextView = this.b1;
        if (!this.j1 && this.e1.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        checkedTextView.setChecked(z);
        for (int i = 0; i < this.i1.length; i++) {
            C2782Dr2 c2782Dr2 = this.e1.get(this.d1.get(i).c());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.i1[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c2782Dr2 != null) {
                        this.i1[i][i2].setChecked(c2782Dr2.Y.contains(Integer.valueOf(((c) C9542sf.g(checkedTextViewArr[i2].getTag())).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void l() {
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.d1.isEmpty()) {
            this.a1.setEnabled(false);
            this.b1.setEnabled(false);
            return;
        }
        this.a1.setEnabled(true);
        this.b1.setEnabled(true);
        this.i1 = new CheckedTextView[this.d1.size()];
        boolean j = j();
        for (int i2 = 0; i2 < this.d1.size(); i2++) {
            C3773Nr2.a aVar = this.d1.get(i2);
            boolean i3 = i(aVar);
            CheckedTextView[][] checkedTextViewArr = this.i1;
            int i4 = aVar.X;
            checkedTextViewArr[i2] = new CheckedTextView[i4];
            c[] cVarArr = new c[i4];
            for (int i5 = 0; i5 < aVar.X; i5++) {
                cVarArr[i5] = new c(aVar, i5);
            }
            Comparator<c> comparator = this.k1;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                if (i6 == 0) {
                    addView(this.Z0.inflate(g.i.b, (ViewGroup) this, false));
                }
                if (!i3 && !j) {
                    i = 17367055;
                } else {
                    i = 17367056;
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.Z0.inflate(i, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.Y0);
                checkedTextView.setText(this.h1.a(cVarArr[i6].a()));
                checkedTextView.setTag(cVarArr[i6]);
                if (aVar.m(i6)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.c1);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.i1[i2][i6] = checkedTextView;
                addView(checkedTextView);
            }
        }
        k();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f1 != z) {
            this.f1 = z;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.g1 != z) {
            this.g1 = z;
            if (!z && this.e1.size() > 1) {
                Map<C9593sr2, C2782Dr2> c2 = c(this.e1, this.d1, false);
                this.e1.clear();
                this.e1.putAll(c2);
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z) {
        int i;
        CheckedTextView checkedTextView = this.a1;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkedTextView.setVisibility(i);
    }

    public void setTrackNameProvider(InterfaceC10322vr2 interfaceC10322vr2) {
        this.h1 = (InterfaceC10322vr2) C9542sf.g(interfaceC10322vr2);
        l();
    }

    public TrackSelectionView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.Y0 = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.Z0 = from;
        b bVar = new b();
        this.c1 = bVar;
        this.h1 = new com.google.android.exoplayer2.ui.d(getResources());
        this.d1 = new ArrayList();
        this.e1 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.a1 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(g.k.J);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(g.i.b, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.b1 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(g.k.I);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
