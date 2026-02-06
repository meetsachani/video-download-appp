package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import o.AbstractView$OnTouchListenerC8397ny0;
import o.C9097qq2;
import o.D60;
import o.OL1;
import o.R4;
import o.T52;
import o.U4;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements U4.a {
    public static final String z1 = "ActionMenuPresenter";
    public d f1;
    public Drawable g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public final SparseBooleanArray s1;
    public e t1;
    public C0008a u1;
    public c v1;
    public b w1;
    public final f x1;
    public int y1;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008a extends i {
        public C0008a(Context context, m mVar, View view) {
            super(context, mVar, view, false, OL1.b.G);
            if (!((h) mVar.getItem()).o()) {
                View view2 = a.this.f1;
                h(view2 == null ? (View) a.this.d1 : view2);
            }
            a(a.this.x1);
        }

        @Override // androidx.appcompat.view.menu.i
        public void g() {
            a aVar = a.this;
            aVar.u1 = null;
            aVar.y1 = 0;
            super.g();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public T52 a() {
            C0008a c0008a = a.this.u1;
            if (c0008a != null) {
                return c0008a.e();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public e X;

        public c(e eVar) {
            this.X = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.Z != null) {
                a.this.Z.d();
            }
            View view = (View) a.this.d1;
            if (view != null && view.getWindowToken() != null && this.X.o()) {
                a.this.t1 = this.X;
            }
            a.this.v1 = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0009a extends AbstractView$OnTouchListenerC8397ny0 {
            public final /* synthetic */ a e1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009a(View view, a aVar) {
                super(view);
                this.e1 = aVar;
            }

            @Override // o.AbstractView$OnTouchListenerC8397ny0
            public T52 b() {
                e eVar = a.this.t1;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // o.AbstractView$OnTouchListenerC8397ny0
            public boolean c() {
                a.this.Q();
                return true;
            }

            @Override // o.AbstractView$OnTouchListenerC8397ny0
            public boolean d() {
                a aVar = a.this;
                if (aVar.v1 != null) {
                    return false;
                }
                aVar.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, OL1.b.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C9097qq2.a(this, getContentDescription());
            setOnTouchListener(new C0009a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean f() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.Q();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                D60.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, OL1.b.G);
            j(8388613);
            a(a.this.x1);
        }

        @Override // androidx.appcompat.view.menu.i
        public void g() {
            if (a.this.Z != null) {
                a.this.Z.close();
            }
            a.this.t1 = null;
            super.g();
        }
    }

    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof m) {
                eVar.G().f(false);
            }
            j.a q = a.this.q();
            if (q != null) {
                q.a(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.Z) {
                return false;
            }
            a.this.y1 = ((m) eVar).getItem().getItemId();
            j.a q = a.this.q();
            if (q == null) {
                return false;
            }
            return q.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new C0010a();
        public int X;

        /* renamed from: androidx.appcompat.widget.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0010a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
        }

        public g(Parcel parcel) {
            this.X = parcel.readInt();
        }
    }

    public a(Context context) {
        super(context, OL1.j.d, OL1.j.c);
        this.s1 = new SparseBooleanArray();
        this.x1 = new f();
    }

    public boolean B() {
        return E() | F();
    }

    public final View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.d1;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable D() {
        d dVar = this.f1;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.h1) {
            return this.g1;
        }
        return null;
    }

    public boolean E() {
        k kVar;
        c cVar = this.v1;
        if (cVar != null && (kVar = this.d1) != null) {
            ((View) kVar).removeCallbacks(cVar);
            this.v1 = null;
            return true;
        }
        e eVar = this.t1;
        if (eVar != null) {
            eVar.dismiss();
            return true;
        }
        return false;
    }

    public boolean F() {
        C0008a c0008a = this.u1;
        if (c0008a != null) {
            c0008a.dismiss();
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.v1 == null && !H()) {
            return false;
        }
        return true;
    }

    public boolean H() {
        e eVar = this.t1;
        if (eVar != null && eVar.f()) {
            return true;
        }
        return false;
    }

    public boolean I() {
        return this.i1;
    }

    public void J(Configuration configuration) {
        if (!this.n1) {
            this.m1 = R4.b(this.Y).d();
        }
        androidx.appcompat.view.menu.e eVar = this.Z;
        if (eVar != null) {
            eVar.O(true);
        }
    }

    public void K(boolean z) {
        this.q1 = z;
    }

    public void L(int i) {
        this.m1 = i;
        this.n1 = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.d1 = actionMenuView;
        actionMenuView.c(this.Z);
    }

    public void N(Drawable drawable) {
        d dVar = this.f1;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.h1 = true;
        this.g1 = drawable;
    }

    public void O(boolean z) {
        this.i1 = z;
        this.j1 = true;
    }

    public void P(int i, boolean z) {
        this.k1 = i;
        this.o1 = z;
        this.p1 = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.e eVar;
        if (this.i1 && !H() && (eVar = this.Z) != null && this.d1 != null && this.v1 == null && !eVar.C().isEmpty()) {
            c cVar = new c(new e(this.Y, this.Z, this.f1, true));
            this.v1 = cVar;
            ((View) this.d1).post(cVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        B();
        super.a(eVar, z);
    }

    @Override // o.U4.a
    public void b(boolean z) {
        if (z) {
            super.f(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.Z;
        if (eVar != null) {
            eVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).X) > 0 && (findItem = this.Z.findItem(i)) != null) {
            f((m) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.o0() != this.Z) {
            mVar2 = (m) mVar2.o0();
        }
        View C = C(mVar2.getItem());
        if (C == null) {
            return false;
        }
        this.y1 = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0008a c0008a = new C0008a(this.Y, mVar, C);
        this.u1 = c0008a;
        c0008a.i(z);
        this.u1.l();
        super.f(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public k g(ViewGroup viewGroup) {
        k kVar = this.d1;
        k g2 = super.g(viewGroup);
        if (kVar != g2) {
            ((ActionMenuView) g2).setPresenter(this);
        }
        return g2;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        g gVar = new g();
        gVar.X = this.y1;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z) {
        ArrayList<h> arrayList;
        super.i(z);
        ((View) this.d1).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.Z;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<h> v = eVar.v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                U4 a = v.get(i).a();
                if (a != null) {
                    a.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.Z;
        if (eVar2 != null) {
            arrayList = eVar2.C();
        } else {
            arrayList = null;
        }
        if (this.i1 && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1 == null) {
                this.f1 = new d(this.X);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1.getParent();
            if (viewGroup != this.d1) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.d1;
                actionMenuView.addView(this.f1, actionMenuView.J());
            }
        } else {
            d dVar = this.f1;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                k kVar = this.d1;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.f1);
                }
            }
        }
        ((ActionMenuView) this.d1).setOverflowReserved(this.i1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean j() {
        ArrayList<h> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.Z;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayList = eVar.H();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = aVar.m1;
        int i6 = aVar.l1;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.d1;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.b()) {
                i7++;
            } else if (hVar.q()) {
                i8++;
            } else {
                z4 = true;
            }
            if (aVar.q1 && hVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (aVar.i1 && (z4 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = aVar.s1;
        sparseBooleanArray.clear();
        if (aVar.o1) {
            int i11 = aVar.r1;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            h hVar2 = arrayList.get(i12);
            if (hVar2.b()) {
                View r = aVar.r(hVar2, view, viewGroup);
                if (aVar.o1) {
                    i3 -= ActionMenuView.P(r, i2, i3, makeMeasureSpec, r3);
                } else {
                    r.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.x(true);
                z = r3;
                i4 = i;
            } else if (hVar2.q()) {
                int groupId2 = hVar2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z5) && i6 > 0 && (!aVar.o1 || i3 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2;
                i4 = i;
                if (z2) {
                    View r2 = aVar.r(hVar2, null, viewGroup);
                    if (aVar.o1) {
                        int P = ActionMenuView.P(r2, i2, i3, makeMeasureSpec, 0);
                        i3 -= P;
                        if (P == 0) {
                            z6 = false;
                        }
                    } else {
                        r2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = r2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!aVar.o1 ? i6 + i13 > 0 : i6 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z7 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        h hVar3 = arrayList.get(i14);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.o()) {
                                i10++;
                            }
                            hVar3.x(false);
                        }
                    }
                }
                if (z2) {
                    i10--;
                }
                hVar2.x(z2);
                z = false;
            } else {
                z = r3;
                i4 = i;
                hVar2.x(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.e eVar) {
        super.l(context, eVar);
        Resources resources = context.getResources();
        R4 b2 = R4.b(context);
        if (!this.j1) {
            this.i1 = b2.h();
        }
        if (!this.p1) {
            this.k1 = b2.c();
        }
        if (!this.n1) {
            this.m1 = b2.d();
        }
        int i = this.k1;
        if (this.i1) {
            if (this.f1 == null) {
                d dVar = new d(this.X);
                this.f1 = dVar;
                if (this.h1) {
                    dVar.setImageDrawable(this.g1);
                    this.g1 = null;
                    this.h1 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1.getMeasuredWidth();
        } else {
            this.f1 = null;
        }
        this.l1 = i;
        this.r1 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void n(h hVar, k.a aVar) {
        aVar.g(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.d1);
        if (this.w1 == null) {
            this.w1 = new b();
        }
        actionMenuItemView.setPopupCallback(this.w1);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean p(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1) {
            return false;
        }
        return super.p(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View r(h hVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.m()) {
            actionView = super.r(hVar, view, viewGroup);
        }
        if (hVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.n(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean t(int i, h hVar) {
        return hVar.o();
    }
}
