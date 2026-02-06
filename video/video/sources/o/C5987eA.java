package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;
import o.AbstractC5921dt2;
import o.BM1;
import o.C3193Ht2;

/* renamed from: o.eA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5987eA extends AbstractC5921dt2 {
    public static final String X1 = "android:changeImageTransform:matrix";
    public static final String Y1 = "android:changeImageTransform:bounds";
    public static final String[] Z1 = {X1, Y1};
    public static final TypeEvaluator<Matrix> a2 = new a();
    public static final Property<ImageView, Matrix> b2 = new b(Matrix.class, "animatedTransform");

    /* renamed from: o.eA$a */
    /* loaded from: classes.dex */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: o.eA$b */
    /* loaded from: classes.dex */
    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C11181zN0.a(imageView, matrix);
        }
    }

    /* renamed from: o.eA$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.eA$d */
    /* loaded from: classes.dex */
    public static class d extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final ImageView a;
        public final Matrix b;
        public final Matrix c;
        public boolean d = true;

        public d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.a = imageView;
            this.b = matrix;
            this.c = matrix2;
        }

        public final void a() {
            ImageView imageView = this.a;
            int i = BM1.a.transition_image_transform;
            Matrix matrix = (Matrix) imageView.getTag(i);
            if (matrix != null) {
                C11181zN0.a(this.a, matrix);
                this.a.setTag(i, null);
            }
        }

        public final void b(Matrix matrix) {
            this.a.setTag(BM1.a.transition_image_transform, matrix);
            C11181zN0.a(this.a, this.c);
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            a();
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            if (this.d) {
                b(this.b);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            b((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            this.d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.d = false;
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    public C5987eA() {
    }

    private void R0(C3291It2 c3291It2, boolean z) {
        Matrix matrix;
        View view = c3291It2.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = c3291It2.a;
                map.put(Y1, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                if (z) {
                    matrix = (Matrix) imageView.getTag(BM1.a.transition_image_transform);
                } else {
                    matrix = null;
                }
                if (matrix == null) {
                    matrix = T0(imageView);
                }
                map.put(X1, matrix);
            }
        }
    }

    public static Matrix S0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    public static Matrix T0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = c.a[imageView.getScaleType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return new Matrix(imageView.getImageMatrix());
                }
                return S0(imageView);
            }
            return X0(imageView);
        }
        return new Matrix(imageView.getImageMatrix());
    }

    public static Matrix X0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public final ObjectAnimator V0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) b2, (TypeEvaluator) new C3193Ht2.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    public final ObjectAnimator W0(ImageView imageView) {
        Property<ImageView, Matrix> property = b2;
        TypeEvaluator<Matrix> typeEvaluator = a2;
        Matrix matrix = C10511wd1.a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return Z1;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2, false);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        R0(c3291It2, true);
    }

    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        boolean z;
        if (c3291It2 == null || c3291It22 == null) {
            return null;
        }
        Rect rect = (Rect) c3291It2.a.get(Y1);
        Rect rect2 = (Rect) c3291It22.a.get(Y1);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c3291It2.a.get(X1);
        Matrix matrix2 = (Matrix) c3291It22.a.get(X1);
        if ((matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2))) {
            z = true;
        } else {
            z = false;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) c3291It22.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = C10511wd1.a;
            }
            if (matrix2 == null) {
                matrix2 = C10511wd1.a;
            }
            b2.set(imageView, matrix);
            ObjectAnimator V0 = V0(imageView, matrix, matrix2);
            d dVar = new d(imageView, matrix, matrix2);
            V0.addListener(dVar);
            V0.addPauseListener(dVar);
            d(dVar);
            return V0;
        }
        return W0(imageView);
    }

    public C5987eA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
