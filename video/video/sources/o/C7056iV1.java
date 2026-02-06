package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import java.io.InputStream;

/* renamed from: o.iV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7056iV1 {
    public static final String a = "RoundedBitmapDrawableFa";

    /* renamed from: o.iV1$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC6813hV1 {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // o.AbstractC6813hV1
        public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
            JE0.b(i, i2, i3, rect, rect2, 0);
        }

        @Override // o.AbstractC6813hV1
        public boolean h() {
            Bitmap bitmap = this.a;
            if (bitmap != null && C3166Hn.c(bitmap)) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC6813hV1
        public void o(boolean z) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                C3166Hn.d(bitmap, z);
                invalidateSelf();
            }
        }
    }

    public static AbstractC6813hV1 a(Resources resources, Bitmap bitmap) {
        return new C6570gV1(resources, bitmap);
    }

    public static AbstractC6813hV1 b(Resources resources, InputStream inputStream) {
        AbstractC6813hV1 a2 = a(resources, BitmapFactory.decodeStream(inputStream));
        if (a2.b() == null) {
            Log.w(a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return a2;
    }

    public static AbstractC6813hV1 c(Resources resources, String str) {
        AbstractC6813hV1 a2 = a(resources, BitmapFactory.decodeFile(str));
        if (a2.b() == null) {
            Log.w(a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return a2;
    }
}
