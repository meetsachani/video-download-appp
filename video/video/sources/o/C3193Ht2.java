package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: o.Ht2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3193Ht2 {
    public static final int a = 1048576;
    public static final boolean b;

    /* renamed from: o.Ht2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Bitmap a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* renamed from: o.Ht2$b */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<Matrix> {
        public final float[] a = new float[9];
        public final float[] b = new float[9];
        public final Matrix c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.b;
                float f2 = fArr[i];
                float f3 = this.a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        AI2.h(view, matrix);
        AI2.i(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b2 = b(view, matrix, rectF, viewGroup);
        if (b2 != null) {
            imageView.setImageBitmap(b2);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        int i;
        ViewGroup viewGroup2;
        boolean isAttachedToWindow = view.isAttachedToWindow();
        if (viewGroup != null && viewGroup.isAttachedToWindow()) {
            z = true;
        } else {
            z = false;
        }
        Bitmap bitmap = null;
        if (!isAttachedToWindow) {
            if (!z) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            i = 0;
            viewGroup2 = null;
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (b) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = a.a(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!isAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
