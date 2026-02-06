package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zai extends Drawable implements Drawable.Callback {
    public int X;
    public long Y;
    public int Y0;
    public int Z;
    public int Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public zah d1;
    public Drawable e1;
    public Drawable f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public int j1;

    public zai(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zag.a : drawable;
        this.e1 = drawable;
        drawable.setCallback(this);
        zah zahVar = this.d1;
        zahVar.b = drawable.getChangingConfigurations() | zahVar.b;
        drawable2 = drawable2 == null ? zag.a : drawable2;
        this.f1 = drawable2;
        drawable2.setCallback(this);
        zah zahVar2 = this.d1;
        zahVar2.b = drawable2.getChangingConfigurations() | zahVar2.b;
    }

    public final Drawable a() {
        return this.f1;
    }

    public final void b(int i) {
        this.Z = this.Y0;
        this.a1 = 0;
        this.Z0 = 250;
        this.X = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.g1) {
            boolean z = false;
            if (this.e1.getConstantState() != null && this.f1.getConstantState() != null) {
                z = true;
            }
            this.h1 = z;
            this.g1 = true;
        }
        return this.h1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i = this.X;
        int i2 = 0;
        boolean z = true;
        if (i != 1) {
            if (i == 2 && this.Y >= 0) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.Y)) / this.Z0;
                if (uptimeMillis < 1.0f) {
                    z = false;
                }
                if (z) {
                    this.X = 0;
                }
                this.a1 = (int) ((this.Z * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            }
        } else {
            this.Y = SystemClock.uptimeMillis();
            this.X = 2;
            z = false;
        }
        int i3 = this.a1;
        boolean z2 = this.b1;
        Drawable drawable = this.e1;
        Drawable drawable2 = this.f1;
        if (z) {
            if (!z2) {
                i2 = i3;
            }
            drawable.draw(canvas);
            i3 = i2;
            int i4 = this.Y0;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.Y0 - i3);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.Y0);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.Y0);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zah zahVar = this.d1;
        return changingConfigurations | zahVar.a | zahVar.b;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public final Drawable.ConstantState getConstantState() {
        if (c()) {
            this.d1.a = getChangingConfigurations();
            return this.d1;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.e1.getIntrinsicHeight(), this.f1.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.e1.getIntrinsicWidth(), this.f1.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.i1) {
            this.j1 = Drawable.resolveOpacity(this.e1.getOpacity(), this.f1.getOpacity());
            this.i1 = true;
        }
        return this.j1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.c1 && super.mutate() == this) {
            if (c()) {
                this.e1.mutate();
                this.f1.mutate();
                this.c1 = true;
                return this;
            }
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e1.setBounds(rect);
        this.f1.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.a1 == this.Y0) {
            this.a1 = i;
        }
        this.Y0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.e1.setColorFilter(colorFilter);
        this.f1.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public zai(@InterfaceC11300zs1 zah zahVar) {
        this.X = 0;
        this.Y0 = 255;
        this.a1 = 0;
        this.b1 = true;
        this.d1 = new zah(zahVar);
    }
}
