package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import o.C10816xt;
import o.C10861y4;
import o.C10920yI2;
import o.C11143zD2;
import o.C4377Tx1;
import o.C6516gH2;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9015qV;
import o.Q3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar Y0;
    public final boolean Z0;

    /* loaded from: classes3.dex */
    public class a extends Q3 {
        public a() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.m1(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public static int d(@InterfaceC5670cr1 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean e(@InterfaceC11300zs1 Long l, @InterfaceC11300zs1 Long l2, @InterfaceC11300zs1 Long l3, @InterfaceC11300zs1 Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    public final void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m());
        } else if (i == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @InterfaceC5670cr1
    /* renamed from: b */
    public h getAdapter2() {
        return (h) super.getAdapter();
    }

    public final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        int a2;
        int d;
        int a3;
        int d2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        h adapter2 = materialCalendarGridView.getAdapter2();
        InterfaceC9015qV<?> interfaceC9015qV = adapter2.Y;
        C10816xt c10816xt = adapter2.Y0;
        int max = Math.max(adapter2.b(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter2.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        for (C4377Tx1<Long, Long> c4377Tx1 : interfaceC9015qV.V()) {
            Long l = c4377Tx1.a;
            if (l != null) {
                if (c4377Tx1.b != null) {
                    Long l2 = l;
                    long longValue = l2.longValue();
                    Long l3 = c4377Tx1.b;
                    long longValue2 = l3.longValue();
                    if (!e(item, item2, l2, l3)) {
                        boolean s = C10920yI2.s(materialCalendarGridView);
                        if (longValue < item.longValue()) {
                            if (adapter2.h(max)) {
                                left2 = 0;
                            } else if (!s) {
                                left2 = materialCalendarGridView.c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.c(max - 1).getLeft();
                            }
                            d = left2;
                            a2 = max;
                        } else {
                            materialCalendarGridView.Y0.setTimeInMillis(longValue);
                            a2 = adapter2.a(materialCalendarGridView.Y0.get(5));
                            d = d(materialCalendarGridView.c(a2));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.i(min)) {
                                left = materialCalendarGridView.getWidth();
                            } else if (!s) {
                                left = materialCalendarGridView.c(min).getRight();
                            } else {
                                left = materialCalendarGridView.c(min).getLeft();
                            }
                            d2 = left;
                            a3 = min;
                        } else {
                            materialCalendarGridView.Y0.setTimeInMillis(longValue2);
                            a3 = adapter2.a(materialCalendarGridView.Y0.get(5));
                            d2 = d(materialCalendarGridView.c(a3));
                        }
                        int itemId = (int) adapter2.getItemId(a2);
                        int i5 = max;
                        int i6 = min;
                        int itemId2 = (int) adapter2.getItemId(a3);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                            View c = materialCalendarGridView.c(numColumns);
                            int top = c.getTop() + c10816xt.a.e();
                            h hVar = adapter2;
                            int bottom = c.getBottom() - c10816xt.a.b();
                            if (!s) {
                                if (numColumns > a2) {
                                    i4 = 0;
                                } else {
                                    i4 = d;
                                }
                                if (a3 > numColumns2) {
                                    i3 = getWidth();
                                } else {
                                    i3 = d2;
                                }
                            } else {
                                if (a3 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = d2;
                                }
                                if (numColumns > a2) {
                                    i2 = getWidth();
                                } else {
                                    i2 = d;
                                }
                                int i7 = i;
                                i3 = i2;
                                i4 = i7;
                            }
                            canvas.drawRect(i4, top, i3, bottom, c10816xt.h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = hVar;
                        }
                        materialCalendarGridView = this;
                        max = i5;
                        min = i6;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter2().b() && selectedItemPosition <= getAdapter2().m())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.Z0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C6516gH2.x, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof h) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = C11143zD2.x();
        if (g.A3(getContext())) {
            setNextFocusLeftId(C7025iN1.h.f767o);
            setNextFocusRightId(C7025iN1.h.confirm_button);
        }
        this.Z0 = g.C3(getContext());
        C6516gH2.I1(this, new a());
    }
}
