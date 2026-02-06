package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import o.OL1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int Y0;
    public int Z0;
    public WeakReference<View> a1;
    public LayoutInflater b1;
    public a c1;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.Y0 != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.b1;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.Y0, viewGroup, false);
                int i = this.Z0;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.a1 = new WeakReference<>(inflate);
                a aVar = this.c1;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.Z0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.b1;
    }

    public int getLayoutResource() {
        return this.Y0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.Z0 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.b1 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.Y0 = i;
    }

    public void setOnInflateListener(a aVar) {
        this.c1 = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.a1;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        a();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.g7, i, 0);
        this.Z0 = obtainStyledAttributes.getResourceId(OL1.m.j7, -1);
        this.Y0 = obtainStyledAttributes.getResourceId(OL1.m.i7, 0);
        setId(obtainStyledAttributes.getResourceId(OL1.m.h7, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
