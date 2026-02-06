package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends RecyclerView.o {
    public static final int d = 0;
    public static final int e = 1;
    public static final String f = "DividerItem";
    public static final int[] g = {16843284};
    public Drawable a;
    public int b;
    public final Rect c = new Rect();

    public j(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.a = drawable;
        if (drawable == null) {
            Log.w(f, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        p(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.D d2) {
        Drawable drawable = this.a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d2) {
        if (recyclerView.getLayoutManager() != null && this.a != null) {
            if (this.b == 1) {
                m(canvas, recyclerView);
            } else {
                l(canvas, recyclerView);
            }
        }
    }

    public final void l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().c0(childAt, this.c);
            int round = this.c.right + Math.round(childAt.getTranslationX());
            this.a.setBounds(round - this.a.getIntrinsicWidth(), i, round, height);
            this.a.draw(canvas);
        }
        canvas.restore();
    }

    public final void m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.y0(childAt, this.c);
            int round = this.c.bottom + Math.round(childAt.getTranslationY());
            this.a.setBounds(i, round - this.a.getIntrinsicHeight(), width, round);
            this.a.draw(canvas);
        }
        canvas.restore();
    }

    public Drawable n() {
        return this.a;
    }

    public void o(Drawable drawable) {
        if (drawable != null) {
            this.a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void p(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.b = i;
    }
}
