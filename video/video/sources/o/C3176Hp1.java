package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.C5555cN0;

/* renamed from: o.Hp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3176Hp1 extends ImageView {
    public String Y0;
    public int Z0;
    public Drawable a1;
    public Bitmap b1;
    public int c1;
    public Drawable d1;
    public Bitmap e1;
    public C5555cN0 f1;
    public C5555cN0.g g1;

    /* renamed from: o.Hp1$a */
    /* loaded from: classes.dex */
    public class a implements C5555cN0.h {
        public final /* synthetic */ boolean X;

        /* renamed from: o.Hp1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0187a implements Runnable {
            public final /* synthetic */ C5555cN0.g X;

            public RunnableC0187a(C5555cN0.g gVar) {
                this.X = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.X, false);
            }
        }

        public a(boolean z) {
            this.X = z;
        }

        @Override // o.DT1.a
        public void a(C6524gJ2 c6524gJ2) {
            if (C3176Hp1.this.c1 != 0) {
                C3176Hp1 c3176Hp1 = C3176Hp1.this;
                c3176Hp1.setImageResource(c3176Hp1.c1);
            } else if (C3176Hp1.this.d1 != null) {
                C3176Hp1 c3176Hp12 = C3176Hp1.this;
                c3176Hp12.setImageDrawable(c3176Hp12.d1);
            } else if (C3176Hp1.this.e1 != null) {
                C3176Hp1 c3176Hp13 = C3176Hp1.this;
                c3176Hp13.setImageBitmap(c3176Hp13.e1);
            }
        }

        @Override // o.C5555cN0.h
        public void c(C5555cN0.g gVar, boolean z) {
            if (z && this.X) {
                C3176Hp1.this.post(new RunnableC0187a(gVar));
            } else if (gVar.d() != null) {
                C3176Hp1.this.setImageBitmap(gVar.d());
            } else if (C3176Hp1.this.Z0 != 0) {
                C3176Hp1 c3176Hp1 = C3176Hp1.this;
                c3176Hp1.setImageResource(c3176Hp1.Z0);
            } else if (C3176Hp1.this.a1 != null) {
                C3176Hp1 c3176Hp12 = C3176Hp1.this;
                c3176Hp12.setImageDrawable(c3176Hp12.a1);
            } else if (C3176Hp1.this.b1 != null) {
                C3176Hp1 c3176Hp13 = C3176Hp1.this;
                c3176Hp13.setImageBitmap(c3176Hp13.b1);
            }
        }
    }

    public C3176Hp1(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void g(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getLayoutParams().height == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z2 || !z3) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.Y0)) {
                C5555cN0.g gVar = this.g1;
                if (gVar != null) {
                    gVar.c();
                    this.g1 = null;
                }
                h();
                return;
            }
            C5555cN0.g gVar2 = this.g1;
            if (gVar2 != null && gVar2.e() != null) {
                if (this.g1.e().equals(this.Y0)) {
                    return;
                }
                this.g1.c();
                h();
            }
            if (z2) {
                width = 0;
            }
            if (z3) {
                i = 0;
            } else {
                i = height;
            }
            this.g1 = this.f1.g(this.Y0, new a(z), width, i, scaleType);
        }
    }

    public final void h() {
        int i = this.Z0;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.a1;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    public void i(String str, C5555cN0 c5555cN0) {
        C5659co2.a();
        this.Y0 = str;
        this.f1 = c5555cN0;
        g(false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        C5555cN0.g gVar = this.g1;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.g1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.Z0 = 0;
        this.a1 = null;
        this.b1 = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.Z0 = 0;
        this.b1 = null;
        this.a1 = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.b1 = null;
        this.a1 = null;
        this.Z0 = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.c1 = 0;
        this.d1 = null;
        this.e1 = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.c1 = 0;
        this.e1 = null;
        this.d1 = drawable;
    }

    public void setErrorImageResId(int i) {
        this.e1 = null;
        this.d1 = null;
        this.c1 = i;
    }

    public C3176Hp1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3176Hp1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
