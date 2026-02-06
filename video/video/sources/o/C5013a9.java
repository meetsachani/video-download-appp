package o;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;
import o.InterfaceC8499oN0;

/* renamed from: o.a9 */
/* loaded from: classes.dex */
public class C5013a9 implements InterfaceC8499oN0 {
    public final ImageReader a;
    public final Object b = new Object();
    public boolean c = true;

    public C5013a9(ImageReader imageReader) {
        this.a = imageReader;
    }

    public static /* synthetic */ void b(C5013a9 c5013a9, Executor executor, final InterfaceC8499oN0.a aVar, ImageReader imageReader) {
        synchronized (c5013a9.b) {
            try {
                if (!c5013a9.c) {
                    executor.execute(new Runnable() { // from class: o.Y8
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5013a9.h(C5013a9.this, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void h(C5013a9 c5013a9, InterfaceC8499oN0.a aVar) {
        c5013a9.getClass();
        aVar.a(c5013a9);
    }

    @Override // o.InterfaceC8499oN0
    public androidx.camera.core.g a() {
        Image image;
        synchronized (this.b) {
            try {
                image = this.a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (i(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // o.InterfaceC8499oN0
    public int c() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // o.InterfaceC8499oN0
    public void close() {
        synchronized (this.b) {
            this.a.close();
        }
    }

    @Override // o.InterfaceC8499oN0
    public void d() {
        synchronized (this.b) {
            this.c = true;
            this.a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // o.InterfaceC8499oN0
    public int e() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.a.getMaxImages();
        }
        return maxImages;
    }

    @Override // o.InterfaceC8499oN0
    public void f(final InterfaceC8499oN0.a aVar, final Executor executor) {
        synchronized (this.b) {
            this.c = false;
            this.a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: o.Z8
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C5013a9.b(C5013a9.this, executor, aVar, imageReader);
                }
            }, C10632x71.a());
        }
    }

    @Override // o.InterfaceC8499oN0
    public androidx.camera.core.g g() {
        Image image;
        synchronized (this.b) {
            try {
                image = this.a.acquireNextImage();
            } catch (RuntimeException e) {
                if (i(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // o.InterfaceC8499oN0
    public int getHeight() {
        int height;
        synchronized (this.b) {
            height = this.a.getHeight();
        }
        return height;
    }

    @Override // o.InterfaceC8499oN0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.a.getSurface();
        }
        return surface;
    }

    @Override // o.InterfaceC8499oN0
    public int getWidth() {
        int width;
        synchronized (this.b) {
            width = this.a.getWidth();
        }
        return width;
    }

    public final boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
