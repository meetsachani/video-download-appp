package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import o.OL1;

/* renamed from: o.Mc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3611Mc extends Spinner implements InterfaceC2981Fp2 {
    public static final int[] g1 = {16843505};
    public static final int h1 = 15;
    public static final String i1 = "AppCompatSpinner";
    public static final int j1 = 0;
    public static final int k1 = 1;
    public static final int l1 = -1;
    public final C3705Nb Y0;
    public final Context Z0;
    public AbstractView$OnTouchListenerC8397ny0 a1;
    public SpinnerAdapter b1;
    public final boolean c1;
    public h d1;
    public int e1;
    public final Rect f1;

    /* renamed from: o.Mc$a */
    /* loaded from: classes.dex */
    public class a extends AbstractView$OnTouchListenerC8397ny0 {
        public final /* synthetic */ f e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.e1 = fVar;
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public T52 b() {
            return this.e1;
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean c() {
            if (!C3611Mc.this.getInternalPopup().b()) {
                C3611Mc.this.b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: o.Mc$b */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C3611Mc.this.getInternalPopup().b()) {
                C3611Mc.this.b();
            }
            ViewTreeObserver viewTreeObserver = C3611Mc.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: o.Mc$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!C2691Ct1.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: o.Mc$d */
    /* loaded from: classes.dex */
    public class d implements h, DialogInterface.OnClickListener {
        public androidx.appcompat.app.a X;
        public ListAdapter Y;
        public CharSequence Z;

        public d() {
        }

        @Override // o.C3611Mc.h
        public void a(Drawable drawable) {
            Log.e(C3611Mc.i1, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // o.C3611Mc.h
        public boolean b() {
            androidx.appcompat.app.a aVar = this.X;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // o.C3611Mc.h
        public int c() {
            return 0;
        }

        @Override // o.C3611Mc.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.X;
            if (aVar != null) {
                aVar.dismiss();
                this.X = null;
            }
        }

        @Override // o.C3611Mc.h
        public void e(int i) {
            Log.e(C3611Mc.i1, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C3611Mc.h
        public CharSequence f() {
            return this.Z;
        }

        @Override // o.C3611Mc.h
        public Drawable g() {
            return null;
        }

        @Override // o.C3611Mc.h
        public void h(CharSequence charSequence) {
            this.Z = charSequence;
        }

        @Override // o.C3611Mc.h
        public void i(int i) {
            Log.e(C3611Mc.i1, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C3611Mc.h
        public void j(int i) {
            Log.e(C3611Mc.i1, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C3611Mc.h
        public void k(int i, int i2) {
            if (this.Y == null) {
                return;
            }
            a.C0006a c0006a = new a.C0006a(C3611Mc.this.getPopupContext());
            CharSequence charSequence = this.Z;
            if (charSequence != null) {
                c0006a.setTitle(charSequence);
            }
            androidx.appcompat.app.a create = c0006a.D(this.Y, C3611Mc.this.getSelectedItemPosition(), this).create();
            this.X = create;
            ListView s = create.s();
            s.setTextDirection(i);
            s.setTextAlignment(i2);
            this.X.show();
        }

        @Override // o.C3611Mc.h
        public int l() {
            return 0;
        }

        @Override // o.C3611Mc.h
        public int m() {
            return 0;
        }

        @Override // o.C3611Mc.h
        public void n(ListAdapter listAdapter) {
            this.Y = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C3611Mc.this.setSelection(i);
            if (C3611Mc.this.getOnItemClickListener() != null) {
                C3611Mc.this.performItemClick(null, i, this.Y.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: o.Mc$e */
    /* loaded from: classes.dex */
    public static class e implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter X;
        public ListAdapter Y;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.X = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.Y = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC8355nn2) {
                    InterfaceC8355nn2 interfaceC8355nn2 = (InterfaceC8355nn2) spinnerAdapter;
                    if (interfaceC8355nn2.getDropDownViewTheme() == null) {
                        interfaceC8355nn2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.Y;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.Y;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: o.Mc$f */
    /* loaded from: classes.dex */
    public class f extends C5711d11 implements h {
        public CharSequence O1;
        public ListAdapter P1;
        public final Rect Q1;
        public int R1;

        /* renamed from: o.Mc$f$a */
        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ C3611Mc X;

            public a(C3611Mc c3611Mc) {
                this.X = c3611Mc;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C3611Mc.this.setSelection(i);
                if (C3611Mc.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C3611Mc.this.performItemClick(view, i, fVar.P1.getItemId(i));
                }
                f.this.dismiss();
            }
        }

        /* renamed from: o.Mc$f$b */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.q0(C3611Mc.this)) {
                    f.this.dismiss();
                    return;
                }
                f.this.p0();
                f.super.show();
            }
        }

        /* renamed from: o.Mc$f$c */
        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener X;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.X = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C3611Mc.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.X);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.Q1 = new Rect();
            R(C3611Mc.this);
            c0(true);
            i0(0);
            e0(new a(C3611Mc.this));
        }

        @Override // o.C3611Mc.h
        public CharSequence f() {
            return this.O1;
        }

        @Override // o.C3611Mc.h
        public void h(CharSequence charSequence) {
            this.O1 = charSequence;
        }

        @Override // o.C3611Mc.h
        public void j(int i) {
            this.R1 = i;
        }

        @Override // o.C3611Mc.h
        public void k(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            p0();
            Z(2);
            super.show();
            ListView p = p();
            p.setChoiceMode(1);
            p.setTextDirection(i);
            p.setTextAlignment(i2);
            k0(C3611Mc.this.getSelectedItemPosition());
            if (!b2 && (viewTreeObserver = C3611Mc.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                d0(new c(bVar));
            }
        }

        @Override // o.C3611Mc.h
        public int m() {
            return this.R1;
        }

        @Override // o.C5711d11, o.C3611Mc.h
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.P1 = listAdapter;
        }

        public void p0() {
            int i;
            int m;
            Drawable g = g();
            if (g != null) {
                g.getPadding(C3611Mc.this.f1);
                if (C11163zI2.b(C3611Mc.this)) {
                    i = C3611Mc.this.f1.right;
                } else {
                    i = -C3611Mc.this.f1.left;
                }
            } else {
                Rect rect = C3611Mc.this.f1;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C3611Mc.this.getPaddingLeft();
            int paddingRight = C3611Mc.this.getPaddingRight();
            int width = C3611Mc.this.getWidth();
            C3611Mc c3611Mc = C3611Mc.this;
            int i2 = c3611Mc.e1;
            if (i2 == -2) {
                int a2 = c3611Mc.a((SpinnerAdapter) this.P1, g());
                int i3 = C3611Mc.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C3611Mc.this.f1;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (a2 > i4) {
                    a2 = i4;
                }
                T(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                T((width - paddingLeft) - paddingRight);
            } else {
                T(i2);
            }
            if (C11163zI2.b(C3611Mc.this)) {
                m = i + (((width - paddingRight) - G()) - m());
            } else {
                m = i + paddingLeft + m();
            }
            e(m);
        }

        public boolean q0(View view) {
            if (view.isAttachedToWindow() && view.getGlobalVisibleRect(this.Q1)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Mc$g */
    /* loaded from: classes.dex */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public boolean X;

        /* renamed from: o.Mc$g$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
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

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.X = parcel.readByte() != 0;
        }
    }

    /* renamed from: o.Mc$h */
    /* loaded from: classes.dex */
    public interface h {
        void a(Drawable drawable);

        boolean b();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i);

        void j(int i);

        void k(int i, int i2);

        int l();

        int m();

        void n(ListAdapter listAdapter);
    }

    public C3611Mc(Context context) {
        this(context, (AttributeSet) null);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1);
            Rect rect = this.f1;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    public void b() {
        this.d1.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.d1;
        if (hVar != null) {
            return hVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.d1;
        if (hVar != null) {
            return hVar.l();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.d1 != null) {
            return this.e1;
        }
        return super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.d1;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.d1;
        if (hVar != null) {
            return hVar.g();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.Z0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.d1;
        if (hVar != null) {
            return hVar.f();
        }
        return super.getPrompt();
    }

    @Override // o.InterfaceC2981Fp2
    public ColorStateList getSupportBackgroundTintList() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.c();
        }
        return null;
    }

    @Override // o.InterfaceC2981Fp2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.d1;
        if (hVar != null && hVar.b()) {
            this.d1.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d1 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (gVar.X && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.d1;
        if (hVar != null && hVar.b()) {
            z = true;
        } else {
            z = false;
        }
        gVar.X = z;
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC8397ny0 abstractView$OnTouchListenerC8397ny0 = this.a1;
        if (abstractView$OnTouchListenerC8397ny0 != null && abstractView$OnTouchListenerC8397ny0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.d1;
        if (hVar != null) {
            if (!hVar.b()) {
                b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        h hVar = this.d1;
        if (hVar != null) {
            hVar.j(i);
            this.d1.e(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        h hVar = this.d1;
        if (hVar != null) {
            hVar.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.d1 != null) {
            this.e1 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.d1;
        if (hVar != null) {
            hVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3220Ic.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.d1;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.i(colorStateList);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.j(mode);
        }
    }

    public C3611Mc(Context context, int i) {
        this(context, null, OL1.b.Y2, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.c1) {
            this.b1 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.d1 != null) {
            Context context = this.Z0;
            if (context == null) {
                context = getContext();
            }
            this.d1.n(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C3611Mc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.Y2);
    }

    public C3611Mc(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C3611Mc(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.Mc, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3611Mc(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f1 = new Rect();
        C8112mn2.a(this, getContext());
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, OL1.m.F5, i, 0);
        this.Y0 = new C3705Nb(this);
        if (theme != null) {
            this.Z0 = new BM(context, theme);
        } else {
            int u = G.u(OL1.m.K5, 0);
            if (u != 0) {
                this.Z0 = new BM(context, u);
            } else {
                this.Z0 = context;
            }
        }
        ?? r11 = -1;
        TypedArray typedArray2 = null;
        try {
            if (i2 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, g1, i, 0);
                } catch (Exception e2) {
                    e = e2;
                    typedArray = null;
                } catch (Throwable th) {
                    th = th;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
                try {
                    boolean hasValue = typedArray.hasValue(0);
                    r11 = typedArray;
                    if (hasValue) {
                        i2 = typedArray.getInt(0, 0);
                        r11 = typedArray;
                    }
                } catch (Exception e3) {
                    e = e3;
                    Log.i(i1, "Could not read android:spinnerMode", e);
                    r11 = typedArray;
                }
                r11.recycle();
            }
            if (i2 == 0) {
                d dVar = new d();
                this.d1 = dVar;
                dVar.h(G.w(OL1.m.I5));
            } else if (i2 == 1) {
                f fVar = new f(this.Z0, attributeSet, i);
                C2872Ep2 G2 = C2872Ep2.G(this.Z0, attributeSet, OL1.m.F5, i, 0);
                this.e1 = G2.q(OL1.m.J5, -2);
                fVar.a(G2.h(OL1.m.H5));
                fVar.h(G.w(OL1.m.I5));
                G2.I();
                this.d1 = fVar;
                this.a1 = new a(this, fVar);
            }
            CharSequence[] y = G.y(OL1.m.G5);
            if (y != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, y);
                arrayAdapter.setDropDownViewResource(OL1.j.F);
                setAdapter(arrayAdapter);
            }
            G.I();
            this.c1 = true;
            SpinnerAdapter spinnerAdapter = this.b1;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.b1 = null;
            }
            this.Y0.e(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = r11;
        }
    }
}
