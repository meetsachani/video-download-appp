package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import o.C10206vN0;
import o.YM0;

/* loaded from: classes.dex */
public interface g extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface a {
        ByteBuffer B();

        int C();

        int D();
    }

    YM0 I4();

    Rect L3();

    default Bitmap N4() {
        return C10206vN0.c(this);
    }

    Image X4();

    void b2(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    a[] f3();

    int getFormat();

    int getHeight();

    int getWidth();
}
