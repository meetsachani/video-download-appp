package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class U32 {
    public static final int b = 1048576;
    public static final String c = "sharedElement:snapshot:bitmap";
    public static final String d = "sharedElement:snapshot:imageScaleType";
    public static final String e = "sharedElement:snapshot:imageMatrix";
    public Matrix a;

    /* loaded from: classes.dex */
    public interface a {
        void onSharedElementsReady();
    }

    public static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
            if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int i = (int) (intrinsicWidth * min);
            int i2 = (int) (intrinsicHeight * min);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect bounds = drawable.getBounds();
            int i3 = bounds.left;
            int i4 = bounds.top;
            int i5 = bounds.right;
            int i6 = bounds.bottom;
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            drawable.setBounds(i3, i4, i5, i6);
            return createBitmap;
        }
        return null;
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap a2;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (a2 = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(c, a2);
                bundle.putString(d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(e, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int i = (int) (round * min);
            int i2 = (int) (round2 * min);
            if (this.a == null) {
                this.a = new Matrix();
            }
            this.a.set(matrix);
            this.a.postTranslate(-rectF.left, -rectF.top);
            this.a.postScale(min, min);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(this.a);
            view.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    public View c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(c);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(d)));
            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray(e);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
            }
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.onSharedElementsReady();
    }

    public void e(List<View> list) {
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }
}
