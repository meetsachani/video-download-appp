package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import o.C10748xc;
import o.C10861y4;
import o.C6516gH2;
import o.HT1;
import o.InterfaceC5670cr1;
import o.J;
import o.OL1;
import o.Q3;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class CheckableImageButton extends C10748xc implements Checkable {
    public static final int[] e1 = {16842912};
    public boolean b1;
    public boolean c1;
    public boolean d1;

    /* loaded from: classes3.dex */
    public class a extends Q3 {
        public a() {
        }

        @Override // o.Q3
        public void f(View view, @InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.i1(CheckableImageButton.this.a());
            c10861y4.j1(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends J {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: a */
            public b createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public b createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@InterfaceC5670cr1 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.Z = z;
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z ? 1 : 0);
        }

        public b(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.c1;
    }

    public boolean b() {
        return this.d1;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.b1;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.b1) {
            int[] iArr = e1;
            return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.Z);
    }

    @Override // android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.Z = this.b1;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.c1 && this.b1 != z) {
            this.b1 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.d1 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.d1) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.b1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.K1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c1 = true;
        this.d1 = true;
        C6516gH2.I1(this, new a());
    }
}
